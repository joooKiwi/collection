import condition.DisableIfNormalCondition;
import condition.DisableIfNormalViewerCondition;
import instance.ArrayAsCollection;
import instance.ArrayAsMinimalistCollection;
import instance.CollectionHolderForTest;
import instance.GenericCollectionHolder_FirstIndexOfAlias;
import instance.GenericCollectionHolder_FirstIndexOfOrNullAlias;
import instance.GenericCollectionHolder_IndexOfFirstAlias;
import instance.GenericCollectionHolder_IndexOfFirstIndexedAlias;
import instance.GenericCollectionHolder_IndexOfFirstIndexedOrNullAlias;
import instance.GenericCollectionHolder_IndexOfFirstOrNullAlias;
import instance.GenericCollectionHolder_IndexOfLastAlias;
import instance.GenericCollectionHolder_IndexOfLastIndexedAlias;
import instance.GenericCollectionHolder_IndexOfLastIndexedOrNullAlias;
import instance.GenericCollectionHolder_IndexOfLastOrNullAlias;
import joookiwi.collection.java.exception.EmptyCollectionException;
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
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.FieldSource;
import test.AbstractEmptyCollectionHolderTests;
import test.AbstractInstancesTests;
import test.AbstractMethodsTests;

import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;
import static joookiwi.collection.java.NumericConstants.MIN_INT_VALUE;
import static joookiwi.collection.java.method.FindFirstIndex.findFirstIndex;
import static joookiwi.collection.java.method.FindFirstIndexIndexed.findFirstIndexIndexed;
import static joookiwi.collection.java.method.FindFirstIndexIndexedOrNull.findFirstIndexIndexedOrNull;
import static joookiwi.collection.java.method.FindFirstIndexOrNull.findFirstIndexOrNull;
import static joookiwi.collection.java.method.FindIndex.findIndex;
import static joookiwi.collection.java.method.FindIndexIndexed.findIndexIndexed;
import static joookiwi.collection.java.method.FindIndexIndexedOrNull.findIndexIndexedOrNull;
import static joookiwi.collection.java.method.FindIndexOrNull.findIndexOrNull;
import static joookiwi.collection.java.method.FindLastIndex.findLastIndex;
import static joookiwi.collection.java.method.FindLastIndexIndexed.findLastIndexIndexed;
import static joookiwi.collection.java.method.FindLastIndexIndexedOrNull.findLastIndexIndexedOrNull;
import static joookiwi.collection.java.method.FindLastIndexOrNull.findLastIndexOrNull;
import static joookiwi.collection.java.method.FirstIndexOf.firstIndexOf;
import static joookiwi.collection.java.method.FirstIndexOfOrNull.firstIndexOfOrNull;
import static joookiwi.collection.java.method.IndexOf.indexOf;
import static joookiwi.collection.java.method.IndexOfFirst.indexOfFirst;
import static joookiwi.collection.java.method.IndexOfFirstIndexed.indexOfFirstIndexed;
import static joookiwi.collection.java.method.IndexOfFirstIndexedOrNull.indexOfFirstIndexedOrNull;
import static joookiwi.collection.java.method.IndexOfFirstOrNull.indexOfFirstOrNull;
import static joookiwi.collection.java.method.IndexOfLast.indexOfLast;
import static joookiwi.collection.java.method.IndexOfLastIndexed.indexOfLastIndexed;
import static joookiwi.collection.java.method.IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull;
import static joookiwi.collection.java.method.IndexOfLastOrNull.indexOfLastOrNull;
import static joookiwi.collection.java.method.IndexOfOrNull.indexOfOrNull;
import static joookiwi.collection.java.method.LastIndexOf.lastIndexOf;
import static joookiwi.collection.java.method.LastIndexOfOrNull.lastIndexOfOrNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;
import static value.Arrays.A;
import static value.Arrays.AA;
import static value.Arrays.AB;
import static value.Arrays.ABAB;
import static value.Arrays.ABC;
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
import static value.Callbacks_String.callbackIsAAlt;
import static value.Callbacks_String.callbackIsB;
import static value.Callbacks_String.callbackIsBAlt;
import static value.Callbacks_String.callbackIsC;
import static value.Callbacks_String.callbackIsCAlt;
import static value.Callbacks_String.callbackIsD;
import static value.Callbacks_String.callbackIsDAlt;
import static value.Callbacks_String.callbackIsEAlt;
import static value.Callbacks_String.callbackIsA;
import static value.Callbacks_String.callbackIsE;
import static value.Instances.everyExtensionMethodInstancesAsArguments;
import static value.Instances.everyInstancesAsArguments;
import static value.ReusableFields.EMPTY_ARRAY;
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
@DisplayName("CollectionHolder tests (index)") @TestInstance(PER_CLASS) class CollectionHolder04_IndexTests {

    @TestInstance(PER_CLASS) @Nested class EmptyCollectionHolder extends AbstractEmptyCollectionHolderTests {
        @Nested class firstIndexOf {
            @DisplayName("∅")                @Test void testEmpty()        { assertThrowsExactly(EmptyCollectionException.class, () -> instance.firstIndexOf()); }
            @DisplayName("null object")      @Test void testNullObject()   { assertThrowsExactly(EmptyCollectionException.class, () -> instance.firstIndexOf(NULL_OBJECT)); }
            @DisplayName("null string")      @Test void testNullString()   { assertThrowsExactly(EmptyCollectionException.class, () -> instance.firstIndexOf(NULL_STRING)); }
            @DisplayName("null []")          @Test void testNullArray()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.firstIndexOf(NULL_VARARGS)); }
            @DisplayName("[]")               @Test void testArray()        { assertThrowsExactly(EmptyCollectionException.class, () -> instance.firstIndexOf(EMPTY_ARRAY)); }
            @DisplayName("null, int")        @Test void testNull0()        { assertThrowsExactly(EmptyCollectionException.class, () -> instance.firstIndexOf(null, 0)); }
            @DisplayName("null, int?")       @Test void testNullNull()     { assertThrowsExactly(EmptyCollectionException.class, () -> instance.firstIndexOf(null, null)); }
            @DisplayName("null, int, int")   @Test void testNull00()       { assertThrowsExactly(EmptyCollectionException.class, () -> instance.firstIndexOf(null, 0, 0)); }
            @DisplayName("null, int, int?")  @Test void testNull0Null()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.firstIndexOf(null, 0, null)); }
            @DisplayName("null, int?, int")  @Test void testNullNull0()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.firstIndexOf(null, null, 0)); }
            @DisplayName("null, int?, int?") @Test void testNullNullNull() { assertThrowsExactly(EmptyCollectionException.class, () -> instance.firstIndexOf(null, null, null)); }

        }
        @Nested class indexOf {
            @DisplayName("∅")                @Test void testEmpty()        { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOf()); }
            @DisplayName("null object")      @Test void testNullObject()   { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOf(NULL_OBJECT)); }
            @DisplayName("null string")      @Test void testNullString()   { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOf(NULL_STRING)); }
            @DisplayName("null []")          @Test void testNullArray()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOf(NULL_VARARGS)); }
            @DisplayName("[]")               @Test void testArray()        { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOf(EMPTY_ARRAY)); }
            @DisplayName("null, int")        @Test void testNull0()        { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOf(null, 0)); }
            @DisplayName("null, int?")       @Test void testNullNull()     { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOf(null, null)); }
            @DisplayName("null, int, int")   @Test void testNull00()       { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOf(null, 0, 0)); }
            @DisplayName("null, int, int?")  @Test void testNull0Null()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOf(null, 0, null)); }
            @DisplayName("null, int?, int")  @Test void testNullNull0()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOf(null, null, 0)); }
            @DisplayName("null, int?, int?") @Test void testNullNullNull() { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOf(null, null, null)); }

        }
        @Nested class firstIndexOfOrNull {
            @DisplayName("∅")                @Test void testEmpty()        { assertNull(instance.firstIndexOfOrNull()); }
            @DisplayName("null object")      @Test void testNullObject()   { assertNull(instance.firstIndexOfOrNull(NULL_OBJECT)); }
            @DisplayName("null string")      @Test void testNullString()   { assertNull(instance.firstIndexOfOrNull(NULL_STRING)); }
            @DisplayName("null []")          @Test void testNullArray()    { assertNull(instance.firstIndexOfOrNull(NULL_VARARGS)); }
            @DisplayName("[]")               @Test void testArray()        { assertNull(instance.firstIndexOfOrNull(EMPTY_ARRAY)); }
            @DisplayName("null, int")        @Test void testNull0()        { assertNull(instance.firstIndexOfOrNull(null, 0)); }
            @DisplayName("null, int?")       @Test void testNullNull()     { assertNull(instance.firstIndexOfOrNull(null, null)); }
            @DisplayName("null, int, int")   @Test void testNull00()       { assertNull(instance.firstIndexOfOrNull(null, 0, 0)); }
            @DisplayName("null, int, int?")  @Test void testNull0Null()    { assertNull(instance.firstIndexOfOrNull(null, 0, null)); }
            @DisplayName("null, int?, int")  @Test void testNullNull0()    { assertNull(instance.firstIndexOfOrNull(null, null, 0)); }
            @DisplayName("null, int?, int?") @Test void testNullNullNull() { assertNull(instance.firstIndexOfOrNull(null, null, null)); }

        }
        @Nested class indexOfOrNull {
            @DisplayName("∅")                @Test void testEmpty()        { assertNull(instance.indexOfOrNull()); }
            @DisplayName("null object")      @Test void testNullObject()   { assertNull(instance.indexOfOrNull(NULL_OBJECT)); }
            @DisplayName("null string")      @Test void testNullString()   { assertNull(instance.indexOfOrNull(NULL_STRING)); }
            @DisplayName("null []")          @Test void testNullArray()    { assertNull(instance.indexOfOrNull(NULL_VARARGS)); }
            @DisplayName("[]")               @Test void testArray()        { assertNull(instance.indexOfOrNull(EMPTY_ARRAY)); }
            @DisplayName("null, int")        @Test void testNull0()        { assertNull(instance.indexOfOrNull(null, 0)); }
            @DisplayName("null, int?")       @Test void testNullNull()     { assertNull(instance.indexOfOrNull(null, null)); }
            @DisplayName("null, int, int")   @Test void testNull00()       { assertNull(instance.indexOfOrNull(null, 0, 0)); }
            @DisplayName("null, int, int?")  @Test void testNull0Null()    { assertNull(instance.indexOfOrNull(null, 0, null)); }
            @DisplayName("null, int?, int")  @Test void testNullNull0()    { assertNull(instance.indexOfOrNull(null, null, 0)); }
            @DisplayName("null, int?, int?") @Test void testNullNullNull() { assertNull(instance.indexOfOrNull(null, null, null)); }

        }
        @Nested class lastIndexOf {
            @DisplayName("∅")                @Test void testEmpty()        { assertThrowsExactly(EmptyCollectionException.class, () -> instance.lastIndexOf()); }
            @DisplayName("null object")      @Test void testNullObject()   { assertThrowsExactly(EmptyCollectionException.class, () -> instance.lastIndexOf(NULL_OBJECT)); }
            @DisplayName("null string")      @Test void testNullString()   { assertThrowsExactly(EmptyCollectionException.class, () -> instance.lastIndexOf(NULL_STRING)); }
            @DisplayName("null []")          @Test void testNullArray()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.lastIndexOf(NULL_VARARGS)); }
            @DisplayName("[]")               @Test void testArray()        { assertThrowsExactly(EmptyCollectionException.class, () -> instance.lastIndexOf(EMPTY_ARRAY)); }
            @DisplayName("null, int")        @Test void testNull0()        { assertThrowsExactly(EmptyCollectionException.class, () -> instance.lastIndexOf(null, 0)); }
            @DisplayName("null, int?")       @Test void testNullNull()     { assertThrowsExactly(EmptyCollectionException.class, () -> instance.lastIndexOf(null, null)); }
            @DisplayName("null, int, int")   @Test void testNull00()       { assertThrowsExactly(EmptyCollectionException.class, () -> instance.lastIndexOf(null, 0, 0)); }
            @DisplayName("null, int, int?")  @Test void testNull0Null()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.lastIndexOf(null, 0, null)); }
            @DisplayName("null, int?, int")  @Test void testNullNull0()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.lastIndexOf(null, null, 0)); }
            @DisplayName("null, int?, int?") @Test void testNullNullNull() { assertThrowsExactly(EmptyCollectionException.class, () -> instance.lastIndexOf(null, null, null)); }

        }
        @Nested class lastIndexOfOrNull {
            @DisplayName("∅")                @Test void testEmpty()        { assertNull(instance.lastIndexOfOrNull()); }
            @DisplayName("null object")      @Test void testNullObject()   { assertNull(instance.lastIndexOfOrNull(NULL_OBJECT)); }
            @DisplayName("null string")      @Test void testNullString()   { assertNull(instance.lastIndexOfOrNull(NULL_STRING)); }
            @DisplayName("null []")          @Test void testNullArray()    { assertNull(instance.lastIndexOfOrNull(NULL_VARARGS)); }
            @DisplayName("[]")               @Test void testArray()        { assertNull(instance.lastIndexOfOrNull(EMPTY_ARRAY)); }
            @DisplayName("null, int")        @Test void testNull0()        { assertNull(instance.lastIndexOfOrNull(null, 0)); }
            @DisplayName("null, int?")       @Test void testNullNull()     { assertNull(instance.lastIndexOfOrNull(null, null)); }
            @DisplayName("null, int, int")   @Test void testNull00()       { assertNull(instance.lastIndexOfOrNull(null, 0, 0)); }
            @DisplayName("null, int, int?")  @Test void testNull0Null()    { assertNull(instance.lastIndexOfOrNull(null, 0, null)); }
            @DisplayName("null, int?, int")  @Test void testNullNull0()    { assertNull(instance.lastIndexOfOrNull(null, null, 0)); }
            @DisplayName("null, int?, int?") @Test void testNullNullNull() { assertNull(instance.lastIndexOfOrNull(null, null, null)); }

        }

        @Nested class indexOfFirst {
            @DisplayName("∅")                              @Test void testEmpty()        { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfFirst()); }
            @DisplayName("null []")                        @Test void testNullArray()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfFirst(NULL_VARARGS)); }
            @DisplayName("(T, int) → boolean")             @Test void test2Arg()         { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfFirst(NULL_PREDICATE2)); }
            @DisplayName("(T) → boolean")                  @Test void test1Arg()         { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfFirst(NULL_PREDICATE1)); }
            @DisplayName("() → boolean")                   @Test void test0Arg()         { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfFirst(NULL_PREDICATE0)); }
            @DisplayName("(T, int) → boolean, int")        @Test void test2Arg0()        { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfFirst(NULL_PREDICATE2, 0)); }
            @DisplayName("(T) → boolean, int")             @Test void test1Arg0()        { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfFirst(NULL_PREDICATE1, 0)); }
            @DisplayName("() → boolean, int")              @Test void test0Arg0()        { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfFirst(NULL_PREDICATE0, 0)); }
            @DisplayName("(T, int) → boolean, int?")       @Test void test2ArgNull()     { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfFirst(NULL_PREDICATE2, null)); }
            @DisplayName("(T) → boolean, int?")            @Test void test1ArgNull()     { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfFirst(NULL_PREDICATE1, null)); }
            @DisplayName("() → boolean, int?")             @Test void test0ArgNull()     { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfFirst(NULL_PREDICATE0, null)); }
            @DisplayName("(T, int) → boolean, int, int")   @Test void test2Arg00()       { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfFirst(NULL_PREDICATE2, 0, 0)); }
            @DisplayName("(T) → boolean, int, int")        @Test void test1Arg00()       { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfFirst(NULL_PREDICATE1, 0, 0)); }
            @DisplayName("() → boolean, int, int")         @Test void test0Arg00()       { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfFirst(NULL_PREDICATE0, 0, 0)); }
            @DisplayName("(T, int) → boolean, int, int?")  @Test void test2Arg0Null()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfFirst(NULL_PREDICATE2, 0, null)); }
            @DisplayName("(T) → boolean, int, int?")       @Test void test1Arg0Null()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfFirst(NULL_PREDICATE1, 0, null)); }
            @DisplayName("() → boolean, int, int?")        @Test void test0Arg0Null()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfFirst(NULL_PREDICATE0, 0, null)); }
            @DisplayName("(T, int) → boolean, int?, int")  @Test void test2ArgNull0()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfFirst(NULL_PREDICATE2, null, 0)); }
            @DisplayName("(T) → boolean, int?, int")       @Test void test1ArgNull0()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfFirst(NULL_PREDICATE1, null, 0)); }
            @DisplayName("() → boolean, int?, int")        @Test void test0ArgNull0()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfFirst(NULL_PREDICATE0, null, 0)); }
            @DisplayName("(T, int) → boolean, int?, int?") @Test void test2ArgNullNull() { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfFirst(NULL_PREDICATE2, null, null)); }
            @DisplayName("(T) → boolean, int?, int?")      @Test void test1ArgNullNull() { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfFirst(NULL_PREDICATE1, null, null)); }
            @DisplayName("() → boolean, int?, int?")       @Test void test0ArgNullNull() { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfFirst(NULL_PREDICATE0, null, null)); }
            @DisplayName("[]")                             @Test void testArray()        { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfFirst(EMPTY_ARRAY)); }
        }
        @Nested class findFirstIndex {
            @DisplayName("∅")                              @Test void testEmpty()        { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findFirstIndex()); }
            @DisplayName("null []")                        @Test void testNullArray()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findFirstIndex(NULL_VARARGS)); }
            @DisplayName("(T, int) → boolean")             @Test void test2Arg()         { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findFirstIndex(NULL_PREDICATE2)); }
            @DisplayName("(T) → boolean")                  @Test void test1Arg()         { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findFirstIndex(NULL_PREDICATE1)); }
            @DisplayName("() → boolean")                   @Test void test0Arg()         { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findFirstIndex(NULL_PREDICATE0)); }
            @DisplayName("(T, int) → boolean, int")        @Test void test2Arg0()        { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findFirstIndex(NULL_PREDICATE2, 0)); }
            @DisplayName("(T) → boolean, int")             @Test void test1Arg0()        { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findFirstIndex(NULL_PREDICATE1, 0)); }
            @DisplayName("() → boolean, int")              @Test void test0Arg0()        { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findFirstIndex(NULL_PREDICATE0, 0)); }
            @DisplayName("(T, int) → boolean, int?")       @Test void test2ArgNull()     { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findFirstIndex(NULL_PREDICATE2, null)); }
            @DisplayName("(T) → boolean, int?")            @Test void test1ArgNull()     { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findFirstIndex(NULL_PREDICATE1, null)); }
            @DisplayName("() → boolean, int?")             @Test void test0ArgNull()     { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findFirstIndex(NULL_PREDICATE0, null)); }
            @DisplayName("(T, int) → boolean, int, int")   @Test void test2Arg00()       { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findFirstIndex(NULL_PREDICATE2, 0, 0)); }
            @DisplayName("(T) → boolean, int, int")        @Test void test1Arg00()       { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findFirstIndex(NULL_PREDICATE1, 0, 0)); }
            @DisplayName("() → boolean, int, int")         @Test void test0Arg00()       { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findFirstIndex(NULL_PREDICATE0, 0, 0)); }
            @DisplayName("(T, int) → boolean, int, int?")  @Test void test2Arg0Null()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findFirstIndex(NULL_PREDICATE2, 0, null)); }
            @DisplayName("(T) → boolean, int, int?")       @Test void test1Arg0Null()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findFirstIndex(NULL_PREDICATE1, 0, null)); }
            @DisplayName("() → boolean, int, int?")        @Test void test0Arg0Null()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findFirstIndex(NULL_PREDICATE0, 0, null)); }
            @DisplayName("(T, int) → boolean, int?, int")  @Test void test2ArgNull0()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findFirstIndex(NULL_PREDICATE2, null, 0)); }
            @DisplayName("(T) → boolean, int?, int")       @Test void test1ArgNull0()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findFirstIndex(NULL_PREDICATE1, null, 0)); }
            @DisplayName("() → boolean, int?, int")        @Test void test0ArgNull0()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findFirstIndex(NULL_PREDICATE0, null, 0)); }
            @DisplayName("(T, int) → boolean, int?, int?") @Test void test2ArgNullNull() { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findFirstIndex(NULL_PREDICATE2, null, null)); }
            @DisplayName("(T) → boolean, int?, int?")      @Test void test1ArgNullNull() { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findFirstIndex(NULL_PREDICATE1, null, null)); }
            @DisplayName("() → boolean, int?, int?")       @Test void test0ArgNullNull() { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findFirstIndex(NULL_PREDICATE0, null, null)); }
            @DisplayName("[]")                             @Test void testArray()        { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findFirstIndex(EMPTY_ARRAY)); }
        }
        @Nested class findIndex {
            @DisplayName("∅")                              @Test void testEmpty()        { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findIndex()); }
            @DisplayName("null []")                        @Test void testNullArray()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findIndex(NULL_VARARGS)); }
            @DisplayName("(T, int) → boolean")             @Test void test2Arg()         { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findIndex(NULL_PREDICATE2)); }
            @DisplayName("(T) → boolean")                  @Test void test1Arg()         { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findIndex(NULL_PREDICATE1)); }
            @DisplayName("() → boolean")                   @Test void test0Arg()         { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findIndex(NULL_PREDICATE0)); }
            @DisplayName("(T, int) → boolean, int")        @Test void test2Arg0()        { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findIndex(NULL_PREDICATE2, 0)); }
            @DisplayName("(T) → boolean, int")             @Test void test1Arg0()        { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findIndex(NULL_PREDICATE1, 0)); }
            @DisplayName("() → boolean, int")              @Test void test0Arg0()        { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findIndex(NULL_PREDICATE0, 0)); }
            @DisplayName("(T, int) → boolean, int?")       @Test void test2ArgNull()     { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findIndex(NULL_PREDICATE2, null)); }
            @DisplayName("(T) → boolean, int?")            @Test void test1ArgNull()     { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findIndex(NULL_PREDICATE1, null)); }
            @DisplayName("() → boolean, int?")             @Test void test0ArgNull()     { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findIndex(NULL_PREDICATE0, null)); }
            @DisplayName("(T, int) → boolean, int, int")   @Test void test2Arg00()       { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findIndex(NULL_PREDICATE2, 0, 0)); }
            @DisplayName("(T) → boolean, int, int")        @Test void test1Arg00()       { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findIndex(NULL_PREDICATE1, 0, 0)); }
            @DisplayName("() → boolean, int, int")         @Test void test0Arg00()       { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findIndex(NULL_PREDICATE0, 0, 0)); }
            @DisplayName("(T, int) → boolean, int, int?")  @Test void test2Arg0Null()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findIndex(NULL_PREDICATE2, 0, null)); }
            @DisplayName("(T) → boolean, int, int?")       @Test void test1Arg0Null()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findIndex(NULL_PREDICATE1, 0, null)); }
            @DisplayName("() → boolean, int, int?")        @Test void test0Arg0Null()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findIndex(NULL_PREDICATE0, 0, null)); }
            @DisplayName("(T, int) → boolean, int?, int")  @Test void test2ArgNull0()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findIndex(NULL_PREDICATE2, null, 0)); }
            @DisplayName("(T) → boolean, int?, int")       @Test void test1ArgNull0()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findIndex(NULL_PREDICATE1, null, 0)); }
            @DisplayName("() → boolean, int?, int")        @Test void test0ArgNull0()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findIndex(NULL_PREDICATE0, null, 0)); }
            @DisplayName("(T, int) → boolean, int?, int?") @Test void test2ArgNullNull() { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findIndex(NULL_PREDICATE2, null, null)); }
            @DisplayName("(T) → boolean, int?, int?")      @Test void test1ArgNullNull() { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findIndex(NULL_PREDICATE1, null, null)); }
            @DisplayName("() → boolean, int?, int?")       @Test void test0ArgNullNull() { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findIndex(NULL_PREDICATE0, null, null)); }
            @DisplayName("[]")                             @Test void testArray()        { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findIndex(EMPTY_ARRAY)); }
        }
        @Nested class indexOfFirstOrNull {
            @DisplayName("∅")                              @Test void testEmpty()        { assertNull(instance.indexOfFirstOrNull()); }
            @DisplayName("null []")                        @Test void testNullArray()    { assertNull(instance.indexOfFirstOrNull(NULL_VARARGS)); }
            @DisplayName("(T, int) → boolean")             @Test void test2Arg()         { assertNull(instance.indexOfFirstOrNull(NULL_PREDICATE2)); }
            @DisplayName("(T) → boolean")                  @Test void test1Arg()         { assertNull(instance.indexOfFirstOrNull(NULL_PREDICATE1)); }
            @DisplayName("() → boolean")                   @Test void test0Arg()         { assertNull(instance.indexOfFirstOrNull(NULL_PREDICATE0)); }
            @DisplayName("(T, int) → boolean, int")        @Test void test2Arg0()        { assertNull(instance.indexOfFirstOrNull(NULL_PREDICATE2, 0)); }
            @DisplayName("(T) → boolean, int")             @Test void test1Arg0()        { assertNull(instance.indexOfFirstOrNull(NULL_PREDICATE1, 0)); }
            @DisplayName("() → boolean, int")              @Test void test0Arg0()        { assertNull(instance.indexOfFirstOrNull(NULL_PREDICATE0, 0)); }
            @DisplayName("(T, int) → boolean, int?")       @Test void test2ArgNull()     { assertNull(instance.indexOfFirstOrNull(NULL_PREDICATE2, null)); }
            @DisplayName("(T) → boolean, int?")            @Test void test1ArgNull()     { assertNull(instance.indexOfFirstOrNull(NULL_PREDICATE1, null)); }
            @DisplayName("() → boolean, int?")             @Test void test0ArgNull()     { assertNull(instance.indexOfFirstOrNull(NULL_PREDICATE0, null)); }
            @DisplayName("(T, int) → boolean, int, int")   @Test void test2Arg00()       { assertNull(instance.indexOfFirstOrNull(NULL_PREDICATE2, 0, 0)); }
            @DisplayName("(T) → boolean, int, int")        @Test void test1Arg00()       { assertNull(instance.indexOfFirstOrNull(NULL_PREDICATE1, 0, 0)); }
            @DisplayName("() → boolean, int, int")         @Test void test0Arg00()       { assertNull(instance.indexOfFirstOrNull(NULL_PREDICATE0, 0, 0)); }
            @DisplayName("(T, int) → boolean, int, int?")  @Test void test2Arg0Null()    { assertNull(instance.indexOfFirstOrNull(NULL_PREDICATE2, 0, null)); }
            @DisplayName("(T) → boolean, int, int?")       @Test void test1Arg0Null()    { assertNull(instance.indexOfFirstOrNull(NULL_PREDICATE1, 0, null)); }
            @DisplayName("() → boolean, int, int?")        @Test void test0Arg0Null()    { assertNull(instance.indexOfFirstOrNull(NULL_PREDICATE0, 0, null)); }
            @DisplayName("(T, int) → boolean, int?, int")  @Test void test2ArgNull0()    { assertNull(instance.indexOfFirstOrNull(NULL_PREDICATE2, null, 0)); }
            @DisplayName("(T) → boolean, int?, int")       @Test void test1ArgNull0()    { assertNull(instance.indexOfFirstOrNull(NULL_PREDICATE1, null, 0)); }
            @DisplayName("() → boolean, int?, int")        @Test void test0ArgNull0()    { assertNull(instance.indexOfFirstOrNull(NULL_PREDICATE0, null, 0)); }
            @DisplayName("(T, int) → boolean, int?, int?") @Test void test2ArgNullNull() { assertNull(instance.indexOfFirstOrNull(NULL_PREDICATE2, null, null)); }
            @DisplayName("(T) → boolean, int?, int?")      @Test void test1ArgNullNull() { assertNull(instance.indexOfFirstOrNull(NULL_PREDICATE1, null, null)); }
            @DisplayName("() → boolean, int?, int?")       @Test void test0ArgNullNull() { assertNull(instance.indexOfFirstOrNull(NULL_PREDICATE0, null, null)); }
            @DisplayName("[]")                             @Test void testArray()        { assertNull(instance.indexOfFirstOrNull(EMPTY_ARRAY)); }
        }
        @Nested class findFirstIndexOrNull {
            @DisplayName("∅")                              @Test void testEmpty()        { assertNull(instance.findFirstIndexOrNull()); }
            @DisplayName("null []")                        @Test void testNullArray()    { assertNull(instance.findFirstIndexOrNull(NULL_VARARGS)); }
            @DisplayName("(T, int) → boolean")             @Test void test2Arg()         { assertNull(instance.findFirstIndexOrNull(NULL_PREDICATE2)); }
            @DisplayName("(T) → boolean")                  @Test void test1Arg()         { assertNull(instance.findFirstIndexOrNull(NULL_PREDICATE1)); }
            @DisplayName("() → boolean")                   @Test void test0Arg()         { assertNull(instance.findFirstIndexOrNull(NULL_PREDICATE0)); }
            @DisplayName("(T, int) → boolean, int")        @Test void test2Arg0()        { assertNull(instance.findFirstIndexOrNull(NULL_PREDICATE2, 0)); }
            @DisplayName("(T) → boolean, int")             @Test void test1Arg0()        { assertNull(instance.findFirstIndexOrNull(NULL_PREDICATE1, 0)); }
            @DisplayName("() → boolean, int")              @Test void test0Arg0()        { assertNull(instance.findFirstIndexOrNull(NULL_PREDICATE0, 0)); }
            @DisplayName("(T, int) → boolean, int?")       @Test void test2ArgNull()     { assertNull(instance.findFirstIndexOrNull(NULL_PREDICATE2, null)); }
            @DisplayName("(T) → boolean, int?")            @Test void test1ArgNull()     { assertNull(instance.findFirstIndexOrNull(NULL_PREDICATE1, null)); }
            @DisplayName("() → boolean, int?")             @Test void test0ArgNull()     { assertNull(instance.findFirstIndexOrNull(NULL_PREDICATE0, null)); }
            @DisplayName("(T, int) → boolean, int, int")   @Test void test2Arg00()       { assertNull(instance.findFirstIndexOrNull(NULL_PREDICATE2, 0, 0)); }
            @DisplayName("(T) → boolean, int, int")        @Test void test1Arg00()       { assertNull(instance.findFirstIndexOrNull(NULL_PREDICATE1, 0, 0)); }
            @DisplayName("() → boolean, int, int")         @Test void test0Arg00()       { assertNull(instance.findFirstIndexOrNull(NULL_PREDICATE0, 0, 0)); }
            @DisplayName("(T, int) → boolean, int, int?")  @Test void test2Arg0Null()    { assertNull(instance.findFirstIndexOrNull(NULL_PREDICATE2, 0, null)); }
            @DisplayName("(T) → boolean, int, int?")       @Test void test1Arg0Null()    { assertNull(instance.findFirstIndexOrNull(NULL_PREDICATE1, 0, null)); }
            @DisplayName("() → boolean, int, int?")        @Test void test0Arg0Null()    { assertNull(instance.findFirstIndexOrNull(NULL_PREDICATE0, 0, null)); }
            @DisplayName("(T, int) → boolean, int?, int")  @Test void test2ArgNull0()    { assertNull(instance.findFirstIndexOrNull(NULL_PREDICATE2, null, 0)); }
            @DisplayName("(T) → boolean, int?, int")       @Test void test1ArgNull0()    { assertNull(instance.findFirstIndexOrNull(NULL_PREDICATE1, null, 0)); }
            @DisplayName("() → boolean, int?, int")        @Test void test0ArgNull0()    { assertNull(instance.findFirstIndexOrNull(NULL_PREDICATE0, null, 0)); }
            @DisplayName("(T, int) → boolean, int?, int?") @Test void test2ArgNullNull() { assertNull(instance.findFirstIndexOrNull(NULL_PREDICATE2, null, null)); }
            @DisplayName("(T) → boolean, int?, int?")      @Test void test1ArgNullNull() { assertNull(instance.findFirstIndexOrNull(NULL_PREDICATE1, null, null)); }
            @DisplayName("() → boolean, int?, int?")       @Test void test0ArgNullNull() { assertNull(instance.findFirstIndexOrNull(NULL_PREDICATE0, null, null)); }
            @DisplayName("[]")                             @Test void testArray()        { assertNull(instance.findFirstIndexOrNull(EMPTY_ARRAY)); }
        }
        @Nested class findIndexOrNull {
            @DisplayName("∅")                              @Test void testEmpty()        { assertNull(instance.findIndexOrNull()); }
            @DisplayName("null []")                        @Test void testNullArray()    { assertNull(instance.findIndexOrNull(NULL_VARARGS)); }
            @DisplayName("(T, int) → boolean")             @Test void test2Arg()         { assertNull(instance.findIndexOrNull(NULL_PREDICATE2)); }
            @DisplayName("(T) → boolean")                  @Test void test1Arg()         { assertNull(instance.findIndexOrNull(NULL_PREDICATE1)); }
            @DisplayName("() → boolean")                   @Test void test0Arg()         { assertNull(instance.findIndexOrNull(NULL_PREDICATE0)); }
            @DisplayName("(T, int) → boolean, int")        @Test void test2Arg0()        { assertNull(instance.findIndexOrNull(NULL_PREDICATE2, 0)); }
            @DisplayName("(T) → boolean, int")             @Test void test1Arg0()        { assertNull(instance.findIndexOrNull(NULL_PREDICATE1, 0)); }
            @DisplayName("() → boolean, int")              @Test void test0Arg0()        { assertNull(instance.findIndexOrNull(NULL_PREDICATE0, 0)); }
            @DisplayName("(T, int) → boolean, int?")       @Test void test2ArgNull()     { assertNull(instance.findIndexOrNull(NULL_PREDICATE2, null)); }
            @DisplayName("(T) → boolean, int?")            @Test void test1ArgNull()     { assertNull(instance.findIndexOrNull(NULL_PREDICATE1, null)); }
            @DisplayName("() → boolean, int?")             @Test void test0ArgNull()     { assertNull(instance.findIndexOrNull(NULL_PREDICATE0, null)); }
            @DisplayName("(T, int) → boolean, int, int")   @Test void test2Arg00()       { assertNull(instance.findIndexOrNull(NULL_PREDICATE2, 0, 0)); }
            @DisplayName("(T) → boolean, int, int")        @Test void test1Arg00()       { assertNull(instance.findIndexOrNull(NULL_PREDICATE1, 0, 0)); }
            @DisplayName("() → boolean, int, int")         @Test void test0Arg00()       { assertNull(instance.findIndexOrNull(NULL_PREDICATE0, 0, 0)); }
            @DisplayName("(T, int) → boolean, int, int?")  @Test void test2Arg0Null()    { assertNull(instance.findIndexOrNull(NULL_PREDICATE2, 0, null)); }
            @DisplayName("(T) → boolean, int, int?")       @Test void test1Arg0Null()    { assertNull(instance.findIndexOrNull(NULL_PREDICATE1, 0, null)); }
            @DisplayName("() → boolean, int, int?")        @Test void test0Arg0Null()    { assertNull(instance.findIndexOrNull(NULL_PREDICATE0, 0, null)); }
            @DisplayName("(T, int) → boolean, int?, int")  @Test void test2ArgNull0()    { assertNull(instance.findIndexOrNull(NULL_PREDICATE2, null, 0)); }
            @DisplayName("(T) → boolean, int?, int")       @Test void test1ArgNull0()    { assertNull(instance.findIndexOrNull(NULL_PREDICATE1, null, 0)); }
            @DisplayName("() → boolean, int?, int")        @Test void test0ArgNull0()    { assertNull(instance.findIndexOrNull(NULL_PREDICATE0, null, 0)); }
            @DisplayName("(T, int) → boolean, int?, int?") @Test void test2ArgNullNull() { assertNull(instance.findIndexOrNull(NULL_PREDICATE2, null, null)); }
            @DisplayName("(T) → boolean, int?, int?")      @Test void test1ArgNullNull() { assertNull(instance.findIndexOrNull(NULL_PREDICATE1, null, null)); }
            @DisplayName("() → boolean, int?, int?")       @Test void test0ArgNullNull() { assertNull(instance.findIndexOrNull(NULL_PREDICATE0, null, null)); }
            @DisplayName("[]")                             @Test void testArray()        { assertNull(instance.findIndexOrNull(EMPTY_ARRAY)); }
        }
        @Nested class indexOfFirstIndexed {
            @DisplayName("∅")                              @Test void testEmpty()        { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfFirstIndexed()); }
            @DisplayName("null []")                        @Test void testNullArray()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfFirstIndexed(NULL_VARARGS)); }
            @DisplayName("(int, T) → boolean")             @Test void test2Arg()         { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfFirstIndexed(NULL_PREDICATE2_ALT)); }
            @DisplayName("(int) → boolean")                @Test void test1Arg()         { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfFirstIndexed(NULL_PREDICATE1_ALT)); }
            @DisplayName("() → boolean")                   @Test void test0Arg()         { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfFirstIndexed(NULL_PREDICATE0)); }
            @DisplayName("(int, T) → boolean, int")        @Test void test2Arg0()        { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfFirstIndexed(NULL_PREDICATE2_ALT, 0)); }
            @DisplayName("(int) → boolean, int")           @Test void test1Arg0()        { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfFirstIndexed(NULL_PREDICATE1_ALT, 0)); }
            @DisplayName("() → boolean, int")              @Test void test0Arg0()        { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfFirstIndexed(NULL_PREDICATE0, 0)); }
            @DisplayName("(int, T) → boolean, int?")       @Test void test2ArgNull()     { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfFirstIndexed(NULL_PREDICATE2_ALT, null)); }
            @DisplayName("(int) → boolean, int?")          @Test void test1ArgNull()     { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfFirstIndexed(NULL_PREDICATE1_ALT, null)); }
            @DisplayName("() → boolean, int?")             @Test void test0ArgNull()     { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfFirstIndexed(NULL_PREDICATE0, null)); }
            @DisplayName("(int, T) → boolean, int, int")   @Test void test2Arg00()       { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfFirstIndexed(NULL_PREDICATE2_ALT, 0, 0)); }
            @DisplayName("(int) → boolean, int, int")      @Test void test1Arg00()       { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfFirstIndexed(NULL_PREDICATE1_ALT, 0, 0)); }
            @DisplayName("() → boolean, int, int")         @Test void test0Arg00()       { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfFirstIndexed(NULL_PREDICATE0, 0, 0)); }
            @DisplayName("(int, T) → boolean, int, int?")  @Test void test2Arg0Null()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfFirstIndexed(NULL_PREDICATE2_ALT, 0, null)); }
            @DisplayName("(int) → boolean, int, int?")     @Test void test1Arg0Null()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfFirstIndexed(NULL_PREDICATE1_ALT, 0, null)); }
            @DisplayName("() → boolean, int, int?")        @Test void test0Arg0Null()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfFirstIndexed(NULL_PREDICATE0, 0, null)); }
            @DisplayName("(int, T) → boolean, int?, int")  @Test void test2ArgNull0()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfFirstIndexed(NULL_PREDICATE2_ALT, null, 0)); }
            @DisplayName("(int) → boolean, int?, int")     @Test void test1ArgNull0()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfFirstIndexed(NULL_PREDICATE1_ALT, null, 0)); }
            @DisplayName("() → boolean, int?, int")        @Test void test0ArgNull0()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfFirstIndexed(NULL_PREDICATE0, null, 0)); }
            @DisplayName("(int, T) → boolean, int?, int?") @Test void test2ArgNullNull() { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfFirstIndexed(NULL_PREDICATE2_ALT, null, null)); }
            @DisplayName("(int) → boolean, int?, int?")    @Test void test1ArgNullNull() { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfFirstIndexed(NULL_PREDICATE1_ALT, null, null)); }
            @DisplayName("() → boolean, int?, int?")       @Test void test0ArgNullNull() { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfFirstIndexed(NULL_PREDICATE0, null, null)); }
            @DisplayName("[]")                             @Test void testArray()        { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfFirstIndexed(EMPTY_ARRAY)); }
        }
        @Nested class findFirstIndexIndexed {
            @DisplayName("∅")                              @Test void testEmpty()        { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findFirstIndexIndexed()); }
            @DisplayName("null []")                        @Test void testNullArray()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findFirstIndexIndexed(NULL_VARARGS)); }
            @DisplayName("(int, T) → boolean")             @Test void test2Arg()         { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findFirstIndexIndexed(NULL_PREDICATE2_ALT)); }
            @DisplayName("(int) → boolean")                @Test void test1Arg()         { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findFirstIndexIndexed(NULL_PREDICATE1_ALT)); }
            @DisplayName("() → boolean")                   @Test void test0Arg()         { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findFirstIndexIndexed(NULL_PREDICATE0)); }
            @DisplayName("(int, T) → boolean, int")        @Test void test2Arg0()        { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findFirstIndexIndexed(NULL_PREDICATE2_ALT, 0)); }
            @DisplayName("(int) → boolean, int")           @Test void test1Arg0()        { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findFirstIndexIndexed(NULL_PREDICATE1_ALT, 0)); }
            @DisplayName("() → boolean, int")              @Test void test0Arg0()        { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findFirstIndexIndexed(NULL_PREDICATE0, 0)); }
            @DisplayName("(int, T) → boolean, int?")       @Test void test2ArgNull()     { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findFirstIndexIndexed(NULL_PREDICATE2_ALT, null)); }
            @DisplayName("(int) → boolean, int?")          @Test void test1ArgNull()     { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findFirstIndexIndexed(NULL_PREDICATE1_ALT, null)); }
            @DisplayName("() → boolean, int?")             @Test void test0ArgNull()     { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findFirstIndexIndexed(NULL_PREDICATE0, null)); }
            @DisplayName("(int, T) → boolean, int, int")   @Test void test2Arg00()       { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findFirstIndexIndexed(NULL_PREDICATE2_ALT, 0, 0)); }
            @DisplayName("(int) → boolean, int, int")      @Test void test1Arg00()       { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findFirstIndexIndexed(NULL_PREDICATE1_ALT, 0, 0)); }
            @DisplayName("() → boolean, int, int")         @Test void test0Arg00()       { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findFirstIndexIndexed(NULL_PREDICATE0, 0, 0)); }
            @DisplayName("(int, T) → boolean, int, int?")  @Test void test2Arg0Null()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findFirstIndexIndexed(NULL_PREDICATE2_ALT, 0, null)); }
            @DisplayName("(int) → boolean, int, int?")     @Test void test1Arg0Null()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findFirstIndexIndexed(NULL_PREDICATE1_ALT, 0, null)); }
            @DisplayName("() → boolean, int, int?")        @Test void test0Arg0Null()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findFirstIndexIndexed(NULL_PREDICATE0, 0, null)); }
            @DisplayName("(int, T) → boolean, int?, int")  @Test void test2ArgNull0()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findFirstIndexIndexed(NULL_PREDICATE2_ALT, null, 0)); }
            @DisplayName("(int) → boolean, int?, int")     @Test void test1ArgNull0()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findFirstIndexIndexed(NULL_PREDICATE1_ALT, null, 0)); }
            @DisplayName("() → boolean, int?, int")        @Test void test0ArgNull0()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findFirstIndexIndexed(NULL_PREDICATE0, null, 0)); }
            @DisplayName("(int, T) → boolean, int?, int?") @Test void test2ArgNullNull() { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findFirstIndexIndexed(NULL_PREDICATE2_ALT, null, null)); }
            @DisplayName("(int) → boolean, int?, int?")    @Test void test1ArgNullNull() { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findFirstIndexIndexed(NULL_PREDICATE1_ALT, null, null)); }
            @DisplayName("() → boolean, int?, int?")       @Test void test0ArgNullNull() { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findFirstIndexIndexed(NULL_PREDICATE0, null, null)); }
            @DisplayName("[]")                             @Test void testArray()        { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findFirstIndexIndexed(EMPTY_ARRAY)); }
        }
        @Nested class findIndexIndexed {
            @DisplayName("∅")                              @Test void testEmpty()        { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findIndexIndexed()); }
            @DisplayName("null []")                        @Test void testNullArray()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findIndexIndexed(NULL_VARARGS)); }
            @DisplayName("(int, T) → boolean")             @Test void test2Arg()         { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findIndexIndexed(NULL_PREDICATE2_ALT)); }
            @DisplayName("(int) → boolean")                @Test void test1Arg()         { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findIndexIndexed(NULL_PREDICATE1_ALT)); }
            @DisplayName("() → boolean")                   @Test void test0Arg()         { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findIndexIndexed(NULL_PREDICATE0)); }
            @DisplayName("(int, T) → boolean, int")        @Test void test2Arg0()        { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findIndexIndexed(NULL_PREDICATE2_ALT, 0)); }
            @DisplayName("(int) → boolean, int")           @Test void test1Arg0()        { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findIndexIndexed(NULL_PREDICATE1_ALT, 0)); }
            @DisplayName("() → boolean, int")              @Test void test0Arg0()        { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findIndexIndexed(NULL_PREDICATE0, 0)); }
            @DisplayName("(int, T) → boolean, int?")       @Test void test2ArgNull()     { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findIndexIndexed(NULL_PREDICATE2_ALT, null)); }
            @DisplayName("(int) → boolean, int?")          @Test void test1ArgNull()     { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findIndexIndexed(NULL_PREDICATE1_ALT, null)); }
            @DisplayName("() → boolean, int?")             @Test void test0ArgNull()     { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findIndexIndexed(NULL_PREDICATE0, null)); }
            @DisplayName("(int, T) → boolean, int, int")   @Test void test2Arg00()       { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findIndexIndexed(NULL_PREDICATE2_ALT, 0, 0)); }
            @DisplayName("(int) → boolean, int, int")      @Test void test1Arg00()       { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findIndexIndexed(NULL_PREDICATE1_ALT, 0, 0)); }
            @DisplayName("() → boolean, int, int")         @Test void test0Arg00()       { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findIndexIndexed(NULL_PREDICATE0, 0, 0)); }
            @DisplayName("(int, T) → boolean, int, int?")  @Test void test2Arg0Null()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findIndexIndexed(NULL_PREDICATE2_ALT, 0, null)); }
            @DisplayName("(int) → boolean, int, int?")     @Test void test1Arg0Null()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findIndexIndexed(NULL_PREDICATE1_ALT, 0, null)); }
            @DisplayName("() → boolean, int, int?")        @Test void test0Arg0Null()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findIndexIndexed(NULL_PREDICATE0, 0, null)); }
            @DisplayName("(int, T) → boolean, int?, int")  @Test void test2ArgNull0()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findIndexIndexed(NULL_PREDICATE2_ALT, null, 0)); }
            @DisplayName("(int) → boolean, int?, int")     @Test void test1ArgNull0()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findIndexIndexed(NULL_PREDICATE1_ALT, null, 0)); }
            @DisplayName("() → boolean, int?, int")        @Test void test0ArgNull0()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findIndexIndexed(NULL_PREDICATE0, null, 0)); }
            @DisplayName("(int, T) → boolean, int?, int?") @Test void test2ArgNullNull() { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findIndexIndexed(NULL_PREDICATE2_ALT, null, null)); }
            @DisplayName("(int) → boolean, int?, int?")    @Test void test1ArgNullNull() { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findIndexIndexed(NULL_PREDICATE1_ALT, null, null)); }
            @DisplayName("() → boolean, int?, int?")       @Test void test0ArgNullNull() { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findIndexIndexed(NULL_PREDICATE0, null, null)); }
            @DisplayName("[]")                             @Test void testArray()        { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findIndexIndexed(EMPTY_ARRAY)); }
        }
        @Nested class indexOfFirstIndexedOrNull {
            @DisplayName("∅")                              @Test void testEmpty()        { assertNull(instance.indexOfFirstIndexedOrNull()); }
            @DisplayName("null []")                        @Test void testNullArray()    { assertNull(instance.indexOfFirstIndexedOrNull(NULL_VARARGS)); }
            @DisplayName("(int, T) → boolean")             @Test void test2Arg()         { assertNull(instance.indexOfFirstIndexedOrNull(NULL_PREDICATE2_ALT)); }
            @DisplayName("(int) → boolean")                @Test void test1Arg()         { assertNull(instance.indexOfFirstIndexedOrNull(NULL_PREDICATE1_ALT)); }
            @DisplayName("() → boolean")                   @Test void test0Arg()         { assertNull(instance.indexOfFirstIndexedOrNull(NULL_PREDICATE0)); }
            @DisplayName("(int, T) → boolean, int")        @Test void test2Arg0()        { assertNull(instance.indexOfFirstIndexedOrNull(NULL_PREDICATE2_ALT, 0)); }
            @DisplayName("(int) → boolean, int")           @Test void test1Arg0()        { assertNull(instance.indexOfFirstIndexedOrNull(NULL_PREDICATE1_ALT, 0)); }
            @DisplayName("() → boolean, int")              @Test void test0Arg0()        { assertNull(instance.indexOfFirstIndexedOrNull(NULL_PREDICATE0, 0)); }
            @DisplayName("(int, T) → boolean, int?")       @Test void test2ArgNull()     { assertNull(instance.indexOfFirstIndexedOrNull(NULL_PREDICATE2_ALT, null)); }
            @DisplayName("(int) → boolean, int?")          @Test void test1ArgNull()     { assertNull(instance.indexOfFirstIndexedOrNull(NULL_PREDICATE1_ALT, null)); }
            @DisplayName("() → boolean, int?")             @Test void test0ArgNull()     { assertNull(instance.indexOfFirstIndexedOrNull(NULL_PREDICATE0, null)); }
            @DisplayName("(int, T) → boolean, int, int")   @Test void test2Arg00()       { assertNull(instance.indexOfFirstIndexedOrNull(NULL_PREDICATE2_ALT, 0, 0)); }
            @DisplayName("(int) → boolean, int, int")      @Test void test1Arg00()       { assertNull(instance.indexOfFirstIndexedOrNull(NULL_PREDICATE1_ALT, 0, 0)); }
            @DisplayName("() → boolean, int, int")         @Test void test0Arg00()       { assertNull(instance.indexOfFirstIndexedOrNull(NULL_PREDICATE0, 0, 0)); }
            @DisplayName("(int, T) → boolean, int, int?")  @Test void test2Arg0Null()    { assertNull(instance.indexOfFirstIndexedOrNull(NULL_PREDICATE2_ALT, 0, null)); }
            @DisplayName("(int) → boolean, int, int?")     @Test void test1Arg0Null()    { assertNull(instance.indexOfFirstIndexedOrNull(NULL_PREDICATE1_ALT, 0, null)); }
            @DisplayName("() → boolean, int, int?")        @Test void test0Arg0Null()    { assertNull(instance.indexOfFirstIndexedOrNull(NULL_PREDICATE0, 0, null)); }
            @DisplayName("(int, T) → boolean, int?, int")  @Test void test2ArgNull0()    { assertNull(instance.indexOfFirstIndexedOrNull(NULL_PREDICATE2_ALT, null, 0)); }
            @DisplayName("(int) → boolean, int?, int")     @Test void test1ArgNull0()    { assertNull(instance.indexOfFirstIndexedOrNull(NULL_PREDICATE1_ALT, null, 0)); }
            @DisplayName("() → boolean, int?, int")        @Test void test0ArgNull0()    { assertNull(instance.indexOfFirstIndexedOrNull(NULL_PREDICATE0, null, 0)); }
            @DisplayName("(int, T) → boolean, int?, int?") @Test void test2ArgNullNull() { assertNull(instance.indexOfFirstIndexedOrNull(NULL_PREDICATE2_ALT, null, null)); }
            @DisplayName("(int) → boolean, int?, int?")    @Test void test1ArgNullNull() { assertNull(instance.indexOfFirstIndexedOrNull(NULL_PREDICATE1_ALT, null, null)); }
            @DisplayName("() → boolean, int?, int?")       @Test void test0ArgNullNull() { assertNull(instance.indexOfFirstIndexedOrNull(NULL_PREDICATE0, null, null)); }
            @DisplayName("[]")                             @Test void testArray()        { assertNull(instance.indexOfFirstIndexedOrNull(EMPTY_ARRAY)); }
        }
        @Nested class findFirstIndexIndexedOrNull {
            @DisplayName("∅")                              @Test void testEmpty()        { assertNull(instance.findFirstIndexIndexedOrNull()); }
            @DisplayName("null []")                        @Test void testNullArray()    { assertNull(instance.findFirstIndexIndexedOrNull(NULL_VARARGS)); }
            @DisplayName("(int, T) → boolean")             @Test void test2Arg()         { assertNull(instance.findFirstIndexIndexedOrNull(NULL_PREDICATE2_ALT)); }
            @DisplayName("(int) → boolean")                @Test void test1Arg()         { assertNull(instance.findFirstIndexIndexedOrNull(NULL_PREDICATE1_ALT)); }
            @DisplayName("() → boolean")                   @Test void test0Arg()         { assertNull(instance.findFirstIndexIndexedOrNull(NULL_PREDICATE0)); }
            @DisplayName("(int, T) → boolean, int")        @Test void test2Arg0()        { assertNull(instance.findFirstIndexIndexedOrNull(NULL_PREDICATE2_ALT, 0)); }
            @DisplayName("(int) → boolean, int")           @Test void test1Arg0()        { assertNull(instance.findFirstIndexIndexedOrNull(NULL_PREDICATE1_ALT, 0)); }
            @DisplayName("() → boolean, int")              @Test void test0Arg0()        { assertNull(instance.findFirstIndexIndexedOrNull(NULL_PREDICATE0, 0)); }
            @DisplayName("(int, T) → boolean, int?")       @Test void test2ArgNull()     { assertNull(instance.findFirstIndexIndexedOrNull(NULL_PREDICATE2_ALT, null)); }
            @DisplayName("(int) → boolean, int?")          @Test void test1ArgNull()     { assertNull(instance.findFirstIndexIndexedOrNull(NULL_PREDICATE1_ALT, null)); }
            @DisplayName("() → boolean, int?")             @Test void test0ArgNull()     { assertNull(instance.findFirstIndexIndexedOrNull(NULL_PREDICATE0, null)); }
            @DisplayName("(int, T) → boolean, int, int")   @Test void test2Arg00()       { assertNull(instance.findFirstIndexIndexedOrNull(NULL_PREDICATE2_ALT, 0, 0)); }
            @DisplayName("(int) → boolean, int, int")      @Test void test1Arg00()       { assertNull(instance.findFirstIndexIndexedOrNull(NULL_PREDICATE1_ALT, 0, 0)); }
            @DisplayName("() → boolean, int, int")         @Test void test0Arg00()       { assertNull(instance.findFirstIndexIndexedOrNull(NULL_PREDICATE0, 0, 0)); }
            @DisplayName("(int, T) → boolean, int, int?")  @Test void test2Arg0Null()    { assertNull(instance.findFirstIndexIndexedOrNull(NULL_PREDICATE2_ALT, 0, null)); }
            @DisplayName("(int) → boolean, int, int?")     @Test void test1Arg0Null()    { assertNull(instance.findFirstIndexIndexedOrNull(NULL_PREDICATE1_ALT, 0, null)); }
            @DisplayName("() → boolean, int, int?")        @Test void test0Arg0Null()    { assertNull(instance.findFirstIndexIndexedOrNull(NULL_PREDICATE0, 0, null)); }
            @DisplayName("(int, T) → boolean, int?, int")  @Test void test2ArgNull0()    { assertNull(instance.findFirstIndexIndexedOrNull(NULL_PREDICATE2_ALT, null, 0)); }
            @DisplayName("(int) → boolean, int?, int")     @Test void test1ArgNull0()    { assertNull(instance.findFirstIndexIndexedOrNull(NULL_PREDICATE1_ALT, null, 0)); }
            @DisplayName("() → boolean, int?, int")        @Test void test0ArgNull0()    { assertNull(instance.findFirstIndexIndexedOrNull(NULL_PREDICATE0, null, 0)); }
            @DisplayName("(int, T) → boolean, int?, int?") @Test void test2ArgNullNull() { assertNull(instance.findFirstIndexIndexedOrNull(NULL_PREDICATE2_ALT, null, null)); }
            @DisplayName("(int) → boolean, int?, int?")    @Test void test1ArgNullNull() { assertNull(instance.findFirstIndexIndexedOrNull(NULL_PREDICATE1_ALT, null, null)); }
            @DisplayName("() → boolean, int?, int?")       @Test void test0ArgNullNull() { assertNull(instance.findFirstIndexIndexedOrNull(NULL_PREDICATE0, null, null)); }
            @DisplayName("[]")                             @Test void testArray()        { assertNull(instance.findFirstIndexIndexedOrNull(EMPTY_ARRAY)); }
        }
        @Nested class findIndexIndexedOrNull {
            @DisplayName("∅")                              @Test void testEmpty()        { assertNull(instance.findIndexIndexedOrNull()); }
            @DisplayName("null []")                        @Test void testNullArray()    { assertNull(instance.findIndexIndexedOrNull(NULL_VARARGS)); }
            @DisplayName("(int, T) → boolean")             @Test void test2Arg()         { assertNull(instance.findIndexIndexedOrNull(NULL_PREDICATE2_ALT)); }
            @DisplayName("(int) → boolean")                @Test void test1Arg()         { assertNull(instance.findIndexIndexedOrNull(NULL_PREDICATE1_ALT)); }
            @DisplayName("() → boolean")                   @Test void test0Arg()         { assertNull(instance.findIndexIndexedOrNull(NULL_PREDICATE0)); }
            @DisplayName("(int, T) → boolean, int")        @Test void test2Arg0()        { assertNull(instance.findIndexIndexedOrNull(NULL_PREDICATE2_ALT, 0)); }
            @DisplayName("(int) → boolean, int")           @Test void test1Arg0()        { assertNull(instance.findIndexIndexedOrNull(NULL_PREDICATE1_ALT, 0)); }
            @DisplayName("() → boolean, int")              @Test void test0Arg0()        { assertNull(instance.findIndexIndexedOrNull(NULL_PREDICATE0, 0)); }
            @DisplayName("(int, T) → boolean, int?")       @Test void test2ArgNull()     { assertNull(instance.findIndexIndexedOrNull(NULL_PREDICATE2_ALT, null)); }
            @DisplayName("(int) → boolean, int?")          @Test void test1ArgNull()     { assertNull(instance.findIndexIndexedOrNull(NULL_PREDICATE1_ALT, null)); }
            @DisplayName("() → boolean, int?")             @Test void test0ArgNull()     { assertNull(instance.findIndexIndexedOrNull(NULL_PREDICATE0, null)); }
            @DisplayName("(int, T) → boolean, int, int")   @Test void test2Arg00()       { assertNull(instance.findIndexIndexedOrNull(NULL_PREDICATE2_ALT, 0, 0)); }
            @DisplayName("(int) → boolean, int, int")      @Test void test1Arg00()       { assertNull(instance.findIndexIndexedOrNull(NULL_PREDICATE1_ALT, 0, 0)); }
            @DisplayName("() → boolean, int, int")         @Test void test0Arg00()       { assertNull(instance.findIndexIndexedOrNull(NULL_PREDICATE0, 0, 0)); }
            @DisplayName("(int, T) → boolean, int, int?")  @Test void test2Arg0Null()    { assertNull(instance.findIndexIndexedOrNull(NULL_PREDICATE2_ALT, 0, null)); }
            @DisplayName("(int) → boolean, int, int?")     @Test void test1Arg0Null()    { assertNull(instance.findIndexIndexedOrNull(NULL_PREDICATE1_ALT, 0, null)); }
            @DisplayName("() → boolean, int, int?")        @Test void test0Arg0Null()    { assertNull(instance.findIndexIndexedOrNull(NULL_PREDICATE0, 0, null)); }
            @DisplayName("(int, T) → boolean, int?, int")  @Test void test2ArgNull0()    { assertNull(instance.findIndexIndexedOrNull(NULL_PREDICATE2_ALT, null, 0)); }
            @DisplayName("(int) → boolean, int?, int")     @Test void test1ArgNull0()    { assertNull(instance.findIndexIndexedOrNull(NULL_PREDICATE1_ALT, null, 0)); }
            @DisplayName("() → boolean, int?, int")        @Test void test0ArgNull0()    { assertNull(instance.findIndexIndexedOrNull(NULL_PREDICATE0, null, 0)); }
            @DisplayName("(int, T) → boolean, int?, int?") @Test void test2ArgNullNull() { assertNull(instance.findIndexIndexedOrNull(NULL_PREDICATE2_ALT, null, null)); }
            @DisplayName("(int) → boolean, int?, int?")    @Test void test1ArgNullNull() { assertNull(instance.findIndexIndexedOrNull(NULL_PREDICATE1_ALT, null, null)); }
            @DisplayName("() → boolean, int?, int?")       @Test void test0ArgNullNull() { assertNull(instance.findIndexIndexedOrNull(NULL_PREDICATE0, null, null)); }
            @DisplayName("[]")                             @Test void testArray()        { assertNull(instance.findIndexIndexedOrNull(EMPTY_ARRAY)); }
        }

        @Nested class indexOfLast {
            @DisplayName("∅")                              @Test void testEmpty()        { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfLast()); }
            @DisplayName("null []")                        @Test void testNullArray()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfLast(NULL_VARARGS)); }
            @DisplayName("(T, int) → boolean")             @Test void test2Arg()         { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfLast(NULL_PREDICATE2)); }
            @DisplayName("(T) → boolean")                  @Test void test1Arg()         { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfLast(NULL_PREDICATE1)); }
            @DisplayName("() → boolean")                   @Test void test0Arg()         { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfLast(NULL_PREDICATE0)); }
            @DisplayName("(T, int) → boolean, int")        @Test void test2Arg0()        { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfLast(NULL_PREDICATE2, 0)); }
            @DisplayName("(T) → boolean, int")             @Test void test1Arg0()        { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfLast(NULL_PREDICATE1, 0)); }
            @DisplayName("() → boolean, int")              @Test void test0Arg0()        { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfLast(NULL_PREDICATE0, 0)); }
            @DisplayName("(T, int) → boolean, int?")       @Test void test2ArgNull()     { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfLast(NULL_PREDICATE2, null)); }
            @DisplayName("(T) → boolean, int?")            @Test void test1ArgNull()     { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfLast(NULL_PREDICATE1, null)); }
            @DisplayName("() → boolean, int?")             @Test void test0ArgNull()     { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfLast(NULL_PREDICATE0, null)); }
            @DisplayName("(T, int) → boolean, int, int")   @Test void test2Arg00()       { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfLast(NULL_PREDICATE2, 0, 0)); }
            @DisplayName("(T) → boolean, int, int")        @Test void test1Arg00()       { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfLast(NULL_PREDICATE1, 0, 0)); }
            @DisplayName("() → boolean, int, int")         @Test void test0Arg00()       { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfLast(NULL_PREDICATE0, 0, 0)); }
            @DisplayName("(T, int) → boolean, int, int?")  @Test void test2Arg0Null()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfLast(NULL_PREDICATE2, 0, null)); }
            @DisplayName("(T) → boolean, int, int?")       @Test void test1Arg0Null()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfLast(NULL_PREDICATE1, 0, null)); }
            @DisplayName("() → boolean, int, int?")        @Test void test0Arg0Null()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfLast(NULL_PREDICATE0, 0, null)); }
            @DisplayName("(T, int) → boolean, int?, int")  @Test void test2ArgNull0()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfLast(NULL_PREDICATE2, null, 0)); }
            @DisplayName("(T) → boolean, int?, int")       @Test void test1ArgNull0()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfLast(NULL_PREDICATE1, null, 0)); }
            @DisplayName("() → boolean, int?, int")        @Test void test0ArgNull0()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfLast(NULL_PREDICATE0, null, 0)); }
            @DisplayName("(T, int) → boolean, int?, int?") @Test void test2ArgNullNull() { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfLast(NULL_PREDICATE2, null, null)); }
            @DisplayName("(T) → boolean, int?, int?")      @Test void test1ArgNullNull() { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfLast(NULL_PREDICATE1, null, null)); }
            @DisplayName("() → boolean, int?, int?")       @Test void test0ArgNullNull() { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfLast(NULL_PREDICATE0, null, null)); }
            @DisplayName("[]")                             @Test void testArray()        { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfLast(EMPTY_ARRAY)); }
        }
        @Nested class findLastIndex {
            @DisplayName("∅")                              @Test void testEmpty()        { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findLastIndex()); }
            @DisplayName("null []")                        @Test void testNullArray()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findLastIndex(NULL_VARARGS)); }
            @DisplayName("(T, int) → boolean")             @Test void test2Arg()         { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findLastIndex(NULL_PREDICATE2)); }
            @DisplayName("(T) → boolean")                  @Test void test1Arg()         { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findLastIndex(NULL_PREDICATE1)); }
            @DisplayName("() → boolean")                   @Test void test0Arg()         { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findLastIndex(NULL_PREDICATE0)); }
            @DisplayName("(T, int) → boolean, int")        @Test void test2Arg0()        { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findLastIndex(NULL_PREDICATE2, 0)); }
            @DisplayName("(T) → boolean, int")             @Test void test1Arg0()        { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findLastIndex(NULL_PREDICATE1, 0)); }
            @DisplayName("() → boolean, int")              @Test void test0Arg0()        { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findLastIndex(NULL_PREDICATE0, 0)); }
            @DisplayName("(T, int) → boolean, int?")       @Test void test2ArgNull()     { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findLastIndex(NULL_PREDICATE2, null)); }
            @DisplayName("(T) → boolean, int?")            @Test void test1ArgNull()     { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findLastIndex(NULL_PREDICATE1, null)); }
            @DisplayName("() → boolean, int?")             @Test void test0ArgNull()     { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findLastIndex(NULL_PREDICATE0, null)); }
            @DisplayName("(T, int) → boolean, int, int")   @Test void test2Arg00()       { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findLastIndex(NULL_PREDICATE2, 0, 0)); }
            @DisplayName("(T) → boolean, int, int")        @Test void test1Arg00()       { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findLastIndex(NULL_PREDICATE1, 0, 0)); }
            @DisplayName("() → boolean, int, int")         @Test void test0Arg00()       { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findLastIndex(NULL_PREDICATE0, 0, 0)); }
            @DisplayName("(T, int) → boolean, int, int?")  @Test void test2Arg0Null()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findLastIndex(NULL_PREDICATE2, 0, null)); }
            @DisplayName("(T) → boolean, int, int?")       @Test void test1Arg0Null()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findLastIndex(NULL_PREDICATE1, 0, null)); }
            @DisplayName("() → boolean, int, int?")        @Test void test0Arg0Null()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findLastIndex(NULL_PREDICATE0, 0, null)); }
            @DisplayName("(T, int) → boolean, int?, int")  @Test void test2ArgNull0()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findLastIndex(NULL_PREDICATE2, null, 0)); }
            @DisplayName("(T) → boolean, int?, int")       @Test void test1ArgNull0()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findLastIndex(NULL_PREDICATE1, null, 0)); }
            @DisplayName("() → boolean, int?, int")        @Test void test0ArgNull0()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findLastIndex(NULL_PREDICATE0, null, 0)); }
            @DisplayName("(T, int) → boolean, int?, int?") @Test void test2ArgNullNull() { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findLastIndex(NULL_PREDICATE2, null, null)); }
            @DisplayName("(T) → boolean, int?, int?")      @Test void test1ArgNullNull() { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findLastIndex(NULL_PREDICATE1, null, null)); }
            @DisplayName("() → boolean, int?, int?")       @Test void test0ArgNullNull() { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findLastIndex(NULL_PREDICATE0, null, null)); }
            @DisplayName("[]")                             @Test void testArray()        { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findLastIndex(EMPTY_ARRAY)); }
        }
        @Nested class indexOfLastOrNull {
            @DisplayName("∅")                              @Test void testEmpty()        { assertNull(instance.indexOfLastOrNull()); }
            @DisplayName("null []")                        @Test void testNullArray()    { assertNull(instance.indexOfLastOrNull(NULL_VARARGS)); }
            @DisplayName("(T, int) → boolean")             @Test void test2Arg()         { assertNull(instance.indexOfLastOrNull(NULL_PREDICATE2)); }
            @DisplayName("(T) → boolean")                  @Test void test1Arg()         { assertNull(instance.indexOfLastOrNull(NULL_PREDICATE1)); }
            @DisplayName("() → boolean")                   @Test void test0Arg()         { assertNull(instance.indexOfLastOrNull(NULL_PREDICATE0)); }
            @DisplayName("(T, int) → boolean, int")        @Test void test2Arg0()        { assertNull(instance.indexOfLastOrNull(NULL_PREDICATE2, 0)); }
            @DisplayName("(T) → boolean, int")             @Test void test1Arg0()        { assertNull(instance.indexOfLastOrNull(NULL_PREDICATE1, 0)); }
            @DisplayName("() → boolean, int")              @Test void test0Arg0()        { assertNull(instance.indexOfLastOrNull(NULL_PREDICATE0, 0)); }
            @DisplayName("(T, int) → boolean, int?")       @Test void test2ArgNull()     { assertNull(instance.indexOfLastOrNull(NULL_PREDICATE2, null)); }
            @DisplayName("(T) → boolean, int?")            @Test void test1ArgNull()     { assertNull(instance.indexOfLastOrNull(NULL_PREDICATE1, null)); }
            @DisplayName("() → boolean, int?")             @Test void test0ArgNull()     { assertNull(instance.indexOfLastOrNull(NULL_PREDICATE0, null)); }
            @DisplayName("(T, int) → boolean, int, int")   @Test void test2Arg00()       { assertNull(instance.indexOfLastOrNull(NULL_PREDICATE2, 0, 0)); }
            @DisplayName("(T) → boolean, int, int")        @Test void test1Arg00()       { assertNull(instance.indexOfLastOrNull(NULL_PREDICATE1, 0, 0)); }
            @DisplayName("() → boolean, int, int")         @Test void test0Arg00()       { assertNull(instance.indexOfLastOrNull(NULL_PREDICATE0, 0, 0)); }
            @DisplayName("(T, int) → boolean, int, int?")  @Test void test2Arg0Null()    { assertNull(instance.indexOfLastOrNull(NULL_PREDICATE2, 0, null)); }
            @DisplayName("(T) → boolean, int, int?")       @Test void test1Arg0Null()    { assertNull(instance.indexOfLastOrNull(NULL_PREDICATE1, 0, null)); }
            @DisplayName("() → boolean, int, int?")        @Test void test0Arg0Null()    { assertNull(instance.indexOfLastOrNull(NULL_PREDICATE0, 0, null)); }
            @DisplayName("(T, int) → boolean, int?, int")  @Test void test2ArgNull0()    { assertNull(instance.indexOfLastOrNull(NULL_PREDICATE2, null, 0)); }
            @DisplayName("(T) → boolean, int?, int")       @Test void test1ArgNull0()    { assertNull(instance.indexOfLastOrNull(NULL_PREDICATE1, null, 0)); }
            @DisplayName("() → boolean, int?, int")        @Test void test0ArgNull0()    { assertNull(instance.indexOfLastOrNull(NULL_PREDICATE0, null, 0)); }
            @DisplayName("(T, int) → boolean, int?, int?") @Test void test2ArgNullNull() { assertNull(instance.indexOfLastOrNull(NULL_PREDICATE2, null, null)); }
            @DisplayName("(T) → boolean, int?, int?")      @Test void test1ArgNullNull() { assertNull(instance.indexOfLastOrNull(NULL_PREDICATE1, null, null)); }
            @DisplayName("() → boolean, int?, int?")       @Test void test0ArgNullNull() { assertNull(instance.indexOfLastOrNull(NULL_PREDICATE0, null, null)); }
            @DisplayName("[]")                             @Test void testArray()        { assertNull(instance.indexOfLastOrNull(EMPTY_ARRAY)); }
        }
        @Nested class findLastIndexOrNull {
            @DisplayName("∅")                              @Test void testEmpty()        { assertNull(instance.findLastIndexOrNull()); }
            @DisplayName("null []")                        @Test void testNullArray()    { assertNull(instance.findLastIndexOrNull(NULL_VARARGS)); }
            @DisplayName("(T, int) → boolean")             @Test void test2Arg()         { assertNull(instance.findLastIndexOrNull(NULL_PREDICATE2)); }
            @DisplayName("(T) → boolean")                  @Test void test1Arg()         { assertNull(instance.findLastIndexOrNull(NULL_PREDICATE1)); }
            @DisplayName("() → boolean")                   @Test void test0Arg()         { assertNull(instance.findLastIndexOrNull(NULL_PREDICATE0)); }
            @DisplayName("(T, int) → boolean, int")        @Test void test2Arg0()        { assertNull(instance.findLastIndexOrNull(NULL_PREDICATE2, 0)); }
            @DisplayName("(T) → boolean, int")             @Test void test1Arg0()        { assertNull(instance.findLastIndexOrNull(NULL_PREDICATE1, 0)); }
            @DisplayName("() → boolean, int")              @Test void test0Arg0()        { assertNull(instance.findLastIndexOrNull(NULL_PREDICATE0, 0)); }
            @DisplayName("(T, int) → boolean, int?")       @Test void test2ArgNull()     { assertNull(instance.findLastIndexOrNull(NULL_PREDICATE2, null)); }
            @DisplayName("(T) → boolean, int?")            @Test void test1ArgNull()     { assertNull(instance.findLastIndexOrNull(NULL_PREDICATE1, null)); }
            @DisplayName("() → boolean, int?")             @Test void test0ArgNull()     { assertNull(instance.findLastIndexOrNull(NULL_PREDICATE0, null)); }
            @DisplayName("(T, int) → boolean, int, int")   @Test void test2Arg00()       { assertNull(instance.findLastIndexOrNull(NULL_PREDICATE2, 0, 0)); }
            @DisplayName("(T) → boolean, int, int")        @Test void test1Arg00()       { assertNull(instance.findLastIndexOrNull(NULL_PREDICATE1, 0, 0)); }
            @DisplayName("() → boolean, int, int")         @Test void test0Arg00()       { assertNull(instance.findLastIndexOrNull(NULL_PREDICATE0, 0, 0)); }
            @DisplayName("(T, int) → boolean, int, int?")  @Test void test2Arg0Null()    { assertNull(instance.findLastIndexOrNull(NULL_PREDICATE2, 0, null)); }
            @DisplayName("(T) → boolean, int, int?")       @Test void test1Arg0Null()    { assertNull(instance.findLastIndexOrNull(NULL_PREDICATE1, 0, null)); }
            @DisplayName("() → boolean, int, int?")        @Test void test0Arg0Null()    { assertNull(instance.findLastIndexOrNull(NULL_PREDICATE0, 0, null)); }
            @DisplayName("(T, int) → boolean, int?, int")  @Test void test2ArgNull0()    { assertNull(instance.findLastIndexOrNull(NULL_PREDICATE2, null, 0)); }
            @DisplayName("(T) → boolean, int?, int")       @Test void test1ArgNull0()    { assertNull(instance.findLastIndexOrNull(NULL_PREDICATE1, null, 0)); }
            @DisplayName("() → boolean, int?, int")        @Test void test0ArgNull0()    { assertNull(instance.findLastIndexOrNull(NULL_PREDICATE0, null, 0)); }
            @DisplayName("(T, int) → boolean, int?, int?") @Test void test2ArgNullNull() { assertNull(instance.findLastIndexOrNull(NULL_PREDICATE2, null, null)); }
            @DisplayName("(T) → boolean, int?, int?")      @Test void test1ArgNullNull() { assertNull(instance.findLastIndexOrNull(NULL_PREDICATE1, null, null)); }
            @DisplayName("() → boolean, int?, int?")       @Test void test0ArgNullNull() { assertNull(instance.findLastIndexOrNull(NULL_PREDICATE0, null, null)); }
            @DisplayName("[]")                             @Test void testArray()        { assertNull(instance.findLastIndexOrNull(EMPTY_ARRAY)); }
        }
        @Nested class indexOfLastIndexed {
            @DisplayName("∅")                              @Test void testEmpty()        { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfLastIndexed()); }
            @DisplayName("null []")                        @Test void testNullArray()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfLastIndexed(NULL_VARARGS)); }
            @DisplayName("(int, T) → boolean")             @Test void test2Arg()         { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfLastIndexed(NULL_PREDICATE2_ALT)); }
            @DisplayName("(int) → boolean")                @Test void test1Arg()         { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfLastIndexed(NULL_PREDICATE1_ALT)); }
            @DisplayName("() → boolean")                   @Test void test0Arg()         { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfLastIndexed(NULL_PREDICATE0)); }
            @DisplayName("(int, T) → boolean, int")        @Test void test2Arg0()        { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfLastIndexed(NULL_PREDICATE2_ALT, 0)); }
            @DisplayName("(int) → boolean, int")           @Test void test1Arg0()        { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfLastIndexed(NULL_PREDICATE1_ALT, 0)); }
            @DisplayName("() → boolean, int")              @Test void test0Arg0()        { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfLastIndexed(NULL_PREDICATE0, 0)); }
            @DisplayName("(int, T) → boolean, int?")       @Test void test2ArgNull()     { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfLastIndexed(NULL_PREDICATE2_ALT, null)); }
            @DisplayName("(int) → boolean, int?")          @Test void test1ArgNull()     { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfLastIndexed(NULL_PREDICATE1_ALT, null)); }
            @DisplayName("() → boolean, int?")             @Test void test0ArgNull()     { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfLastIndexed(NULL_PREDICATE0, null)); }
            @DisplayName("(int, T) → boolean, int, int")   @Test void test2Arg00()       { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfLastIndexed(NULL_PREDICATE2_ALT, 0, 0)); }
            @DisplayName("(int) → boolean, int, int")      @Test void test1Arg00()       { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfLastIndexed(NULL_PREDICATE1_ALT, 0, 0)); }
            @DisplayName("() → boolean, int, int")         @Test void test0Arg00()       { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfLastIndexed(NULL_PREDICATE0, 0, 0)); }
            @DisplayName("(int, T) → boolean, int, int?")  @Test void test2Arg0Null()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfLastIndexed(NULL_PREDICATE2_ALT, 0, null)); }
            @DisplayName("(int) → boolean, int, int?")     @Test void test1Arg0Null()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfLastIndexed(NULL_PREDICATE1_ALT, 0, null)); }
            @DisplayName("() → boolean, int, int?")        @Test void test0Arg0Null()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfLastIndexed(NULL_PREDICATE0, 0, null)); }
            @DisplayName("(int, T) → boolean, int?, int")  @Test void test2ArgNull0()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfLastIndexed(NULL_PREDICATE2_ALT, null, 0)); }
            @DisplayName("(int) → boolean, int?, int")     @Test void test1ArgNull0()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfLastIndexed(NULL_PREDICATE1_ALT, null, 0)); }
            @DisplayName("() → boolean, int?, int")        @Test void test0ArgNull0()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfLastIndexed(NULL_PREDICATE0, null, 0)); }
            @DisplayName("(int, T) → boolean, int?, int?") @Test void test2ArgNullNull() { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfLastIndexed(NULL_PREDICATE2_ALT, null, null)); }
            @DisplayName("(int) → boolean, int?, int?")    @Test void test1ArgNullNull() { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfLastIndexed(NULL_PREDICATE1_ALT, null, null)); }
            @DisplayName("() → boolean, int?, int?")       @Test void test0ArgNullNull() { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfLastIndexed(NULL_PREDICATE0, null, null)); }
            @DisplayName("[]")                             @Test void testArray()        { assertThrowsExactly(EmptyCollectionException.class, () -> instance.indexOfLastIndexed(EMPTY_ARRAY)); }
        }
        @Nested class findLastIndexIndexed {
            @DisplayName("∅")                              @Test void testEmpty()        { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findLastIndexIndexed()); }
            @DisplayName("null []")                        @Test void testNullArray()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findLastIndexIndexed(NULL_VARARGS)); }
            @DisplayName("(int, T) → boolean")             @Test void test2Arg()         { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findLastIndexIndexed(NULL_PREDICATE2_ALT)); }
            @DisplayName("(int) → boolean")                @Test void test1Arg()         { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findLastIndexIndexed(NULL_PREDICATE1_ALT)); }
            @DisplayName("() → boolean")                   @Test void test0Arg()         { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findLastIndexIndexed(NULL_PREDICATE0)); }
            @DisplayName("(int, T) → boolean, int")        @Test void test2Arg0()        { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findLastIndexIndexed(NULL_PREDICATE2_ALT, 0)); }
            @DisplayName("(int) → boolean, int")           @Test void test1Arg0()        { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findLastIndexIndexed(NULL_PREDICATE1_ALT, 0)); }
            @DisplayName("() → boolean, int")              @Test void test0Arg0()        { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findLastIndexIndexed(NULL_PREDICATE0, 0)); }
            @DisplayName("(int, T) → boolean, int?")       @Test void test2ArgNull()     { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findLastIndexIndexed(NULL_PREDICATE2_ALT, null)); }
            @DisplayName("(int) → boolean, int?")          @Test void test1ArgNull()     { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findLastIndexIndexed(NULL_PREDICATE1_ALT, null)); }
            @DisplayName("() → boolean, int?")             @Test void test0ArgNull()     { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findLastIndexIndexed(NULL_PREDICATE0, null)); }
            @DisplayName("(int, T) → boolean, int, int")   @Test void test2Arg00()       { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findLastIndexIndexed(NULL_PREDICATE2_ALT, 0, 0)); }
            @DisplayName("(int) → boolean, int, int")      @Test void test1Arg00()       { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findLastIndexIndexed(NULL_PREDICATE1_ALT, 0, 0)); }
            @DisplayName("() → boolean, int, int")         @Test void test0Arg00()       { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findLastIndexIndexed(NULL_PREDICATE0, 0, 0)); }
            @DisplayName("(int, T) → boolean, int, int?")  @Test void test2Arg0Null()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findLastIndexIndexed(NULL_PREDICATE2_ALT, 0, null)); }
            @DisplayName("(int) → boolean, int, int?")     @Test void test1Arg0Null()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findLastIndexIndexed(NULL_PREDICATE1_ALT, 0, null)); }
            @DisplayName("() → boolean, int, int?")        @Test void test0Arg0Null()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findLastIndexIndexed(NULL_PREDICATE0, 0, null)); }
            @DisplayName("(int, T) → boolean, int?, int")  @Test void test2ArgNull0()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findLastIndexIndexed(NULL_PREDICATE2_ALT, null, 0)); }
            @DisplayName("(int) → boolean, int?, int")     @Test void test1ArgNull0()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findLastIndexIndexed(NULL_PREDICATE1_ALT, null, 0)); }
            @DisplayName("() → boolean, int?, int")        @Test void test0ArgNull0()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findLastIndexIndexed(NULL_PREDICATE0, null, 0)); }
            @DisplayName("(int, T) → boolean, int?, int?") @Test void test2ArgNullNull() { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findLastIndexIndexed(NULL_PREDICATE2_ALT, null, null)); }
            @DisplayName("(int) → boolean, int?, int?")    @Test void test1ArgNullNull() { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findLastIndexIndexed(NULL_PREDICATE1_ALT, null, null)); }
            @DisplayName("() → boolean, int?, int?")       @Test void test0ArgNullNull() { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findLastIndexIndexed(NULL_PREDICATE0, null, null)); }
            @DisplayName("[]")                             @Test void testArray()        { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findLastIndexIndexed(EMPTY_ARRAY)); }
        }
        @Nested class indexOfLastIndexedOrNull {
            @DisplayName("∅")                              @Test void testEmpty()        { assertNull(instance.indexOfLastIndexedOrNull()); }
            @DisplayName("null []")                        @Test void testNullArray()    { assertNull(instance.indexOfLastIndexedOrNull(NULL_VARARGS)); }
            @DisplayName("(int, T) → boolean")             @Test void test2Arg()         { assertNull(instance.indexOfLastIndexedOrNull(NULL_PREDICATE2_ALT)); }
            @DisplayName("(int) → boolean")                @Test void test1Arg()         { assertNull(instance.indexOfLastIndexedOrNull(NULL_PREDICATE1_ALT)); }
            @DisplayName("() → boolean")                   @Test void test0Arg()         { assertNull(instance.indexOfLastIndexedOrNull(NULL_PREDICATE0)); }
            @DisplayName("(int, T) → boolean, int")        @Test void test2Arg0()        { assertNull(instance.indexOfLastIndexedOrNull(NULL_PREDICATE2_ALT, 0)); }
            @DisplayName("(int) → boolean, int")           @Test void test1Arg0()        { assertNull(instance.indexOfLastIndexedOrNull(NULL_PREDICATE1_ALT, 0)); }
            @DisplayName("() → boolean, int")              @Test void test0Arg0()        { assertNull(instance.indexOfLastIndexedOrNull(NULL_PREDICATE0, 0)); }
            @DisplayName("(int, T) → boolean, int?")       @Test void test2ArgNull()     { assertNull(instance.indexOfLastIndexedOrNull(NULL_PREDICATE2_ALT, null)); }
            @DisplayName("(int) → boolean, int?")          @Test void test1ArgNull()     { assertNull(instance.indexOfLastIndexedOrNull(NULL_PREDICATE1_ALT, null)); }
            @DisplayName("() → boolean, int?")             @Test void test0ArgNull()     { assertNull(instance.indexOfLastIndexedOrNull(NULL_PREDICATE0, null)); }
            @DisplayName("(int, T) → boolean, int, int")   @Test void test2Arg00()       { assertNull(instance.indexOfLastIndexedOrNull(NULL_PREDICATE2_ALT, 0, 0)); }
            @DisplayName("(int) → boolean, int, int")      @Test void test1Arg00()       { assertNull(instance.indexOfLastIndexedOrNull(NULL_PREDICATE1_ALT, 0, 0)); }
            @DisplayName("() → boolean, int, int")         @Test void test0Arg00()       { assertNull(instance.indexOfLastIndexedOrNull(NULL_PREDICATE0, 0, 0)); }
            @DisplayName("(int, T) → boolean, int, int?")  @Test void test2Arg0Null()    { assertNull(instance.indexOfLastIndexedOrNull(NULL_PREDICATE2_ALT, 0, null)); }
            @DisplayName("(int) → boolean, int, int?")     @Test void test1Arg0Null()    { assertNull(instance.indexOfLastIndexedOrNull(NULL_PREDICATE1_ALT, 0, null)); }
            @DisplayName("() → boolean, int, int?")        @Test void test0Arg0Null()    { assertNull(instance.indexOfLastIndexedOrNull(NULL_PREDICATE0, 0, null)); }
            @DisplayName("(int, T) → boolean, int?, int")  @Test void test2ArgNull0()    { assertNull(instance.indexOfLastIndexedOrNull(NULL_PREDICATE2_ALT, null, 0)); }
            @DisplayName("(int) → boolean, int?, int")     @Test void test1ArgNull0()    { assertNull(instance.indexOfLastIndexedOrNull(NULL_PREDICATE1_ALT, null, 0)); }
            @DisplayName("() → boolean, int?, int")        @Test void test0ArgNull0()    { assertNull(instance.indexOfLastIndexedOrNull(NULL_PREDICATE0, null, 0)); }
            @DisplayName("(int, T) → boolean, int?, int?") @Test void test2ArgNullNull() { assertNull(instance.indexOfLastIndexedOrNull(NULL_PREDICATE2_ALT, null, null)); }
            @DisplayName("(int) → boolean, int?, int?")    @Test void test1ArgNullNull() { assertNull(instance.indexOfLastIndexedOrNull(NULL_PREDICATE1_ALT, null, null)); }
            @DisplayName("() → boolean, int?, int?")       @Test void test0ArgNullNull() { assertNull(instance.indexOfLastIndexedOrNull(NULL_PREDICATE0, null, null)); }
            @DisplayName("[]")                             @Test void testArray()        { assertNull(instance.indexOfLastIndexedOrNull(EMPTY_ARRAY)); }
        }
        @Nested class findLastIndexIndexedOrNull {
            @DisplayName("∅")                              @Test void testEmpty()        { assertNull(instance.findLastIndexIndexedOrNull()); }
            @DisplayName("null []")                        @Test void testNullArray()    { assertNull(instance.findLastIndexIndexedOrNull(NULL_VARARGS)); }
            @DisplayName("(int, T) → boolean")             @Test void test2Arg()         { assertNull(instance.findLastIndexIndexedOrNull(NULL_PREDICATE2_ALT)); }
            @DisplayName("(int) → boolean")                @Test void test1Arg()         { assertNull(instance.findLastIndexIndexedOrNull(NULL_PREDICATE1_ALT)); }
            @DisplayName("() → boolean")                   @Test void test0Arg()         { assertNull(instance.findLastIndexIndexedOrNull(NULL_PREDICATE0)); }
            @DisplayName("(int, T) → boolean, int")        @Test void test2Arg0()        { assertNull(instance.findLastIndexIndexedOrNull(NULL_PREDICATE2_ALT, 0)); }
            @DisplayName("(int) → boolean, int")           @Test void test1Arg0()        { assertNull(instance.findLastIndexIndexedOrNull(NULL_PREDICATE1_ALT, 0)); }
            @DisplayName("() → boolean, int")              @Test void test0Arg0()        { assertNull(instance.findLastIndexIndexedOrNull(NULL_PREDICATE0, 0)); }
            @DisplayName("(int, T) → boolean, int?")       @Test void test2ArgNull()     { assertNull(instance.findLastIndexIndexedOrNull(NULL_PREDICATE2_ALT, null)); }
            @DisplayName("(int) → boolean, int?")          @Test void test1ArgNull()     { assertNull(instance.findLastIndexIndexedOrNull(NULL_PREDICATE1_ALT, null)); }
            @DisplayName("() → boolean, int?")             @Test void test0ArgNull()     { assertNull(instance.findLastIndexIndexedOrNull(NULL_PREDICATE0, null)); }
            @DisplayName("(int, T) → boolean, int, int")   @Test void test2Arg00()       { assertNull(instance.findLastIndexIndexedOrNull(NULL_PREDICATE2_ALT, 0, 0)); }
            @DisplayName("(int) → boolean, int, int")      @Test void test1Arg00()       { assertNull(instance.findLastIndexIndexedOrNull(NULL_PREDICATE1_ALT, 0, 0)); }
            @DisplayName("() → boolean, int, int")         @Test void test0Arg00()       { assertNull(instance.findLastIndexIndexedOrNull(NULL_PREDICATE0, 0, 0)); }
            @DisplayName("(int, T) → boolean, int, int?")  @Test void test2Arg0Null()    { assertNull(instance.findLastIndexIndexedOrNull(NULL_PREDICATE2_ALT, 0, null)); }
            @DisplayName("(int) → boolean, int, int?")     @Test void test1Arg0Null()    { assertNull(instance.findLastIndexIndexedOrNull(NULL_PREDICATE1_ALT, 0, null)); }
            @DisplayName("() → boolean, int, int?")        @Test void test0Arg0Null()    { assertNull(instance.findLastIndexIndexedOrNull(NULL_PREDICATE0, 0, null)); }
            @DisplayName("(int, T) → boolean, int?, int")  @Test void test2ArgNull0()    { assertNull(instance.findLastIndexIndexedOrNull(NULL_PREDICATE2_ALT, null, 0)); }
            @DisplayName("(int) → boolean, int?, int")     @Test void test1ArgNull0()    { assertNull(instance.findLastIndexIndexedOrNull(NULL_PREDICATE1_ALT, null, 0)); }
            @DisplayName("() → boolean, int?, int")        @Test void test0ArgNull0()    { assertNull(instance.findLastIndexIndexedOrNull(NULL_PREDICATE0, null, 0)); }
            @DisplayName("(int, T) → boolean, int?, int?") @Test void test2ArgNullNull() { assertNull(instance.findLastIndexIndexedOrNull(NULL_PREDICATE2_ALT, null, null)); }
            @DisplayName("(int) → boolean, int?, int?")    @Test void test1ArgNullNull() { assertNull(instance.findLastIndexIndexedOrNull(NULL_PREDICATE1_ALT, null, null)); }
            @DisplayName("() → boolean, int?, int?")       @Test void test0ArgNullNull() { assertNull(instance.findLastIndexIndexedOrNull(NULL_PREDICATE0, null, null)); }
            @DisplayName("[]")                             @Test void testArray()        { assertNull(instance.findLastIndexIndexedOrNull(EMPTY_ARRAY)); }
        }
    }

    @TestInstance(PER_CLASS) @Nested class aliases {
        @TestInstance(PER_CLASS) @Nested class GenericCollectionHolder {
            @Nested class indexOf {
                                                  @Test void element()         { assertEquals(1, new GenericCollectionHolder_FirstIndexOfAlias().execute(it -> it.indexOf("a")).amountOfCall); }
                @DisplayName("element, int")      @Test void elementFrom()     { assertEquals(1, new GenericCollectionHolder_FirstIndexOfAlias().execute(it -> it.indexOf("b", 1)).amountOfCall); }
                @DisplayName("element, int?")     @Test void elementNull()     { assertEquals(1, new GenericCollectionHolder_FirstIndexOfAlias().execute(it -> it.indexOf("a", null)).amountOfCall); }
                @DisplayName("element, int, int") @Test void elementFromTo()   { assertEquals(1, new GenericCollectionHolder_FirstIndexOfAlias().execute(it -> it.indexOf("b", 1, 2)).amountOfCall); }
                @DisplayName("element, int, int") @Test void elementFromNull() { assertEquals(1, new GenericCollectionHolder_FirstIndexOfAlias().execute(it -> it.indexOf("b", 1, null)).amountOfCall); }
                @DisplayName("element, int, int") @Test void elementNullNull() { assertEquals(1, new GenericCollectionHolder_FirstIndexOfAlias().execute(it -> it.indexOf("a", null, null)).amountOfCall); }
            }
            @Nested class indexOfOrNull {
                                                  @Test void element()         { assertEquals(1, new GenericCollectionHolder_FirstIndexOfOrNullAlias().execute(it -> it.indexOfOrNull("a")).amountOfCall); }
                @DisplayName("element, int")      @Test void elementFrom()     { assertEquals(1, new GenericCollectionHolder_FirstIndexOfOrNullAlias().execute(it -> it.indexOfOrNull("b", 1)).amountOfCall); }
                @DisplayName("element, int?")     @Test void elementNull()     { assertEquals(1, new GenericCollectionHolder_FirstIndexOfOrNullAlias().execute(it -> it.indexOfOrNull("a", null)).amountOfCall); }
                @DisplayName("element, int, int") @Test void elementFromTo()   { assertEquals(1, new GenericCollectionHolder_FirstIndexOfOrNullAlias().execute(it -> it.indexOfOrNull("b", 1, 2)).amountOfCall); }
                @DisplayName("element, int, int") @Test void elementFromNull() { assertEquals(1, new GenericCollectionHolder_FirstIndexOfOrNullAlias().execute(it -> it.indexOfOrNull("b", 1, null)).amountOfCall); }
                @DisplayName("element, int, int") @Test void elementNullNull() { assertEquals(1, new GenericCollectionHolder_FirstIndexOfOrNullAlias().execute(it -> it.indexOfOrNull("a", null, null)).amountOfCall); }
            }

            @Nested class findFirstIndex {
                @DisplayName("() → boolean")                   @Test void test0Arg()         { assertEquals(1, new GenericCollectionHolder_IndexOfFirstAlias().execute(it -> it.findFirstIndex(callback0AsTrue)).amountOfCall); }
                @DisplayName("(T) → boolean")                  @Test void test1Arg()         { assertEquals(1, new GenericCollectionHolder_IndexOfFirstAlias().execute(it -> it.findFirstIndex(callback1AsTrue)).amountOfCall); }
                @DisplayName("(T, int) → boolean")             @Test void test2Arg()         { assertEquals(1, new GenericCollectionHolder_IndexOfFirstAlias().execute(it -> it.findFirstIndex(callback2AsTrue)).amountOfCall); }
                @DisplayName("() → boolean, int")              @Test void test0ArgFrom()     { assertEquals(1, new GenericCollectionHolder_IndexOfFirstAlias().execute(it -> it.findFirstIndex(callback0AsTrue, 1)).amountOfCall); }
                @DisplayName("(T) → boolean, int")             @Test void test1ArgFrom()     { assertEquals(1, new GenericCollectionHolder_IndexOfFirstAlias().execute(it -> it.findFirstIndex(callback1AsTrue, 1)).amountOfCall); }
                @DisplayName("(T, int) → boolean, int")        @Test void test2ArgFrom()     { assertEquals(1, new GenericCollectionHolder_IndexOfFirstAlias().execute(it -> it.findFirstIndex(callback2AsTrue, 1)).amountOfCall); }
                @DisplayName("() → boolean, int?")             @Test void test0ArgNull()     { assertEquals(1, new GenericCollectionHolder_IndexOfFirstAlias().execute(it -> it.findFirstIndex(callback0AsTrue, null)).amountOfCall); }
                @DisplayName("(T) → boolean, int?")            @Test void test1ArgNull()     { assertEquals(1, new GenericCollectionHolder_IndexOfFirstAlias().execute(it -> it.findFirstIndex(callback1AsTrue, null)).amountOfCall); }
                @DisplayName("(T, int) → boolean, int?")       @Test void test2ArgNull()     { assertEquals(1, new GenericCollectionHolder_IndexOfFirstAlias().execute(it -> it.findFirstIndex(callback2AsTrue, null)).amountOfCall); }
                @DisplayName("() → boolean, int, int")         @Test void test0ArgFromTo()   { assertEquals(1, new GenericCollectionHolder_IndexOfFirstAlias().execute(it -> it.findFirstIndex(callback0AsTrue, 1, 2)).amountOfCall); }
                @DisplayName("(T) → boolean, int, int")        @Test void test1ArgFromTo()   { assertEquals(1, new GenericCollectionHolder_IndexOfFirstAlias().execute(it -> it.findFirstIndex(callback1AsTrue, 1, 2)).amountOfCall); }
                @DisplayName("(T, int) → boolean, int, int")   @Test void test2ArgFromTo()   { assertEquals(1, new GenericCollectionHolder_IndexOfFirstAlias().execute(it -> it.findFirstIndex(callback2AsTrue, 1, 2)).amountOfCall); }
                @DisplayName("() → boolean, int, int?")        @Test void test0ArgFromNull() { assertEquals(1, new GenericCollectionHolder_IndexOfFirstAlias().execute(it -> it.findFirstIndex(callback0AsTrue, 0, null)).amountOfCall); }
                @DisplayName("(T) → boolean, int, int?")       @Test void test1ArgFromNull() { assertEquals(1, new GenericCollectionHolder_IndexOfFirstAlias().execute(it -> it.findFirstIndex(callback1AsTrue, 0, null)).amountOfCall); }
                @DisplayName("(T, int) → boolean, int, int?")  @Test void test2ArgFromNull() { assertEquals(1, new GenericCollectionHolder_IndexOfFirstAlias().execute(it -> it.findFirstIndex(callback2AsTrue, 0, null)).amountOfCall); }
                @DisplayName("() → boolean, int?, int?")       @Test void test0ArgNullNull() { assertEquals(1, new GenericCollectionHolder_IndexOfFirstAlias().execute(it -> it.findFirstIndex(callback0AsTrue, null, null)).amountOfCall); }
                @DisplayName("(T) → boolean, int?, int?")      @Test void test1ArgNullNull() { assertEquals(1, new GenericCollectionHolder_IndexOfFirstAlias().execute(it -> it.findFirstIndex(callback1AsTrue, null, null)).amountOfCall); }
                @DisplayName("(T, int) → boolean, int?, int?") @Test void test2ArgNullNull() { assertEquals(1, new GenericCollectionHolder_IndexOfFirstAlias().execute(it -> it.findFirstIndex(callback2AsTrue, null, null)).amountOfCall); }
            }
            @Nested class findIndex {
                @DisplayName("() → boolean")                   @Test void test0Arg()         { assertEquals(1, new GenericCollectionHolder_IndexOfFirstAlias().execute(it -> it.findIndex(callback0AsTrue)).amountOfCall); }
                @DisplayName("(T) → boolean")                  @Test void test1Arg()         { assertEquals(1, new GenericCollectionHolder_IndexOfFirstAlias().execute(it -> it.findIndex(callback1AsTrue)).amountOfCall); }
                @DisplayName("(T, int) → boolean")             @Test void test2Arg()         { assertEquals(1, new GenericCollectionHolder_IndexOfFirstAlias().execute(it -> it.findIndex(callback2AsTrue)).amountOfCall); }
                @DisplayName("() → boolean, int")              @Test void test0ArgFrom()     { assertEquals(1, new GenericCollectionHolder_IndexOfFirstAlias().execute(it -> it.findIndex(callback0AsTrue, 1)).amountOfCall); }
                @DisplayName("(T) → boolean, int")             @Test void test1ArgFrom()     { assertEquals(1, new GenericCollectionHolder_IndexOfFirstAlias().execute(it -> it.findIndex(callback1AsTrue, 1)).amountOfCall); }
                @DisplayName("(T, int) → boolean, int")        @Test void test2ArgFrom()     { assertEquals(1, new GenericCollectionHolder_IndexOfFirstAlias().execute(it -> it.findIndex(callback2AsTrue, 1)).amountOfCall); }
                @DisplayName("() → boolean, int?")             @Test void test0ArgNull()     { assertEquals(1, new GenericCollectionHolder_IndexOfFirstAlias().execute(it -> it.findIndex(callback0AsTrue, null)).amountOfCall); }
                @DisplayName("(T) → boolean, int?")            @Test void test1ArgNull()     { assertEquals(1, new GenericCollectionHolder_IndexOfFirstAlias().execute(it -> it.findIndex(callback1AsTrue, null)).amountOfCall); }
                @DisplayName("(T, int) → boolean, int?")       @Test void test2ArgNull()     { assertEquals(1, new GenericCollectionHolder_IndexOfFirstAlias().execute(it -> it.findIndex(callback2AsTrue, null)).amountOfCall); }
                @DisplayName("() → boolean, int, int")         @Test void test0ArgFromTo()   { assertEquals(1, new GenericCollectionHolder_IndexOfFirstAlias().execute(it -> it.findIndex(callback0AsTrue, 1, 2)).amountOfCall); }
                @DisplayName("(T) → boolean, int, int")        @Test void test1ArgFromTo()   { assertEquals(1, new GenericCollectionHolder_IndexOfFirstAlias().execute(it -> it.findIndex(callback1AsTrue, 1, 2)).amountOfCall); }
                @DisplayName("(T, int) → boolean, int, int")   @Test void test2ArgFromTo()   { assertEquals(1, new GenericCollectionHolder_IndexOfFirstAlias().execute(it -> it.findIndex(callback2AsTrue, 1, 2)).amountOfCall); }
                @DisplayName("() → boolean, int, int?")        @Test void test0ArgFromNull() { assertEquals(1, new GenericCollectionHolder_IndexOfFirstAlias().execute(it -> it.findIndex(callback0AsTrue, 0, null)).amountOfCall); }
                @DisplayName("(T) → boolean, int, int?")       @Test void test1ArgFromNull() { assertEquals(1, new GenericCollectionHolder_IndexOfFirstAlias().execute(it -> it.findIndex(callback1AsTrue, 0, null)).amountOfCall); }
                @DisplayName("(T, int) → boolean, int, int?")  @Test void test2ArgFromNull() { assertEquals(1, new GenericCollectionHolder_IndexOfFirstAlias().execute(it -> it.findIndex(callback2AsTrue, 0, null)).amountOfCall); }
                @DisplayName("() → boolean, int?, int?")       @Test void test0ArgNullNull() { assertEquals(1, new GenericCollectionHolder_IndexOfFirstAlias().execute(it -> it.findIndex(callback0AsTrue, null, null)).amountOfCall); }
                @DisplayName("(T) → boolean, int?, int?")      @Test void test1ArgNullNull() { assertEquals(1, new GenericCollectionHolder_IndexOfFirstAlias().execute(it -> it.findIndex(callback1AsTrue, null, null)).amountOfCall); }
                @DisplayName("(T, int) → boolean, int?, int?") @Test void test2ArgNullNull() { assertEquals(1, new GenericCollectionHolder_IndexOfFirstAlias().execute(it -> it.findIndex(callback2AsTrue, null, null)).amountOfCall); }
            }
            @Nested class findFirstIndexOrNull {
                @DisplayName("() → boolean")                   @Test void test0Arg()         { assertEquals(1, new GenericCollectionHolder_IndexOfFirstOrNullAlias().execute(it -> it.findFirstIndexOrNull(callback0AsTrue)).amountOfCall); }
                @DisplayName("(T) → boolean")                  @Test void test1Arg()         { assertEquals(1, new GenericCollectionHolder_IndexOfFirstOrNullAlias().execute(it -> it.findFirstIndexOrNull(callback1AsTrue)).amountOfCall); }
                @DisplayName("(T, int) → boolean")             @Test void test2Arg()         { assertEquals(1, new GenericCollectionHolder_IndexOfFirstOrNullAlias().execute(it -> it.findFirstIndexOrNull(callback2AsTrue)).amountOfCall); }
                @DisplayName("() → boolean, int")              @Test void test0ArgFrom()     { assertEquals(1, new GenericCollectionHolder_IndexOfFirstOrNullAlias().execute(it -> it.findFirstIndexOrNull(callback0AsTrue, 1)).amountOfCall); }
                @DisplayName("(T) → boolean, int")             @Test void test1ArgFrom()     { assertEquals(1, new GenericCollectionHolder_IndexOfFirstOrNullAlias().execute(it -> it.findFirstIndexOrNull(callback1AsTrue, 1)).amountOfCall); }
                @DisplayName("(T, int) → boolean, int")        @Test void test2ArgFrom()     { assertEquals(1, new GenericCollectionHolder_IndexOfFirstOrNullAlias().execute(it -> it.findFirstIndexOrNull(callback2AsTrue, 1)).amountOfCall); }
                @DisplayName("() → boolean, int?")             @Test void test0ArgNull()     { assertEquals(1, new GenericCollectionHolder_IndexOfFirstOrNullAlias().execute(it -> it.findFirstIndexOrNull(callback0AsTrue, null)).amountOfCall); }
                @DisplayName("(T) → boolean, int?")            @Test void test1ArgNull()     { assertEquals(1, new GenericCollectionHolder_IndexOfFirstOrNullAlias().execute(it -> it.findFirstIndexOrNull(callback1AsTrue, null)).amountOfCall); }
                @DisplayName("(T, int) → boolean, int?")       @Test void test2ArgNull()     { assertEquals(1, new GenericCollectionHolder_IndexOfFirstOrNullAlias().execute(it -> it.findFirstIndexOrNull(callback2AsTrue, null)).amountOfCall); }
                @DisplayName("() → boolean, int, int")         @Test void test0ArgFromTo()   { assertEquals(1, new GenericCollectionHolder_IndexOfFirstOrNullAlias().execute(it -> it.findFirstIndexOrNull(callback0AsTrue, 1, 2)).amountOfCall); }
                @DisplayName("(T) → boolean, int, int")        @Test void test1ArgFromTo()   { assertEquals(1, new GenericCollectionHolder_IndexOfFirstOrNullAlias().execute(it -> it.findFirstIndexOrNull(callback1AsTrue, 1, 2)).amountOfCall); }
                @DisplayName("(T, int) → boolean, int, int")   @Test void test2ArgFromTo()   { assertEquals(1, new GenericCollectionHolder_IndexOfFirstOrNullAlias().execute(it -> it.findFirstIndexOrNull(callback2AsTrue, 1, 2)).amountOfCall); }
                @DisplayName("() → boolean, int, int?")        @Test void test0ArgFromNull() { assertEquals(1, new GenericCollectionHolder_IndexOfFirstOrNullAlias().execute(it -> it.findFirstIndexOrNull(callback0AsTrue, 0, null)).amountOfCall); }
                @DisplayName("(T) → boolean, int, int?")       @Test void test1ArgFromNull() { assertEquals(1, new GenericCollectionHolder_IndexOfFirstOrNullAlias().execute(it -> it.findFirstIndexOrNull(callback1AsTrue, 0, null)).amountOfCall); }
                @DisplayName("(T, int) → boolean, int, int?")  @Test void test2ArgFromNull() { assertEquals(1, new GenericCollectionHolder_IndexOfFirstOrNullAlias().execute(it -> it.findFirstIndexOrNull(callback2AsTrue, 0, null)).amountOfCall); }
                @DisplayName("() → boolean, int?, int?")       @Test void test0ArgNullNull() { assertEquals(1, new GenericCollectionHolder_IndexOfFirstOrNullAlias().execute(it -> it.findFirstIndexOrNull(callback0AsTrue, null, null)).amountOfCall); }
                @DisplayName("(T) → boolean, int?, int?")      @Test void test1ArgNullNull() { assertEquals(1, new GenericCollectionHolder_IndexOfFirstOrNullAlias().execute(it -> it.findFirstIndexOrNull(callback1AsTrue, null, null)).amountOfCall); }
                @DisplayName("(T, int) → boolean, int?, int?") @Test void test2ArgNullNull() { assertEquals(1, new GenericCollectionHolder_IndexOfFirstOrNullAlias().execute(it -> it.findFirstIndexOrNull(callback2AsTrue, null, null)).amountOfCall); }
            }
            @Nested class findIndexOrNull {
                @DisplayName("() → boolean")                   @Test void test0Arg()         { assertEquals(1, new GenericCollectionHolder_IndexOfFirstOrNullAlias().execute(it -> it.findIndexOrNull(callback0AsTrue)).amountOfCall); }
                @DisplayName("(T) → boolean")                  @Test void test1Arg()         { assertEquals(1, new GenericCollectionHolder_IndexOfFirstOrNullAlias().execute(it -> it.findIndexOrNull(callback1AsTrue)).amountOfCall); }
                @DisplayName("(T, int) → boolean")             @Test void test2Arg()         { assertEquals(1, new GenericCollectionHolder_IndexOfFirstOrNullAlias().execute(it -> it.findIndexOrNull(callback2AsTrue)).amountOfCall); }
                @DisplayName("() → boolean, int")              @Test void test0ArgFrom()     { assertEquals(1, new GenericCollectionHolder_IndexOfFirstOrNullAlias().execute(it -> it.findIndexOrNull(callback0AsTrue, 1)).amountOfCall); }
                @DisplayName("(T) → boolean, int")             @Test void test1ArgFrom()     { assertEquals(1, new GenericCollectionHolder_IndexOfFirstOrNullAlias().execute(it -> it.findIndexOrNull(callback1AsTrue, 1)).amountOfCall); }
                @DisplayName("(T, int) → boolean, int")        @Test void test2ArgFrom()     { assertEquals(1, new GenericCollectionHolder_IndexOfFirstOrNullAlias().execute(it -> it.findIndexOrNull(callback2AsTrue, 1)).amountOfCall); }
                @DisplayName("() → boolean, int?")             @Test void test0ArgNull()     { assertEquals(1, new GenericCollectionHolder_IndexOfFirstOrNullAlias().execute(it -> it.findIndexOrNull(callback0AsTrue, null)).amountOfCall); }
                @DisplayName("(T) → boolean, int?")            @Test void test1ArgNull()     { assertEquals(1, new GenericCollectionHolder_IndexOfFirstOrNullAlias().execute(it -> it.findIndexOrNull(callback1AsTrue, null)).amountOfCall); }
                @DisplayName("(T, int) → boolean, int?")       @Test void test2ArgNull()     { assertEquals(1, new GenericCollectionHolder_IndexOfFirstOrNullAlias().execute(it -> it.findIndexOrNull(callback2AsTrue, null)).amountOfCall); }
                @DisplayName("() → boolean, int, int")         @Test void test0ArgFromTo()   { assertEquals(1, new GenericCollectionHolder_IndexOfFirstOrNullAlias().execute(it -> it.findIndexOrNull(callback0AsTrue, 1, 2)).amountOfCall); }
                @DisplayName("(T) → boolean, int, int")        @Test void test1ArgFromTo()   { assertEquals(1, new GenericCollectionHolder_IndexOfFirstOrNullAlias().execute(it -> it.findIndexOrNull(callback1AsTrue, 1, 2)).amountOfCall); }
                @DisplayName("(T, int) → boolean, int, int")   @Test void test2ArgFromTo()   { assertEquals(1, new GenericCollectionHolder_IndexOfFirstOrNullAlias().execute(it -> it.findIndexOrNull(callback2AsTrue, 1, 2)).amountOfCall); }
                @DisplayName("() → boolean, int, int?")        @Test void test0ArgFromNull() { assertEquals(1, new GenericCollectionHolder_IndexOfFirstOrNullAlias().execute(it -> it.findIndexOrNull(callback0AsTrue, 0, null)).amountOfCall); }
                @DisplayName("(T) → boolean, int, int?")       @Test void test1ArgFromNull() { assertEquals(1, new GenericCollectionHolder_IndexOfFirstOrNullAlias().execute(it -> it.findIndexOrNull(callback1AsTrue, 0, null)).amountOfCall); }
                @DisplayName("(T, int) → boolean, int, int?")  @Test void test2ArgFromNull() { assertEquals(1, new GenericCollectionHolder_IndexOfFirstOrNullAlias().execute(it -> it.findIndexOrNull(callback2AsTrue, 0, null)).amountOfCall); }
                @DisplayName("() → boolean, int?, int?")       @Test void test0ArgNullNull() { assertEquals(1, new GenericCollectionHolder_IndexOfFirstOrNullAlias().execute(it -> it.findIndexOrNull(callback0AsTrue, null, null)).amountOfCall); }
                @DisplayName("(T) → boolean, int?, int?")      @Test void test1ArgNullNull() { assertEquals(1, new GenericCollectionHolder_IndexOfFirstOrNullAlias().execute(it -> it.findIndexOrNull(callback1AsTrue, null, null)).amountOfCall); }
                @DisplayName("(T, int) → boolean, int?, int?") @Test void test2ArgNullNull() { assertEquals(1, new GenericCollectionHolder_IndexOfFirstOrNullAlias().execute(it -> it.findIndexOrNull(callback2AsTrue, null, null)).amountOfCall); }
            }
            @Nested class findFirstIndexIndexed {
                @DisplayName("() → boolean")                   @Test void test0Arg()         { assertEquals(1, new GenericCollectionHolder_IndexOfFirstIndexedAlias().execute(it -> it.findFirstIndexIndexed(callback0AsTrue)).amountOfCall); }
                @DisplayName("(T) → boolean")                  @Test void test1Arg()         { assertEquals(1, new GenericCollectionHolder_IndexOfFirstIndexedAlias().execute(it -> it.findFirstIndexIndexed(callback1AltAsTrue)).amountOfCall); }
                @DisplayName("(T, int) → boolean")             @Test void test2Arg()         { assertEquals(1, new GenericCollectionHolder_IndexOfFirstIndexedAlias().execute(it -> it.findFirstIndexIndexed(callback2AltAsTrue)).amountOfCall); }
                @DisplayName("() → boolean, int")              @Test void test0ArgFrom()     { assertEquals(1, new GenericCollectionHolder_IndexOfFirstIndexedAlias().execute(it -> it.findFirstIndexIndexed(callback0AsTrue, 1)).amountOfCall); }
                @DisplayName("(T) → boolean, int")             @Test void test1ArgFrom()     { assertEquals(1, new GenericCollectionHolder_IndexOfFirstIndexedAlias().execute(it -> it.findFirstIndexIndexed(callback1AltAsTrue, 1)).amountOfCall); }
                @DisplayName("(T, int) → boolean, int")        @Test void test2ArgFrom()     { assertEquals(1, new GenericCollectionHolder_IndexOfFirstIndexedAlias().execute(it -> it.findFirstIndexIndexed(callback2AltAsTrue, 1)).amountOfCall); }
                @DisplayName("() → boolean, int?")             @Test void test0ArgNull()     { assertEquals(1, new GenericCollectionHolder_IndexOfFirstIndexedAlias().execute(it -> it.findFirstIndexIndexed(callback0AsTrue, null)).amountOfCall); }
                @DisplayName("(T) → boolean, int?")            @Test void test1ArgNull()     { assertEquals(1, new GenericCollectionHolder_IndexOfFirstIndexedAlias().execute(it -> it.findFirstIndexIndexed(callback1AltAsTrue, null)).amountOfCall); }
                @DisplayName("(T, int) → boolean, int?")       @Test void test2ArgNull()     { assertEquals(1, new GenericCollectionHolder_IndexOfFirstIndexedAlias().execute(it -> it.findFirstIndexIndexed(callback2AltAsTrue, null)).amountOfCall); }
                @DisplayName("() → boolean, int, int")         @Test void test0ArgFromTo()   { assertEquals(1, new GenericCollectionHolder_IndexOfFirstIndexedAlias().execute(it -> it.findFirstIndexIndexed(callback0AsTrue, 1, 2)).amountOfCall); }
                @DisplayName("(T) → boolean, int, int")        @Test void test1ArgFromTo()   { assertEquals(1, new GenericCollectionHolder_IndexOfFirstIndexedAlias().execute(it -> it.findFirstIndexIndexed(callback1AltAsTrue, 1, 2)).amountOfCall); }
                @DisplayName("(T, int) → boolean, int, int")   @Test void test2ArgFromTo()   { assertEquals(1, new GenericCollectionHolder_IndexOfFirstIndexedAlias().execute(it -> it.findFirstIndexIndexed(callback2AltAsTrue, 1, 2)).amountOfCall); }
                @DisplayName("() → boolean, int, int?")        @Test void test0ArgFromNull() { assertEquals(1, new GenericCollectionHolder_IndexOfFirstIndexedAlias().execute(it -> it.findFirstIndexIndexed(callback0AsTrue, 0, null)).amountOfCall); }
                @DisplayName("(T) → boolean, int, int?")       @Test void test1ArgFromNull() { assertEquals(1, new GenericCollectionHolder_IndexOfFirstIndexedAlias().execute(it -> it.findFirstIndexIndexed(callback1AltAsTrue, 0, null)).amountOfCall); }
                @DisplayName("(T, int) → boolean, int, int?")  @Test void test2ArgFromNull() { assertEquals(1, new GenericCollectionHolder_IndexOfFirstIndexedAlias().execute(it -> it.findFirstIndexIndexed(callback2AltAsTrue, 0, null)).amountOfCall); }
                @DisplayName("() → boolean, int?, int?")       @Test void test0ArgNullNull() { assertEquals(1, new GenericCollectionHolder_IndexOfFirstIndexedAlias().execute(it -> it.findFirstIndexIndexed(callback0AsTrue, null, null)).amountOfCall); }
                @DisplayName("(T) → boolean, int?, int?")      @Test void test1ArgNullNull() { assertEquals(1, new GenericCollectionHolder_IndexOfFirstIndexedAlias().execute(it -> it.findFirstIndexIndexed(callback1AltAsTrue, null, null)).amountOfCall); }
                @DisplayName("(T, int) → boolean, int?, int?") @Test void test2ArgNullNull() { assertEquals(1, new GenericCollectionHolder_IndexOfFirstIndexedAlias().execute(it -> it.findFirstIndexIndexed(callback2AltAsTrue, null, null)).amountOfCall); }
            }
            @Nested class findIndexIndexed {
                @DisplayName("() → boolean")                   @Test void test0Arg()         { assertEquals(1, new GenericCollectionHolder_IndexOfFirstIndexedAlias().execute(it -> it.findIndexIndexed(callback0AsTrue)).amountOfCall); }
                @DisplayName("(T) → boolean")                  @Test void test1Arg()         { assertEquals(1, new GenericCollectionHolder_IndexOfFirstIndexedAlias().execute(it -> it.findIndexIndexed(callback1AltAsTrue)).amountOfCall); }
                @DisplayName("(T, int) → boolean")             @Test void test2Arg()         { assertEquals(1, new GenericCollectionHolder_IndexOfFirstIndexedAlias().execute(it -> it.findIndexIndexed(callback2AltAsTrue)).amountOfCall); }
                @DisplayName("() → boolean, int")              @Test void test0ArgFrom()     { assertEquals(1, new GenericCollectionHolder_IndexOfFirstIndexedAlias().execute(it -> it.findIndexIndexed(callback0AsTrue, 1)).amountOfCall); }
                @DisplayName("(T) → boolean, int")             @Test void test1ArgFrom()     { assertEquals(1, new GenericCollectionHolder_IndexOfFirstIndexedAlias().execute(it -> it.findIndexIndexed(callback1AltAsTrue, 1)).amountOfCall); }
                @DisplayName("(T, int) → boolean, int")        @Test void test2ArgFrom()     { assertEquals(1, new GenericCollectionHolder_IndexOfFirstIndexedAlias().execute(it -> it.findIndexIndexed(callback2AltAsTrue, 1)).amountOfCall); }
                @DisplayName("() → boolean, int?")             @Test void test0ArgNull()     { assertEquals(1, new GenericCollectionHolder_IndexOfFirstIndexedAlias().execute(it -> it.findIndexIndexed(callback0AsTrue, null)).amountOfCall); }
                @DisplayName("(T) → boolean, int?")            @Test void test1ArgNull()     { assertEquals(1, new GenericCollectionHolder_IndexOfFirstIndexedAlias().execute(it -> it.findIndexIndexed(callback1AltAsTrue, null)).amountOfCall); }
                @DisplayName("(T, int) → boolean, int?")       @Test void test2ArgNull()     { assertEquals(1, new GenericCollectionHolder_IndexOfFirstIndexedAlias().execute(it -> it.findIndexIndexed(callback2AltAsTrue, null)).amountOfCall); }
                @DisplayName("() → boolean, int, int")         @Test void test0ArgFromTo()   { assertEquals(1, new GenericCollectionHolder_IndexOfFirstIndexedAlias().execute(it -> it.findIndexIndexed(callback0AsTrue, 1, 2)).amountOfCall); }
                @DisplayName("(T) → boolean, int, int")        @Test void test1ArgFromTo()   { assertEquals(1, new GenericCollectionHolder_IndexOfFirstIndexedAlias().execute(it -> it.findIndexIndexed(callback1AltAsTrue, 1, 2)).amountOfCall); }
                @DisplayName("(T, int) → boolean, int, int")   @Test void test2ArgFromTo()   { assertEquals(1, new GenericCollectionHolder_IndexOfFirstIndexedAlias().execute(it -> it.findIndexIndexed(callback2AltAsTrue, 1, 2)).amountOfCall); }
                @DisplayName("() → boolean, int, int?")        @Test void test0ArgFromNull() { assertEquals(1, new GenericCollectionHolder_IndexOfFirstIndexedAlias().execute(it -> it.findIndexIndexed(callback0AsTrue, 0, null)).amountOfCall); }
                @DisplayName("(T) → boolean, int, int?")       @Test void test1ArgFromNull() { assertEquals(1, new GenericCollectionHolder_IndexOfFirstIndexedAlias().execute(it -> it.findIndexIndexed(callback1AltAsTrue, 0, null)).amountOfCall); }
                @DisplayName("(T, int) → boolean, int, int?")  @Test void test2ArgFromNull() { assertEquals(1, new GenericCollectionHolder_IndexOfFirstIndexedAlias().execute(it -> it.findIndexIndexed(callback2AltAsTrue, 0, null)).amountOfCall); }
                @DisplayName("() → boolean, int?, int?")       @Test void test0ArgNullNull() { assertEquals(1, new GenericCollectionHolder_IndexOfFirstIndexedAlias().execute(it -> it.findIndexIndexed(callback0AsTrue, null, null)).amountOfCall); }
                @DisplayName("(T) → boolean, int?, int?")      @Test void test1ArgNullNull() { assertEquals(1, new GenericCollectionHolder_IndexOfFirstIndexedAlias().execute(it -> it.findIndexIndexed(callback1AltAsTrue, null, null)).amountOfCall); }
                @DisplayName("(T, int) → boolean, int?, int?") @Test void test2ArgNullNull() { assertEquals(1, new GenericCollectionHolder_IndexOfFirstIndexedAlias().execute(it -> it.findIndexIndexed(callback2AltAsTrue, null, null)).amountOfCall); }
            }
            @Nested class findFirstIndexIndexedOrNull {
                @DisplayName("() → boolean")                   @Test void test0Arg()         { assertEquals(1, new GenericCollectionHolder_IndexOfFirstIndexedOrNullAlias().execute(it -> it.findFirstIndexIndexedOrNull(callback0AsTrue)).amountOfCall); }
                @DisplayName("(T) → boolean")                  @Test void test1Arg()         { assertEquals(1, new GenericCollectionHolder_IndexOfFirstIndexedOrNullAlias().execute(it -> it.findFirstIndexIndexedOrNull(callback1AltAsTrue)).amountOfCall); }
                @DisplayName("(T, int) → boolean")             @Test void test2Arg()         { assertEquals(1, new GenericCollectionHolder_IndexOfFirstIndexedOrNullAlias().execute(it -> it.findFirstIndexIndexedOrNull(callback2AltAsTrue)).amountOfCall); }
                @DisplayName("() → boolean, int")              @Test void test0ArgFrom()     { assertEquals(1, new GenericCollectionHolder_IndexOfFirstIndexedOrNullAlias().execute(it -> it.findFirstIndexIndexedOrNull(callback0AsTrue, 1)).amountOfCall); }
                @DisplayName("(T) → boolean, int")             @Test void test1ArgFrom()     { assertEquals(1, new GenericCollectionHolder_IndexOfFirstIndexedOrNullAlias().execute(it -> it.findFirstIndexIndexedOrNull(callback1AltAsTrue, 1)).amountOfCall); }
                @DisplayName("(T, int) → boolean, int")        @Test void test2ArgFrom()     { assertEquals(1, new GenericCollectionHolder_IndexOfFirstIndexedOrNullAlias().execute(it -> it.findFirstIndexIndexedOrNull(callback2AltAsTrue, 1)).amountOfCall); }
                @DisplayName("() → boolean, int?")             @Test void test0ArgNull()     { assertEquals(1, new GenericCollectionHolder_IndexOfFirstIndexedOrNullAlias().execute(it -> it.findFirstIndexIndexedOrNull(callback0AsTrue, null)).amountOfCall); }
                @DisplayName("(T) → boolean, int?")            @Test void test1ArgNull()     { assertEquals(1, new GenericCollectionHolder_IndexOfFirstIndexedOrNullAlias().execute(it -> it.findFirstIndexIndexedOrNull(callback1AltAsTrue, null)).amountOfCall); }
                @DisplayName("(T, int) → boolean, int?")       @Test void test2ArgNull()     { assertEquals(1, new GenericCollectionHolder_IndexOfFirstIndexedOrNullAlias().execute(it -> it.findFirstIndexIndexedOrNull(callback2AltAsTrue, null)).amountOfCall); }
                @DisplayName("() → boolean, int, int")         @Test void test0ArgFromTo()   { assertEquals(1, new GenericCollectionHolder_IndexOfFirstIndexedOrNullAlias().execute(it -> it.findFirstIndexIndexedOrNull(callback0AsTrue, 1, 2)).amountOfCall); }
                @DisplayName("(T) → boolean, int, int")        @Test void test1ArgFromTo()   { assertEquals(1, new GenericCollectionHolder_IndexOfFirstIndexedOrNullAlias().execute(it -> it.findFirstIndexIndexedOrNull(callback1AltAsTrue, 1, 2)).amountOfCall); }
                @DisplayName("(T, int) → boolean, int, int")   @Test void test2ArgFromTo()   { assertEquals(1, new GenericCollectionHolder_IndexOfFirstIndexedOrNullAlias().execute(it -> it.findFirstIndexIndexedOrNull(callback2AltAsTrue, 1, 2)).amountOfCall); }
                @DisplayName("() → boolean, int, int?")        @Test void test0ArgFromNull() { assertEquals(1, new GenericCollectionHolder_IndexOfFirstIndexedOrNullAlias().execute(it -> it.findFirstIndexIndexedOrNull(callback0AsTrue, 0, null)).amountOfCall); }
                @DisplayName("(T) → boolean, int, int?")       @Test void test1ArgFromNull() { assertEquals(1, new GenericCollectionHolder_IndexOfFirstIndexedOrNullAlias().execute(it -> it.findFirstIndexIndexedOrNull(callback1AltAsTrue, 0, null)).amountOfCall); }
                @DisplayName("(T, int) → boolean, int, int?")  @Test void test2ArgFromNull() { assertEquals(1, new GenericCollectionHolder_IndexOfFirstIndexedOrNullAlias().execute(it -> it.findFirstIndexIndexedOrNull(callback2AltAsTrue, 0, null)).amountOfCall); }
                @DisplayName("() → boolean, int?, int?")       @Test void test0ArgNullNull() { assertEquals(1, new GenericCollectionHolder_IndexOfFirstIndexedOrNullAlias().execute(it -> it.findFirstIndexIndexedOrNull(callback0AsTrue, null, null)).amountOfCall); }
                @DisplayName("(T) → boolean, int?, int?")      @Test void test1ArgNullNull() { assertEquals(1, new GenericCollectionHolder_IndexOfFirstIndexedOrNullAlias().execute(it -> it.findFirstIndexIndexedOrNull(callback1AltAsTrue, null, null)).amountOfCall); }
                @DisplayName("(T, int) → boolean, int?, int?") @Test void test2ArgNullNull() { assertEquals(1, new GenericCollectionHolder_IndexOfFirstIndexedOrNullAlias().execute(it -> it.findFirstIndexIndexedOrNull(callback2AltAsTrue, null, null)).amountOfCall); }
            }
            @Nested class findIndexIndexedOrNull {
                @DisplayName("() → boolean")                   @Test void test0Arg()         { assertEquals(1, new GenericCollectionHolder_IndexOfFirstIndexedOrNullAlias().execute(it -> it.findIndexIndexedOrNull(callback0AsTrue)).amountOfCall); }
                @DisplayName("(T) → boolean")                  @Test void test1Arg()         { assertEquals(1, new GenericCollectionHolder_IndexOfFirstIndexedOrNullAlias().execute(it -> it.findIndexIndexedOrNull(callback1AltAsTrue)).amountOfCall); }
                @DisplayName("(T, int) → boolean")             @Test void test2Arg()         { assertEquals(1, new GenericCollectionHolder_IndexOfFirstIndexedOrNullAlias().execute(it -> it.findIndexIndexedOrNull(callback2AltAsTrue)).amountOfCall); }
                @DisplayName("() → boolean, int")              @Test void test0ArgFrom()     { assertEquals(1, new GenericCollectionHolder_IndexOfFirstIndexedOrNullAlias().execute(it -> it.findIndexIndexedOrNull(callback0AsTrue, 1)).amountOfCall); }
                @DisplayName("(T) → boolean, int")             @Test void test1ArgFrom()     { assertEquals(1, new GenericCollectionHolder_IndexOfFirstIndexedOrNullAlias().execute(it -> it.findIndexIndexedOrNull(callback1AltAsTrue, 1)).amountOfCall); }
                @DisplayName("(T, int) → boolean, int")        @Test void test2ArgFrom()     { assertEquals(1, new GenericCollectionHolder_IndexOfFirstIndexedOrNullAlias().execute(it -> it.findIndexIndexedOrNull(callback2AltAsTrue, 1)).amountOfCall); }
                @DisplayName("() → boolean, int?")             @Test void test0ArgNull()     { assertEquals(1, new GenericCollectionHolder_IndexOfFirstIndexedOrNullAlias().execute(it -> it.findIndexIndexedOrNull(callback0AsTrue, null)).amountOfCall); }
                @DisplayName("(T) → boolean, int?")            @Test void test1ArgNull()     { assertEquals(1, new GenericCollectionHolder_IndexOfFirstIndexedOrNullAlias().execute(it -> it.findIndexIndexedOrNull(callback1AltAsTrue, null)).amountOfCall); }
                @DisplayName("(T, int) → boolean, int?")       @Test void test2ArgNull()     { assertEquals(1, new GenericCollectionHolder_IndexOfFirstIndexedOrNullAlias().execute(it -> it.findIndexIndexedOrNull(callback2AltAsTrue, null)).amountOfCall); }
                @DisplayName("() → boolean, int, int")         @Test void test0ArgFromNTo()  { assertEquals(1, new GenericCollectionHolder_IndexOfFirstIndexedOrNullAlias().execute(it -> it.findIndexIndexedOrNull(callback0AsTrue, 1, 2)).amountOfCall); }
                @DisplayName("(T) → boolean, int, int")        @Test void test1ArgFromNTo()  { assertEquals(1, new GenericCollectionHolder_IndexOfFirstIndexedOrNullAlias().execute(it -> it.findIndexIndexedOrNull(callback1AltAsTrue, 1, 2)).amountOfCall); }
                @DisplayName("(T, int) → boolean, int, int")   @Test void test2ArgFromNTo()  { assertEquals(1, new GenericCollectionHolder_IndexOfFirstIndexedOrNullAlias().execute(it -> it.findIndexIndexedOrNull(callback2AltAsTrue, 1, 2)).amountOfCall); }
                @DisplayName("() → boolean, int, int?")        @Test void test0ArgFromNull() { assertEquals(1, new GenericCollectionHolder_IndexOfFirstIndexedOrNullAlias().execute(it -> it.findIndexIndexedOrNull(callback0AsTrue, 0, null)).amountOfCall); }
                @DisplayName("(T) → boolean, int, int?")       @Test void test1ArgFromNull() { assertEquals(1, new GenericCollectionHolder_IndexOfFirstIndexedOrNullAlias().execute(it -> it.findIndexIndexedOrNull(callback1AltAsTrue, 0, null)).amountOfCall); }
                @DisplayName("(T, int) → boolean, int, int?")  @Test void test2ArgFromNull() { assertEquals(1, new GenericCollectionHolder_IndexOfFirstIndexedOrNullAlias().execute(it -> it.findIndexIndexedOrNull(callback2AltAsTrue, 0, null)).amountOfCall); }
                @DisplayName("() → boolean, int?, int?")       @Test void test0ArgNullNull() { assertEquals(1, new GenericCollectionHolder_IndexOfFirstIndexedOrNullAlias().execute(it -> it.findIndexIndexedOrNull(callback0AsTrue, null, null)).amountOfCall); }
                @DisplayName("(T) → boolean, int?, int?")      @Test void test1ArgNullNull() { assertEquals(1, new GenericCollectionHolder_IndexOfFirstIndexedOrNullAlias().execute(it -> it.findIndexIndexedOrNull(callback1AltAsTrue, null, null)).amountOfCall); }
                @DisplayName("(T, int) → boolean, int?, int?") @Test void test2ArgNullNull() { assertEquals(1, new GenericCollectionHolder_IndexOfFirstIndexedOrNullAlias().execute(it -> it.findIndexIndexedOrNull(callback2AltAsTrue, null, null)).amountOfCall); }
            }

            @Nested class findLastIndex {
                @DisplayName("() → boolean")                   @Test void test0Arg()         { assertEquals(1, new GenericCollectionHolder_IndexOfLastAlias().execute(it -> it.findLastIndex(callback0AsTrue)).amountOfCall); }
                @DisplayName("(T) → boolean")                  @Test void test1Arg()         { assertEquals(1, new GenericCollectionHolder_IndexOfLastAlias().execute(it -> it.findLastIndex(callback1AsTrue)).amountOfCall); }
                @DisplayName("(T, int) → boolean")             @Test void test2Arg()         { assertEquals(1, new GenericCollectionHolder_IndexOfLastAlias().execute(it -> it.findLastIndex(callback2AsTrue)).amountOfCall); }
                @DisplayName("() → boolean, int")              @Test void test0ArgFrom()     { assertEquals(1, new GenericCollectionHolder_IndexOfLastAlias().execute(it -> it.findLastIndex(callback0AsTrue, 1)).amountOfCall); }
                @DisplayName("(T) → boolean, int")             @Test void test1ArgFrom()     { assertEquals(1, new GenericCollectionHolder_IndexOfLastAlias().execute(it -> it.findLastIndex(callback1AsTrue, 1)).amountOfCall); }
                @DisplayName("(T, int) → boolean, int")        @Test void test2ArgFrom()     { assertEquals(1, new GenericCollectionHolder_IndexOfLastAlias().execute(it -> it.findLastIndex(callback2AsTrue, 1)).amountOfCall); }
                @DisplayName("() → boolean, int?")             @Test void test0ArgNull()     { assertEquals(1, new GenericCollectionHolder_IndexOfLastAlias().execute(it -> it.findLastIndex(callback0AsTrue, null)).amountOfCall); }
                @DisplayName("(T) → boolean, int?")            @Test void test1ArgNull()     { assertEquals(1, new GenericCollectionHolder_IndexOfLastAlias().execute(it -> it.findLastIndex(callback1AsTrue, null)).amountOfCall); }
                @DisplayName("(T, int) → boolean, int?")       @Test void test2ArgNull()     { assertEquals(1, new GenericCollectionHolder_IndexOfLastAlias().execute(it -> it.findLastIndex(callback2AsTrue, null)).amountOfCall); }
                @DisplayName("() → boolean, int, int")         @Test void test0ArgFromTo()   { assertEquals(1, new GenericCollectionHolder_IndexOfLastAlias().execute(it -> it.findLastIndex(callback0AsTrue, 1, 2)).amountOfCall); }
                @DisplayName("(T) → boolean, int, int")        @Test void test1ArgFromTo()   { assertEquals(1, new GenericCollectionHolder_IndexOfLastAlias().execute(it -> it.findLastIndex(callback1AsTrue, 1, 2)).amountOfCall); }
                @DisplayName("(T, int) → boolean, int, int")   @Test void test2ArgFromTo()   { assertEquals(1, new GenericCollectionHolder_IndexOfLastAlias().execute(it -> it.findLastIndex(callback2AsTrue, 1, 2)).amountOfCall); }
                @DisplayName("() → boolean, int, int?")        @Test void test0ArgFromNull() { assertEquals(1, new GenericCollectionHolder_IndexOfLastAlias().execute(it -> it.findLastIndex(callback0AsTrue, 0, null)).amountOfCall); }
                @DisplayName("(T) → boolean, int, int?")       @Test void test1ArgFromNull() { assertEquals(1, new GenericCollectionHolder_IndexOfLastAlias().execute(it -> it.findLastIndex(callback1AsTrue, 0, null)).amountOfCall); }
                @DisplayName("(T, int) → boolean, int, int?")  @Test void test2ArgFromNull() { assertEquals(1, new GenericCollectionHolder_IndexOfLastAlias().execute(it -> it.findLastIndex(callback2AsTrue, 0, null)).amountOfCall); }
                @DisplayName("() → boolean, int?, int?")       @Test void test0ArgNullNull() { assertEquals(1, new GenericCollectionHolder_IndexOfLastAlias().execute(it -> it.findLastIndex(callback0AsTrue, null, null)).amountOfCall); }
                @DisplayName("(T) → boolean, int?, int?")      @Test void test1ArgNullNull() { assertEquals(1, new GenericCollectionHolder_IndexOfLastAlias().execute(it -> it.findLastIndex(callback1AsTrue, null, null)).amountOfCall); }
                @DisplayName("(T, int) → boolean, int?, int?") @Test void test2ArgNullNull() { assertEquals(1, new GenericCollectionHolder_IndexOfLastAlias().execute(it -> it.findLastIndex(callback2AsTrue, null, null)).amountOfCall); }
            }
            @Nested class findLastIndexOrNull {
                @DisplayName("() → boolean")                   @Test void test0Arg()         { assertEquals(1, new GenericCollectionHolder_IndexOfLastOrNullAlias().execute(it -> it.findLastIndexOrNull(callback0AsTrue)).amountOfCall); }
                @DisplayName("(T) → boolean")                  @Test void test1Arg()         { assertEquals(1, new GenericCollectionHolder_IndexOfLastOrNullAlias().execute(it -> it.findLastIndexOrNull(callback1AsTrue)).amountOfCall); }
                @DisplayName("(T, int) → boolean")             @Test void test2Arg()         { assertEquals(1, new GenericCollectionHolder_IndexOfLastOrNullAlias().execute(it -> it.findLastIndexOrNull(callback2AsTrue)).amountOfCall); }
                @DisplayName("() → boolean, int")              @Test void test0ArgFrom()     { assertEquals(1, new GenericCollectionHolder_IndexOfLastOrNullAlias().execute(it -> it.findLastIndexOrNull(callback0AsTrue, 1)).amountOfCall); }
                @DisplayName("(T) → boolean, int")             @Test void test1ArgFrom()     { assertEquals(1, new GenericCollectionHolder_IndexOfLastOrNullAlias().execute(it -> it.findLastIndexOrNull(callback1AsTrue, 1)).amountOfCall); }
                @DisplayName("(T, int) → boolean, int")        @Test void test2ArgFrom()     { assertEquals(1, new GenericCollectionHolder_IndexOfLastOrNullAlias().execute(it -> it.findLastIndexOrNull(callback2AsTrue, 1)).amountOfCall); }
                @DisplayName("() → boolean, int?")             @Test void test0ArgNull()     { assertEquals(1, new GenericCollectionHolder_IndexOfLastOrNullAlias().execute(it -> it.findLastIndexOrNull(callback0AsTrue, null)).amountOfCall); }
                @DisplayName("(T) → boolean, int?")            @Test void test1ArgNull()     { assertEquals(1, new GenericCollectionHolder_IndexOfLastOrNullAlias().execute(it -> it.findLastIndexOrNull(callback1AsTrue, null)).amountOfCall); }
                @DisplayName("(T, int) → boolean, int?")       @Test void test2ArgNull()     { assertEquals(1, new GenericCollectionHolder_IndexOfLastOrNullAlias().execute(it -> it.findLastIndexOrNull(callback2AsTrue, null)).amountOfCall); }
                @DisplayName("() → boolean, int, int")         @Test void test0ArgFromTo()   { assertEquals(1, new GenericCollectionHolder_IndexOfLastOrNullAlias().execute(it -> it.findLastIndexOrNull(callback0AsTrue, 1, 2)).amountOfCall); }
                @DisplayName("(T) → boolean, int, int")        @Test void test1ArgFromTo()   { assertEquals(1, new GenericCollectionHolder_IndexOfLastOrNullAlias().execute(it -> it.findLastIndexOrNull(callback1AsTrue, 1, 2)).amountOfCall); }
                @DisplayName("(T, int) → boolean, int, int")   @Test void test2ArgFromTo()   { assertEquals(1, new GenericCollectionHolder_IndexOfLastOrNullAlias().execute(it -> it.findLastIndexOrNull(callback2AsTrue, 1, 2)).amountOfCall); }
                @DisplayName("() → boolean, int, int?")        @Test void test0ArgFromNull() { assertEquals(1, new GenericCollectionHolder_IndexOfLastOrNullAlias().execute(it -> it.findLastIndexOrNull(callback0AsTrue, 0, null)).amountOfCall); }
                @DisplayName("(T) → boolean, int, int?")       @Test void test1ArgFromNull() { assertEquals(1, new GenericCollectionHolder_IndexOfLastOrNullAlias().execute(it -> it.findLastIndexOrNull(callback1AsTrue, 0, null)).amountOfCall); }
                @DisplayName("(T, int) → boolean, int, int?")  @Test void test2ArgFromNull() { assertEquals(1, new GenericCollectionHolder_IndexOfLastOrNullAlias().execute(it -> it.findLastIndexOrNull(callback2AsTrue, 0, null)).amountOfCall); }
                @DisplayName("() → boolean, int?, int?")       @Test void test0ArgNullNull() { assertEquals(1, new GenericCollectionHolder_IndexOfLastOrNullAlias().execute(it -> it.findLastIndexOrNull(callback0AsTrue, null, null)).amountOfCall); }
                @DisplayName("(T) → boolean, int?, int?")      @Test void test1ArgNullNull() { assertEquals(1, new GenericCollectionHolder_IndexOfLastOrNullAlias().execute(it -> it.findLastIndexOrNull(callback1AsTrue, null, null)).amountOfCall); }
                @DisplayName("(T, int) → boolean, int?, int?") @Test void test2ArgNullNull() { assertEquals(1, new GenericCollectionHolder_IndexOfLastOrNullAlias().execute(it -> it.findLastIndexOrNull(callback2AsTrue, null, null)).amountOfCall); }
            }
            @Nested class findLastIndexIndexed {
                @DisplayName("() → boolean")                   @Test void test0Arg()         { assertEquals(1, new GenericCollectionHolder_IndexOfLastIndexedAlias().execute(it -> it.findLastIndexIndexed(callback0AsTrue)).amountOfCall); }
                @DisplayName("(T) → boolean")                  @Test void test1Arg()         { assertEquals(1, new GenericCollectionHolder_IndexOfLastIndexedAlias().execute(it -> it.findLastIndexIndexed(callback1AltAsTrue)).amountOfCall); }
                @DisplayName("(T, int) → boolean")             @Test void test2Arg()         { assertEquals(1, new GenericCollectionHolder_IndexOfLastIndexedAlias().execute(it -> it.findLastIndexIndexed(callback2AltAsTrue)).amountOfCall); }
                @DisplayName("() → boolean, int")              @Test void test0ArgFrom()     { assertEquals(1, new GenericCollectionHolder_IndexOfLastIndexedAlias().execute(it -> it.findLastIndexIndexed(callback0AsTrue, 1)).amountOfCall); }
                @DisplayName("(T) → boolean, int")             @Test void test1ArgFrom()     { assertEquals(1, new GenericCollectionHolder_IndexOfLastIndexedAlias().execute(it -> it.findLastIndexIndexed(callback1AltAsTrue, 1)).amountOfCall); }
                @DisplayName("(T, int) → boolean, int")        @Test void test2ArgFrom()     { assertEquals(1, new GenericCollectionHolder_IndexOfLastIndexedAlias().execute(it -> it.findLastIndexIndexed(callback2AltAsTrue, 1)).amountOfCall); }
                @DisplayName("() → boolean, int?")             @Test void test0ArgNull()     { assertEquals(1, new GenericCollectionHolder_IndexOfLastIndexedAlias().execute(it -> it.findLastIndexIndexed(callback0AsTrue, null)).amountOfCall); }
                @DisplayName("(T) → boolean, int?")            @Test void test1ArgNull()     { assertEquals(1, new GenericCollectionHolder_IndexOfLastIndexedAlias().execute(it -> it.findLastIndexIndexed(callback1AltAsTrue, null)).amountOfCall); }
                @DisplayName("(T, int) → boolean, int?")       @Test void test2ArgNull()     { assertEquals(1, new GenericCollectionHolder_IndexOfLastIndexedAlias().execute(it -> it.findLastIndexIndexed(callback2AltAsTrue, null)).amountOfCall); }
                @DisplayName("() → boolean, int, int")         @Test void test0ArgFromTo()   { assertEquals(1, new GenericCollectionHolder_IndexOfLastIndexedAlias().execute(it -> it.findLastIndexIndexed(callback0AsTrue, 1, 2)).amountOfCall); }
                @DisplayName("(T) → boolean, int, int")        @Test void test1ArgFromTo()   { assertEquals(1, new GenericCollectionHolder_IndexOfLastIndexedAlias().execute(it -> it.findLastIndexIndexed(callback1AltAsTrue, 1, 2)).amountOfCall); }
                @DisplayName("(T, int) → boolean, int, int")   @Test void test2ArgFromTo()   { assertEquals(1, new GenericCollectionHolder_IndexOfLastIndexedAlias().execute(it -> it.findLastIndexIndexed(callback2AltAsTrue, 1, 2)).amountOfCall); }
                @DisplayName("() → boolean, int, int?")        @Test void test0ArgFromNull() { assertEquals(1, new GenericCollectionHolder_IndexOfLastIndexedAlias().execute(it -> it.findLastIndexIndexed(callback0AsTrue, 0, null)).amountOfCall); }
                @DisplayName("(T) → boolean, int, int?")       @Test void test1ArgFromNull() { assertEquals(1, new GenericCollectionHolder_IndexOfLastIndexedAlias().execute(it -> it.findLastIndexIndexed(callback1AltAsTrue, 0, null)).amountOfCall); }
                @DisplayName("(T, int) → boolean, int, int?")  @Test void test2ArgFromNull() { assertEquals(1, new GenericCollectionHolder_IndexOfLastIndexedAlias().execute(it -> it.findLastIndexIndexed(callback2AltAsTrue, 0, null)).amountOfCall); }
                @DisplayName("() → boolean, int?, int?")       @Test void test0ArgNullNull() { assertEquals(1, new GenericCollectionHolder_IndexOfLastIndexedAlias().execute(it -> it.findLastIndexIndexed(callback0AsTrue, null, null)).amountOfCall); }
                @DisplayName("(T) → boolean, int?, int?")      @Test void test1ArgNullNull() { assertEquals(1, new GenericCollectionHolder_IndexOfLastIndexedAlias().execute(it -> it.findLastIndexIndexed(callback1AltAsTrue, null, null)).amountOfCall); }
                @DisplayName("(T, int) → boolean, int?, int?") @Test void test2ArgNullNull() { assertEquals(1, new GenericCollectionHolder_IndexOfLastIndexedAlias().execute(it -> it.findLastIndexIndexed(callback2AltAsTrue, null, null)).amountOfCall); }
            }
            @Nested class findLastIndexIndexedOrNull {
                @DisplayName("() → boolean")                   @Test void test0Arg()         { assertEquals(1, new GenericCollectionHolder_IndexOfLastIndexedOrNullAlias().execute(it -> it.findLastIndexIndexedOrNull(callback0AsTrue)).amountOfCall); }
                @DisplayName("(T) → boolean")                  @Test void test1Arg()         { assertEquals(1, new GenericCollectionHolder_IndexOfLastIndexedOrNullAlias().execute(it -> it.findLastIndexIndexedOrNull(callback1AltAsTrue)).amountOfCall); }
                @DisplayName("(T, int) → boolean")             @Test void test2Arg()         { assertEquals(1, new GenericCollectionHolder_IndexOfLastIndexedOrNullAlias().execute(it -> it.findLastIndexIndexedOrNull(callback2AltAsTrue)).amountOfCall); }
                @DisplayName("() → boolean, int")              @Test void test0ArgFrom()     { assertEquals(1, new GenericCollectionHolder_IndexOfLastIndexedOrNullAlias().execute(it -> it.findLastIndexIndexedOrNull(callback0AsTrue, 1)).amountOfCall); }
                @DisplayName("(T) → boolean, int")             @Test void test1ArgFrom()     { assertEquals(1, new GenericCollectionHolder_IndexOfLastIndexedOrNullAlias().execute(it -> it.findLastIndexIndexedOrNull(callback1AltAsTrue, 1)).amountOfCall); }
                @DisplayName("(T, int) → boolean, int")        @Test void test2ArgFrom()     { assertEquals(1, new GenericCollectionHolder_IndexOfLastIndexedOrNullAlias().execute(it -> it.findLastIndexIndexedOrNull(callback2AltAsTrue, 1)).amountOfCall); }
                @DisplayName("() → boolean, int?")             @Test void test0ArgNull()     { assertEquals(1, new GenericCollectionHolder_IndexOfLastIndexedOrNullAlias().execute(it -> it.findLastIndexIndexedOrNull(callback0AsTrue, null)).amountOfCall); }
                @DisplayName("(T) → boolean, int?")            @Test void test1ArgNull()     { assertEquals(1, new GenericCollectionHolder_IndexOfLastIndexedOrNullAlias().execute(it -> it.findLastIndexIndexedOrNull(callback1AltAsTrue, null)).amountOfCall); }
                @DisplayName("(T, int) → boolean, int?")       @Test void test2ArgNull()     { assertEquals(1, new GenericCollectionHolder_IndexOfLastIndexedOrNullAlias().execute(it -> it.findLastIndexIndexedOrNull(callback2AltAsTrue, null)).amountOfCall); }
                @DisplayName("() → boolean, int, int")         @Test void test0ArgFromTo()   { assertEquals(1, new GenericCollectionHolder_IndexOfLastIndexedOrNullAlias().execute(it -> it.findLastIndexIndexedOrNull(callback0AsTrue, 1, 2)).amountOfCall); }
                @DisplayName("(T) → boolean, int, int")        @Test void test1ArgFromTo()   { assertEquals(1, new GenericCollectionHolder_IndexOfLastIndexedOrNullAlias().execute(it -> it.findLastIndexIndexedOrNull(callback1AltAsTrue, 1, 2)).amountOfCall); }
                @DisplayName("(T, int) → boolean, int, int")   @Test void test2ArgFromTo()   { assertEquals(1, new GenericCollectionHolder_IndexOfLastIndexedOrNullAlias().execute(it -> it.findLastIndexIndexedOrNull(callback2AltAsTrue, 1, 2)).amountOfCall); }
                @DisplayName("() → boolean, int, int?")        @Test void test0ArgFromNull() { assertEquals(1, new GenericCollectionHolder_IndexOfLastIndexedOrNullAlias().execute(it -> it.findLastIndexIndexedOrNull(callback0AsTrue, 0, null)).amountOfCall); }
                @DisplayName("(T) → boolean, int, int?")       @Test void test1ArgFromNull() { assertEquals(1, new GenericCollectionHolder_IndexOfLastIndexedOrNullAlias().execute(it -> it.findLastIndexIndexedOrNull(callback1AltAsTrue, 0, null)).amountOfCall); }
                @DisplayName("(T, int) → boolean, int, int?")  @Test void test2ArgFromNull() { assertEquals(1, new GenericCollectionHolder_IndexOfLastIndexedOrNullAlias().execute(it -> it.findLastIndexIndexedOrNull(callback2AltAsTrue, 0, null)).amountOfCall); }
                @DisplayName("() → boolean, int?, int?")       @Test void test0ArgNullNull() { assertEquals(1, new GenericCollectionHolder_IndexOfLastIndexedOrNullAlias().execute(it -> it.findLastIndexIndexedOrNull(callback0AsTrue, null, null)).amountOfCall); }
                @DisplayName("(T) → boolean, int?, int?")      @Test void test1ArgNullNull() { assertEquals(1, new GenericCollectionHolder_IndexOfLastIndexedOrNullAlias().execute(it -> it.findLastIndexIndexedOrNull(callback1AltAsTrue, null, null)).amountOfCall); }
                @DisplayName("(T, int) → boolean, int?, int?") @Test void test2ArgNullNull() { assertEquals(1, new GenericCollectionHolder_IndexOfLastIndexedOrNullAlias().execute(it -> it.findLastIndexIndexedOrNull(callback2AltAsTrue, null, null)).amountOfCall); }
            }
        }

        @Nested class indexOf {
            @DisplayName("MinimalistCollectionHolder<T>, element")           @Test void minimalistElement()         { assertEquals(0, indexOf(new ArrayAsMinimalistCollection<>(ABC), "a")); }
            @DisplayName("CollectionHolder<T>, element")                     @Test void normalElement()             { assertEquals(0, indexOf(new ArrayAsCollection<>(ABC),           "a")); }
            @DisplayName("T[], element")                                     @Test void arrayElement()              { assertEquals(0, indexOf(ABC,                                    "a")); }
            @DisplayName("MinimalistCollectionHolder<T>, element, int")      @Test void minimalistElementFrom()     { assertEquals(1, indexOf(new ArrayAsMinimalistCollection<>(ABC), "b", 1)); }
            @DisplayName("CollectionHolder<T>, element, int")                @Test void normalElementFrom()         { assertEquals(1, indexOf(new ArrayAsCollection<>(ABC),           "b", 1)); }
            @DisplayName("T[], element, int")                                @Test void arrayElementFrom()          { assertEquals(1, indexOf(ABC,                                    "b", 1)); }
            @DisplayName("MinimalistCollectionHolder<T>, element, int?")     @Test void minimalistElementNull()     { assertEquals(0, indexOf(new ArrayAsMinimalistCollection<>(ABC), "a", null)); }
            @DisplayName("CollectionHolder<T>, element, int?")               @Test void normalElementNull()         { assertEquals(0, indexOf(new ArrayAsCollection<>(ABC),           "a", null)); }
            @DisplayName("T[], element, int?")                               @Test void arrayElementNull()          { assertEquals(0, indexOf(ABC,                                    "a", null)); }
            @DisplayName("MinimalistCollectionHolder<T>, element, int, int") @Test void minimalistElementFromTo()   { assertEquals(1, indexOf(new ArrayAsMinimalistCollection<>(ABC), "b", 1, 2)); }
            @DisplayName("CollectionHolder<T>, element, int, int")           @Test void normalElementFromTo()       { assertEquals(1, indexOf(new ArrayAsCollection<>(ABC),           "b", 1, 2)); }
            @DisplayName("T[], element, int, int")                           @Test void arrayElementFromTo()        { assertEquals(1, indexOf(ABC,                                    "b", 1, 2)); }
            @DisplayName("MinimalistCollectionHolder<T>, element, int, int") @Test void minimalistElementFromNull() { assertEquals(1, indexOf(new ArrayAsMinimalistCollection<>(ABC), "b", 1, null)); }
            @DisplayName("CollectionHolder<T>, element, int, int")           @Test void normalElementFromNull()     { assertEquals(1, indexOf(new ArrayAsCollection<>(ABC),           "b", 1, null)); }
            @DisplayName("T[], element, int, int")                           @Test void arrayElementFromNull()      { assertEquals(1, indexOf(ABC,                                    "b", 1, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, element, int, int") @Test void minimalistElementNullNull() { assertEquals(0, indexOf(new ArrayAsMinimalistCollection<>(ABC), "a", null, null)); }
            @DisplayName("CollectionHolder<T>, element, int, int")           @Test void normalElementNullNull()     { assertEquals(0, indexOf(new ArrayAsCollection<>(ABC),           "a", null, null)); }
            @DisplayName("T[], element, int, int")                           @Test void arrayElementNullNull()      { assertEquals(0, indexOf(ABC,                                    "a", null, null)); }
        }
        @Nested class indexOfOrNull {
            @DisplayName("MinimalistCollectionHolder<T>")                    @Test void minimalistElement()         { assertEquals(0, indexOfOrNull(new ArrayAsMinimalistCollection<>(ABC), "a")); }
            @DisplayName("CollectionHolder<T>")                              @Test void normalElement()             { assertEquals(0, indexOfOrNull(new ArrayAsCollection<>(ABC),           "a")); }
            @DisplayName("T[]")                                              @Test void arrayElement()              { assertEquals(0, indexOfOrNull(ABC,                                    "a")); }
            @DisplayName("MinimalistCollectionHolder<T>, element, int")      @Test void minimalistElementFrom()     { assertEquals(1, indexOfOrNull(new ArrayAsMinimalistCollection<>(ABC), "b", 1)); }
            @DisplayName("CollectionHolder<T>, element, int")                @Test void normalElementFrom()         { assertEquals(1, indexOfOrNull(new ArrayAsCollection<>(ABC),           "b", 1)); }
            @DisplayName("T[], element, int")                                @Test void arrayElementFrom()          { assertEquals(1, indexOfOrNull(ABC,                                    "b", 1)); }
            @DisplayName("MinimalistCollectionHolder<T>, element, int?")     @Test void minimalistElementNull()     { assertEquals(0, indexOfOrNull(new ArrayAsMinimalistCollection<>(ABC), "a", null)); }
            @DisplayName("CollectionHolder<T>, element, int?")               @Test void normalElementNull()         { assertEquals(0, indexOfOrNull(new ArrayAsCollection<>(ABC),           "a", null)); }
            @DisplayName("T[], element, int?")                               @Test void arrayElementNull()          { assertEquals(0, indexOfOrNull(ABC,                                    "a", null)); }
            @DisplayName("MinimalistCollectionHolder<T>, element, int, int") @Test void minimalistElementFromTo()   { assertEquals(1, indexOfOrNull(new ArrayAsMinimalistCollection<>(ABC), "b", 1, 2)); }
            @DisplayName("CollectionHolder<T>, element, int, int")           @Test void normalElementFromTo()       { assertEquals(1, indexOfOrNull(new ArrayAsCollection<>(ABC),           "b", 1, 2)); }
            @DisplayName("T[], element, int, int")                           @Test void arrayElementFromTo()        { assertEquals(1, indexOfOrNull(ABC,                                    "b", 1, 2)); }
            @DisplayName("MinimalistCollectionHolder<T>, element, int, int") @Test void minimalistElementFromNull() { assertEquals(1, indexOfOrNull(new ArrayAsMinimalistCollection<>(ABC), "b", 1, null)); }
            @DisplayName("CollectionHolder<T>, element, int, int")           @Test void normalElementFromNull()     { assertEquals(1, indexOfOrNull(new ArrayAsCollection<>(ABC),           "b", 1, null)); }
            @DisplayName("T[], element, int, int")                           @Test void arrayElementFromNull()      { assertEquals(1, indexOfOrNull(ABC,                                    "b", 1, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, element, int, int") @Test void minimalistElementNullNull() { assertEquals(0, indexOfOrNull(new ArrayAsMinimalistCollection<>(ABC), "a", null, null)); }
            @DisplayName("CollectionHolder<T>, element, int, int")           @Test void normalElementNullNull()     { assertEquals(0, indexOfOrNull(new ArrayAsCollection<>(ABC),           "a", null, null)); }
            @DisplayName("T[], element, int, int")                           @Test void arrayElementNullNull()      { assertEquals(0, indexOfOrNull(ABC,                                    "a", null, null)); }
        }

        @Nested class findFirstIndex {
            @DisplayName("MinimalistCollectionHolder<T>, () → boolean")                   @Test void minimalist0Arg()         { assertEquals(0, findFirstIndex(new ArrayAsMinimalistCollection<>(ABC), callback0AsTrue)); }
            @DisplayName("CollectionHolder<T>, () → boolean")                             @Test void normal0Arg()             { assertEquals(0, findFirstIndex(new ArrayAsCollection<>(ABC),           callback0AsTrue)); }
            @DisplayName("T[], () → boolean")                                             @Test void array0Arg()              { assertEquals(0, findFirstIndex(ABC,                                    callback0AsTrue)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T) → boolean")                  @Test void minimalist1Arg()         { assertEquals(0, findFirstIndex(new ArrayAsMinimalistCollection<>(ABC), callback1AsTrue)); }
            @DisplayName("CollectionHolder<T>, (T) → boolean")                            @Test void normal1Arg()             { assertEquals(0, findFirstIndex(new ArrayAsCollection<>(ABC),           callback1AsTrue)); }
            @DisplayName("T[], (T) → boolean")                                            @Test void array1Arg()              { assertEquals(0, findFirstIndex(ABC,                                    callback1AsTrue)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T, int) → boolean")             @Test void minimalist2Arg()         { assertEquals(0, findFirstIndex(new ArrayAsMinimalistCollection<>(ABC), callback2AsTrue)); }
            @DisplayName("CollectionHolder<T>, (T, int) → boolean")                       @Test void normal2Arg()             { assertEquals(0, findFirstIndex(new ArrayAsCollection<>(ABC),           callback2AsTrue)); }
            @DisplayName("T[], (T, int) → boolean")                                       @Test void array2Arg()              { assertEquals(0, findFirstIndex(ABC,                                    callback2AsTrue)); }
            @DisplayName("MinimalistCollectionHolder<T>, () → boolean, int")              @Test void minimalist0ArgFrom()     { assertEquals(1, findFirstIndex(new ArrayAsMinimalistCollection<>(ABC), callback0AsTrue, 1)); }
            @DisplayName("CollectionHolder<T>, () → boolean, int")                        @Test void normal0ArgFrom()         { assertEquals(1, findFirstIndex(new ArrayAsCollection<>(ABC),           callback0AsTrue, 1)); }
            @DisplayName("T[], () → boolean, int")                                        @Test void array0ArgFrom()          { assertEquals(1, findFirstIndex(ABC,                                    callback0AsTrue, 1)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T) → boolean, int")             @Test void minimalist1ArgFrom()     { assertEquals(1, findFirstIndex(new ArrayAsMinimalistCollection<>(ABC), callback1AsTrue, 1)); }
            @DisplayName("CollectionHolder<T>, (T) → boolean, int")                       @Test void normal1ArgFrom()         { assertEquals(1, findFirstIndex(new ArrayAsCollection<>(ABC),           callback1AsTrue, 1)); }
            @DisplayName("T[], (T) → boolean, int")                                       @Test void array1ArgFrom()          { assertEquals(1, findFirstIndex(ABC,                                    callback1AsTrue, 1)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T, int) → boolean, int")        @Test void minimalist2ArgFrom()     { assertEquals(1, findFirstIndex(new ArrayAsMinimalistCollection<>(ABC), callback2AsTrue, 1)); }
            @DisplayName("CollectionHolder<T>, (T, int) → boolean, int")                  @Test void normal2ArgFrom()         { assertEquals(1, findFirstIndex(new ArrayAsCollection<>(ABC),           callback2AsTrue, 1)); }
            @DisplayName("T[], (T, int) → boolean, int")                                  @Test void array2ArgFrom()          { assertEquals(1, findFirstIndex(ABC,                                    callback2AsTrue, 1)); }
            @DisplayName("MinimalistCollectionHolder<T>, () → boolean, int?")             @Test void minimalist0ArgNull()     { assertEquals(0, findFirstIndex(new ArrayAsMinimalistCollection<>(ABC), callback0AsTrue, null)); }
            @DisplayName("CollectionHolder<T>, () → boolean, int?")                       @Test void normal0ArgNull()         { assertEquals(0, findFirstIndex(new ArrayAsCollection<>(ABC),           callback0AsTrue, null)); }
            @DisplayName("T[], () → boolean, int?")                                       @Test void array0ArgNull()          { assertEquals(0, findFirstIndex(ABC,                                    callback0AsTrue, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T) → boolean, int?")            @Test void minimalist1ArgNull()     { assertEquals(0, findFirstIndex(new ArrayAsMinimalistCollection<>(ABC), callback1AsTrue, null)); }
            @DisplayName("CollectionHolder<T>, (T) → boolean, int?")                      @Test void normal1ArgNull()         { assertEquals(0, findFirstIndex(new ArrayAsCollection<>(ABC),           callback1AsTrue, null)); }
            @DisplayName("T[], (T) → boolean, int?")                                      @Test void array1ArgNull()          { assertEquals(0, findFirstIndex(ABC,                                    callback1AsTrue, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T, int) → boolean, int?")       @Test void minimalist2ArgNull()     { assertEquals(0, findFirstIndex(new ArrayAsMinimalistCollection<>(ABC), callback2AsTrue, null)); }
            @DisplayName("CollectionHolder<T>, (T, int) → boolean, int?")                 @Test void normal2ArgNull()         { assertEquals(0, findFirstIndex(new ArrayAsCollection<>(ABC),           callback2AsTrue, null)); }
            @DisplayName("T[], (T, int) → boolean, int?")                                 @Test void array2ArgNull()          { assertEquals(0, findFirstIndex(ABC,                                    callback2AsTrue, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, () → boolean, int, int")         @Test void minimalist0ArgFromTo()   { assertEquals(1, findFirstIndex(new ArrayAsMinimalistCollection<>(ABC), callback0AsTrue, 1, 2)); }
            @DisplayName("CollectionHolder<T>, () → boolean, int, int")                   @Test void normal0ArgFromTo()       { assertEquals(1, findFirstIndex(new ArrayAsCollection<>(ABC),           callback0AsTrue, 1, 2)); }
            @DisplayName("T[], () → boolean, int, int")                                   @Test void array0ArgFromTo()        { assertEquals(1, findFirstIndex(ABC,                                    callback0AsTrue, 1, 2)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T) → boolean, int, int")        @Test void minimalist1ArgFromTo()   { assertEquals(1, findFirstIndex(new ArrayAsMinimalistCollection<>(ABC), callback1AsTrue, 1, 2)); }
            @DisplayName("CollectionHolder<T>, (T) → boolean, int, int")                  @Test void normal1ArgFromTo()       { assertEquals(1, findFirstIndex(new ArrayAsCollection<>(ABC),           callback1AsTrue, 1, 2)); }
            @DisplayName("T[], (T) → boolean, int, int")                                  @Test void array1ArgFromTo()        { assertEquals(1, findFirstIndex(ABC,                                    callback1AsTrue, 1, 2)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T, int) → boolean, int, int")   @Test void minimalist2ArgFromTo()   { assertEquals(1, findFirstIndex(new ArrayAsMinimalistCollection<>(ABC), callback2AsTrue, 1, 2)); }
            @DisplayName("CollectionHolder<T>, (T, int) → boolean, int, int")             @Test void normal2ArgFromTo()       { assertEquals(1, findFirstIndex(new ArrayAsCollection<>(ABC),           callback2AsTrue, 1, 2)); }
            @DisplayName("T[], (T, int) → boolean, int, int")                             @Test void array2ArgFromTo()        { assertEquals(1, findFirstIndex(ABC,                                    callback2AsTrue, 1, 2)); }
            @DisplayName("MinimalistCollectionHolder<T>, () → boolean, int, int?")        @Test void minimalist0ArgFromNull() { assertEquals(0, findFirstIndex(new ArrayAsMinimalistCollection<>(ABC), callback0AsTrue, 0, null)); }
            @DisplayName("CollectionHolder<T>, () → boolean, int, int?")                  @Test void normal0ArgFromNull()     { assertEquals(0, findFirstIndex(new ArrayAsCollection<>(ABC),           callback0AsTrue, 0, null)); }
            @DisplayName("T[], () → boolean, int, int?")                                  @Test void array0ArgFromNull()      { assertEquals(0, findFirstIndex(ABC,                                    callback0AsTrue, 0, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T) → boolean, int, int?")       @Test void minimalist1ArgFromNull() { assertEquals(0, findFirstIndex(new ArrayAsMinimalistCollection<>(ABC), callback1AsTrue, 0, null)); }
            @DisplayName("CollectionHolder<T>, (T) → boolean, int, int?")                 @Test void normal1ArgFromNull()     { assertEquals(0, findFirstIndex(new ArrayAsCollection<>(ABC),           callback1AsTrue, 0, null)); }
            @DisplayName("T[], (T) → boolean, int, int?")                                 @Test void array1ArgFromNull()      { assertEquals(0, findFirstIndex(ABC,                                    callback1AsTrue, 0, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T, int) → boolean, int, int?")  @Test void minimalist2ArgFromNull() { assertEquals(0, findFirstIndex(new ArrayAsMinimalistCollection<>(ABC), callback2AsTrue, 0, null)); }
            @DisplayName("CollectionHolder<T>, (T, int) → boolean, int, int?")            @Test void normal2ArgFromNull()     { assertEquals(0, findFirstIndex(new ArrayAsCollection<>(ABC),           callback2AsTrue, 0, null)); }
            @DisplayName("T[], (T, int) → boolean, int, int?")                            @Test void array2ArgFromNull()      { assertEquals(0, findFirstIndex(ABC,                                    callback2AsTrue, 0, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, () → boolean, int?, int?")       @Test void minimalist0ArgNullNull() { assertEquals(0, findFirstIndex(new ArrayAsMinimalistCollection<>(ABC), callback0AsTrue, null, null)); }
            @DisplayName("CollectionHolder<T>, () → boolean, int?, int?")                 @Test void normal0ArgNullNull()     { assertEquals(0, findFirstIndex(new ArrayAsCollection<>(ABC),           callback0AsTrue, null, null)); }
            @DisplayName("T[], () → boolean, int?, int?")                                 @Test void array0ArgNullNull()      { assertEquals(0, findFirstIndex(ABC,                                    callback0AsTrue, null, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T) → boolean, int?, int?")      @Test void minimalist1ArgNullNull() { assertEquals(0, findFirstIndex(new ArrayAsMinimalistCollection<>(ABC), callback1AsTrue, null, null)); }
            @DisplayName("CollectionHolder<T>, (T) → boolean, int?, int?")                @Test void normal1ArgNullNull()     { assertEquals(0, findFirstIndex(new ArrayAsCollection<>(ABC),           callback1AsTrue, null, null)); }
            @DisplayName("T[], (T) → boolean, int?, int?")                                @Test void array1ArgNullNull()      { assertEquals(0, findFirstIndex(ABC,                                    callback1AsTrue, null, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T, int) → boolean, int?, int?") @Test void minimalist2ArgNullNull() { assertEquals(0, findFirstIndex(new ArrayAsMinimalistCollection<>(ABC), callback2AsTrue, null, null)); }
            @DisplayName("CollectionHolder<T>, (T, int) → boolean, int?, int")            @Test void normal2ArgNullNull()     { assertEquals(0, findFirstIndex(new ArrayAsCollection<>(ABC),           callback2AsTrue, null, null)); }
            @DisplayName("T[], (T, int) → boolean, int?, int")                            @Test void array2ArgNullNull()      { assertEquals(0, findFirstIndex(ABC,                                    callback2AsTrue, null, null)); }
       }
        @Nested class findIndex {
            @DisplayName("MinimalistCollectionHolder<T>, () → boolean")                   @Test void minimalist0Arg()         { assertEquals(0, findIndex(new ArrayAsMinimalistCollection<>(ABC), callback0AsTrue)); }
            @DisplayName("CollectionHolder<T>, () → boolean")                             @Test void normal0Arg()             { assertEquals(0, findIndex(new ArrayAsCollection<>(ABC),           callback0AsTrue)); }
            @DisplayName("T[], () → boolean")                                             @Test void array0Arg()              { assertEquals(0, findIndex(ABC,                                    callback0AsTrue)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T) → boolean")                  @Test void minimalist1Arg()         { assertEquals(0, findIndex(new ArrayAsMinimalistCollection<>(ABC), callback1AsTrue)); }
            @DisplayName("CollectionHolder<T>, (T) → boolean")                            @Test void normal1Arg()             { assertEquals(0, findIndex(new ArrayAsCollection<>(ABC),           callback1AsTrue)); }
            @DisplayName("T[], (T) → boolean")                                            @Test void array1Arg()              { assertEquals(0, findIndex(ABC,                                    callback1AsTrue)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T, int) → boolean")             @Test void minimalist2Arg()         { assertEquals(0, findIndex(new ArrayAsMinimalistCollection<>(ABC), callback2AsTrue)); }
            @DisplayName("CollectionHolder<T>, (T, int) → boolean")                       @Test void normal2Arg()             { assertEquals(0, findIndex(new ArrayAsCollection<>(ABC),           callback2AsTrue)); }
            @DisplayName("T[], (T, int) → boolean")                                       @Test void array2Arg()              { assertEquals(0, findIndex(ABC,                                    callback2AsTrue)); }
            @DisplayName("MinimalistCollectionHolder<T>, () → boolean, int")              @Test void minimalist0ArgFrom()     { assertEquals(1, findIndex(new ArrayAsMinimalistCollection<>(ABC), callback0AsTrue, 1)); }
            @DisplayName("CollectionHolder<T>, () → boolean, int")                        @Test void normal0ArgFrom()         { assertEquals(1, findIndex(new ArrayAsCollection<>(ABC),           callback0AsTrue, 1)); }
            @DisplayName("T[], () → boolean, int")                                        @Test void array0ArgFrom()          { assertEquals(1, findIndex(ABC,                                    callback0AsTrue, 1)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T) → boolean, int")             @Test void minimalist1ArgFrom()     { assertEquals(1, findIndex(new ArrayAsMinimalistCollection<>(ABC), callback1AsTrue, 1)); }
            @DisplayName("CollectionHolder<T>, (T) → boolean, int")                       @Test void normal1ArgFrom()         { assertEquals(1, findIndex(new ArrayAsCollection<>(ABC),           callback1AsTrue, 1)); }
            @DisplayName("T[], (T) → boolean, int")                                       @Test void array1ArgFrom()          { assertEquals(1, findIndex(ABC,                                    callback1AsTrue, 1)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T, int) → boolean, int")        @Test void minimalist2ArgFrom()     { assertEquals(1, findIndex(new ArrayAsMinimalistCollection<>(ABC), callback2AsTrue, 1)); }
            @DisplayName("CollectionHolder<T>, (T, int) → boolean, int")                  @Test void normal2ArgFrom()         { assertEquals(1, findIndex(new ArrayAsCollection<>(ABC),           callback2AsTrue, 1)); }
            @DisplayName("T[], (T, int) → boolean, int")                                  @Test void array2ArgFrom()          { assertEquals(1, findIndex(ABC,                                    callback2AsTrue, 1)); }
            @DisplayName("MinimalistCollectionHolder<T>, () → boolean, int?")             @Test void minimalist0ArgNull()     { assertEquals(0, findIndex(new ArrayAsMinimalistCollection<>(ABC), callback0AsTrue, null)); }
            @DisplayName("CollectionHolder<T>, () → boolean, int?")                       @Test void normal0ArgNull()         { assertEquals(0, findIndex(new ArrayAsCollection<>(ABC),           callback0AsTrue, null)); }
            @DisplayName("T[], () → boolean, int?")                                       @Test void array0ArgNull()          { assertEquals(0, findIndex(ABC,                                    callback0AsTrue, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T) → boolean, int?")            @Test void minimalist1ArgNull()     { assertEquals(0, findIndex(new ArrayAsMinimalistCollection<>(ABC), callback1AsTrue, null)); }
            @DisplayName("CollectionHolder<T>, (T) → boolean, int?")                      @Test void normal1ArgNull()         { assertEquals(0, findIndex(new ArrayAsCollection<>(ABC),           callback1AsTrue, null)); }
            @DisplayName("T[], (T) → boolean, int?")                                      @Test void array1ArgNull()          { assertEquals(0, findIndex(ABC,                                    callback1AsTrue, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T, int) → boolean, int?")       @Test void minimalist2ArgNull()     { assertEquals(0, findIndex(new ArrayAsMinimalistCollection<>(ABC), callback2AsTrue, null)); }
            @DisplayName("CollectionHolder<T>, (T, int) → boolean, int?")                 @Test void normal2ArgNull()         { assertEquals(0, findIndex(new ArrayAsCollection<>(ABC),           callback2AsTrue, null)); }
            @DisplayName("T[], (T, int) → boolean, int?")                                 @Test void array2ArgNull()          { assertEquals(0, findIndex(ABC,                                    callback2AsTrue, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, () → boolean, int, int")         @Test void minimalist0ArgFromTo()   { assertEquals(1, findIndex(new ArrayAsMinimalistCollection<>(ABC), callback0AsTrue, 1, 2)); }
            @DisplayName("CollectionHolder<T>, () → boolean, int, int")                   @Test void normal0ArgFromTo()       { assertEquals(1, findIndex(new ArrayAsCollection<>(ABC),           callback0AsTrue, 1, 2)); }
            @DisplayName("T[], () → boolean, int, int")                                   @Test void array0ArgFromTo()        { assertEquals(1, findIndex(ABC,                                    callback0AsTrue, 1, 2)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T) → boolean, int, int")        @Test void minimalist1ArgFromTo()   { assertEquals(1, findIndex(new ArrayAsMinimalistCollection<>(ABC), callback1AsTrue, 1, 2)); }
            @DisplayName("CollectionHolder<T>, (T) → boolean, int, int")                  @Test void normal1ArgFromTo()       { assertEquals(1, findIndex(new ArrayAsCollection<>(ABC),           callback1AsTrue, 1, 2)); }
            @DisplayName("T[], (T) → boolean, int, int")                                  @Test void array1ArgFromTo()        { assertEquals(1, findIndex(ABC,                                    callback1AsTrue, 1, 2)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T, int) → boolean, int, int")   @Test void minimalist2ArgFromTo()   { assertEquals(1, findIndex(new ArrayAsMinimalistCollection<>(ABC), callback2AsTrue, 1, 2)); }
            @DisplayName("CollectionHolder<T>, (T, int) → boolean, int, int")             @Test void normal2ArgFromTo()       { assertEquals(1, findIndex(new ArrayAsCollection<>(ABC),           callback2AsTrue, 1, 2)); }
            @DisplayName("T[], (T, int) → boolean, int, int")                             @Test void array2ArgFromTo()        { assertEquals(1, findIndex(ABC,                                    callback2AsTrue, 1, 2)); }
            @DisplayName("MinimalistCollectionHolder<T>, () → boolean, int, int?")        @Test void minimalist0ArgFromNull() { assertEquals(0, findIndex(new ArrayAsMinimalistCollection<>(ABC), callback0AsTrue, 0, null)); }
            @DisplayName("CollectionHolder<T>, () → boolean, int, int?")                  @Test void normal0ArgFromNull()     { assertEquals(0, findIndex(new ArrayAsCollection<>(ABC),           callback0AsTrue, 0, null)); }
            @DisplayName("T[], () → boolean, int, int?")                                  @Test void array0ArgFromNull()      { assertEquals(0, findIndex(ABC,                                    callback0AsTrue, 0, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T) → boolean, int, int?")       @Test void minimalist1ArgFromNull() { assertEquals(0, findIndex(new ArrayAsMinimalistCollection<>(ABC), callback1AsTrue, 0, null)); }
            @DisplayName("CollectionHolder<T>, (T) → boolean, int, int?")                 @Test void normal1ArgFromNull()     { assertEquals(0, findIndex(new ArrayAsCollection<>(ABC),           callback1AsTrue, 0, null)); }
            @DisplayName("T[], (T) → boolean, int, int?")                                 @Test void array1ArgFromNull()      { assertEquals(0, findIndex(ABC,                                    callback1AsTrue, 0, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T, int) → boolean, int, int?")  @Test void minimalist2ArgFromNull() { assertEquals(0, findIndex(new ArrayAsMinimalistCollection<>(ABC), callback2AsTrue, 0, null)); }
            @DisplayName("CollectionHolder<T>, (T, int) → boolean, int, int?")            @Test void normal2ArgFromNull()     { assertEquals(0, findIndex(new ArrayAsCollection<>(ABC),           callback2AsTrue, 0, null)); }
            @DisplayName("T[], (T, int) → boolean, int, int?")                            @Test void array2ArgFromNull()      { assertEquals(0, findIndex(ABC,                                    callback2AsTrue, 0, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, () → boolean, int?, int?")       @Test void minimalist0ArgNullNull() { assertEquals(0, findIndex(new ArrayAsMinimalistCollection<>(ABC), callback0AsTrue, null, null)); }
            @DisplayName("CollectionHolder<T>, () → boolean, int?, int?")                 @Test void normal0ArgNullNull()     { assertEquals(0, findIndex(new ArrayAsCollection<>(ABC),           callback0AsTrue, null, null)); }
            @DisplayName("T[], () → boolean, int?, int?")                                 @Test void array0ArgNullNull()      { assertEquals(0, findIndex(ABC,                                    callback0AsTrue, null, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T) → boolean, int?, int?")      @Test void minimalist1ArgNullNull() { assertEquals(0, findIndex(new ArrayAsMinimalistCollection<>(ABC), callback1AsTrue, null, null)); }
            @DisplayName("CollectionHolder<T>, (T) → boolean, int?, int?")                @Test void normal1ArgNullNull()     { assertEquals(0, findIndex(new ArrayAsCollection<>(ABC),           callback1AsTrue, null, null)); }
            @DisplayName("T[], (T) → boolean, int?, int?")                                @Test void array1ArgNullNull()      { assertEquals(0, findIndex(ABC,                                    callback1AsTrue, null, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T, int) → boolean, int?, int?") @Test void minimalist2ArgNullNull() { assertEquals(0, findIndex(new ArrayAsMinimalistCollection<>(ABC), callback2AsTrue, null, null)); }
            @DisplayName("CollectionHolder<T>, (T, int) → boolean, int?, int")            @Test void normal2ArgNullNull()     { assertEquals(0, findIndex(new ArrayAsCollection<>(ABC),           callback2AsTrue, null, null)); }
            @DisplayName("T[], (T, int) → boolean, int?, int")                            @Test void array2ArgNullNull()      { assertEquals(0, findIndex(ABC,                                    callback2AsTrue, null, null)); }
       }
        @Nested class findFirstIndexOrNull {
            @DisplayName("MinimalistCollectionHolder<T>, () → boolean")                   @Test void minimalist0Arg()         { assertEquals(0, findFirstIndexOrNull(new ArrayAsMinimalistCollection<>(ABC), callback0AsTrue)); }
            @DisplayName("CollectionHolder<T>, () → boolean")                             @Test void normal0Arg()             { assertEquals(0, findFirstIndexOrNull(new ArrayAsCollection<>(ABC),           callback0AsTrue)); }
            @DisplayName("T[], () → boolean")                                             @Test void array0Arg()              { assertEquals(0, findFirstIndexOrNull(ABC,                                    callback0AsTrue)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T) → boolean")                  @Test void minimalist1Arg()         { assertEquals(0, findFirstIndexOrNull(new ArrayAsMinimalistCollection<>(ABC), callback1AsTrue)); }
            @DisplayName("CollectionHolder<T>, (T) → boolean")                            @Test void normal1Arg()             { assertEquals(0, findFirstIndexOrNull(new ArrayAsCollection<>(ABC),           callback1AsTrue)); }
            @DisplayName("T[], (T) → boolean")                                            @Test void array1Arg()              { assertEquals(0, findFirstIndexOrNull(ABC,                                    callback1AsTrue)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T, int) → boolean")             @Test void minimalist2Arg()         { assertEquals(0, findFirstIndexOrNull(new ArrayAsMinimalistCollection<>(ABC), callback2AsTrue)); }
            @DisplayName("CollectionHolder<T>, (T, int) → boolean")                       @Test void normal2Arg()             { assertEquals(0, findFirstIndexOrNull(new ArrayAsCollection<>(ABC),           callback2AsTrue)); }
            @DisplayName("T[], (T, int) → boolean")                                       @Test void array2Arg()              { assertEquals(0, findFirstIndexOrNull(ABC,                                    callback2AsTrue)); }
            @DisplayName("MinimalistCollectionHolder<T>, () → boolean, int")              @Test void minimalist0ArgFrom()     { assertEquals(1, findFirstIndexOrNull(new ArrayAsMinimalistCollection<>(ABC), callback0AsTrue, 1)); }
            @DisplayName("CollectionHolder<T>, () → boolean, int")                        @Test void normal0ArgFrom()         { assertEquals(1, findFirstIndexOrNull(new ArrayAsCollection<>(ABC),           callback0AsTrue, 1)); }
            @DisplayName("T[], () → boolean, int")                                        @Test void array0ArgFrom()          { assertEquals(1, findFirstIndexOrNull(ABC,                                    callback0AsTrue, 1)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T) → boolean, int")             @Test void minimalist1ArgFrom()     { assertEquals(1, findFirstIndexOrNull(new ArrayAsMinimalistCollection<>(ABC), callback1AsTrue, 1)); }
            @DisplayName("CollectionHolder<T>, (T) → boolean, int")                       @Test void normal1ArgFrom()         { assertEquals(1, findFirstIndexOrNull(new ArrayAsCollection<>(ABC),           callback1AsTrue, 1)); }
            @DisplayName("T[], (T) → boolean, int")                                       @Test void array1ArgFrom()          { assertEquals(1, findFirstIndexOrNull(ABC,                                    callback1AsTrue, 1)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T, int) → boolean, int")        @Test void minimalist2ArgFrom()     { assertEquals(1, findFirstIndexOrNull(new ArrayAsMinimalistCollection<>(ABC), callback2AsTrue, 1)); }
            @DisplayName("CollectionHolder<T>, (T, int) → boolean, int")                  @Test void normal2ArgFrom()         { assertEquals(1, findFirstIndexOrNull(new ArrayAsCollection<>(ABC),           callback2AsTrue, 1)); }
            @DisplayName("T[], (T, int) → boolean, int")                                  @Test void array2ArgFrom()          { assertEquals(1, findFirstIndexOrNull(ABC,                                    callback2AsTrue, 1)); }
            @DisplayName("MinimalistCollectionHolder<T>, () → boolean, int?")             @Test void minimalist0ArgNull()     { assertEquals(0, findFirstIndexOrNull(new ArrayAsMinimalistCollection<>(ABC), callback0AsTrue, null)); }
            @DisplayName("CollectionHolder<T>, () → boolean, int?")                       @Test void normal0ArgNull()         { assertEquals(0, findFirstIndexOrNull(new ArrayAsCollection<>(ABC),           callback0AsTrue, null)); }
            @DisplayName("T[], () → boolean, int?")                                       @Test void array0ArgNull()          { assertEquals(0, findFirstIndexOrNull(ABC,                                    callback0AsTrue, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T) → boolean, int?")            @Test void minimalist1ArgNull()     { assertEquals(0, findFirstIndexOrNull(new ArrayAsMinimalistCollection<>(ABC), callback1AsTrue, null)); }
            @DisplayName("CollectionHolder<T>, (T) → boolean, int?")                      @Test void normal1ArgNull()         { assertEquals(0, findFirstIndexOrNull(new ArrayAsCollection<>(ABC),           callback1AsTrue, null)); }
            @DisplayName("T[], (T) → boolean, int?")                                      @Test void array1ArgNull()          { assertEquals(0, findFirstIndexOrNull(ABC,                                    callback1AsTrue, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T, int) → boolean, int?")       @Test void minimalist2ArgNull()     { assertEquals(0, findFirstIndexOrNull(new ArrayAsMinimalistCollection<>(ABC), callback2AsTrue, null)); }
            @DisplayName("CollectionHolder<T>, (T, int) → boolean, int?")                 @Test void normal2ArgNull()         { assertEquals(0, findFirstIndexOrNull(new ArrayAsCollection<>(ABC),           callback2AsTrue, null)); }
            @DisplayName("T[], (T, int) → boolean, int?")                                 @Test void array2ArgNull()          { assertEquals(0, findFirstIndexOrNull(ABC,                                    callback2AsTrue, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, () → boolean, int, int")         @Test void minimalist0ArgFromTo()   { assertEquals(1, findFirstIndexOrNull(new ArrayAsMinimalistCollection<>(ABC), callback0AsTrue, 1, 2)); }
            @DisplayName("CollectionHolder<T>, () → boolean, int, int")                   @Test void normal0ArgFromTo()       { assertEquals(1, findFirstIndexOrNull(new ArrayAsCollection<>(ABC),           callback0AsTrue, 1, 2)); }
            @DisplayName("T[], () → boolean, int, int")                                   @Test void array0ArgFromTo()        { assertEquals(1, findFirstIndexOrNull(ABC,                                    callback0AsTrue, 1, 2)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T) → boolean, int, int")        @Test void minimalist1ArgFromTo()   { assertEquals(1, findFirstIndexOrNull(new ArrayAsMinimalistCollection<>(ABC), callback1AsTrue, 1, 2)); }
            @DisplayName("CollectionHolder<T>, (T) → boolean, int, int")                  @Test void normal1ArgFromTo()       { assertEquals(1, findFirstIndexOrNull(new ArrayAsCollection<>(ABC),           callback1AsTrue, 1, 2)); }
            @DisplayName("T[], (T) → boolean, int, int")                                  @Test void array1ArgFromTo()        { assertEquals(1, findFirstIndexOrNull(ABC,                                    callback1AsTrue, 1, 2)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T, int) → boolean, int, int")   @Test void minimalist2ArgFromTo()   { assertEquals(1, findFirstIndexOrNull(new ArrayAsMinimalistCollection<>(ABC), callback2AsTrue, 1, 2)); }
            @DisplayName("CollectionHolder<T>, (T, int) → boolean, int, int")             @Test void normal2ArgFromTo()       { assertEquals(1, findFirstIndexOrNull(new ArrayAsCollection<>(ABC),           callback2AsTrue, 1, 2)); }
            @DisplayName("T[], (T, int) → boolean, int, int")                             @Test void array2ArgFromTo()        { assertEquals(1, findFirstIndexOrNull(ABC,                                    callback2AsTrue, 1, 2)); }
            @DisplayName("MinimalistCollectionHolder<T>, () → boolean, int, int?")        @Test void minimalist0ArgFromNull() { assertEquals(0, findFirstIndexOrNull(new ArrayAsMinimalistCollection<>(ABC), callback0AsTrue, 0, null)); }
            @DisplayName("CollectionHolder<T>, () → boolean, int, int?")                  @Test void normal0ArgFromNull()     { assertEquals(0, findFirstIndexOrNull(new ArrayAsCollection<>(ABC),           callback0AsTrue, 0, null)); }
            @DisplayName("T[], () → boolean, int, int?")                                  @Test void array0ArgFromNull()      { assertEquals(0, findFirstIndexOrNull(ABC,                                    callback0AsTrue, 0, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T) → boolean, int, int?")       @Test void minimalist1ArgFromNull() { assertEquals(0, findFirstIndexOrNull(new ArrayAsMinimalistCollection<>(ABC), callback1AsTrue, 0, null)); }
            @DisplayName("CollectionHolder<T>, (T) → boolean, int, int?")                 @Test void normal1ArgFromNull()     { assertEquals(0, findFirstIndexOrNull(new ArrayAsCollection<>(ABC),           callback1AsTrue, 0, null)); }
            @DisplayName("T[], (T) → boolean, int, int?")                                 @Test void array1ArgFromNull()      { assertEquals(0, findFirstIndexOrNull(ABC,                                    callback1AsTrue, 0, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T, int) → boolean, int, int?")  @Test void minimalist2ArgFromNull() { assertEquals(0, findFirstIndexOrNull(new ArrayAsMinimalistCollection<>(ABC), callback2AsTrue, 0, null)); }
            @DisplayName("CollectionHolder<T>, (T, int) → boolean, int, int?")            @Test void normal2ArgFromNull()     { assertEquals(0, findFirstIndexOrNull(new ArrayAsCollection<>(ABC),           callback2AsTrue, 0, null)); }
            @DisplayName("T[], (T, int) → boolean, int, int?")                            @Test void array2ArgFromNull()      { assertEquals(0, findFirstIndexOrNull(ABC,                                    callback2AsTrue, 0, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, () → boolean, int?, int?")       @Test void minimalist0ArgNullNull() { assertEquals(0, findFirstIndexOrNull(new ArrayAsMinimalistCollection<>(ABC), callback0AsTrue, null, null)); }
            @DisplayName("CollectionHolder<T>, () → boolean, int?, int?")                 @Test void normal0ArgNullNull()     { assertEquals(0, findFirstIndexOrNull(new ArrayAsCollection<>(ABC),           callback0AsTrue, null, null)); }
            @DisplayName("T[], () → boolean, int?, int?")                                 @Test void array0ArgNullNull()      { assertEquals(0, findFirstIndexOrNull(ABC,                                    callback0AsTrue, null, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T) → boolean, int?, int?")      @Test void minimalist1ArgNullNull() { assertEquals(0, findFirstIndexOrNull(new ArrayAsMinimalistCollection<>(ABC), callback1AsTrue, null, null)); }
            @DisplayName("CollectionHolder<T>, (T) → boolean, int?, int?")                @Test void normal1ArgNullNull()     { assertEquals(0, findFirstIndexOrNull(new ArrayAsCollection<>(ABC),           callback1AsTrue, null, null)); }
            @DisplayName("T[], (T) → boolean, int?, int?")                                @Test void array1ArgNullNull()      { assertEquals(0, findFirstIndexOrNull(ABC,                                    callback1AsTrue, null, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T, int) → boolean, int?, int?") @Test void minimalist2ArgNullNull() { assertEquals(0, findFirstIndexOrNull(new ArrayAsMinimalistCollection<>(ABC), callback2AsTrue, null, null)); }
            @DisplayName("CollectionHolder<T>, (T, int) → boolean, int?, int?")           @Test void normal2ArgNullNull()     { assertEquals(0, findFirstIndexOrNull(new ArrayAsCollection<>(ABC),           callback2AsTrue, null, null)); }
            @DisplayName("T[], (T, int) → boolean, int?, int?")                           @Test void array2ArgNullNull()      { assertEquals(0, findFirstIndexOrNull(ABC,                                    callback2AsTrue, null, null)); }
        }
        @Nested class findIndexOrNull {
            @DisplayName("MinimalistCollectionHolder<T>, () → boolean")                   @Test void minimalist0Arg()         { assertEquals(0, findIndexOrNull(new ArrayAsMinimalistCollection<>(ABC), callback0AsTrue)); }
            @DisplayName("CollectionHolder<T>, () → boolean")                             @Test void normal0Arg()             { assertEquals(0, findIndexOrNull(new ArrayAsCollection<>(ABC),           callback0AsTrue)); }
            @DisplayName("T[], () → boolean")                                             @Test void array0Arg()              { assertEquals(0, findIndexOrNull(ABC,                                    callback0AsTrue)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T) → boolean")                  @Test void minimalist1Arg()         { assertEquals(0, findIndexOrNull(new ArrayAsMinimalistCollection<>(ABC), callback1AsTrue)); }
            @DisplayName("CollectionHolder<T>, (T) → boolean")                            @Test void normal1Arg()             { assertEquals(0, findIndexOrNull(new ArrayAsCollection<>(ABC),           callback1AsTrue)); }
            @DisplayName("T[], (T) → boolean")                                            @Test void array1Arg()              { assertEquals(0, findIndexOrNull(ABC,                                    callback1AsTrue)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T, int) → boolean")             @Test void minimalist2Arg()         { assertEquals(0, findIndexOrNull(new ArrayAsMinimalistCollection<>(ABC), callback2AsTrue)); }
            @DisplayName("CollectionHolder<T>, (T, int) → boolean")                       @Test void normal2Arg()             { assertEquals(0, findIndexOrNull(new ArrayAsCollection<>(ABC),           callback2AsTrue)); }
            @DisplayName("T[], (T, int) → boolean")                                       @Test void array2Arg()              { assertEquals(0, findIndexOrNull(ABC,                                    callback2AsTrue)); }
            @DisplayName("MinimalistCollectionHolder<T>, () → boolean, int")              @Test void minimalist0ArgFrom()     { assertEquals(1, findIndexOrNull(new ArrayAsMinimalistCollection<>(ABC), callback0AsTrue, 1)); }
            @DisplayName("CollectionHolder<T>, () → boolean, int")                        @Test void normal0ArgFrom()         { assertEquals(1, findIndexOrNull(new ArrayAsCollection<>(ABC),           callback0AsTrue, 1)); }
            @DisplayName("T[], () → boolean, int")                                        @Test void array0ArgFrom()          { assertEquals(1, findIndexOrNull(ABC,                                    callback0AsTrue, 1)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T) → boolean, int")             @Test void minimalist1ArgFrom()     { assertEquals(1, findIndexOrNull(new ArrayAsMinimalistCollection<>(ABC), callback1AsTrue, 1)); }
            @DisplayName("CollectionHolder<T>, (T) → boolean, int")                       @Test void normal1ArgFrom()         { assertEquals(1, findIndexOrNull(new ArrayAsCollection<>(ABC),           callback1AsTrue, 1)); }
            @DisplayName("T[], (T) → boolean, int")                                       @Test void array1ArgFrom()          { assertEquals(1, findIndexOrNull(ABC,                                    callback1AsTrue, 1)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T, int) → boolean, int")        @Test void minimalist2ArgFrom()     { assertEquals(1, findIndexOrNull(new ArrayAsMinimalistCollection<>(ABC), callback2AsTrue, 1)); }
            @DisplayName("CollectionHolder<T>, (T, int) → boolean, int")                  @Test void normal2ArgFrom()         { assertEquals(1, findIndexOrNull(new ArrayAsCollection<>(ABC),           callback2AsTrue, 1)); }
            @DisplayName("T[], (T, int) → boolean, int")                                  @Test void array2ArgFrom()          { assertEquals(1, findIndexOrNull(ABC,                                    callback2AsTrue, 1)); }
            @DisplayName("MinimalistCollectionHolder<T>, () → boolean, int?")             @Test void minimalist0ArgNull()     { assertEquals(0, findIndexOrNull(new ArrayAsMinimalistCollection<>(ABC), callback0AsTrue, null)); }
            @DisplayName("CollectionHolder<T>, () → boolean, int?")                       @Test void normal0ArgNull()         { assertEquals(0, findIndexOrNull(new ArrayAsCollection<>(ABC),           callback0AsTrue, null)); }
            @DisplayName("T[], () → boolean, int?")                                       @Test void array0ArgNull()          { assertEquals(0, findIndexOrNull(ABC,                                    callback0AsTrue, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T) → boolean, int?")            @Test void minimalist1ArgNull()     { assertEquals(0, findIndexOrNull(new ArrayAsMinimalistCollection<>(ABC), callback1AsTrue, null)); }
            @DisplayName("CollectionHolder<T>, (T) → boolean, int?")                      @Test void normal1ArgNull()         { assertEquals(0, findIndexOrNull(new ArrayAsCollection<>(ABC),           callback1AsTrue, null)); }
            @DisplayName("T[], (T) → boolean, int?")                                      @Test void array1ArgNull()          { assertEquals(0, findIndexOrNull(ABC,                                    callback1AsTrue, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T, int) → boolean, int?")       @Test void minimalist2ArgNull()     { assertEquals(0, findIndexOrNull(new ArrayAsMinimalistCollection<>(ABC), callback2AsTrue, null)); }
            @DisplayName("CollectionHolder<T>, (T, int) → boolean, int?")                 @Test void normal2ArgNull()         { assertEquals(0, findIndexOrNull(new ArrayAsCollection<>(ABC),           callback2AsTrue, null)); }
            @DisplayName("T[], (T, int) → boolean, int?")                                 @Test void array2ArgNull()          { assertEquals(0, findIndexOrNull(ABC,                                    callback2AsTrue, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, () → boolean, int, int")         @Test void minimalist0ArgFromTo()   { assertEquals(1, findIndexOrNull(new ArrayAsMinimalistCollection<>(ABC), callback0AsTrue, 1, 2)); }
            @DisplayName("CollectionHolder<T>, () → boolean, int, int")                   @Test void normal0ArgFromTo()       { assertEquals(1, findIndexOrNull(new ArrayAsCollection<>(ABC),           callback0AsTrue, 1, 2)); }
            @DisplayName("T[], () → boolean, int, int")                                   @Test void array0ArgFromTo()        { assertEquals(1, findIndexOrNull(ABC,                                    callback0AsTrue, 1, 2)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T) → boolean, int, int")        @Test void minimalist1ArgFromTo()   { assertEquals(1, findIndexOrNull(new ArrayAsMinimalistCollection<>(ABC), callback1AsTrue, 1, 2)); }
            @DisplayName("CollectionHolder<T>, (T) → boolean, int, int")                  @Test void normal1ArgFromTo()       { assertEquals(1, findIndexOrNull(new ArrayAsCollection<>(ABC),           callback1AsTrue, 1, 2)); }
            @DisplayName("T[], (T) → boolean, int, int")                                  @Test void array1ArgFromTo()        { assertEquals(1, findIndexOrNull(ABC,                                    callback1AsTrue, 1, 2)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T, int) → boolean, int, int")   @Test void minimalist2ArgFromTo()   { assertEquals(1, findIndexOrNull(new ArrayAsMinimalistCollection<>(ABC), callback2AsTrue, 1, 2)); }
            @DisplayName("CollectionHolder<T>, (T, int) → boolean, int, int")             @Test void normal2ArgFromTo()       { assertEquals(1, findIndexOrNull(new ArrayAsCollection<>(ABC),           callback2AsTrue, 1, 2)); }
            @DisplayName("T[], (T, int) → boolean, int, int")                             @Test void array2ArgFromTo()        { assertEquals(1, findIndexOrNull(ABC,                                    callback2AsTrue, 1, 2)); }
            @DisplayName("MinimalistCollectionHolder<T>, () → boolean, int, int?")        @Test void minimalist0ArgFromNull() { assertEquals(0, findIndexOrNull(new ArrayAsMinimalistCollection<>(ABC), callback0AsTrue, 0, null)); }
            @DisplayName("CollectionHolder<T>, () → boolean, int, int?")                  @Test void normal0ArgFromNull()     { assertEquals(0, findIndexOrNull(new ArrayAsCollection<>(ABC),           callback0AsTrue, 0, null)); }
            @DisplayName("T[], () → boolean, int, int?")                                  @Test void array0ArgFromNull()      { assertEquals(0, findIndexOrNull(ABC,                                    callback0AsTrue, 0, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T) → boolean, int, int?")       @Test void minimalist1ArgFromNull() { assertEquals(0, findIndexOrNull(new ArrayAsMinimalistCollection<>(ABC), callback1AsTrue, 0, null)); }
            @DisplayName("CollectionHolder<T>, (T) → boolean, int, int?")                 @Test void normal1ArgFromNull()     { assertEquals(0, findIndexOrNull(new ArrayAsCollection<>(ABC),           callback1AsTrue, 0, null)); }
            @DisplayName("T[], (T) → boolean, int, int?")                                 @Test void array1ArgFromNull()      { assertEquals(0, findIndexOrNull(ABC,                                    callback1AsTrue, 0, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T, int) → boolean, int, int?")  @Test void minimalist2ArgFromNull() { assertEquals(0, findIndexOrNull(new ArrayAsMinimalistCollection<>(ABC), callback2AsTrue, 0, null)); }
            @DisplayName("CollectionHolder<T>, (T, int) → boolean, int, int?")            @Test void normal2ArgFromNull()     { assertEquals(0, findIndexOrNull(new ArrayAsCollection<>(ABC),           callback2AsTrue, 0, null)); }
            @DisplayName("T[], (T, int) → boolean, int, int?")                            @Test void array2ArgFromNull()      { assertEquals(0, findIndexOrNull(ABC,                                    callback2AsTrue, 0, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, () → boolean, int?, int?")       @Test void minimalist0ArgNullNull() { assertEquals(0, findIndexOrNull(new ArrayAsMinimalistCollection<>(ABC), callback0AsTrue, null, null)); }
            @DisplayName("CollectionHolder<T>, () → boolean, int?, int?")                 @Test void normal0ArgNullNull()     { assertEquals(0, findIndexOrNull(new ArrayAsCollection<>(ABC),           callback0AsTrue, null, null)); }
            @DisplayName("T[], () → boolean, int?, int?")                                 @Test void array0ArgNullNull()      { assertEquals(0, findIndexOrNull(ABC,                                    callback0AsTrue, null, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T) → boolean, int?, int?")      @Test void minimalist1ArgNullNull() { assertEquals(0, findIndexOrNull(new ArrayAsMinimalistCollection<>(ABC), callback1AsTrue, null, null)); }
            @DisplayName("CollectionHolder<T>, (T) → boolean, int?, int?")                @Test void normal1ArgNullNull()     { assertEquals(0, findIndexOrNull(new ArrayAsCollection<>(ABC),           callback1AsTrue, null, null)); }
            @DisplayName("T[], (T) → boolean, int?, int?")                                @Test void array1ArgNullNull()      { assertEquals(0, findIndexOrNull(ABC,                                    callback1AsTrue, null, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T, int) → boolean, int?, int?") @Test void minimalist2ArgNullNull() { assertEquals(0, findIndexOrNull(new ArrayAsMinimalistCollection<>(ABC), callback2AsTrue, null, null)); }
            @DisplayName("CollectionHolder<T>, (T, int) → boolean, int?, int?")           @Test void normal2ArgNullNull()     { assertEquals(0, findIndexOrNull(new ArrayAsCollection<>(ABC),           callback2AsTrue, null, null)); }
            @DisplayName("T[], (T, int) → boolean, int?, int?")                           @Test void array2ArgNullNull()      { assertEquals(0, findIndexOrNull(ABC,                                    callback2AsTrue, null, null)); }
        }
        @Nested class findFirstIndexIndexed {
            @DisplayName("MinimalistCollectionHolder<T>, () → boolean")                   @Test void minimalist0Arg()         { assertEquals(0, findFirstIndexIndexed(new ArrayAsMinimalistCollection<>(ABC), callback0AsTrue)); }
            @DisplayName("CollectionHolder<T>, () → boolean")                             @Test void normal0Arg()             { assertEquals(0, findFirstIndexIndexed(new ArrayAsCollection<>(ABC),           callback0AsTrue)); }
            @DisplayName("T[], () → boolean")                                             @Test void array0Arg()              { assertEquals(0, findFirstIndexIndexed(ABC,                                    callback0AsTrue)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T) → boolean")                  @Test void minimalist1Arg()         { assertEquals(0, findFirstIndexIndexed(new ArrayAsMinimalistCollection<>(ABC), callback1AltAsTrue)); }
            @DisplayName("CollectionHolder<T>, (T) → boolean")                            @Test void normal1Arg()             { assertEquals(0, findFirstIndexIndexed(new ArrayAsCollection<>(ABC),           callback1AltAsTrue)); }
            @DisplayName("T[], (T) → boolean")                                            @Test void array1Arg()              { assertEquals(0, findFirstIndexIndexed(ABC,                                    callback1AltAsTrue)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T, int) → boolean")             @Test void minimalist2Arg()         { assertEquals(0, findFirstIndexIndexed(new ArrayAsMinimalistCollection<>(ABC), callback2AltAsTrue)); }
            @DisplayName("CollectionHolder<T>, (T, int) → boolean")                       @Test void normal2Arg()             { assertEquals(0, findFirstIndexIndexed(new ArrayAsCollection<>(ABC),           callback2AltAsTrue)); }
            @DisplayName("T[], (T, int) → boolean")                                       @Test void array2Arg()              { assertEquals(0, findFirstIndexIndexed(ABC,                                    callback2AltAsTrue)); }
            @DisplayName("MinimalistCollectionHolder<T>, () → boolean, int")              @Test void minimalist0ArgFrom()     { assertEquals(1, findFirstIndexIndexed(new ArrayAsMinimalistCollection<>(ABC), callback0AsTrue, 1)); }
            @DisplayName("CollectionHolder<T>, () → boolean, int")                        @Test void normal0ArgFrom()         { assertEquals(1, findFirstIndexIndexed(new ArrayAsCollection<>(ABC),           callback0AsTrue, 1)); }
            @DisplayName("T[], () → boolean, int")                                        @Test void array0ArgFrom()          { assertEquals(1, findFirstIndexIndexed(ABC,                                    callback0AsTrue, 1)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T) → boolean, int")             @Test void minimalist1ArgFrom()     { assertEquals(1, findFirstIndexIndexed(new ArrayAsMinimalistCollection<>(ABC), callback1AltAsTrue, 1)); }
            @DisplayName("CollectionHolder<T>, (T) → boolean, int")                       @Test void normal1ArgFrom()         { assertEquals(1, findFirstIndexIndexed(new ArrayAsCollection<>(ABC),           callback1AltAsTrue, 1)); }
            @DisplayName("T[], (T) → boolean, int")                                       @Test void array1ArgFrom()          { assertEquals(1, findFirstIndexIndexed(ABC,                                    callback1AltAsTrue, 1)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T, int) → boolean, int")        @Test void minimalist2ArgFrom()     { assertEquals(1, findFirstIndexIndexed(new ArrayAsMinimalistCollection<>(ABC), callback2AltAsTrue, 1)); }
            @DisplayName("CollectionHolder<T>, (T, int) → boolean, int")                  @Test void normal2ArgFrom()         { assertEquals(1, findFirstIndexIndexed(new ArrayAsCollection<>(ABC),           callback2AltAsTrue, 1)); }
            @DisplayName("T[], (T, int) → boolean, int")                                  @Test void array2ArgFrom()          { assertEquals(1, findFirstIndexIndexed(ABC,                                    callback2AltAsTrue, 1)); }
            @DisplayName("MinimalistCollectionHolder<T>, () → boolean, int?")             @Test void minimalist0ArgNull()     { assertEquals(0, findFirstIndexIndexed(new ArrayAsMinimalistCollection<>(ABC), callback0AsTrue, null)); }
            @DisplayName("CollectionHolder<T>, () → boolean, int?")                       @Test void normal0ArgNull()         { assertEquals(0, findFirstIndexIndexed(new ArrayAsCollection<>(ABC),           callback0AsTrue, null)); }
            @DisplayName("T[], () → boolean, int?")                                       @Test void array0ArgNull()          { assertEquals(0, findFirstIndexIndexed(ABC,                                    callback0AsTrue, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T) → boolean, int?")            @Test void minimalist1ArgNull()     { assertEquals(0, findFirstIndexIndexed(new ArrayAsMinimalistCollection<>(ABC), callback1AltAsTrue, null)); }
            @DisplayName("CollectionHolder<T>, (T) → boolean, int?")                      @Test void normal1ArgNull()         { assertEquals(0, findFirstIndexIndexed(new ArrayAsCollection<>(ABC),           callback1AltAsTrue, null)); }
            @DisplayName("T[], (T) → boolean, int?")                                      @Test void array1ArgNull()          { assertEquals(0, findFirstIndexIndexed(ABC,                                    callback1AltAsTrue, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T, int) → boolean, int?")       @Test void minimalist2ArgNull()     { assertEquals(0, findFirstIndexIndexed(new ArrayAsMinimalistCollection<>(ABC), callback2AltAsTrue, null)); }
            @DisplayName("CollectionHolder<T>, (T, int) → boolean, int?")                 @Test void normal2ArgNull()         { assertEquals(0, findFirstIndexIndexed(new ArrayAsCollection<>(ABC),           callback2AltAsTrue, null)); }
            @DisplayName("T[], (T, int) → boolean, int?")                                 @Test void array2ArgNull()          { assertEquals(0, findFirstIndexIndexed(ABC,                                    callback2AltAsTrue, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, () → boolean, int, int")         @Test void minimalist0ArgFromTo()   { assertEquals(1, findFirstIndexIndexed(new ArrayAsMinimalistCollection<>(ABC), callback0AsTrue, 1, 2)); }
            @DisplayName("CollectionHolder<T>, () → boolean, int, int")                   @Test void normal0ArgFromTo()       { assertEquals(1, findFirstIndexIndexed(new ArrayAsCollection<>(ABC),           callback0AsTrue, 1, 2)); }
            @DisplayName("T[], () → boolean, int, int")                                   @Test void array0ArgFromTo()        { assertEquals(1, findFirstIndexIndexed(ABC,                                    callback0AsTrue, 1, 2)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T) → boolean, int, int")        @Test void minimalist1ArgFromTo()   { assertEquals(1, findFirstIndexIndexed(new ArrayAsMinimalistCollection<>(ABC), callback1AltAsTrue, 1, 2)); }
            @DisplayName("CollectionHolder<T>, (T) → boolean, int, int")                  @Test void normal1ArgFromTo()       { assertEquals(1, findFirstIndexIndexed(new ArrayAsCollection<>(ABC),           callback1AltAsTrue, 1, 2)); }
            @DisplayName("T[], (T) → boolean, int, int")                                  @Test void array1ArgFromTo()        { assertEquals(1, findFirstIndexIndexed(ABC,                                    callback1AltAsTrue, 1, 2)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T, int) → boolean, int, int")   @Test void minimalist2ArgFromTo()   { assertEquals(1, findFirstIndexIndexed(new ArrayAsMinimalistCollection<>(ABC), callback2AltAsTrue, 1, 2)); }
            @DisplayName("CollectionHolder<T>, (T, int) → boolean, int, int")             @Test void normal2ArgFromTo()       { assertEquals(1, findFirstIndexIndexed(new ArrayAsCollection<>(ABC),           callback2AltAsTrue, 1, 2)); }
            @DisplayName("T[], (T, int) → boolean, int, int")                             @Test void array2ArgFromTo()        { assertEquals(1, findFirstIndexIndexed(ABC,                                    callback2AltAsTrue, 1, 2)); }
            @DisplayName("MinimalistCollectionHolder<T>, () → boolean, int, int?")        @Test void minimalist0ArgFromNull() { assertEquals(0, findFirstIndexIndexed(new ArrayAsMinimalistCollection<>(ABC), callback0AsTrue, 0, null)); }
            @DisplayName("CollectionHolder<T>, () → boolean, int, int?")                  @Test void normal0ArgFromNull()     { assertEquals(0, findFirstIndexIndexed(new ArrayAsCollection<>(ABC),           callback0AsTrue, 0, null)); }
            @DisplayName("T[], () → boolean, int, int?")                                  @Test void array0ArgFromNull()      { assertEquals(0, findFirstIndexIndexed(ABC,                                    callback0AsTrue, 0, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T) → boolean, int, int?")       @Test void minimalist1ArgFromNull() { assertEquals(0, findFirstIndexIndexed(new ArrayAsMinimalistCollection<>(ABC), callback1AltAsTrue, 0, null)); }
            @DisplayName("CollectionHolder<T>, (T) → boolean, int, int?")                 @Test void normal1ArgFromNull()     { assertEquals(0, findFirstIndexIndexed(new ArrayAsCollection<>(ABC),           callback1AltAsTrue, 0, null)); }
            @DisplayName("T[], (T) → boolean, int, int?")                                 @Test void array1ArgFromNull()      { assertEquals(0, findFirstIndexIndexed(ABC,                                    callback1AltAsTrue, 0, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T, int) → boolean, int, int?")  @Test void minimalist2ArgFromNull() { assertEquals(0, findFirstIndexIndexed(new ArrayAsMinimalistCollection<>(ABC), callback2AltAsTrue, 0, null)); }
            @DisplayName("CollectionHolder<T>, (T, int) → boolean, int, int?")            @Test void normal2ArgFromNull()     { assertEquals(0, findFirstIndexIndexed(new ArrayAsCollection<>(ABC),           callback2AltAsTrue, 0, null)); }
            @DisplayName("T[], (T, int) → boolean, int, int?")                            @Test void array2ArgFromNull()      { assertEquals(0, findFirstIndexIndexed(ABC,                                    callback2AltAsTrue, 0, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, () → boolean, int?, int?")       @Test void minimalist0ArgNullNull() { assertEquals(0, findFirstIndexIndexed(new ArrayAsMinimalistCollection<>(ABC), callback0AsTrue, null, null)); }
            @DisplayName("CollectionHolder<T>, () → boolean, int?, int?")                 @Test void normal0ArgNullNull()     { assertEquals(0, findFirstIndexIndexed(new ArrayAsCollection<>(ABC),           callback0AsTrue, null, null)); }
            @DisplayName("T[], () → boolean, int?, int?")                                 @Test void array0ArgNullNull()      { assertEquals(0, findFirstIndexIndexed(ABC,                                    callback0AsTrue, null, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T) → boolean, int?, int?")      @Test void minimalist1ArgNullNull() { assertEquals(0, findFirstIndexIndexed(new ArrayAsMinimalistCollection<>(ABC), callback1AltAsTrue, null, null)); }
            @DisplayName("CollectionHolder<T>, (T) → boolean, int?, int?")                @Test void normal1ArgNullNull()     { assertEquals(0, findFirstIndexIndexed(new ArrayAsCollection<>(ABC),           callback1AltAsTrue, null, null)); }
            @DisplayName("T[], (T) → boolean, int?, int?")                                @Test void array1ArgNullNull()      { assertEquals(0, findFirstIndexIndexed(ABC,                                    callback1AltAsTrue, null, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T, int) → boolean, int?, int?") @Test void minimalist2ArgNullNull() { assertEquals(0, findFirstIndexIndexed(new ArrayAsMinimalistCollection<>(ABC), callback2AltAsTrue, null, null)); }
            @DisplayName("CollectionHolder<T>, (T, int) → boolean, int?, int?")           @Test void normal2ArgNullNull()     { assertEquals(0, findFirstIndexIndexed(new ArrayAsCollection<>(ABC),           callback2AltAsTrue, null, null)); }
            @DisplayName("T[], (T, int) → boolean, int?, int?")                           @Test void array2ArgNullNull()      { assertEquals(0, findFirstIndexIndexed(ABC,                                    callback2AltAsTrue, null, null)); }
        }
        @Nested class findIndexIndexed {
            @DisplayName("MinimalistCollectionHolder<T>, () → boolean")                   @Test void minimalist0Arg()         { assertEquals(0, findIndexIndexed(new ArrayAsMinimalistCollection<>(ABC), callback0AsTrue)); }
            @DisplayName("CollectionHolder<T>, () → boolean")                             @Test void normal0Arg()             { assertEquals(0, findIndexIndexed(new ArrayAsCollection<>(ABC),           callback0AsTrue)); }
            @DisplayName("T[], () → boolean")                                             @Test void array0Arg()              { assertEquals(0, findIndexIndexed(ABC,                                    callback0AsTrue)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T) → boolean")                  @Test void minimalist1Arg()         { assertEquals(0, findIndexIndexed(new ArrayAsMinimalistCollection<>(ABC), callback1AltAsTrue)); }
            @DisplayName("CollectionHolder<T>, (T) → boolean")                            @Test void normal1Arg()             { assertEquals(0, findIndexIndexed(new ArrayAsCollection<>(ABC),           callback1AltAsTrue)); }
            @DisplayName("T[], (T) → boolean")                                            @Test void array1Arg()              { assertEquals(0, findIndexIndexed(ABC,                                    callback1AltAsTrue)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T, int) → boolean")             @Test void minimalist2Arg()         { assertEquals(0, findIndexIndexed(new ArrayAsMinimalistCollection<>(ABC), callback2AltAsTrue)); }
            @DisplayName("CollectionHolder<T>, (T, int) → boolean")                       @Test void normal2Arg()             { assertEquals(0, findIndexIndexed(new ArrayAsCollection<>(ABC),           callback2AltAsTrue)); }
            @DisplayName("T[], (T, int) → boolean")                                       @Test void array2Arg()              { assertEquals(0, findIndexIndexed(ABC,                                    callback2AltAsTrue)); }
            @DisplayName("MinimalistCollectionHolder<T>, () → boolean, int")              @Test void minimalist0ArgFrom()     { assertEquals(1, findIndexIndexed(new ArrayAsMinimalistCollection<>(ABC), callback0AsTrue, 1)); }
            @DisplayName("CollectionHolder<T>, () → boolean, int")                        @Test void normal0ArgFrom()         { assertEquals(1, findIndexIndexed(new ArrayAsCollection<>(ABC),           callback0AsTrue, 1)); }
            @DisplayName("T[], () → boolean, int")                                        @Test void array0ArgFrom()          { assertEquals(1, findIndexIndexed(ABC,                                    callback0AsTrue, 1)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T) → boolean, int")             @Test void minimalist1ArgFrom()     { assertEquals(1, findIndexIndexed(new ArrayAsMinimalistCollection<>(ABC), callback1AltAsTrue, 1)); }
            @DisplayName("CollectionHolder<T>, (T) → boolean, int")                       @Test void normal1ArgFrom()         { assertEquals(1, findIndexIndexed(new ArrayAsCollection<>(ABC),           callback1AltAsTrue, 1)); }
            @DisplayName("T[], (T) → boolean, int")                                       @Test void array1ArgFrom()          { assertEquals(1, findIndexIndexed(ABC,                                    callback1AltAsTrue, 1)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T, int) → boolean, int")        @Test void minimalist2ArgFrom()     { assertEquals(1, findIndexIndexed(new ArrayAsMinimalistCollection<>(ABC), callback2AltAsTrue, 1)); }
            @DisplayName("CollectionHolder<T>, (T, int) → boolean, int")                  @Test void normal2ArgFrom()         { assertEquals(1, findIndexIndexed(new ArrayAsCollection<>(ABC),           callback2AltAsTrue, 1)); }
            @DisplayName("T[], (T, int) → boolean, int")                                  @Test void array2ArgFrom()          { assertEquals(1, findIndexIndexed(ABC,                                    callback2AltAsTrue, 1)); }
            @DisplayName("MinimalistCollectionHolder<T>, () → boolean, int?")             @Test void minimalist0ArgNull()     { assertEquals(0, findIndexIndexed(new ArrayAsMinimalistCollection<>(ABC), callback0AsTrue, null)); }
            @DisplayName("CollectionHolder<T>, () → boolean, int?")                       @Test void normal0ArgNull()         { assertEquals(0, findIndexIndexed(new ArrayAsCollection<>(ABC),           callback0AsTrue, null)); }
            @DisplayName("T[], () → boolean, int?")                                       @Test void array0ArgNull()          { assertEquals(0, findIndexIndexed(ABC,                                    callback0AsTrue, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T) → boolean, int?")            @Test void minimalist1ArgNull()     { assertEquals(0, findIndexIndexed(new ArrayAsMinimalistCollection<>(ABC), callback1AltAsTrue, null)); }
            @DisplayName("CollectionHolder<T>, (T) → boolean, int?")                      @Test void normal1ArgNull()         { assertEquals(0, findIndexIndexed(new ArrayAsCollection<>(ABC),           callback1AltAsTrue, null)); }
            @DisplayName("T[], (T) → boolean, int?")                                      @Test void array1ArgNull()          { assertEquals(0, findIndexIndexed(ABC,                                    callback1AltAsTrue, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T, int) → boolean, int?")       @Test void minimalist2ArgNull()     { assertEquals(0, findIndexIndexed(new ArrayAsMinimalistCollection<>(ABC), callback2AltAsTrue, null)); }
            @DisplayName("CollectionHolder<T>, (T, int) → boolean, int?")                 @Test void normal2ArgNull()         { assertEquals(0, findIndexIndexed(new ArrayAsCollection<>(ABC),           callback2AltAsTrue, null)); }
            @DisplayName("T[], (T, int) → boolean, int?")                                 @Test void array2ArgNull()          { assertEquals(0, findIndexIndexed(ABC,                                    callback2AltAsTrue, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, () → boolean, int, int")         @Test void minimalist0ArgFromTo()   { assertEquals(1, findIndexIndexed(new ArrayAsMinimalistCollection<>(ABC), callback0AsTrue, 1, 2)); }
            @DisplayName("CollectionHolder<T>, () → boolean, int, int")                   @Test void normal0ArgFromTo()       { assertEquals(1, findIndexIndexed(new ArrayAsCollection<>(ABC),           callback0AsTrue, 1, 2)); }
            @DisplayName("T[], () → boolean, int, int")                                   @Test void array0ArgFromTo()        { assertEquals(1, findIndexIndexed(ABC,                                    callback0AsTrue, 1, 2)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T) → boolean, int, int")        @Test void minimalist1ArgFromTo()   { assertEquals(1, findIndexIndexed(new ArrayAsMinimalistCollection<>(ABC), callback1AltAsTrue, 1, 2)); }
            @DisplayName("CollectionHolder<T>, (T) → boolean, int, int")                  @Test void normal1ArgFromTo()       { assertEquals(1, findIndexIndexed(new ArrayAsCollection<>(ABC),           callback1AltAsTrue, 1, 2)); }
            @DisplayName("T[], (T) → boolean, int, int")                                  @Test void array1ArgFromTo()        { assertEquals(1, findIndexIndexed(ABC,                                    callback1AltAsTrue, 1, 2)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T, int) → boolean, int, int")   @Test void minimalist2ArgFromTo()   { assertEquals(1, findIndexIndexed(new ArrayAsMinimalistCollection<>(ABC), callback2AltAsTrue, 1, 2)); }
            @DisplayName("CollectionHolder<T>, (T, int) → boolean, int, int")             @Test void normal2ArgFromTo()       { assertEquals(1, findIndexIndexed(new ArrayAsCollection<>(ABC),           callback2AltAsTrue, 1, 2)); }
            @DisplayName("T[], (T, int) → boolean, int, int")                             @Test void array2ArgFromTo()        { assertEquals(1, findIndexIndexed(ABC,                                    callback2AltAsTrue, 1, 2)); }
            @DisplayName("MinimalistCollectionHolder<T>, () → boolean, int, int?")        @Test void minimalist0ArgFromNull() { assertEquals(0, findIndexIndexed(new ArrayAsMinimalistCollection<>(ABC), callback0AsTrue, 0, null)); }
            @DisplayName("CollectionHolder<T>, () → boolean, int, int?")                  @Test void normal0ArgFromNull()     { assertEquals(0, findIndexIndexed(new ArrayAsCollection<>(ABC),           callback0AsTrue, 0, null)); }
            @DisplayName("T[], () → boolean, int, int?")                                  @Test void array0ArgFromNull()      { assertEquals(0, findIndexIndexed(ABC,                                    callback0AsTrue, 0, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T) → boolean, int, int?")       @Test void minimalist1ArgFromNull() { assertEquals(0, findIndexIndexed(new ArrayAsMinimalistCollection<>(ABC), callback1AltAsTrue, 0, null)); }
            @DisplayName("CollectionHolder<T>, (T) → boolean, int, int?")                 @Test void normal1ArgFromNull()     { assertEquals(0, findIndexIndexed(new ArrayAsCollection<>(ABC),           callback1AltAsTrue, 0, null)); }
            @DisplayName("T[], (T) → boolean, int, int?")                                 @Test void array1ArgFromNull()      { assertEquals(0, findIndexIndexed(ABC,                                    callback1AltAsTrue, 0, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T, int) → boolean, int, int?")  @Test void minimalist2ArgFromNull() { assertEquals(0, findIndexIndexed(new ArrayAsMinimalistCollection<>(ABC), callback2AltAsTrue, 0, null)); }
            @DisplayName("CollectionHolder<T>, (T, int) → boolean, int, int?")            @Test void normal2ArgFromNull()     { assertEquals(0, findIndexIndexed(new ArrayAsCollection<>(ABC),           callback2AltAsTrue, 0, null)); }
            @DisplayName("T[], (T, int) → boolean, int, int?")                            @Test void array2ArgFromNull()      { assertEquals(0, findIndexIndexed(ABC,                                    callback2AltAsTrue, 0, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, () → boolean, int?, int?")       @Test void minimalist0ArgNullNull() { assertEquals(0, findIndexIndexed(new ArrayAsMinimalistCollection<>(ABC), callback0AsTrue, null, null)); }
            @DisplayName("CollectionHolder<T>, () → boolean, int?, int?")                 @Test void normal0ArgNullNull()     { assertEquals(0, findIndexIndexed(new ArrayAsCollection<>(ABC),           callback0AsTrue, null, null)); }
            @DisplayName("T[], () → boolean, int?, int?")                                 @Test void array0ArgNullNull()      { assertEquals(0, findIndexIndexed(ABC,                                    callback0AsTrue, null, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T) → boolean, int?, int?")      @Test void minimalist1ArgNullNull() { assertEquals(0, findIndexIndexed(new ArrayAsMinimalistCollection<>(ABC), callback1AltAsTrue, null, null)); }
            @DisplayName("CollectionHolder<T>, (T) → boolean, int?, int?")                @Test void normal1ArgNullNull()     { assertEquals(0, findIndexIndexed(new ArrayAsCollection<>(ABC),           callback1AltAsTrue, null, null)); }
            @DisplayName("T[], (T) → boolean, int?, int?")                                @Test void array1ArgNullNull()      { assertEquals(0, findIndexIndexed(ABC,                                    callback1AltAsTrue, null, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T, int) → boolean, int?, int?") @Test void minimalist2ArgNullNull() { assertEquals(0, findIndexIndexed(new ArrayAsMinimalistCollection<>(ABC), callback2AltAsTrue, null, null)); }
            @DisplayName("CollectionHolder<T>, (T, int) → boolean, int?, int?")           @Test void normal2ArgNullNull()     { assertEquals(0, findIndexIndexed(new ArrayAsCollection<>(ABC),           callback2AltAsTrue, null, null)); }
            @DisplayName("T[], (T, int) → boolean, int?, int?")                           @Test void array2ArgNullNull()      { assertEquals(0, findIndexIndexed(ABC,                                    callback2AltAsTrue, null, null)); }
        }
        @Nested class findFirstIndexIndexedOrNull {
            @DisplayName("MinimalistCollectionHolder<T>, () → boolean")                   @Test void minimalist0Arg()         { assertEquals(0, findFirstIndexIndexedOrNull(new ArrayAsMinimalistCollection<>(ABC), callback0AsTrue)); }
            @DisplayName("CollectionHolder<T>, () → boolean")                             @Test void normal0Arg()             { assertEquals(0, findFirstIndexIndexedOrNull(new ArrayAsCollection<>(ABC),           callback0AsTrue)); }
            @DisplayName("T[], () → boolean")                                             @Test void array0Arg()              { assertEquals(0, findFirstIndexIndexedOrNull(ABC,                                    callback0AsTrue)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T) → boolean")                  @Test void minimalist1Arg()         { assertEquals(0, findFirstIndexIndexedOrNull(new ArrayAsMinimalistCollection<>(ABC), callback1AltAsTrue)); }
            @DisplayName("CollectionHolder<T>, (T) → boolean")                            @Test void normal1Arg()             { assertEquals(0, findFirstIndexIndexedOrNull(new ArrayAsCollection<>(ABC),           callback1AltAsTrue)); }
            @DisplayName("T[], (T) → boolean")                                            @Test void array1Arg()              { assertEquals(0, findFirstIndexIndexedOrNull(ABC,                                    callback1AltAsTrue)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T, int) → boolean")             @Test void minimalist2Arg()         { assertEquals(0, findFirstIndexIndexedOrNull(new ArrayAsMinimalistCollection<>(ABC), callback2AltAsTrue)); }
            @DisplayName("CollectionHolder<T>, (T, int) → boolean")                       @Test void normal2Arg()             { assertEquals(0, findFirstIndexIndexedOrNull(new ArrayAsCollection<>(ABC),           callback2AltAsTrue)); }
            @DisplayName("T[], (T, int) → boolean")                                       @Test void array2Arg()              { assertEquals(0, findFirstIndexIndexedOrNull(ABC,                                    callback2AltAsTrue)); }
            @DisplayName("MinimalistCollectionHolder<T>, () → boolean, int")              @Test void minimalist0ArgFrom()     { assertEquals(1, findFirstIndexIndexedOrNull(new ArrayAsMinimalistCollection<>(ABC), callback0AsTrue, 1)); }
            @DisplayName("CollectionHolder<T>, () → boolean, int")                        @Test void normal0ArgFrom()         { assertEquals(1, findFirstIndexIndexedOrNull(new ArrayAsCollection<>(ABC),           callback0AsTrue, 1)); }
            @DisplayName("T[], () → boolean, int")                                        @Test void array0ArgFrom()          { assertEquals(1, findFirstIndexIndexedOrNull(ABC,                                    callback0AsTrue, 1)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T) → boolean, int")             @Test void minimalist1ArgFrom()     { assertEquals(1, findFirstIndexIndexedOrNull(new ArrayAsMinimalistCollection<>(ABC), callback1AltAsTrue, 1)); }
            @DisplayName("CollectionHolder<T>, (T) → boolean, int")                       @Test void normal1ArgFrom()         { assertEquals(1, findFirstIndexIndexedOrNull(new ArrayAsCollection<>(ABC),           callback1AltAsTrue, 1)); }
            @DisplayName("T[], (T) → boolean, int")                                       @Test void array1ArgFrom()          { assertEquals(1, findFirstIndexIndexedOrNull(ABC,                                    callback1AltAsTrue, 1)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T, int) → boolean, int")        @Test void minimalist2ArgFrom()     { assertEquals(1, findFirstIndexIndexedOrNull(new ArrayAsMinimalistCollection<>(ABC), callback2AltAsTrue, 1)); }
            @DisplayName("CollectionHolder<T>, (T, int) → boolean, int")                  @Test void normal2ArgFrom()         { assertEquals(1, findFirstIndexIndexedOrNull(new ArrayAsCollection<>(ABC),           callback2AltAsTrue, 1)); }
            @DisplayName("T[], (T, int) → boolean, int")                                  @Test void array2ArgFrom()          { assertEquals(1, findFirstIndexIndexedOrNull(ABC,                                    callback2AltAsTrue, 1)); }
            @DisplayName("MinimalistCollectionHolder<T>, () → boolean, int?")             @Test void minimalist0ArgNull()     { assertEquals(0, findFirstIndexIndexedOrNull(new ArrayAsMinimalistCollection<>(ABC), callback0AsTrue, null)); }
            @DisplayName("CollectionHolder<T>, () → boolean, int?")                       @Test void normal0ArgNull()         { assertEquals(0, findFirstIndexIndexedOrNull(new ArrayAsCollection<>(ABC),           callback0AsTrue, null)); }
            @DisplayName("T[], () → boolean, int?")                                       @Test void array0ArgNull()          { assertEquals(0, findFirstIndexIndexedOrNull(ABC,                                    callback0AsTrue, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T) → boolean, int?")            @Test void minimalist1ArgNull()     { assertEquals(0, findFirstIndexIndexedOrNull(new ArrayAsMinimalistCollection<>(ABC), callback1AltAsTrue, null)); }
            @DisplayName("CollectionHolder<T>, (T) → boolean, int?")                      @Test void normal1ArgNull()         { assertEquals(0, findFirstIndexIndexedOrNull(new ArrayAsCollection<>(ABC),           callback1AltAsTrue, null)); }
            @DisplayName("T[], (T) → boolean, int?")                                      @Test void array1ArgNull()          { assertEquals(0, findFirstIndexIndexedOrNull(ABC,                                    callback1AltAsTrue, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T, int) → boolean, int?")       @Test void minimalist2ArgNull()     { assertEquals(0, findFirstIndexIndexedOrNull(new ArrayAsMinimalistCollection<>(ABC), callback2AltAsTrue, null)); }
            @DisplayName("CollectionHolder<T>, (T, int) → boolean, int?")                 @Test void normal2ArgNull()         { assertEquals(0, findFirstIndexIndexedOrNull(new ArrayAsCollection<>(ABC),           callback2AltAsTrue, null)); }
            @DisplayName("T[], (T, int) → boolean, int?")                                 @Test void array2ArgNull()          { assertEquals(0, findFirstIndexIndexedOrNull(ABC,                                    callback2AltAsTrue, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, () → boolean, int, int")         @Test void minimalist0ArgFromTo()   { assertEquals(1, findFirstIndexIndexedOrNull(new ArrayAsMinimalistCollection<>(ABC), callback0AsTrue, 1, 2)); }
            @DisplayName("CollectionHolder<T>, () → boolean, int, int")                   @Test void normal0ArgFromTo()       { assertEquals(1, findFirstIndexIndexedOrNull(new ArrayAsCollection<>(ABC),           callback0AsTrue, 1, 2)); }
            @DisplayName("T[], () → boolean, int, int")                                   @Test void array0ArgFromTo()        { assertEquals(1, findFirstIndexIndexedOrNull(ABC,                                    callback0AsTrue, 1, 2)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T) → boolean, int, int")        @Test void minimalist1ArgFromTo()   { assertEquals(1, findFirstIndexIndexedOrNull(new ArrayAsMinimalistCollection<>(ABC), callback1AltAsTrue, 1, 2)); }
            @DisplayName("CollectionHolder<T>, (T) → boolean, int, int")                  @Test void normal1ArgFromTo()       { assertEquals(1, findFirstIndexIndexedOrNull(new ArrayAsCollection<>(ABC),           callback1AltAsTrue, 1, 2)); }
            @DisplayName("T[], (T) → boolean, int, int")                                  @Test void array1ArgFromTo()        { assertEquals(1, findFirstIndexIndexedOrNull(ABC,                                    callback1AltAsTrue, 1, 2)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T, int) → boolean, int, int")   @Test void minimalist2ArgFromTo()   { assertEquals(1, findFirstIndexIndexedOrNull(new ArrayAsMinimalistCollection<>(ABC), callback2AltAsTrue, 1, 2)); }
            @DisplayName("CollectionHolder<T>, (T, int) → boolean, int, int")             @Test void normal2ArgFromTo()       { assertEquals(1, findFirstIndexIndexedOrNull(new ArrayAsCollection<>(ABC),           callback2AltAsTrue, 1, 2)); }
            @DisplayName("T[], (T, int) → boolean, int, int")                             @Test void array2ArgFromTo()        { assertEquals(1, findFirstIndexIndexedOrNull(ABC,                                    callback2AltAsTrue, 1, 2)); }
            @DisplayName("MinimalistCollectionHolder<T>, () → boolean, int, int?")        @Test void minimalist0ArgFromNull() { assertEquals(0, findFirstIndexIndexedOrNull(new ArrayAsMinimalistCollection<>(ABC), callback0AsTrue, 0, null)); }
            @DisplayName("CollectionHolder<T>, () → boolean, int, int?")                  @Test void normal0ArgFromNull()     { assertEquals(0, findFirstIndexIndexedOrNull(new ArrayAsCollection<>(ABC),           callback0AsTrue, 0, null)); }
            @DisplayName("T[], () → boolean, int, int?")                                  @Test void array0ArgFromNull()      { assertEquals(0, findFirstIndexIndexedOrNull(ABC,                                    callback0AsTrue, 0, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T) → boolean, int, int?")       @Test void minimalist1ArgFromNull() { assertEquals(0, findFirstIndexIndexedOrNull(new ArrayAsMinimalistCollection<>(ABC), callback1AltAsTrue, 0, null)); }
            @DisplayName("CollectionHolder<T>, (T) → boolean, int, int?")                 @Test void normal1ArgFromNull()     { assertEquals(0, findFirstIndexIndexedOrNull(new ArrayAsCollection<>(ABC),           callback1AltAsTrue, 0, null)); }
            @DisplayName("T[], (T) → boolean, int, int?")                                 @Test void array1ArgFromNull()      { assertEquals(0, findFirstIndexIndexedOrNull(ABC,                                    callback1AltAsTrue, 0, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T, int) → boolean, int, int?")  @Test void minimalist2ArgFromNull() { assertEquals(0, findFirstIndexIndexedOrNull(new ArrayAsMinimalistCollection<>(ABC), callback2AltAsTrue, 0, null)); }
            @DisplayName("CollectionHolder<T>, (T, int) → boolean, int, int?")            @Test void normal2ArgFromNull()     { assertEquals(0, findFirstIndexIndexedOrNull(new ArrayAsCollection<>(ABC),           callback2AltAsTrue, 0, null)); }
            @DisplayName("T[], (T, int) → boolean, int, int?")                            @Test void array2ArgFromNull()      { assertEquals(0, findFirstIndexIndexedOrNull(ABC,                                    callback2AltAsTrue, 0, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, () → boolean, int?, int?")       @Test void minimalist0ArgNullNull() { assertEquals(0, findFirstIndexIndexedOrNull(new ArrayAsMinimalistCollection<>(ABC), callback0AsTrue, null, null)); }
            @DisplayName("CollectionHolder<T>, () → boolean, int?, int?")                 @Test void normal0ArgNullNull()     { assertEquals(0, findFirstIndexIndexedOrNull(new ArrayAsCollection<>(ABC),           callback0AsTrue, null, null)); }
            @DisplayName("T[], () → boolean, int?, int?")                                 @Test void array0ArgNullNull()      { assertEquals(0, findFirstIndexIndexedOrNull(ABC,                                    callback0AsTrue, null, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T) → boolean, int?, int?")      @Test void minimalist1ArgNullNull() { assertEquals(0, findFirstIndexIndexedOrNull(new ArrayAsMinimalistCollection<>(ABC), callback1AltAsTrue, null, null)); }
            @DisplayName("CollectionHolder<T>, (T) → boolean, int?, int?")                @Test void normal1ArgNullNull()     { assertEquals(0, findFirstIndexIndexedOrNull(new ArrayAsCollection<>(ABC),           callback1AltAsTrue, null, null)); }
            @DisplayName("T[], (T) → boolean, int?, int?")                                @Test void array1ArgNullNull()      { assertEquals(0, findFirstIndexIndexedOrNull(ABC,                                    callback1AltAsTrue, null, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T, int) → boolean, int?, int?") @Test void minimalist2ArgNullNull() { assertEquals(0, findFirstIndexIndexedOrNull(new ArrayAsMinimalistCollection<>(ABC), callback2AltAsTrue, null, null)); }
            @DisplayName("CollectionHolder<T>, (T, int) → boolean, int?, int?")           @Test void normal2ArgNullNull()     { assertEquals(0, findFirstIndexIndexedOrNull(new ArrayAsCollection<>(ABC),           callback2AltAsTrue, null, null)); }
            @DisplayName("T[], (T, int) → boolean, int?, int?")                           @Test void array2ArgNullNull()      { assertEquals(0, findFirstIndexIndexedOrNull(ABC,                                    callback2AltAsTrue, null, null)); }
        }
        @Nested class findIndexIndexedOrNull {
            @DisplayName("MinimalistCollectionHolder<T>, () → boolean")                   @Test void minimalist0Arg()         { assertEquals(0, findIndexIndexedOrNull(new ArrayAsMinimalistCollection<>(ABC), callback0AsTrue)); }
            @DisplayName("CollectionHolder<T>, () → boolean")                             @Test void normal0Arg()             { assertEquals(0, findIndexIndexedOrNull(new ArrayAsCollection<>(ABC),           callback0AsTrue)); }
            @DisplayName("T[], () → boolean")                                             @Test void array0Arg()              { assertEquals(0, findIndexIndexedOrNull(ABC,                                    callback0AsTrue)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T) → boolean")                  @Test void minimalist1Arg()         { assertEquals(0, findIndexIndexedOrNull(new ArrayAsMinimalistCollection<>(ABC), callback1AltAsTrue)); }
            @DisplayName("CollectionHolder<T>, (T) → boolean")                            @Test void normal1Arg()             { assertEquals(0, findIndexIndexedOrNull(new ArrayAsCollection<>(ABC),           callback1AltAsTrue)); }
            @DisplayName("T[], (T) → boolean")                                            @Test void array1Arg()              { assertEquals(0, findIndexIndexedOrNull(ABC,                                    callback1AltAsTrue)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T, int) → boolean")             @Test void minimalist2Arg()         { assertEquals(0, findIndexIndexedOrNull(new ArrayAsMinimalistCollection<>(ABC), callback2AltAsTrue)); }
            @DisplayName("CollectionHolder<T>, (T, int) → boolean")                       @Test void normal2Arg()             { assertEquals(0, findIndexIndexedOrNull(new ArrayAsCollection<>(ABC),           callback2AltAsTrue)); }
            @DisplayName("T[], (T, int) → boolean")                                       @Test void array2Arg()              { assertEquals(0, findIndexIndexedOrNull(ABC,                                    callback2AltAsTrue)); }
            @DisplayName("MinimalistCollectionHolder<T>, () → boolean, int")              @Test void minimalist0ArgFrom()     { assertEquals(1, findIndexIndexedOrNull(new ArrayAsMinimalistCollection<>(ABC), callback0AsTrue, 1)); }
            @DisplayName("CollectionHolder<T>, () → boolean, int")                        @Test void normal0ArgFrom()         { assertEquals(1, findIndexIndexedOrNull(new ArrayAsCollection<>(ABC),           callback0AsTrue, 1)); }
            @DisplayName("T[], () → boolean, int")                                        @Test void array0ArgFrom()          { assertEquals(1, findIndexIndexedOrNull(ABC,                                    callback0AsTrue, 1)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T) → boolean, int")             @Test void minimalist1ArgFrom()     { assertEquals(1, findIndexIndexedOrNull(new ArrayAsMinimalistCollection<>(ABC), callback1AltAsTrue, 1)); }
            @DisplayName("CollectionHolder<T>, (T) → boolean, int")                       @Test void normal1ArgFrom()         { assertEquals(1, findIndexIndexedOrNull(new ArrayAsCollection<>(ABC),           callback1AltAsTrue, 1)); }
            @DisplayName("T[], (T) → boolean, int")                                       @Test void array1ArgFrom()          { assertEquals(1, findIndexIndexedOrNull(ABC,                                    callback1AltAsTrue, 1)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T, int) → boolean, int")        @Test void minimalist2ArgFrom()     { assertEquals(1, findIndexIndexedOrNull(new ArrayAsMinimalistCollection<>(ABC), callback2AltAsTrue, 1)); }
            @DisplayName("CollectionHolder<T>, (T, int) → boolean, int")                  @Test void normal2ArgFrom()         { assertEquals(1, findIndexIndexedOrNull(new ArrayAsCollection<>(ABC),           callback2AltAsTrue, 1)); }
            @DisplayName("T[], (T, int) → boolean, int")                                  @Test void array2ArgFrom()          { assertEquals(1, findIndexIndexedOrNull(ABC,                                    callback2AltAsTrue, 1)); }
            @DisplayName("MinimalistCollectionHolder<T>, () → boolean, int?")             @Test void minimalist0ArgNull()     { assertEquals(0, findIndexIndexedOrNull(new ArrayAsMinimalistCollection<>(ABC), callback0AsTrue, null)); }
            @DisplayName("CollectionHolder<T>, () → boolean, int?")                       @Test void normal0ArgNull()         { assertEquals(0, findIndexIndexedOrNull(new ArrayAsCollection<>(ABC),           callback0AsTrue, null)); }
            @DisplayName("T[], () → boolean, int?")                                       @Test void array0ArgNull()          { assertEquals(0, findIndexIndexedOrNull(ABC,                                    callback0AsTrue, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T) → boolean, int?")            @Test void minimalist1ArgNull()     { assertEquals(0, findIndexIndexedOrNull(new ArrayAsMinimalistCollection<>(ABC), callback1AltAsTrue, null)); }
            @DisplayName("CollectionHolder<T>, (T) → boolean, int?")                      @Test void normal1ArgNull()         { assertEquals(0, findIndexIndexedOrNull(new ArrayAsCollection<>(ABC),           callback1AltAsTrue, null)); }
            @DisplayName("T[], (T) → boolean, int?")                                      @Test void array1ArgNull()          { assertEquals(0, findIndexIndexedOrNull(ABC,                                    callback1AltAsTrue, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T, int) → boolean, int?")       @Test void minimalist2ArgNull()     { assertEquals(0, findIndexIndexedOrNull(new ArrayAsMinimalistCollection<>(ABC), callback2AltAsTrue, null)); }
            @DisplayName("CollectionHolder<T>, (T, int) → boolean, int?")                 @Test void normal2ArgNull()         { assertEquals(0, findIndexIndexedOrNull(new ArrayAsCollection<>(ABC),           callback2AltAsTrue, null)); }
            @DisplayName("T[], (T, int) → boolean, int?")                                 @Test void array2ArgNull()          { assertEquals(0, findIndexIndexedOrNull(ABC,                                    callback2AltAsTrue, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, () → boolean, int, int")         @Test void minimalist0ArgFromTo()   { assertEquals(1, findIndexIndexedOrNull(new ArrayAsMinimalistCollection<>(ABC), callback0AsTrue, 1, 2)); }
            @DisplayName("CollectionHolder<T>, () → boolean, int, int")                   @Test void normal0ArgFromTo()       { assertEquals(1, findIndexIndexedOrNull(new ArrayAsCollection<>(ABC),           callback0AsTrue, 1, 2)); }
            @DisplayName("T[], () → boolean, int, int")                                   @Test void array0ArgFromTo()        { assertEquals(1, findIndexIndexedOrNull(ABC,                                    callback0AsTrue, 1, 2)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T) → boolean, int, int")        @Test void minimalist1ArgFromTo()   { assertEquals(1, findIndexIndexedOrNull(new ArrayAsMinimalistCollection<>(ABC), callback1AltAsTrue, 1, 2)); }
            @DisplayName("CollectionHolder<T>, (T) → boolean, int, int")                  @Test void normal1ArgFromTo()       { assertEquals(1, findIndexIndexedOrNull(new ArrayAsCollection<>(ABC),           callback1AltAsTrue, 1, 2)); }
            @DisplayName("T[], (T) → boolean, int, int")                                  @Test void array1ArgFromTo()        { assertEquals(1, findIndexIndexedOrNull(ABC,                                    callback1AltAsTrue, 1, 2)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T, int) → boolean, int, int")   @Test void minimalist2ArgFromTo()   { assertEquals(1, findIndexIndexedOrNull(new ArrayAsMinimalistCollection<>(ABC), callback2AltAsTrue, 1, 2)); }
            @DisplayName("CollectionHolder<T>, (T, int) → boolean, int, int")             @Test void normal2ArgFromTo()       { assertEquals(1, findIndexIndexedOrNull(new ArrayAsCollection<>(ABC),           callback2AltAsTrue, 1, 2)); }
            @DisplayName("T[], (T, int) → boolean, int, int")                             @Test void array2ArgFromTo()        { assertEquals(1, findIndexIndexedOrNull(ABC,                                    callback2AltAsTrue, 1, 2)); }
            @DisplayName("MinimalistCollectionHolder<T>, () → boolean, int, int?")        @Test void minimalist0ArgFromNull() { assertEquals(0, findIndexIndexedOrNull(new ArrayAsMinimalistCollection<>(ABC), callback0AsTrue, 0, null)); }
            @DisplayName("CollectionHolder<T>, () → boolean, int, int?")                  @Test void normal0ArgFromNull()     { assertEquals(0, findIndexIndexedOrNull(new ArrayAsCollection<>(ABC),           callback0AsTrue, 0, null)); }
            @DisplayName("T[], () → boolean, int, int?")                                  @Test void array0ArgFromNull()      { assertEquals(0, findIndexIndexedOrNull(ABC,                                    callback0AsTrue, 0, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T) → boolean, int, int?")       @Test void minimalist1ArgFromNull() { assertEquals(0, findIndexIndexedOrNull(new ArrayAsMinimalistCollection<>(ABC), callback1AltAsTrue, 0, null)); }
            @DisplayName("CollectionHolder<T>, (T) → boolean, int, int?")                 @Test void normal1ArgFromNull()     { assertEquals(0, findIndexIndexedOrNull(new ArrayAsCollection<>(ABC),           callback1AltAsTrue, 0, null)); }
            @DisplayName("T[], (T) → boolean, int, int?")                                 @Test void array1ArgFromNull()      { assertEquals(0, findIndexIndexedOrNull(ABC,                                    callback1AltAsTrue, 0, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T, int) → boolean, int, int?")  @Test void minimalist2ArgFromNull() { assertEquals(0, findIndexIndexedOrNull(new ArrayAsMinimalistCollection<>(ABC), callback2AltAsTrue, 0, null)); }
            @DisplayName("CollectionHolder<T>, (T, int) → boolean, int, int?")            @Test void normal2ArgFromNull()     { assertEquals(0, findIndexIndexedOrNull(new ArrayAsCollection<>(ABC),           callback2AltAsTrue, 0, null)); }
            @DisplayName("T[], (T, int) → boolean, int, int?")                            @Test void array2ArgFromNull()      { assertEquals(0, findIndexIndexedOrNull(ABC,                                    callback2AltAsTrue, 0, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, () → boolean, int?, int?")       @Test void minimalist0ArgNullNull() { assertEquals(0, findIndexIndexedOrNull(new ArrayAsMinimalistCollection<>(ABC), callback0AsTrue, null, null)); }
            @DisplayName("CollectionHolder<T>, () → boolean, int?, int?")                 @Test void normal0ArgNullNull()     { assertEquals(0, findIndexIndexedOrNull(new ArrayAsCollection<>(ABC),           callback0AsTrue, null, null)); }
            @DisplayName("T[], () → boolean, int?, int?")                                 @Test void array0ArgNullNull()      { assertEquals(0, findIndexIndexedOrNull(ABC,                                    callback0AsTrue, null, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T) → boolean, int?, int?")      @Test void minimalist1ArgNullNull() { assertEquals(0, findIndexIndexedOrNull(new ArrayAsMinimalistCollection<>(ABC), callback1AltAsTrue, null, null)); }
            @DisplayName("CollectionHolder<T>, (T) → boolean, int?, int?")                @Test void normal1ArgNullNull()     { assertEquals(0, findIndexIndexedOrNull(new ArrayAsCollection<>(ABC),           callback1AltAsTrue, null, null)); }
            @DisplayName("T[], (T) → boolean, int?, int?")                                @Test void array1ArgNullNull()      { assertEquals(0, findIndexIndexedOrNull(ABC,                                    callback1AltAsTrue, null, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T, int) → boolean, int?, int?") @Test void minimalist2ArgNullNull() { assertEquals(0, findIndexIndexedOrNull(new ArrayAsMinimalistCollection<>(ABC), callback2AltAsTrue, null, null)); }
            @DisplayName("CollectionHolder<T>, (T, int) → boolean, int?, int?")           @Test void normal2ArgNullNull()     { assertEquals(0, findIndexIndexedOrNull(new ArrayAsCollection<>(ABC),           callback2AltAsTrue, null, null)); }
            @DisplayName("T[], (T, int) → boolean, int?, int?")                           @Test void array2ArgNullNull()      { assertEquals(0, findIndexIndexedOrNull(ABC,                                    callback2AltAsTrue, null, null)); }
        }

        @Nested class findLastIndex {
            @DisplayName("MinimalistCollectionHolder<T>, () → boolean")                   @Test void minimalist0Arg()         { assertEquals(2, findLastIndex(new ArrayAsMinimalistCollection<>(ABC), callback0AsTrue)); }
            @DisplayName("CollectionHolder<T>, () → boolean")                             @Test void normal0Arg()             { assertEquals(2, findLastIndex(new ArrayAsCollection<>(ABC),           callback0AsTrue)); }
            @DisplayName("T[], () → boolean")                                             @Test void array0Arg()              { assertEquals(2, findLastIndex(ABC,                                    callback0AsTrue)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T) → boolean")                  @Test void minimalist1Arg()         { assertEquals(2, findLastIndex(new ArrayAsMinimalistCollection<>(ABC), callback1AsTrue)); }
            @DisplayName("CollectionHolder<T>, (T) → boolean")                            @Test void normal1Arg()             { assertEquals(2, findLastIndex(new ArrayAsCollection<>(ABC),           callback1AsTrue)); }
            @DisplayName("T[], (T) → boolean")                                            @Test void array1Arg()              { assertEquals(2, findLastIndex(ABC,                                    callback1AsTrue)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T, int) → boolean")             @Test void minimalist2Arg()         { assertEquals(2, findLastIndex(new ArrayAsMinimalistCollection<>(ABC), callback2AsTrue)); }
            @DisplayName("CollectionHolder<T>, (T, int) → boolean")                       @Test void normal2Arg()             { assertEquals(2, findLastIndex(new ArrayAsCollection<>(ABC),           callback2AsTrue)); }
            @DisplayName("T[], (T, int) → boolean")                                       @Test void array2Arg()              { assertEquals(2, findLastIndex(ABC,                                    callback2AsTrue)); }
            @DisplayName("MinimalistCollectionHolder<T>, () → boolean, int")              @Test void minimalist0ArgFrom()     { assertEquals(2, findLastIndex(new ArrayAsMinimalistCollection<>(ABC), callback0AsTrue, 1)); }
            @DisplayName("CollectionHolder<T>, () → boolean, int")                        @Test void normal0ArgFrom()         { assertEquals(2, findLastIndex(new ArrayAsCollection<>(ABC),           callback0AsTrue, 1)); }
            @DisplayName("T[], () → boolean, int")                                        @Test void array0ArgFrom()          { assertEquals(2, findLastIndex(ABC,                                    callback0AsTrue, 1)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T) → boolean, int")             @Test void minimalist1ArgFrom()     { assertEquals(2, findLastIndex(new ArrayAsMinimalistCollection<>(ABC), callback1AsTrue, 1)); }
            @DisplayName("CollectionHolder<T>, (T) → boolean, int")                       @Test void normal1ArgFrom()         { assertEquals(2, findLastIndex(new ArrayAsCollection<>(ABC),           callback1AsTrue, 1)); }
            @DisplayName("T[], (T) → boolean, int")                                       @Test void array1ArgFrom()          { assertEquals(2, findLastIndex(ABC,                                    callback1AsTrue, 1)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T, int) → boolean, int")        @Test void minimalist2ArgFrom()     { assertEquals(2, findLastIndex(new ArrayAsMinimalistCollection<>(ABC), callback2AsTrue, 1)); }
            @DisplayName("CollectionHolder<T>, (T, int) → boolean, int")                  @Test void normal2ArgFrom()         { assertEquals(2, findLastIndex(new ArrayAsCollection<>(ABC),           callback2AsTrue, 1)); }
            @DisplayName("T[], (T, int) → boolean, int")                                  @Test void array2ArgFrom()          { assertEquals(2, findLastIndex(ABC,                                    callback2AsTrue, 1)); }
            @DisplayName("MinimalistCollectionHolder<T>, () → boolean, int?")             @Test void minimalist0ArgNull()     { assertEquals(2, findLastIndex(new ArrayAsMinimalistCollection<>(ABC), callback0AsTrue, null)); }
            @DisplayName("CollectionHolder<T>, () → boolean, int?")                       @Test void normal0ArgNull()         { assertEquals(2, findLastIndex(new ArrayAsCollection<>(ABC),           callback0AsTrue, null)); }
            @DisplayName("T[], () → boolean, int?")                                       @Test void array0ArgNull()          { assertEquals(2, findLastIndex(ABC,                                    callback0AsTrue, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T) → boolean, int?")            @Test void minimalist1ArgNull()     { assertEquals(2, findLastIndex(new ArrayAsMinimalistCollection<>(ABC), callback1AsTrue, null)); }
            @DisplayName("CollectionHolder<T>, (T) → boolean, int?")                      @Test void normal1ArgNull()         { assertEquals(2, findLastIndex(new ArrayAsCollection<>(ABC),           callback1AsTrue, null)); }
            @DisplayName("T[], (T) → boolean, int?")                                      @Test void array1ArgNull()          { assertEquals(2, findLastIndex(ABC,                                    callback1AsTrue, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T, int) → boolean, int?")       @Test void minimalist2ArgNull()     { assertEquals(2, findLastIndex(new ArrayAsMinimalistCollection<>(ABC), callback2AsTrue, null)); }
            @DisplayName("CollectionHolder<T>, (T, int) → boolean, int?")                 @Test void normal2ArgNull()         { assertEquals(2, findLastIndex(new ArrayAsCollection<>(ABC),           callback2AsTrue, null)); }
            @DisplayName("T[], (T, int) → boolean, int?")                                 @Test void array2ArgNull()          { assertEquals(2, findLastIndex(ABC,                                    callback2AsTrue, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, () → boolean, int, int")         @Test void minimalist0ArgFromTo()   { assertEquals(2, findLastIndex(new ArrayAsMinimalistCollection<>(ABC), callback0AsTrue, 1, 2)); }
            @DisplayName("CollectionHolder<T>, () → boolean, int, int")                   @Test void normal0ArgFromTo()       { assertEquals(2, findLastIndex(new ArrayAsCollection<>(ABC),           callback0AsTrue, 1, 2)); }
            @DisplayName("T[], () → boolean, int, int")                                   @Test void array0ArgFromTo()        { assertEquals(2, findLastIndex(ABC,                                    callback0AsTrue, 1, 2)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T) → boolean, int, int")        @Test void minimalist1ArgFromTo()   { assertEquals(2, findLastIndex(new ArrayAsMinimalistCollection<>(ABC), callback1AsTrue, 1, 2)); }
            @DisplayName("CollectionHolder<T>, (T) → boolean, int, int")                  @Test void normal1ArgFromTo()       { assertEquals(2, findLastIndex(new ArrayAsCollection<>(ABC),           callback1AsTrue, 1, 2)); }
            @DisplayName("T[], (T) → boolean, int, int")                                  @Test void array1ArgFromTo()        { assertEquals(2, findLastIndex(ABC,                                    callback1AsTrue, 1, 2)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T, int) → boolean, int, int")   @Test void minimalist2ArgFromTo()   { assertEquals(2, findLastIndex(new ArrayAsMinimalistCollection<>(ABC), callback2AsTrue, 1, 2)); }
            @DisplayName("CollectionHolder<T>, (T, int) → boolean, int, int")             @Test void normal2ArgFromTo()       { assertEquals(2, findLastIndex(new ArrayAsCollection<>(ABC),           callback2AsTrue, 1, 2)); }
            @DisplayName("T[], (T, int) → boolean, int, int")                             @Test void array2ArgFromTo()        { assertEquals(2, findLastIndex(ABC,                                    callback2AsTrue, 1, 2)); }
            @DisplayName("MinimalistCollectionHolder<T>, () → boolean, int, int?")        @Test void minimalist0ArgFromNull() { assertEquals(2, findLastIndex(new ArrayAsMinimalistCollection<>(ABC), callback0AsTrue, 0, null)); }
            @DisplayName("CollectionHolder<T>, () → boolean, int, int?")                  @Test void normal0ArgFromNull()     { assertEquals(2, findLastIndex(new ArrayAsCollection<>(ABC),           callback0AsTrue, 0, null)); }
            @DisplayName("T[], () → boolean, int, int?")                                  @Test void array0ArgFromNull()      { assertEquals(2, findLastIndex(ABC,                                    callback0AsTrue, 0, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T) → boolean, int, int?")       @Test void minimalist1ArgFromNull() { assertEquals(2, findLastIndex(new ArrayAsMinimalistCollection<>(ABC), callback1AsTrue, 0, null)); }
            @DisplayName("CollectionHolder<T>, (T) → boolean, int, int?")                 @Test void normal1ArgFromNull()     { assertEquals(2, findLastIndex(new ArrayAsCollection<>(ABC),           callback1AsTrue, 0, null)); }
            @DisplayName("T[], (T) → boolean, int, int?")                                 @Test void array1ArgFromNull()      { assertEquals(2, findLastIndex(ABC,                                    callback1AsTrue, 0, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T, int) → boolean, int, int?")  @Test void minimalist2ArgFromNull() { assertEquals(2, findLastIndex(new ArrayAsMinimalistCollection<>(ABC), callback2AsTrue, 0, null)); }
            @DisplayName("CollectionHolder<T>, (T, int) → boolean, int, int?")            @Test void normal2ArgFromNull()     { assertEquals(2, findLastIndex(new ArrayAsCollection<>(ABC),           callback2AsTrue, 0, null)); }
            @DisplayName("T[], (T, int) → boolean, int, int?")                            @Test void array2ArgFromNull()      { assertEquals(2, findLastIndex(ABC,                                    callback2AsTrue, 0, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, () → boolean, int?, int?")       @Test void minimalist0ArgNullNull() { assertEquals(2, findLastIndex(new ArrayAsMinimalistCollection<>(ABC), callback0AsTrue, null, null)); }
            @DisplayName("CollectionHolder<T>, () → boolean, int?, int?")                 @Test void normal0ArgNullNull()     { assertEquals(2, findLastIndex(new ArrayAsCollection<>(ABC),           callback0AsTrue, null, null)); }
            @DisplayName("T[], () → boolean, int?, int?")                                 @Test void array0ArgNullNull()      { assertEquals(2, findLastIndex(ABC,                                    callback0AsTrue, null, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T) → boolean, int?, int?")      @Test void minimalist1ArgNullNull() { assertEquals(2, findLastIndex(new ArrayAsMinimalistCollection<>(ABC), callback1AsTrue, null, null)); }
            @DisplayName("CollectionHolder<T>, (T) → boolean, int?, int?")                @Test void normal1ArgNullNull()     { assertEquals(2, findLastIndex(new ArrayAsCollection<>(ABC),           callback1AsTrue, null, null)); }
            @DisplayName("T[], (T) → boolean, int?, int?")                                @Test void array1ArgNullNull()      { assertEquals(2, findLastIndex(ABC,                                    callback1AsTrue, null, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T, int) → boolean, int?, int?") @Test void minimalist2ArgNullNull() { assertEquals(2, findLastIndex(new ArrayAsMinimalistCollection<>(ABC), callback2AsTrue, null, null)); }
            @DisplayName("CollectionHolder<T>, (T, int) → boolean, int?, int")            @Test void normal2ArgNullNull()     { assertEquals(2, findLastIndex(new ArrayAsCollection<>(ABC),           callback2AsTrue, null, null)); }
            @DisplayName("T[], (T, int) → boolean, int?, int")                            @Test void array2ArgNullNull()      { assertEquals(2, findLastIndex(ABC,                                    callback2AsTrue, null, null)); }
        }
        @Nested class findLastIndexOrNull {
            @DisplayName("MinimalistCollectionHolder<T>, () → boolean")                   @Test void minimalist0Arg()         { assertEquals(2, findLastIndexOrNull(new ArrayAsMinimalistCollection<>(ABC), callback0AsTrue)); }
            @DisplayName("CollectionHolder<T>, () → boolean")                             @Test void normal0Arg()             { assertEquals(2, findLastIndexOrNull(new ArrayAsCollection<>(ABC),           callback0AsTrue)); }
            @DisplayName("T[], () → boolean")                                             @Test void array0Arg()              { assertEquals(2, findLastIndexOrNull(ABC,                                    callback0AsTrue)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T) → boolean")                  @Test void minimalist1Arg()         { assertEquals(2, findLastIndexOrNull(new ArrayAsMinimalistCollection<>(ABC), callback1AsTrue)); }
            @DisplayName("CollectionHolder<T>, (T) → boolean")                            @Test void normal1Arg()             { assertEquals(2, findLastIndexOrNull(new ArrayAsCollection<>(ABC),           callback1AsTrue)); }
            @DisplayName("T[], (T) → boolean")                                            @Test void array1Arg()              { assertEquals(2, findLastIndexOrNull(ABC,                                    callback1AsTrue)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T, int) → boolean")             @Test void minimalist2Arg()         { assertEquals(2, findLastIndexOrNull(new ArrayAsMinimalistCollection<>(ABC), callback2AsTrue)); }
            @DisplayName("CollectionHolder<T>, (T, int) → boolean")                       @Test void normal2Arg()             { assertEquals(2, findLastIndexOrNull(new ArrayAsCollection<>(ABC),           callback2AsTrue)); }
            @DisplayName("T[], (T, int) → boolean")                                       @Test void array2Arg()              { assertEquals(2, findLastIndexOrNull(ABC,                                    callback2AsTrue)); }
            @DisplayName("MinimalistCollectionHolder<T>, () → boolean, int")              @Test void minimalist0ArgFrom()     { assertEquals(2, findLastIndexOrNull(new ArrayAsMinimalistCollection<>(ABC), callback0AsTrue, 1)); }
            @DisplayName("CollectionHolder<T>, () → boolean, int")                        @Test void normal0ArgFrom()         { assertEquals(2, findLastIndexOrNull(new ArrayAsCollection<>(ABC),           callback0AsTrue, 1)); }
            @DisplayName("T[], () → boolean, int")                                        @Test void array0ArgFrom()          { assertEquals(2, findLastIndexOrNull(ABC,                                    callback0AsTrue, 1)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T) → boolean, int")             @Test void minimalist1ArgFrom()     { assertEquals(2, findLastIndexOrNull(new ArrayAsMinimalistCollection<>(ABC), callback1AsTrue, 1)); }
            @DisplayName("CollectionHolder<T>, (T) → boolean, int")                       @Test void normal1ArgFrom()         { assertEquals(2, findLastIndexOrNull(new ArrayAsCollection<>(ABC),           callback1AsTrue, 1)); }
            @DisplayName("T[], (T) → boolean, int")                                       @Test void array1ArgFrom()          { assertEquals(2, findLastIndexOrNull(ABC,                                    callback1AsTrue, 1)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T, int) → boolean, int")        @Test void minimalist2ArgFrom()     { assertEquals(2, findLastIndexOrNull(new ArrayAsMinimalistCollection<>(ABC), callback2AsTrue, 1)); }
            @DisplayName("CollectionHolder<T>, (T, int) → boolean, int")                  @Test void normal2ArgFrom()         { assertEquals(2, findLastIndexOrNull(new ArrayAsCollection<>(ABC),           callback2AsTrue, 1)); }
            @DisplayName("T[], (T, int) → boolean, int")                                  @Test void array2ArgFrom()          { assertEquals(2, findLastIndexOrNull(ABC,                                    callback2AsTrue, 1)); }
            @DisplayName("MinimalistCollectionHolder<T>, () → boolean, int?")             @Test void minimalist0ArgNull()     { assertEquals(2, findLastIndexOrNull(new ArrayAsMinimalistCollection<>(ABC), callback0AsTrue, null)); }
            @DisplayName("CollectionHolder<T>, () → boolean, int?")                       @Test void normal0ArgNull()         { assertEquals(2, findLastIndexOrNull(new ArrayAsCollection<>(ABC),           callback0AsTrue, null)); }
            @DisplayName("T[], () → boolean, int?")                                       @Test void array0ArgNull()          { assertEquals(2, findLastIndexOrNull(ABC,                                    callback0AsTrue, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T) → boolean, int?")            @Test void minimalist1ArgNull()     { assertEquals(2, findLastIndexOrNull(new ArrayAsMinimalistCollection<>(ABC), callback1AsTrue, null)); }
            @DisplayName("CollectionHolder<T>, (T) → boolean, int?")                      @Test void normal1ArgNull()         { assertEquals(2, findLastIndexOrNull(new ArrayAsCollection<>(ABC),           callback1AsTrue, null)); }
            @DisplayName("T[], (T) → boolean, int?")                                      @Test void array1ArgNull()          { assertEquals(2, findLastIndexOrNull(ABC,                                    callback1AsTrue, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T, int) → boolean, int?")       @Test void minimalist2ArgNull()     { assertEquals(2, findLastIndexOrNull(new ArrayAsMinimalistCollection<>(ABC), callback2AsTrue, null)); }
            @DisplayName("CollectionHolder<T>, (T, int) → boolean, int?")                 @Test void normal2ArgNull()         { assertEquals(2, findLastIndexOrNull(new ArrayAsCollection<>(ABC),           callback2AsTrue, null)); }
            @DisplayName("T[], (T, int) → boolean, int?")                                 @Test void array2ArgNull()          { assertEquals(2, findLastIndexOrNull(ABC,                                    callback2AsTrue, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, () → boolean, int, int")         @Test void minimalist0ArgFromTo()   { assertEquals(2, findLastIndexOrNull(new ArrayAsMinimalistCollection<>(ABC), callback0AsTrue, 1, 2)); }
            @DisplayName("CollectionHolder<T>, () → boolean, int, int")                   @Test void normal0ArgFromTo()       { assertEquals(2, findLastIndexOrNull(new ArrayAsCollection<>(ABC),           callback0AsTrue, 1, 2)); }
            @DisplayName("T[], () → boolean, int, int")                                   @Test void array0ArgFromTo()        { assertEquals(2, findLastIndexOrNull(ABC,                                    callback0AsTrue, 1, 2)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T) → boolean, int, int")        @Test void minimalist1ArgFromTo()   { assertEquals(2, findLastIndexOrNull(new ArrayAsMinimalistCollection<>(ABC), callback1AsTrue, 1, 2)); }
            @DisplayName("CollectionHolder<T>, (T) → boolean, int, int")                  @Test void normal1ArgFromTo()       { assertEquals(2, findLastIndexOrNull(new ArrayAsCollection<>(ABC),           callback1AsTrue, 1, 2)); }
            @DisplayName("T[], (T) → boolean, int, int")                                  @Test void array1ArgFromTo()        { assertEquals(2, findLastIndexOrNull(ABC,                                    callback1AsTrue, 1, 2)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T, int) → boolean, int, int")   @Test void minimalist2ArgFromTo()   { assertEquals(2, findLastIndexOrNull(new ArrayAsMinimalistCollection<>(ABC), callback2AsTrue, 1, 2)); }
            @DisplayName("CollectionHolder<T>, (T, int) → boolean, int, int")             @Test void normal2ArgFromTo()       { assertEquals(2, findLastIndexOrNull(new ArrayAsCollection<>(ABC),           callback2AsTrue, 1, 2)); }
            @DisplayName("T[], (T, int) → boolean, int, int")                             @Test void array2ArgFromTo()        { assertEquals(2, findLastIndexOrNull(ABC,                                    callback2AsTrue, 1, 2)); }
            @DisplayName("MinimalistCollectionHolder<T>, () → boolean, int, int?")        @Test void minimalist0ArgFromNull() { assertEquals(2, findLastIndexOrNull(new ArrayAsMinimalistCollection<>(ABC), callback0AsTrue, 0, null)); }
            @DisplayName("CollectionHolder<T>, () → boolean, int, int?")                  @Test void normal0ArgFromNull()     { assertEquals(2, findLastIndexOrNull(new ArrayAsCollection<>(ABC),           callback0AsTrue, 0, null)); }
            @DisplayName("T[], () → boolean, int, int?")                                  @Test void array0ArgFromNull()      { assertEquals(2, findLastIndexOrNull(ABC,                                    callback0AsTrue, 0, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T) → boolean, int, int?")       @Test void minimalist1ArgFromNull() { assertEquals(2, findLastIndexOrNull(new ArrayAsMinimalistCollection<>(ABC), callback1AsTrue, 0, null)); }
            @DisplayName("CollectionHolder<T>, (T) → boolean, int, int?")                 @Test void normal1ArgFromNull()     { assertEquals(2, findLastIndexOrNull(new ArrayAsCollection<>(ABC),           callback1AsTrue, 0, null)); }
            @DisplayName("T[], (T) → boolean, int, int?")                                 @Test void array1ArgFromNull()      { assertEquals(2, findLastIndexOrNull(ABC,                                    callback1AsTrue, 0, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T, int) → boolean, int, int?")  @Test void minimalist2ArgFromNull() { assertEquals(2, findLastIndexOrNull(new ArrayAsMinimalistCollection<>(ABC), callback2AsTrue, 0, null)); }
            @DisplayName("CollectionHolder<T>, (T, int) → boolean, int, int?")            @Test void normal2ArgFromNull()     { assertEquals(2, findLastIndexOrNull(new ArrayAsCollection<>(ABC),           callback2AsTrue, 0, null)); }
            @DisplayName("T[], (T, int) → boolean, int, int?")                            @Test void array2ArgFromNull()      { assertEquals(2, findLastIndexOrNull(ABC,                                    callback2AsTrue, 0, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, () → boolean, int?, int?")       @Test void minimalist0ArgNullNull() { assertEquals(2, findLastIndexOrNull(new ArrayAsMinimalistCollection<>(ABC), callback0AsTrue, null, null)); }
            @DisplayName("CollectionHolder<T>, () → boolean, int?, int?")                 @Test void normal0ArgNullNull()     { assertEquals(2, findLastIndexOrNull(new ArrayAsCollection<>(ABC),           callback0AsTrue, null, null)); }
            @DisplayName("T[], () → boolean, int?, int?")                                 @Test void array0ArgNullNull()      { assertEquals(2, findLastIndexOrNull(ABC,                                    callback0AsTrue, null, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T) → boolean, int?, int?")      @Test void minimalist1ArgNullNull() { assertEquals(2, findLastIndexOrNull(new ArrayAsMinimalistCollection<>(ABC), callback1AsTrue, null, null)); }
            @DisplayName("CollectionHolder<T>, (T) → boolean, int?, int?")                @Test void normal1ArgNullNull()     { assertEquals(2, findLastIndexOrNull(new ArrayAsCollection<>(ABC),           callback1AsTrue, null, null)); }
            @DisplayName("T[], (T) → boolean, int?, int?")                                @Test void array1ArgNullNull()      { assertEquals(2, findLastIndexOrNull(ABC,                                    callback1AsTrue, null, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T, int) → boolean, int?, int?") @Test void minimalist2ArgNullNull() { assertEquals(2, findLastIndexOrNull(new ArrayAsMinimalistCollection<>(ABC), callback2AsTrue, null, null)); }
            @DisplayName("CollectionHolder<T>, (T, int) → boolean, int?, int?")           @Test void normal2ArgNullNull()     { assertEquals(2, findLastIndexOrNull(new ArrayAsCollection<>(ABC),           callback2AsTrue, null, null)); }
            @DisplayName("T[], (T, int) → boolean, int?, int?")                           @Test void array2ArgNullNull()      { assertEquals(2, findLastIndexOrNull(ABC,                                    callback2AsTrue, null, null)); }
        }
        @Nested class findLastIndexIndexed {
            @DisplayName("MinimalistCollectionHolder<T>, () → boolean")                   @Test void minimalist0Arg()         { assertEquals(2, findLastIndexIndexed(new ArrayAsMinimalistCollection<>(ABC), callback0AsTrue)); }
            @DisplayName("CollectionHolder<T>, () → boolean")                             @Test void normal0Arg()             { assertEquals(2, findLastIndexIndexed(new ArrayAsCollection<>(ABC),           callback0AsTrue)); }
            @DisplayName("T[], () → boolean")                                             @Test void array0Arg()              { assertEquals(2, findLastIndexIndexed(ABC,                                    callback0AsTrue)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T) → boolean")                  @Test void minimalist1Arg()         { assertEquals(2, findLastIndexIndexed(new ArrayAsMinimalistCollection<>(ABC), callback1AltAsTrue)); }
            @DisplayName("CollectionHolder<T>, (T) → boolean")                            @Test void normal1Arg()             { assertEquals(2, findLastIndexIndexed(new ArrayAsCollection<>(ABC),           callback1AltAsTrue)); }
            @DisplayName("T[], (T) → boolean")                                            @Test void array1Arg()              { assertEquals(2, findLastIndexIndexed(ABC,                                    callback1AltAsTrue)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T, int) → boolean")             @Test void minimalist2Arg()         { assertEquals(2, findLastIndexIndexed(new ArrayAsMinimalistCollection<>(ABC), callback2AltAsTrue)); }
            @DisplayName("CollectionHolder<T>, (T, int) → boolean")                       @Test void normal2Arg()             { assertEquals(2, findLastIndexIndexed(new ArrayAsCollection<>(ABC),           callback2AltAsTrue)); }
            @DisplayName("T[], (T, int) → boolean")                                       @Test void array2Arg()              { assertEquals(2, findLastIndexIndexed(ABC,                                    callback2AltAsTrue)); }
            @DisplayName("MinimalistCollectionHolder<T>, () → boolean, int")              @Test void minimalist0ArgFrom()     { assertEquals(2, findLastIndexIndexed(new ArrayAsMinimalistCollection<>(ABC), callback0AsTrue, 1)); }
            @DisplayName("CollectionHolder<T>, () → boolean, int")                        @Test void normal0ArgFrom()         { assertEquals(2, findLastIndexIndexed(new ArrayAsCollection<>(ABC),           callback0AsTrue, 1)); }
            @DisplayName("T[], () → boolean, int")                                        @Test void array0ArgFrom()          { assertEquals(2, findLastIndexIndexed(ABC,                                    callback0AsTrue, 1)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T) → boolean, int")             @Test void minimalist1ArgFrom()     { assertEquals(2, findLastIndexIndexed(new ArrayAsMinimalistCollection<>(ABC), callback1AltAsTrue, 1)); }
            @DisplayName("CollectionHolder<T>, (T) → boolean, int")                       @Test void normal1ArgFrom()         { assertEquals(2, findLastIndexIndexed(new ArrayAsCollection<>(ABC),           callback1AltAsTrue, 1)); }
            @DisplayName("T[], (T) → boolean, int")                                       @Test void array1ArgFrom()          { assertEquals(2, findLastIndexIndexed(ABC,                                    callback1AltAsTrue, 1)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T, int) → boolean, int")        @Test void minimalist2ArgFrom()     { assertEquals(2, findLastIndexIndexed(new ArrayAsMinimalistCollection<>(ABC), callback2AltAsTrue, 1)); }
            @DisplayName("CollectionHolder<T>, (T, int) → boolean, int")                  @Test void normal2ArgFrom()         { assertEquals(2, findLastIndexIndexed(new ArrayAsCollection<>(ABC),           callback2AltAsTrue, 1)); }
            @DisplayName("T[], (T, int) → boolean, int")                                  @Test void array2ArgFrom()          { assertEquals(2, findLastIndexIndexed(ABC,                                    callback2AltAsTrue, 1)); }
            @DisplayName("MinimalistCollectionHolder<T>, () → boolean, int?")             @Test void minimalist0ArgNull()     { assertEquals(2, findLastIndexIndexed(new ArrayAsMinimalistCollection<>(ABC), callback0AsTrue, null)); }
            @DisplayName("CollectionHolder<T>, () → boolean, int?")                       @Test void normal0ArgNull()         { assertEquals(2, findLastIndexIndexed(new ArrayAsCollection<>(ABC),           callback0AsTrue, null)); }
            @DisplayName("T[], () → boolean, int?")                                       @Test void array0ArgNull()          { assertEquals(2, findLastIndexIndexed(ABC,                                    callback0AsTrue, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T) → boolean, int?")            @Test void minimalist1ArgNull()     { assertEquals(2, findLastIndexIndexed(new ArrayAsMinimalistCollection<>(ABC), callback1AltAsTrue, null)); }
            @DisplayName("CollectionHolder<T>, (T) → boolean, int?")                      @Test void normal1ArgNull()         { assertEquals(2, findLastIndexIndexed(new ArrayAsCollection<>(ABC),           callback1AltAsTrue, null)); }
            @DisplayName("T[], (T) → boolean, int?")                                      @Test void array1ArgNull()          { assertEquals(2, findLastIndexIndexed(ABC,                                    callback1AltAsTrue, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T, int) → boolean, int?")       @Test void minimalist2ArgNull()     { assertEquals(2, findLastIndexIndexed(new ArrayAsMinimalistCollection<>(ABC), callback2AltAsTrue, null)); }
            @DisplayName("CollectionHolder<T>, (T, int) → boolean, int?")                 @Test void normal2ArgNull()         { assertEquals(2, findLastIndexIndexed(new ArrayAsCollection<>(ABC),           callback2AltAsTrue, null)); }
            @DisplayName("T[], (T, int) → boolean, int?")                                 @Test void array2ArgNull()          { assertEquals(2, findLastIndexIndexed(ABC,                                    callback2AltAsTrue, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, () → boolean, int, int")         @Test void minimalist0ArgFromTo()   { assertEquals(2, findLastIndexIndexed(new ArrayAsMinimalistCollection<>(ABC), callback0AsTrue, 1, 2)); }
            @DisplayName("CollectionHolder<T>, () → boolean, int, int")                   @Test void normal0ArgFromTo()       { assertEquals(2, findLastIndexIndexed(new ArrayAsCollection<>(ABC),           callback0AsTrue, 1, 2)); }
            @DisplayName("T[], () → boolean, int, int")                                   @Test void array0ArgFromTo()        { assertEquals(2, findLastIndexIndexed(ABC,                                    callback0AsTrue, 1, 2)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T) → boolean, int, int")        @Test void minimalist1ArgFromTo()   { assertEquals(2, findLastIndexIndexed(new ArrayAsMinimalistCollection<>(ABC), callback1AltAsTrue, 1, 2)); }
            @DisplayName("CollectionHolder<T>, (T) → boolean, int, int")                  @Test void normal1ArgFromTo()       { assertEquals(2, findLastIndexIndexed(new ArrayAsCollection<>(ABC),           callback1AltAsTrue, 1, 2)); }
            @DisplayName("T[], (T) → boolean, int, int")                                  @Test void array1ArgFromTo()        { assertEquals(2, findLastIndexIndexed(ABC,                                    callback1AltAsTrue, 1, 2)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T, int) → boolean, int, int")   @Test void minimalist2ArgFromTo()   { assertEquals(2, findLastIndexIndexed(new ArrayAsMinimalistCollection<>(ABC), callback2AltAsTrue, 1, 2)); }
            @DisplayName("CollectionHolder<T>, (T, int) → boolean, int, int")             @Test void normal2ArgFromTo()       { assertEquals(2, findLastIndexIndexed(new ArrayAsCollection<>(ABC),           callback2AltAsTrue, 1, 2)); }
            @DisplayName("T[], (T, int) → boolean, int, int")                             @Test void array2ArgFromTo()        { assertEquals(2, findLastIndexIndexed(ABC,                                    callback2AltAsTrue, 1, 2)); }
            @DisplayName("MinimalistCollectionHolder<T>, () → boolean, int, int?")        @Test void minimalist0ArgFromNull() { assertEquals(2, findLastIndexIndexed(new ArrayAsMinimalistCollection<>(ABC), callback0AsTrue, 0, null)); }
            @DisplayName("CollectionHolder<T>, () → boolean, int, int?")                  @Test void normal0ArgFromNull()     { assertEquals(2, findLastIndexIndexed(new ArrayAsCollection<>(ABC),           callback0AsTrue, 0, null)); }
            @DisplayName("T[], () → boolean, int, int?")                                  @Test void array0ArgFromNull()      { assertEquals(2, findLastIndexIndexed(ABC,                                    callback0AsTrue, 0, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T) → boolean, int, int?")       @Test void minimalist1ArgFromNull() { assertEquals(2, findLastIndexIndexed(new ArrayAsMinimalistCollection<>(ABC), callback1AltAsTrue, 0, null)); }
            @DisplayName("CollectionHolder<T>, (T) → boolean, int, int?")                 @Test void normal1ArgFromNull()     { assertEquals(2, findLastIndexIndexed(new ArrayAsCollection<>(ABC),           callback1AltAsTrue, 0, null)); }
            @DisplayName("T[], (T) → boolean, int, int?")                                 @Test void array1ArgFromNull()      { assertEquals(2, findLastIndexIndexed(ABC,                                    callback1AltAsTrue, 0, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T, int) → boolean, int, int?")  @Test void minimalist2ArgFromNull() { assertEquals(2, findLastIndexIndexed(new ArrayAsMinimalistCollection<>(ABC), callback2AltAsTrue, 0, null)); }
            @DisplayName("CollectionHolder<T>, (T, int) → boolean, int, int?")            @Test void normal2ArgFromNull()     { assertEquals(2, findLastIndexIndexed(new ArrayAsCollection<>(ABC),           callback2AltAsTrue, 0, null)); }
            @DisplayName("T[], (T, int) → boolean, int, int?")                            @Test void array2ArgFromNull()      { assertEquals(2, findLastIndexIndexed(ABC,                                    callback2AltAsTrue, 0, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, () → boolean, int?, int?")       @Test void minimalist0ArgNullNull() { assertEquals(2, findLastIndexIndexed(new ArrayAsMinimalistCollection<>(ABC), callback0AsTrue, null, null)); }
            @DisplayName("CollectionHolder<T>, () → boolean, int?, int?")                 @Test void normal0ArgNullNull()     { assertEquals(2, findLastIndexIndexed(new ArrayAsCollection<>(ABC),           callback0AsTrue, null, null)); }
            @DisplayName("T[], () → boolean, int?, int?")                                 @Test void array0ArgNullNull()      { assertEquals(2, findLastIndexIndexed(ABC,                                    callback0AsTrue, null, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T) → boolean, int?, int?")      @Test void minimalist1ArgNullNull() { assertEquals(2, findLastIndexIndexed(new ArrayAsMinimalistCollection<>(ABC), callback1AltAsTrue, null, null)); }
            @DisplayName("CollectionHolder<T>, (T) → boolean, int?, int?")                @Test void normal1ArgNullNull()     { assertEquals(2, findLastIndexIndexed(new ArrayAsCollection<>(ABC),           callback1AltAsTrue, null, null)); }
            @DisplayName("T[], (T) → boolean, int?, int?")                                @Test void array1ArgNullNull()      { assertEquals(2, findLastIndexIndexed(ABC,                                    callback1AltAsTrue, null, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T, int) → boolean, int?, int?") @Test void minimalist2ArgNullNull() { assertEquals(2, findLastIndexIndexed(new ArrayAsMinimalistCollection<>(ABC), callback2AltAsTrue, null, null)); }
            @DisplayName("CollectionHolder<T>, (T, int) → boolean, int?, int?")           @Test void normal2ArgNullNull()     { assertEquals(2, findLastIndexIndexed(new ArrayAsCollection<>(ABC),           callback2AltAsTrue, null, null)); }
            @DisplayName("T[], (T, int) → boolean, int?, int?")                           @Test void array2ArgNullNull()      { assertEquals(2, findLastIndexIndexed(ABC,                                    callback2AltAsTrue, null, null)); }
        }
        @Nested class findLastIndexIndexedOrNull {
            @DisplayName("MinimalistCollectionHolder<T>, () → boolean")                   @Test void minimalist0Arg()         { assertEquals(2, findLastIndexIndexedOrNull(new ArrayAsMinimalistCollection<>(ABC), callback0AsTrue)); }
            @DisplayName("CollectionHolder<T>, () → boolean")                             @Test void normal0Arg()             { assertEquals(2, findLastIndexIndexedOrNull(new ArrayAsCollection<>(ABC),           callback0AsTrue)); }
            @DisplayName("T[], () → boolean")                                             @Test void array0Arg()              { assertEquals(2, findLastIndexIndexedOrNull(ABC,                                    callback0AsTrue)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T) → boolean")                  @Test void minimalist1Arg()         { assertEquals(2, findLastIndexIndexedOrNull(new ArrayAsMinimalistCollection<>(ABC), callback1AltAsTrue)); }
            @DisplayName("CollectionHolder<T>, (T) → boolean")                            @Test void normal1Arg()             { assertEquals(2, findLastIndexIndexedOrNull(new ArrayAsCollection<>(ABC),           callback1AltAsTrue)); }
            @DisplayName("T[], (T) → boolean")                                            @Test void array1Arg()              { assertEquals(2, findLastIndexIndexedOrNull(ABC,                                    callback1AltAsTrue)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T, int) → boolean")             @Test void minimalist2Arg()         { assertEquals(2, findLastIndexIndexedOrNull(new ArrayAsMinimalistCollection<>(ABC), callback2AltAsTrue)); }
            @DisplayName("CollectionHolder<T>, (T, int) → boolean")                       @Test void normal2Arg()             { assertEquals(2, findLastIndexIndexedOrNull(new ArrayAsCollection<>(ABC),           callback2AltAsTrue)); }
            @DisplayName("T[], (T, int) → boolean")                                       @Test void array2Arg()              { assertEquals(2, findLastIndexIndexedOrNull(ABC,                                    callback2AltAsTrue)); }
            @DisplayName("MinimalistCollectionHolder<T>, () → boolean, int")              @Test void minimalist0ArgFrom()     { assertEquals(2, findLastIndexIndexedOrNull(new ArrayAsMinimalistCollection<>(ABC), callback0AsTrue, 1)); }
            @DisplayName("CollectionHolder<T>, () → boolean, int")                        @Test void normal0ArgFrom()         { assertEquals(2, findLastIndexIndexedOrNull(new ArrayAsCollection<>(ABC),           callback0AsTrue, 1)); }
            @DisplayName("T[], () → boolean, int")                                        @Test void array0ArgFrom()          { assertEquals(2, findLastIndexIndexedOrNull(ABC,                                    callback0AsTrue, 1)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T) → boolean, int")             @Test void minimalist1ArgFrom()     { assertEquals(2, findLastIndexIndexedOrNull(new ArrayAsMinimalistCollection<>(ABC), callback1AltAsTrue, 1)); }
            @DisplayName("CollectionHolder<T>, (T) → boolean, int")                       @Test void normal1ArgFrom()         { assertEquals(2, findLastIndexIndexedOrNull(new ArrayAsCollection<>(ABC),           callback1AltAsTrue, 1)); }
            @DisplayName("T[], (T) → boolean, int")                                       @Test void array1ArgFrom()          { assertEquals(2, findLastIndexIndexedOrNull(ABC,                                    callback1AltAsTrue, 1)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T, int) → boolean, int")        @Test void minimalist2ArgFrom()     { assertEquals(2, findLastIndexIndexedOrNull(new ArrayAsMinimalistCollection<>(ABC), callback2AltAsTrue, 1)); }
            @DisplayName("CollectionHolder<T>, (T, int) → boolean, int")                  @Test void normal2ArgFrom()         { assertEquals(2, findLastIndexIndexedOrNull(new ArrayAsCollection<>(ABC),           callback2AltAsTrue, 1)); }
            @DisplayName("T[], (T, int) → boolean, int")                                  @Test void array2ArgFrom()          { assertEquals(2, findLastIndexIndexedOrNull(ABC,                                    callback2AltAsTrue, 1)); }
            @DisplayName("MinimalistCollectionHolder<T>, () → boolean, int?")             @Test void minimalist0ArgNull()     { assertEquals(2, findLastIndexIndexedOrNull(new ArrayAsMinimalistCollection<>(ABC), callback0AsTrue, null)); }
            @DisplayName("CollectionHolder<T>, () → boolean, int?")                       @Test void normal0ArgNull()         { assertEquals(2, findLastIndexIndexedOrNull(new ArrayAsCollection<>(ABC),           callback0AsTrue, null)); }
            @DisplayName("T[], () → boolean, int?")                                       @Test void array0ArgNull()          { assertEquals(2, findLastIndexIndexedOrNull(ABC,                                    callback0AsTrue, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T) → boolean, int?")            @Test void minimalist1ArgNull()     { assertEquals(2, findLastIndexIndexedOrNull(new ArrayAsMinimalistCollection<>(ABC), callback1AltAsTrue, null)); }
            @DisplayName("CollectionHolder<T>, (T) → boolean, int?")                      @Test void normal1ArgNull()         { assertEquals(2, findLastIndexIndexedOrNull(new ArrayAsCollection<>(ABC),           callback1AltAsTrue, null)); }
            @DisplayName("T[], (T) → boolean, int?")                                      @Test void array1ArgNull()          { assertEquals(2, findLastIndexIndexedOrNull(ABC,                                    callback1AltAsTrue, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T, int) → boolean, int?")       @Test void minimalist2ArgNull()     { assertEquals(2, findLastIndexIndexedOrNull(new ArrayAsMinimalistCollection<>(ABC), callback2AltAsTrue, null)); }
            @DisplayName("CollectionHolder<T>, (T, int) → boolean, int?")                 @Test void normal2ArgNull()         { assertEquals(2, findLastIndexIndexedOrNull(new ArrayAsCollection<>(ABC),           callback2AltAsTrue, null)); }
            @DisplayName("T[], (T, int) → boolean, int?")                                 @Test void array2ArgNull()          { assertEquals(2, findLastIndexIndexedOrNull(ABC,                                    callback2AltAsTrue, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, () → boolean, int, int")         @Test void minimalist0ArgFromTo()   { assertEquals(2, findLastIndexIndexedOrNull(new ArrayAsMinimalistCollection<>(ABC), callback0AsTrue, 1, 2)); }
            @DisplayName("CollectionHolder<T>, () → boolean, int, int")                   @Test void normal0ArgFromTo()       { assertEquals(2, findLastIndexIndexedOrNull(new ArrayAsCollection<>(ABC),           callback0AsTrue, 1, 2)); }
            @DisplayName("T[], () → boolean, int, int")                                   @Test void array0ArgFromTo()        { assertEquals(2, findLastIndexIndexedOrNull(ABC,                                    callback0AsTrue, 1, 2)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T) → boolean, int, int")        @Test void minimalist1ArgFromTo()   { assertEquals(2, findLastIndexIndexedOrNull(new ArrayAsMinimalistCollection<>(ABC), callback1AltAsTrue, 1, 2)); }
            @DisplayName("CollectionHolder<T>, (T) → boolean, int, int")                  @Test void normal1ArgFromTo()       { assertEquals(2, findLastIndexIndexedOrNull(new ArrayAsCollection<>(ABC),           callback1AltAsTrue, 1, 2)); }
            @DisplayName("T[], (T) → boolean, int, int")                                  @Test void array1ArgFromTo()        { assertEquals(2, findLastIndexIndexedOrNull(ABC,                                    callback1AltAsTrue, 1, 2)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T, int) → boolean, int, int")   @Test void minimalist2ArgFromTo()   { assertEquals(2, findLastIndexIndexedOrNull(new ArrayAsMinimalistCollection<>(ABC), callback2AltAsTrue, 1, 2)); }
            @DisplayName("CollectionHolder<T>, (T, int) → boolean, int, int")             @Test void normal2ArgFromTo()       { assertEquals(2, findLastIndexIndexedOrNull(new ArrayAsCollection<>(ABC),           callback2AltAsTrue, 1, 2)); }
            @DisplayName("T[], (T, int) → boolean, int, int")                             @Test void array2ArgFromTo()        { assertEquals(2, findLastIndexIndexedOrNull(ABC,                                    callback2AltAsTrue, 1, 2)); }
            @DisplayName("MinimalistCollectionHolder<T>, () → boolean, int, int?")        @Test void minimalist0ArgFromNull() { assertEquals(2, findLastIndexIndexedOrNull(new ArrayAsMinimalistCollection<>(ABC), callback0AsTrue, 0, null)); }
            @DisplayName("CollectionHolder<T>, () → boolean, int, int?")                  @Test void normal0ArgFromNull()     { assertEquals(2, findLastIndexIndexedOrNull(new ArrayAsCollection<>(ABC),           callback0AsTrue, 0, null)); }
            @DisplayName("T[], () → boolean, int, int?")                                  @Test void array0ArgFromNull()      { assertEquals(2, findLastIndexIndexedOrNull(ABC,                                    callback0AsTrue, 0, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T) → boolean, int, int?")       @Test void minimalist1ArgFromNull() { assertEquals(2, findLastIndexIndexedOrNull(new ArrayAsMinimalistCollection<>(ABC), callback1AltAsTrue, 0, null)); }
            @DisplayName("CollectionHolder<T>, (T) → boolean, int, int?")                 @Test void normal1ArgFromNull()     { assertEquals(2, findLastIndexIndexedOrNull(new ArrayAsCollection<>(ABC),           callback1AltAsTrue, 0, null)); }
            @DisplayName("T[], (T) → boolean, int, int?")                                 @Test void array1ArgFromNull()      { assertEquals(2, findLastIndexIndexedOrNull(ABC,                                    callback1AltAsTrue, 0, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T, int) → boolean, int, int?")  @Test void minimalist2ArgFromNull() { assertEquals(2, findLastIndexIndexedOrNull(new ArrayAsMinimalistCollection<>(ABC), callback2AltAsTrue, 0, null)); }
            @DisplayName("CollectionHolder<T>, (T, int) → boolean, int, int?")            @Test void normal2ArgFromNull()     { assertEquals(2, findLastIndexIndexedOrNull(new ArrayAsCollection<>(ABC),           callback2AltAsTrue, 0, null)); }
            @DisplayName("T[], (T, int) → boolean, int, int?")                            @Test void array2ArgFromNull()      { assertEquals(2, findLastIndexIndexedOrNull(ABC,                                    callback2AltAsTrue, 0, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, () → boolean, int?, int?")       @Test void minimalist0ArgNullNull() { assertEquals(2, findLastIndexIndexedOrNull(new ArrayAsMinimalistCollection<>(ABC), callback0AsTrue, null, null)); }
            @DisplayName("CollectionHolder<T>, () → boolean, int?, int?")                 @Test void normal0ArgNullNull()     { assertEquals(2, findLastIndexIndexedOrNull(new ArrayAsCollection<>(ABC),           callback0AsTrue, null, null)); }
            @DisplayName("T[], () → boolean, int?, int?")                                 @Test void array0ArgNullNull()      { assertEquals(2, findLastIndexIndexedOrNull(ABC,                                    callback0AsTrue, null, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T) → boolean, int?, int?")      @Test void minimalist1ArgNullNull() { assertEquals(2, findLastIndexIndexedOrNull(new ArrayAsMinimalistCollection<>(ABC), callback1AltAsTrue, null, null)); }
            @DisplayName("CollectionHolder<T>, (T) → boolean, int?, int?")                @Test void normal1ArgNullNull()     { assertEquals(2, findLastIndexIndexedOrNull(new ArrayAsCollection<>(ABC),           callback1AltAsTrue, null, null)); }
            @DisplayName("T[], (T) → boolean, int?, int?")                                @Test void array1ArgNullNull()      { assertEquals(2, findLastIndexIndexedOrNull(ABC,                                    callback1AltAsTrue, null, null)); }
            @DisplayName("MinimalistCollectionHolder<T>, (T, int) → boolean, int?, int?") @Test void minimalist2ArgNullNull() { assertEquals(2, findLastIndexIndexedOrNull(new ArrayAsMinimalistCollection<>(ABC), callback2AltAsTrue, null, null)); }
            @DisplayName("CollectionHolder<T>, (T, int) → boolean, int?, int?")           @Test void normal2ArgNullNull()     { assertEquals(2, findLastIndexIndexedOrNull(new ArrayAsCollection<>(ABC),           callback2AltAsTrue, null, null)); }
            @DisplayName("T[], (T, int) → boolean, int?, int?")                           @Test void array2ArgNullNull()      { assertEquals(2, findLastIndexIndexedOrNull(ABC,                                    callback2AltAsTrue, null, null)); }
        }

        //TODO add utility static method (index) call to have been called
    }

    @FieldSource("values")
    @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class methods extends AbstractMethodsTests {

        //#region -------------------- Required test configuration --------------------

        static final Arguments[] values = everyExtensionMethodInstancesAsArguments;

        public methods(final CollectionHolderForTest<?, ?> instance) { super(instance); }

        //#endregion -------------------- Required test configuration --------------------

        @Nested class firstIndexOf {
                                              @Test void element()         { assertThrowsExactly(emptyExceptionClass(), () -> getInstance().firstIndexOf(null)); }
            @DisplayName("element, int")      @Test void elementFrom()     { assertThrowsExactly(emptyExceptionClass(), () -> getInstance().firstIndexOf(null, 0)); }
            @DisplayName("element, int?")     @Test void elementNull()     { assertThrowsExactly(emptyExceptionClass(), () -> getInstance().firstIndexOf(null, null)); }
            @DisplayName("element, int, int") @Test void elementFromTo()   { assertThrowsExactly(emptyExceptionClass(), () -> getInstance().firstIndexOf(null, 0, 1)); }
            @DisplayName("element, int, int") @Test void elementFromNull() { assertThrowsExactly(emptyExceptionClass(), () -> getInstance().firstIndexOf(null, 0, null)); }
            @DisplayName("element, int, int") @Test void elementNullNull() { assertThrowsExactly(emptyExceptionClass(), () -> getInstance().firstIndexOf(null, null, null)); }
        }
        @Nested class firstIndexOfOrNull {
                                              @Test void element()         { assertNull(getInstance().firstIndexOfOrNull(null)); }
            @DisplayName("element, int")      @Test void elementFrom()     { assertNull(getInstance().firstIndexOfOrNull(null, 0)); }
            @DisplayName("element, int?")     @Test void elementNull()     { assertNull(getInstance().firstIndexOfOrNull(null, null)); }
            @DisplayName("element, int, int") @Test void elementFromTo()   { assertNull(getInstance().firstIndexOfOrNull(null, 0, 1)); }
            @DisplayName("element, int, int") @Test void elementFromNull() { assertNull(getInstance().firstIndexOfOrNull(null, 0, null)); }
            @DisplayName("element, int, int") @Test void elementNullNull() { assertNull(getInstance().firstIndexOfOrNull(null, null, null)); }
        }

        @Nested class lastIndexOf {
                                              @Test void element()         { assertThrowsExactly(emptyExceptionClass(), () -> getInstance().lastIndexOf(null)); }
            @DisplayName("element, int")      @Test void elementFrom()     { assertThrowsExactly(emptyExceptionClass(), () -> getInstance().lastIndexOf(null, 0)); }
            @DisplayName("element, int?")     @Test void elementNull()     { assertThrowsExactly(emptyExceptionClass(), () -> getInstance().lastIndexOf(null, null)); }
            @DisplayName("element, int, int") @Test void elementFromTo()   { assertThrowsExactly(emptyExceptionClass(), () -> getInstance().lastIndexOf(null, 0, 1)); }
            @DisplayName("element, int, int") @Test void elementFromNull() { assertThrowsExactly(emptyExceptionClass(), () -> getInstance().lastIndexOf(null, 0, null)); }
            @DisplayName("element, int, int") @Test void elementNullNull() { assertThrowsExactly(emptyExceptionClass(), () -> getInstance().lastIndexOf(null, null, null)); }
        }
        @Nested class lastIndexOfOrNull {
                                              @Test void element()         { assertNull(getInstance().lastIndexOfOrNull(null)); }
            @DisplayName("element, int")      @Test void elementFrom()     { assertNull(getInstance().lastIndexOfOrNull(null, 0)); }
            @DisplayName("element, int?")     @Test void elementNull()     { assertNull(getInstance().lastIndexOfOrNull(null, null)); }
            @DisplayName("element, int, int") @Test void elementFromTo()   { assertNull(getInstance().lastIndexOfOrNull(null, 0, 1)); }
            @DisplayName("element, int, int") @Test void elementFromNull() { assertNull(getInstance().lastIndexOfOrNull(null, 0, null)); }
            @DisplayName("element, int, int") @Test void elementNullNull() { assertNull(getInstance().lastIndexOfOrNull(null, null, null)); }
        }

        @Nested class indexOfFirst {
            @DisplayName("() → boolean")                   @Test void test0Arg()         { assertThrowsExactly(emptyExceptionClass(), () -> methods.this.<String>getInstance().indexOfFirst(predicate0AsFail)); }
            @DisplayName("(T) → boolean")                  @Test void test1Arg()         { assertThrowsExactly(emptyExceptionClass(), () -> methods.this.<String>getInstance().indexOfFirst(predicate1AsFail)); }
            @DisplayName("(T, int) → boolean")             @Test void test2Arg()         { assertThrowsExactly(emptyExceptionClass(), () -> methods.this.<String>getInstance().indexOfFirst(predicate2AsFail)); }
            @DisplayName("() → boolean, int")              @Test void test0ArgFrom()     { assertThrowsExactly(emptyExceptionClass(), () -> methods.this.<String>getInstance().indexOfFirst(predicate0AsFail, 0)); }
            @DisplayName("(T) → boolean, int")             @Test void test1ArgFrom()     { assertThrowsExactly(emptyExceptionClass(), () -> methods.this.<String>getInstance().indexOfFirst(predicate1AsFail, 0)); }
            @DisplayName("(T, int) → boolean, int")        @Test void test2ArgFrom()     { assertThrowsExactly(emptyExceptionClass(), () -> methods.this.<String>getInstance().indexOfFirst(predicate2AsFail, 0)); }
            @DisplayName("() → boolean, int?")             @Test void test0ArgNull()     { assertThrowsExactly(emptyExceptionClass(), () -> methods.this.<String>getInstance().indexOfFirst(predicate0AsFail, null)); }
            @DisplayName("(T) → boolean, int?")            @Test void test1ArgNull()     { assertThrowsExactly(emptyExceptionClass(), () -> methods.this.<String>getInstance().indexOfFirst(predicate1AsFail, null)); }
            @DisplayName("(T, int) → boolean, int?")       @Test void test2ArgNull()     { assertThrowsExactly(emptyExceptionClass(), () -> methods.this.<String>getInstance().indexOfFirst(predicate2AsFail, null)); }
            @DisplayName("() → boolean, int, int")         @Test void test0ArgFromTo()   { assertThrowsExactly(emptyExceptionClass(), () -> methods.this.<String>getInstance().indexOfFirst(predicate0AsFail, 0, 1)); }
            @DisplayName("(T) → boolean, int, int")        @Test void test1ArgFromTo()   { assertThrowsExactly(emptyExceptionClass(), () -> methods.this.<String>getInstance().indexOfFirst(predicate1AsFail, 0, 1)); }
            @DisplayName("(T, int) → boolean, int, int")   @Test void test2ArgFromTo()   { assertThrowsExactly(emptyExceptionClass(), () -> methods.this.<String>getInstance().indexOfFirst(predicate2AsFail, 0, 1)); }
            @DisplayName("() → boolean, int, int?")        @Test void test0ArgFromNull() { assertThrowsExactly(emptyExceptionClass(), () -> methods.this.<String>getInstance().indexOfFirst(predicate0AsFail, 0, null)); }
            @DisplayName("(T) → boolean, int, int?")       @Test void test1ArgFromNull() { assertThrowsExactly(emptyExceptionClass(), () -> methods.this.<String>getInstance().indexOfFirst(predicate1AsFail, 0, null)); }
            @DisplayName("(T, int) → boolean, int, int?")  @Test void test2ArgFromNull() { assertThrowsExactly(emptyExceptionClass(), () -> methods.this.<String>getInstance().indexOfFirst(predicate2AsFail, 0, null)); }
            @DisplayName("() → boolean, int?, int?")       @Test void test0ArgNullNull() { assertThrowsExactly(emptyExceptionClass(), () -> methods.this.<String>getInstance().indexOfFirst(predicate0AsFail, null, null)); }
            @DisplayName("(T) → boolean, int?, int?")      @Test void test1ArgNullNull() { assertThrowsExactly(emptyExceptionClass(), () -> methods.this.<String>getInstance().indexOfFirst(predicate1AsFail, null, null)); }
            @DisplayName("(T, int) → boolean, int?, int?") @Test void test2ArgNullNull() { assertThrowsExactly(emptyExceptionClass(), () -> methods.this.<String>getInstance().indexOfFirst(predicate2AsFail, null, null)); }
        }
        @Nested class indexOfFirstOrNull {
            @DisplayName("() → boolean")                   @Test void test0Arg()         { assertNull(methods.this.<String>getInstance().indexOfFirstOrNull(predicate0AsFail)); }
            @DisplayName("(T) → boolean")                  @Test void test1Arg()         { assertNull(methods.this.<String>getInstance().indexOfFirstOrNull(predicate1AsFail)); }
            @DisplayName("(T, int) → boolean")             @Test void test2Arg()         { assertNull(methods.this.<String>getInstance().indexOfFirstOrNull(predicate2AsFail)); }
            @DisplayName("() → boolean, int")              @Test void test0ArgFrom()     { assertNull(methods.this.<String>getInstance().indexOfFirstOrNull(predicate0AsFail, 0)); }
            @DisplayName("(T) → boolean, int")             @Test void test1ArgFrom()     { assertNull(methods.this.<String>getInstance().indexOfFirstOrNull(predicate1AsFail, 0)); }
            @DisplayName("(T, int) → boolean, int")        @Test void test2ArgFrom()     { assertNull(methods.this.<String>getInstance().indexOfFirstOrNull(predicate2AsFail, 0)); }
            @DisplayName("() → boolean, int?")             @Test void test0ArgNull()     { assertNull(methods.this.<String>getInstance().indexOfFirstOrNull(predicate0AsFail, null)); }
            @DisplayName("(T) → boolean, int?")            @Test void test1ArgNull()     { assertNull(methods.this.<String>getInstance().indexOfFirstOrNull(predicate1AsFail, null)); }
            @DisplayName("(T, int) → boolean, int?")       @Test void test2ArgNull()     { assertNull(methods.this.<String>getInstance().indexOfFirstOrNull(predicate2AsFail, null)); }
            @DisplayName("() → boolean, int, int")         @Test void test0ArgFromTo()   { assertNull(methods.this.<String>getInstance().indexOfFirstOrNull(predicate0AsFail, 0, 1)); }
            @DisplayName("(T) → boolean, int, int")        @Test void test1ArgFromTo()   { assertNull(methods.this.<String>getInstance().indexOfFirstOrNull(predicate1AsFail, 0, 1)); }
            @DisplayName("(T, int) → boolean, int, int")   @Test void test2ArgFromTo()   { assertNull(methods.this.<String>getInstance().indexOfFirstOrNull(predicate2AsFail, 0, 1)); }
            @DisplayName("() → boolean, int, int?")        @Test void test0ArgFromNull() { assertNull(methods.this.<String>getInstance().indexOfFirstOrNull(predicate0AsFail, 0, null)); }
            @DisplayName("(T) → boolean, int, int?")       @Test void test1ArgFromNull() { assertNull(methods.this.<String>getInstance().indexOfFirstOrNull(predicate1AsFail, 0, null)); }
            @DisplayName("(T, int) → boolean, int, int?")  @Test void test2ArgFromNull() { assertNull(methods.this.<String>getInstance().indexOfFirstOrNull(predicate2AsFail, 0, null)); }
            @DisplayName("() → boolean, int?, int?")       @Test void test0ArgNullNull() { assertNull(methods.this.<String>getInstance().indexOfFirstOrNull(predicate0AsFail, null, null)); }
            @DisplayName("(T) → boolean, int?, int?")      @Test void test1ArgNullNull() { assertNull(methods.this.<String>getInstance().indexOfFirstOrNull(predicate1AsFail, null, null)); }
            @DisplayName("(T, int) → boolean, int?, int?") @Test void test2ArgNullNull() { assertNull(methods.this.<String>getInstance().indexOfFirstOrNull(predicate2AsFail, null, null)); }
        }
        @Nested class indexOfFirstIndexed {
            @DisplayName("() → boolean")                   @Test void test0Arg()         { assertThrowsExactly(emptyExceptionClass(), () -> methods.this.<String>getInstance().indexOfFirstIndexed(predicate0AsFail)); }
            @DisplayName("(T) → boolean")                  @Test void test1Arg()         { assertThrowsExactly(emptyExceptionClass(), () -> methods.this.<String>getInstance().indexOfFirstIndexed(predicate1AltAsFail)); }
            @DisplayName("(T, int) → boolean")             @Test void test2Arg()         { assertThrowsExactly(emptyExceptionClass(), () -> methods.this.<String>getInstance().indexOfFirstIndexed(predicate2AltAsFail)); }
            @DisplayName("() → boolean, int")              @Test void test0ArgFrom()     { assertThrowsExactly(emptyExceptionClass(), () -> methods.this.<String>getInstance().indexOfFirstIndexed(predicate0AsFail, 0)); }
            @DisplayName("(T) → boolean, int")             @Test void test1ArgFrom()     { assertThrowsExactly(emptyExceptionClass(), () -> methods.this.<String>getInstance().indexOfFirstIndexed(predicate1AltAsFail, 0)); }
            @DisplayName("(T, int) → boolean, int")        @Test void test2ArgFrom()     { assertThrowsExactly(emptyExceptionClass(), () -> methods.this.<String>getInstance().indexOfFirstIndexed(predicate2AltAsFail, 0)); }
            @DisplayName("() → boolean, int?")             @Test void test0ArgNull()     { assertThrowsExactly(emptyExceptionClass(), () -> methods.this.<String>getInstance().indexOfFirstIndexed(predicate0AsFail, null)); }
            @DisplayName("(T) → boolean, int?")            @Test void test1ArgNull()     { assertThrowsExactly(emptyExceptionClass(), () -> methods.this.<String>getInstance().indexOfFirstIndexed(predicate1AltAsFail, null)); }
            @DisplayName("(T, int) → boolean, int?")       @Test void test2ArgNull()     { assertThrowsExactly(emptyExceptionClass(), () -> methods.this.<String>getInstance().indexOfFirstIndexed(predicate2AltAsFail, null)); }
            @DisplayName("() → boolean, int, int")         @Test void test0ArgFromTo()   { assertThrowsExactly(emptyExceptionClass(), () -> methods.this.<String>getInstance().indexOfFirstIndexed(predicate0AsFail, 0, 1)); }
            @DisplayName("(T) → boolean, int, int")        @Test void test1ArgFromTo()   { assertThrowsExactly(emptyExceptionClass(), () -> methods.this.<String>getInstance().indexOfFirstIndexed(predicate1AltAsFail, 0, 1)); }
            @DisplayName("(T, int) → boolean, int, int")   @Test void test2ArgFromTo()   { assertThrowsExactly(emptyExceptionClass(), () -> methods.this.<String>getInstance().indexOfFirstIndexed(predicate2AltAsFail, 0, 1)); }
            @DisplayName("() → boolean, int, int?")        @Test void test0ArgFromNull() { assertThrowsExactly(emptyExceptionClass(), () -> methods.this.<String>getInstance().indexOfFirstIndexed(predicate0AsFail, 0, null)); }
            @DisplayName("(T) → boolean, int, int?")       @Test void test1ArgFromNull() { assertThrowsExactly(emptyExceptionClass(), () -> methods.this.<String>getInstance().indexOfFirstIndexed(predicate1AltAsFail, 0, null)); }
            @DisplayName("(T, int) → boolean, int, int?")  @Test void test2ArgFromNull() { assertThrowsExactly(emptyExceptionClass(), () -> methods.this.<String>getInstance().indexOfFirstIndexed(predicate2AltAsFail, 0, null)); }
            @DisplayName("() → boolean, int?, int?")       @Test void test0ArgNullNull() { assertThrowsExactly(emptyExceptionClass(), () -> methods.this.<String>getInstance().indexOfFirstIndexed(predicate0AsFail, null, null)); }
            @DisplayName("(T) → boolean, int?, int?")      @Test void test1ArgNullNull() { assertThrowsExactly(emptyExceptionClass(), () -> methods.this.<String>getInstance().indexOfFirstIndexed(predicate1AltAsFail, null, null)); }
            @DisplayName("(T, int) → boolean, int?, int?") @Test void test2ArgNullNull() { assertThrowsExactly(emptyExceptionClass(), () -> methods.this.<String>getInstance().indexOfFirstIndexed(predicate2AltAsFail, null, null)); }
        }
        @Nested class indexOfFirstIndexedOrNull {
            @DisplayName("() → boolean")                   @Test void test0Arg()         { assertNull(methods.this.<String>getInstance().indexOfFirstIndexedOrNull(predicate0AsFail)); }
            @DisplayName("(T) → boolean")                  @Test void test1Arg()         { assertNull(methods.this.<String>getInstance().indexOfFirstIndexedOrNull(predicate1AltAsFail)); }
            @DisplayName("(T, int) → boolean")             @Test void test2Arg()         { assertNull(methods.this.<String>getInstance().indexOfFirstIndexedOrNull(predicate2AltAsFail)); }
            @DisplayName("() → boolean, int")              @Test void test0ArgFrom()     { assertNull(methods.this.<String>getInstance().indexOfFirstIndexedOrNull(predicate0AsFail, 0)); }
            @DisplayName("(T) → boolean, int")             @Test void test1ArgFrom()     { assertNull(methods.this.<String>getInstance().indexOfFirstIndexedOrNull(predicate1AltAsFail, 0)); }
            @DisplayName("(T, int) → boolean, int")        @Test void test2ArgFrom()     { assertNull(methods.this.<String>getInstance().indexOfFirstIndexedOrNull(predicate2AltAsFail, 0)); }
            @DisplayName("() → boolean, int?")             @Test void test0ArgNull()     { assertNull(methods.this.<String>getInstance().indexOfFirstIndexedOrNull(predicate0AsFail, null)); }
            @DisplayName("(T) → boolean, int?")            @Test void test1ArgNull()     { assertNull(methods.this.<String>getInstance().indexOfFirstIndexedOrNull(predicate1AltAsFail, null)); }
            @DisplayName("(T, int) → boolean, int?")       @Test void test2ArgNull()     { assertNull(methods.this.<String>getInstance().indexOfFirstIndexedOrNull(predicate2AltAsFail, null)); }
            @DisplayName("() → boolean, int, int")         @Test void test0ArgFromTo()   { assertNull(methods.this.<String>getInstance().indexOfFirstIndexedOrNull(predicate0AsFail, 0, 1)); }
            @DisplayName("(T) → boolean, int, int")        @Test void test1ArgFromTo()   { assertNull(methods.this.<String>getInstance().indexOfFirstIndexedOrNull(predicate1AltAsFail, 0, 1)); }
            @DisplayName("(T, int) → boolean, int, int")   @Test void test2ArgFromTo()   { assertNull(methods.this.<String>getInstance().indexOfFirstIndexedOrNull(predicate2AltAsFail, 0, 1)); }
            @DisplayName("() → boolean, int, int?")        @Test void test0ArgFromNull() { assertNull(methods.this.<String>getInstance().indexOfFirstIndexedOrNull(predicate0AsFail, 0, null)); }
            @DisplayName("(T) → boolean, int, int?")       @Test void test1ArgFromNull() { assertNull(methods.this.<String>getInstance().indexOfFirstIndexedOrNull(predicate1AltAsFail, 0, null)); }
            @DisplayName("(T, int) → boolean, int, int?")  @Test void test2ArgFromNull() { assertNull(methods.this.<String>getInstance().indexOfFirstIndexedOrNull(predicate2AltAsFail, 0, null)); }
            @DisplayName("() → boolean, int?, int?")       @Test void test0ArgNullNull() { assertNull(methods.this.<String>getInstance().indexOfFirstIndexedOrNull(predicate0AsFail, null, null)); }
            @DisplayName("(T) → boolean, int?, int?")      @Test void test1ArgNullNull() { assertNull(methods.this.<String>getInstance().indexOfFirstIndexedOrNull(predicate1AltAsFail, null, null)); }
            @DisplayName("(T, int) → boolean, int?, int?") @Test void test2ArgNullNull() { assertNull(methods.this.<String>getInstance().indexOfFirstIndexedOrNull(predicate2AltAsFail, null, null)); }
        }

        @Nested class indexOfLast {
            @DisplayName("() → boolean")                   @Test void test0Arg()         { assertThrowsExactly(emptyExceptionClass(), () -> methods.this.<String>getInstance().indexOfLast(predicate0AsFail)); }
            @DisplayName("(T) → boolean")                  @Test void test1Arg()         { assertThrowsExactly(emptyExceptionClass(), () -> methods.this.<String>getInstance().indexOfLast(predicate1AsFail)); }
            @DisplayName("(T, int) → boolean")             @Test void test2Arg()         { assertThrowsExactly(emptyExceptionClass(), () -> methods.this.<String>getInstance().indexOfLast(predicate2AsFail)); }
            @DisplayName("() → boolean, int")              @Test void test0ArgFrom()     { assertThrowsExactly(emptyExceptionClass(), () -> methods.this.<String>getInstance().indexOfLast(predicate0AsFail, 0)); }
            @DisplayName("(T) → boolean, int")             @Test void test1ArgFrom()     { assertThrowsExactly(emptyExceptionClass(), () -> methods.this.<String>getInstance().indexOfLast(predicate1AsFail, 0)); }
            @DisplayName("(T, int) → boolean, int")        @Test void test2ArgFrom()     { assertThrowsExactly(emptyExceptionClass(), () -> methods.this.<String>getInstance().indexOfLast(predicate2AsFail, 0)); }
            @DisplayName("() → boolean, int?")             @Test void test0ArgNull()     { assertThrowsExactly(emptyExceptionClass(), () -> methods.this.<String>getInstance().indexOfLast(predicate0AsFail, null)); }
            @DisplayName("(T) → boolean, int?")            @Test void test1ArgNull()     { assertThrowsExactly(emptyExceptionClass(), () -> methods.this.<String>getInstance().indexOfLast(predicate1AsFail, null)); }
            @DisplayName("(T, int) → boolean, int?")       @Test void test2ArgNull()     { assertThrowsExactly(emptyExceptionClass(), () -> methods.this.<String>getInstance().indexOfLast(predicate2AsFail, null)); }
            @DisplayName("() → boolean, int, int")         @Test void test0ArgFromTo()   { assertThrowsExactly(emptyExceptionClass(), () -> methods.this.<String>getInstance().indexOfLast(predicate0AsFail, 0, 1)); }
            @DisplayName("(T) → boolean, int, int")        @Test void test1ArgFromTo()   { assertThrowsExactly(emptyExceptionClass(), () -> methods.this.<String>getInstance().indexOfLast(predicate1AsFail, 0, 1)); }
            @DisplayName("(T, int) → boolean, int, int")   @Test void test2ArgFromTo()   { assertThrowsExactly(emptyExceptionClass(), () -> methods.this.<String>getInstance().indexOfLast(predicate2AsFail, 0, 1)); }
            @DisplayName("() → boolean, int, int?")        @Test void test0ArgFromNull() { assertThrowsExactly(emptyExceptionClass(), () -> methods.this.<String>getInstance().indexOfLast(predicate0AsFail, 0, null)); }
            @DisplayName("(T) → boolean, int, int?")       @Test void test1ArgFromNull() { assertThrowsExactly(emptyExceptionClass(), () -> methods.this.<String>getInstance().indexOfLast(predicate1AsFail, 0, null)); }
            @DisplayName("(T, int) → boolean, int, int?")  @Test void test2ArgFromNull() { assertThrowsExactly(emptyExceptionClass(), () -> methods.this.<String>getInstance().indexOfLast(predicate2AsFail, 0, null)); }
            @DisplayName("() → boolean, int?, int?")       @Test void test0ArgNullNull() { assertThrowsExactly(emptyExceptionClass(), () -> methods.this.<String>getInstance().indexOfLast(predicate0AsFail, null, null)); }
            @DisplayName("(T) → boolean, int?, int?")      @Test void test1ArgNullNull() { assertThrowsExactly(emptyExceptionClass(), () -> methods.this.<String>getInstance().indexOfLast(predicate1AsFail, null, null)); }
            @DisplayName("(T, int) → boolean, int?, int?") @Test void test2ArgNullNull() { assertThrowsExactly(emptyExceptionClass(), () -> methods.this.<String>getInstance().indexOfLast(predicate2AsFail, null, null)); }
        }
        @Nested class indexOfLastOrNull {
            @DisplayName("() → boolean")                   @Test void test0Arg()         { assertNull(methods.this.<String>getInstance().indexOfLastOrNull(predicate0AsFail)); }
            @DisplayName("(T) → boolean")                  @Test void test1Arg()         { assertNull(methods.this.<String>getInstance().indexOfLastOrNull(predicate1AsFail)); }
            @DisplayName("(T, int) → boolean")             @Test void test2Arg()         { assertNull(methods.this.<String>getInstance().indexOfLastOrNull(predicate2AsFail)); }
            @DisplayName("() → boolean, int")              @Test void test0ArgFrom()     { assertNull(methods.this.<String>getInstance().indexOfLastOrNull(predicate0AsFail, 0)); }
            @DisplayName("(T) → boolean, int")             @Test void test1ArgFrom()     { assertNull(methods.this.<String>getInstance().indexOfLastOrNull(predicate1AsFail, 0)); }
            @DisplayName("(T, int) → boolean, int")        @Test void test2ArgFrom()     { assertNull(methods.this.<String>getInstance().indexOfLastOrNull(predicate2AsFail, 0)); }
            @DisplayName("() → boolean, int?")             @Test void test0ArgNull()     { assertNull(methods.this.<String>getInstance().indexOfLastOrNull(predicate0AsFail, null)); }
            @DisplayName("(T) → boolean, int?")            @Test void test1ArgNull()     { assertNull(methods.this.<String>getInstance().indexOfLastOrNull(predicate1AsFail, null)); }
            @DisplayName("(T, int) → boolean, int?")       @Test void test2ArgNull()     { assertNull(methods.this.<String>getInstance().indexOfLastOrNull(predicate2AsFail, null)); }
            @DisplayName("() → boolean, int, int")         @Test void test0ArgFromTo()   { assertNull(methods.this.<String>getInstance().indexOfLastOrNull(predicate0AsFail, 0, 1)); }
            @DisplayName("(T) → boolean, int, int")        @Test void test1ArgFromTo()   { assertNull(methods.this.<String>getInstance().indexOfLastOrNull(predicate1AsFail, 0, 1)); }
            @DisplayName("(T, int) → boolean, int, int")   @Test void test2ArgFromTo()   { assertNull(methods.this.<String>getInstance().indexOfLastOrNull(predicate2AsFail, 0, 1)); }
            @DisplayName("() → boolean, int, int?")        @Test void test0ArgFromNull() { assertNull(methods.this.<String>getInstance().indexOfLastOrNull(predicate0AsFail, 0, null)); }
            @DisplayName("(T) → boolean, int, int?")       @Test void test1ArgFromNull() { assertNull(methods.this.<String>getInstance().indexOfLastOrNull(predicate1AsFail, 0, null)); }
            @DisplayName("(T, int) → boolean, int, int?")  @Test void test2ArgFromNull() { assertNull(methods.this.<String>getInstance().indexOfLastOrNull(predicate2AsFail, 0, null)); }
            @DisplayName("() → boolean, int?, int?")       @Test void test0ArgNullNull() { assertNull(methods.this.<String>getInstance().indexOfLastOrNull(predicate0AsFail, null, null)); }
            @DisplayName("(T) → boolean, int?, int?")      @Test void test1ArgNullNull() { assertNull(methods.this.<String>getInstance().indexOfLastOrNull(predicate1AsFail, null, null)); }
            @DisplayName("(T, int) → boolean, int?, int?") @Test void test2ArgNullNull() { assertNull(methods.this.<String>getInstance().indexOfLastOrNull(predicate2AsFail, null, null)); }
        }
        @Nested class indexOfLastIndexed {
            @DisplayName("() → boolean")                   @Test void test0Arg()         { assertThrowsExactly(emptyExceptionClass(), () -> methods.this.<String>getInstance().indexOfLastIndexed(predicate0AsFail)); }
            @DisplayName("(T) → boolean")                  @Test void test1Arg()         { assertThrowsExactly(emptyExceptionClass(), () -> methods.this.<String>getInstance().indexOfLastIndexed(predicate1AltAsFail)); }
            @DisplayName("(T, int) → boolean")             @Test void test2Arg()         { assertThrowsExactly(emptyExceptionClass(), () -> methods.this.<String>getInstance().indexOfLastIndexed(predicate2AltAsFail)); }
            @DisplayName("() → boolean, int")              @Test void test0ArgFrom()     { assertThrowsExactly(emptyExceptionClass(), () -> methods.this.<String>getInstance().indexOfLastIndexed(predicate0AsFail, 0)); }
            @DisplayName("(T) → boolean, int")             @Test void test1ArgFrom()     { assertThrowsExactly(emptyExceptionClass(), () -> methods.this.<String>getInstance().indexOfLastIndexed(predicate1AltAsFail, 0)); }
            @DisplayName("(T, int) → boolean, int")        @Test void test2ArgFrom()     { assertThrowsExactly(emptyExceptionClass(), () -> methods.this.<String>getInstance().indexOfLastIndexed(predicate2AltAsFail, 0)); }
            @DisplayName("() → boolean, int?")             @Test void test0ArgNull()     { assertThrowsExactly(emptyExceptionClass(), () -> methods.this.<String>getInstance().indexOfLastIndexed(predicate0AsFail, null)); }
            @DisplayName("(T) → boolean, int?")            @Test void test1ArgNull()     { assertThrowsExactly(emptyExceptionClass(), () -> methods.this.<String>getInstance().indexOfLastIndexed(predicate1AltAsFail, null)); }
            @DisplayName("(T, int) → boolean, int?")       @Test void test2ArgNull()     { assertThrowsExactly(emptyExceptionClass(), () -> methods.this.<String>getInstance().indexOfLastIndexed(predicate2AltAsFail, null)); }
            @DisplayName("() → boolean, int, int")         @Test void test0ArgFromTo()   { assertThrowsExactly(emptyExceptionClass(), () -> methods.this.<String>getInstance().indexOfLastIndexed(predicate0AsFail, 0, 1)); }
            @DisplayName("(T) → boolean, int, int")        @Test void test1ArgFromTo()   { assertThrowsExactly(emptyExceptionClass(), () -> methods.this.<String>getInstance().indexOfLastIndexed(predicate1AltAsFail, 0, 1)); }
            @DisplayName("(T, int) → boolean, int, int")   @Test void test2ArgFromTo()   { assertThrowsExactly(emptyExceptionClass(), () -> methods.this.<String>getInstance().indexOfLastIndexed(predicate2AltAsFail, 0, 1)); }
            @DisplayName("() → boolean, int, int?")        @Test void test0ArgFromNull() { assertThrowsExactly(emptyExceptionClass(), () -> methods.this.<String>getInstance().indexOfLastIndexed(predicate0AsFail, 0, null)); }
            @DisplayName("(T) → boolean, int, int?")       @Test void test1ArgFromNull() { assertThrowsExactly(emptyExceptionClass(), () -> methods.this.<String>getInstance().indexOfLastIndexed(predicate1AltAsFail, 0, null)); }
            @DisplayName("(T, int) → boolean, int, int?")  @Test void test2ArgFromNull() { assertThrowsExactly(emptyExceptionClass(), () -> methods.this.<String>getInstance().indexOfLastIndexed(predicate2AltAsFail, 0, null)); }
            @DisplayName("() → boolean, int?, int?")       @Test void test0ArgNullNull() { assertThrowsExactly(emptyExceptionClass(), () -> methods.this.<String>getInstance().indexOfLastIndexed(predicate0AsFail, null, null)); }
            @DisplayName("(T) → boolean, int?, int?")      @Test void test1ArgNullNull() { assertThrowsExactly(emptyExceptionClass(), () -> methods.this.<String>getInstance().indexOfLastIndexed(predicate1AltAsFail, null, null)); }
            @DisplayName("(T, int) → boolean, int?, int?") @Test void test2ArgNullNull() { assertThrowsExactly(emptyExceptionClass(), () -> methods.this.<String>getInstance().indexOfLastIndexed(predicate2AltAsFail, null, null)); }
        }
        @Nested class indexOfLastIndexedOrNull {
            @DisplayName("() → boolean")                   @Test void test0Arg()         { assertNull(methods.this.<String>getInstance().indexOfLastIndexedOrNull(predicate0AsFail)); }
            @DisplayName("(T) → boolean")                  @Test void test1Arg()         { assertNull(methods.this.<String>getInstance().indexOfLastIndexedOrNull(predicate1AltAsFail)); }
            @DisplayName("(T, int) → boolean")             @Test void test2Arg()         { assertNull(methods.this.<String>getInstance().indexOfLastIndexedOrNull(predicate2AltAsFail)); }
            @DisplayName("() → boolean, int")              @Test void test0ArgFrom()     { assertNull(methods.this.<String>getInstance().indexOfLastIndexedOrNull(predicate0AsFail, 0)); }
            @DisplayName("(T) → boolean, int")             @Test void test1ArgFrom()     { assertNull(methods.this.<String>getInstance().indexOfLastIndexedOrNull(predicate1AltAsFail, 0)); }
            @DisplayName("(T, int) → boolean, int")        @Test void test2ArgFrom()     { assertNull(methods.this.<String>getInstance().indexOfLastIndexedOrNull(predicate2AltAsFail, 0)); }
            @DisplayName("() → boolean, int?")             @Test void test0ArgNull()     { assertNull(methods.this.<String>getInstance().indexOfLastIndexedOrNull(predicate0AsFail, null)); }
            @DisplayName("(T) → boolean, int?")            @Test void test1ArgNull()     { assertNull(methods.this.<String>getInstance().indexOfLastIndexedOrNull(predicate1AltAsFail, null)); }
            @DisplayName("(T, int) → boolean, int?")       @Test void test2ArgNull()     { assertNull(methods.this.<String>getInstance().indexOfLastIndexedOrNull(predicate2AltAsFail, null)); }
            @DisplayName("() → boolean, int, int")         @Test void test0ArgFromTo()   { assertNull(methods.this.<String>getInstance().indexOfLastIndexedOrNull(predicate0AsFail, 0, 1)); }
            @DisplayName("(T) → boolean, int, int")        @Test void test1ArgFromTo()   { assertNull(methods.this.<String>getInstance().indexOfLastIndexedOrNull(predicate1AltAsFail, 0, 1)); }
            @DisplayName("(T, int) → boolean, int, int")   @Test void test2ArgFromTo()   { assertNull(methods.this.<String>getInstance().indexOfLastIndexedOrNull(predicate2AltAsFail, 0, 1)); }
            @DisplayName("() → boolean, int, int?")        @Test void test0ArgFromNull() { assertNull(methods.this.<String>getInstance().indexOfLastIndexedOrNull(predicate0AsFail, 0, null)); }
            @DisplayName("(T) → boolean, int, int?")       @Test void test1ArgFromNull() { assertNull(methods.this.<String>getInstance().indexOfLastIndexedOrNull(predicate1AltAsFail, 0, null)); }
            @DisplayName("(T, int) → boolean, int, int?")  @Test void test2ArgFromNull() { assertNull(methods.this.<String>getInstance().indexOfLastIndexedOrNull(predicate2AltAsFail, 0, null)); }
            @DisplayName("() → boolean, int?, int?")       @Test void test0ArgNullNull() { assertNull(methods.this.<String>getInstance().indexOfLastIndexedOrNull(predicate0AsFail, null, null)); }
            @DisplayName("(T) → boolean, int?, int?")      @Test void test1ArgNullNull() { assertNull(methods.this.<String>getInstance().indexOfLastIndexedOrNull(predicate1AltAsFail, null, null)); }
            @DisplayName("(T, int) → boolean, int?, int?") @Test void test2ArgNullNull() { assertNull(methods.this.<String>getInstance().indexOfLastIndexedOrNull(predicate2AltAsFail, null, null)); }
        }
    }

    @FieldSource("values")
//    @TestInstance(PER_CLASS)
    @ParameterizedClass(name = "{0}") @Nested class instances extends AbstractInstancesTests {

        //#region -------------------- Required test configuration --------------------

        static final Arguments[] values = everyInstancesAsArguments;

        public instances(final Class<CollectionHolderForTest<?, ?>> instanceClass) { super(instanceClass); }

        //#endregion -------------------- Required test configuration --------------------

        @ExtendWith({DisableIfNormalCondition.class, DisableIfNormalViewerCondition.class,})
        @DisplayName("get() being called") @TestInstance(PER_CLASS) @Nested class GetBeingCalled {
            boolean disableIfNormal() { return isNormal(); }
            boolean disableIfNormalViewer() { return isNormalViewer(); }

            @Nested class firstIndexOf {
                                             @Test void empty()   { assertEquals(0, newInstance(EMPTY).executeWhileExpectingEmptyException(it -> it.firstIndexOf("a")).getAmountOfCall()); }
                @DisplayName("1 field (a)")  @Test void test1_a() { assertEquals(1, newInstance(A).execute(it -> it.firstIndexOf("a")).getAmountOfCall()); }
                @DisplayName("1 field (k)")  @Test void test1_k() { assertEquals(1, newInstance(A).executeWhileExpectingIndexOutOfBound(it -> it.firstIndexOf("k")).getAmountOfCall()); }
                @DisplayName("2 fields (a)") @Test void test2_a() { assertEquals(1, newInstance(AB).execute(it -> it.firstIndexOf("a")).getAmountOfCall()); }
                @DisplayName("2 fields (k)") @Test void test2_k() { assertEquals(2, newInstance(AB).executeWhileExpectingIndexOutOfBound(it -> it.firstIndexOf("k")).getAmountOfCall()); }
                @DisplayName("4 fields (a)") @Test void test4_a() { assertEquals(1, newInstance(ABCD).execute(it -> it.firstIndexOf("a")).getAmountOfCall()); }
                @DisplayName("4 fields (k)") @Test void test4_k() { assertEquals(4, newInstance(ABCD).executeWhileExpectingIndexOutOfBound(it -> it.firstIndexOf("k")).getAmountOfCall()); }
            }
            @Nested class firstIndexOfOrNull {
                                             @Test void empty()   { assertEquals(0, newInstance(EMPTY).execute(it -> it.firstIndexOfOrNull("a")).getAmountOfCall()); }
                @DisplayName("1 field (a)")  @Test void test1_a() { assertEquals(1, newInstance(A).execute(it -> it.firstIndexOfOrNull("a")).getAmountOfCall()); }
                @DisplayName("1 field (k)")  @Test void test1_k() { assertEquals(1, newInstance(A).execute(it -> it.firstIndexOfOrNull("k")).getAmountOfCall()); }
                @DisplayName("2 fields (a)") @Test void test2_a() { assertEquals(1, newInstance(AB).execute(it -> it.firstIndexOfOrNull("a")).getAmountOfCall()); }
                @DisplayName("2 fields (k)") @Test void test2_k() { assertEquals(2, newInstance(AB).execute(it -> it.firstIndexOfOrNull("k")).getAmountOfCall()); }
                @DisplayName("4 fields (a)") @Test void test4_a() { assertEquals(1, newInstance(ABCD).execute(it -> it.firstIndexOfOrNull("a")).getAmountOfCall()); }
                @DisplayName("4 fields (k)") @Test void test4_k() { assertEquals(4, newInstance(ABCD).execute(it -> it.firstIndexOfOrNull("k")).getAmountOfCall()); }
            }

            @Nested class lastIndexOf {
                                            @Test void empty()   { assertEquals(0, newInstance(EMPTY).executeWhileExpectingEmptyException(it -> it.lastIndexOf("a")).getAmountOfCall()); }
                @DisplayName("1 field (a)") @Test void test1_a() { assertEquals(1, newInstance(A).execute(it -> it.lastIndexOf("a")).getAmountOfCall()); }
                @DisplayName("1 field (k)") @Test void test1_k() { assertEquals(1, newInstance(A).executeWhileExpectingIndexOutOfBound(it -> it.lastIndexOf("k")).getAmountOfCall()); }
                @DisplayName("2 field (b)") @Test void test2_a() { assertEquals(1, newInstance(AB).execute(it -> it.lastIndexOf("b")).getAmountOfCall()); }
                @DisplayName("2 field (k)") @Test void test2_k() { assertEquals(2, newInstance(AB).executeWhileExpectingIndexOutOfBound(it -> it.lastIndexOf("k")).getAmountOfCall()); }
                @DisplayName("4 field (d)") @Test void test4_a() { assertEquals(1, newInstance(ABCD).execute(it -> it.lastIndexOf("d")).getAmountOfCall()); }
                @DisplayName("4 field (k)") @Test void test4_k() { assertEquals(4, newInstance(ABCD).executeWhileExpectingIndexOutOfBound(it -> it.lastIndexOf("k")).getAmountOfCall()); }
            }
            @Nested class lastIndexOfOrNull {
                                            @Test void empty()   { assertEquals(0, newInstance(EMPTY).execute(it -> it.lastIndexOfOrNull("a")).getAmountOfCall()); }
                @DisplayName("1 field (a)") @Test void test1_a() { assertEquals(1, newInstance(A).execute(it -> it.lastIndexOfOrNull("a")).getAmountOfCall()); }
                @DisplayName("1 field (k)") @Test void test1_k() { assertEquals(1, newInstance(A).execute(it -> it.lastIndexOfOrNull("k")).getAmountOfCall()); }
                @DisplayName("2 field (b)") @Test void test2_a() { assertEquals(1, newInstance(AB).execute(it -> it.lastIndexOfOrNull("b")).getAmountOfCall()); }
                @DisplayName("2 field (k)") @Test void test2_k() { assertEquals(2, newInstance(AB).execute(it -> it.lastIndexOfOrNull("k")).getAmountOfCall()); }
                @DisplayName("4 field (d)") @Test void test4_a() { assertEquals(1, newInstance(ABCD).execute(it -> it.lastIndexOfOrNull("d")).getAmountOfCall()); }
                @DisplayName("4 field (k)") @Test void test4_k() { assertEquals(4, newInstance(ABCD).execute(it -> it.lastIndexOfOrNull("k")).getAmountOfCall()); }
            }

            @TestInstance(PER_CLASS) @Nested class indexOfFirst {
                @Nested class empty {
                    @DisplayName("0 arguments") @Test void test0() { assertEquals(0, newInstance(EMPTY).executeWhileExpectingEmptyException(it -> it.indexOfFirst(predicate0AsFail)).getAmountOfCall()); }
                    @DisplayName("1 argument")  @Test void test1() { assertEquals(0, newInstance(EMPTY).executeWhileExpectingEmptyException(it -> it.indexOfFirst(predicate1AsFail)).getAmountOfCall()); }
                    @DisplayName("2 arguments") @Test void test2() { assertEquals(0, newInstance(EMPTY).executeWhileExpectingEmptyException(it -> it.indexOfFirst(predicate2AsFail)).getAmountOfCall()); }
                }
                @DisplayName("1 field") @Nested class Test1 {
                    @DisplayName("true: 0 arguments")  @Test void true0()  { assertEquals(0, newInstance(A).execute(                             it -> it.indexOfFirst(callback0AsTrue)).getAmountOfCall()); }
                    @DisplayName("true: 1 argument")   @Test void true1()  { assertEquals(1, newInstance(A).execute(                             it -> it.indexOfFirst(callback1AsTrue)).getAmountOfCall()); }
                    @DisplayName("true: 2 arguments")  @Test void true2()  { assertEquals(1, newInstance(A).execute(                             it -> it.indexOfFirst(callback2AsTrue)).getAmountOfCall()); }
                    @DisplayName("false: 0 arguments") @Test void false0() { assertEquals(0, newInstance(A).executeWhileExpectingIndexOutOfBound(it -> it.indexOfFirst(callback0AsFalse)).getAmountOfCall()); }
                    @DisplayName("false: 1 argument")  @Test void false1() { assertEquals(1, newInstance(A).executeWhileExpectingIndexOutOfBound(it -> it.indexOfFirst(callback1AsFalse)).getAmountOfCall()); }
                    @DisplayName("false: 2 arguments") @Test void false2() { assertEquals(1, newInstance(A).executeWhileExpectingIndexOutOfBound(it -> it.indexOfFirst(callback2AsFalse)).getAmountOfCall()); }
                }
                @DisplayName("2 fields") @Nested class Test2 {
                    @DisplayName("true: 0 arguments")  @Test void true0()  { assertEquals(0, newInstance(AB).execute(                             it -> it.indexOfFirst(callback0AsTrue)).getAmountOfCall()); }
                    @DisplayName("true: 1 argument")   @Test void true1()  { assertEquals(1, newInstance(AB).execute(                             it -> it.indexOfFirst(callback1AsTrue)).getAmountOfCall()); }
                    @DisplayName("true: 2 arguments")  @Test void true2()  { assertEquals(1, newInstance(AB).execute(                             it -> it.indexOfFirst(callback2AsTrue)).getAmountOfCall()); }
                    @DisplayName("false: 0 arguments") @Test void false0() { assertEquals(0, newInstance(AB).executeWhileExpectingIndexOutOfBound(it -> it.indexOfFirst(callback0AsFalse)).getAmountOfCall()); }
                    @DisplayName("false: 1 argument")  @Test void false1() { assertEquals(2, newInstance(AB).executeWhileExpectingIndexOutOfBound(it -> it.indexOfFirst(callback1AsFalse)).getAmountOfCall()); }
                    @DisplayName("false: 2 arguments") @Test void false2() { assertEquals(2, newInstance(AB).executeWhileExpectingIndexOutOfBound(it -> it.indexOfFirst(callback2AsFalse)).getAmountOfCall()); }
                }
                @DisplayName("4 fields") @Nested class Test4 {
                    @DisplayName("true: 0 arguments")  @Test void true0()  { assertEquals(0, newInstance(ABCD).execute(                             it -> it.indexOfFirst(callback0AsTrue)).getAmountOfCall()); }
                    @DisplayName("true: 1 argument")   @Test void true1()  { assertEquals(1, newInstance(ABCD).execute(                             it -> it.indexOfFirst(callback1AsTrue)).getAmountOfCall()); }
                    @DisplayName("true: 2 arguments")  @Test void true2()  { assertEquals(1, newInstance(ABCD).execute(                             it -> it.indexOfFirst(callback2AsTrue)).getAmountOfCall()); }
                    @DisplayName("false: 0 arguments") @Test void false0() { assertEquals(0, newInstance(ABCD).executeWhileExpectingIndexOutOfBound(it -> it.indexOfFirst(callback0AsFalse)).getAmountOfCall()); }
                    @DisplayName("false: 1 argument")  @Test void false1() { assertEquals(4, newInstance(ABCD).executeWhileExpectingIndexOutOfBound(it -> it.indexOfFirst(callback1AsFalse)).getAmountOfCall()); }
                    @DisplayName("false: 2 arguments") @Test void false2() { assertEquals(4, newInstance(ABCD).executeWhileExpectingIndexOutOfBound(it -> it.indexOfFirst(callback2AsFalse)).getAmountOfCall()); }
                }
            }
            @TestInstance(PER_CLASS) @Nested class indexOfFirstOrNull {
                @Nested class empty {
                    @DisplayName("0 arguments") @Test void test0() { assertEquals(0, newInstance(EMPTY).execute(it -> it.indexOfFirstOrNull(predicate0AsFail)).getAmountOfCall()); }
                    @DisplayName("1 argument")  @Test void test1() { assertEquals(0, newInstance(EMPTY).execute(it -> it.indexOfFirstOrNull(predicate1AsFail)).getAmountOfCall()); }
                    @DisplayName("2 arguments") @Test void test2() { assertEquals(0, newInstance(EMPTY).execute(it -> it.indexOfFirstOrNull(predicate2AsFail)).getAmountOfCall()); }
                }
                @DisplayName("1 field") @Nested class Test1 {
                    @DisplayName("true: 0 arguments")  @Test void true0()  { assertEquals(0, newInstance(A).execute(it -> it.indexOfFirstOrNull(callback0AsTrue)).getAmountOfCall()); }
                    @DisplayName("true: 1 argument")   @Test void true1()  { assertEquals(1, newInstance(A).execute(it -> it.indexOfFirstOrNull(callback1AsTrue)).getAmountOfCall()); }
                    @DisplayName("true: 2 arguments")  @Test void true2()  { assertEquals(1, newInstance(A).execute(it -> it.indexOfFirstOrNull(callback2AsTrue)).getAmountOfCall()); }
                    @DisplayName("false: 0 arguments") @Test void false0() { assertEquals(0, newInstance(A).execute(it -> it.indexOfFirstOrNull(callback0AsFalse)).getAmountOfCall()); }
                    @DisplayName("false: 1 argument")  @Test void false1() { assertEquals(1, newInstance(A).execute(it -> it.indexOfFirstOrNull(callback1AsFalse)).getAmountOfCall()); }
                    @DisplayName("false: 2 arguments") @Test void false2() { assertEquals(1, newInstance(A).execute(it -> it.indexOfFirstOrNull(callback2AsFalse)).getAmountOfCall()); }
                }
                @DisplayName("2 fields") @Nested class Test2 {
                    @DisplayName("true: 0 arguments")  @Test void true0()  { assertEquals(0, newInstance(AB).execute(it -> it.indexOfFirstOrNull(callback0AsTrue)).getAmountOfCall()); }
                    @DisplayName("true: 1 argument")   @Test void true1()  { assertEquals(1, newInstance(AB).execute(it -> it.indexOfFirstOrNull(callback1AsTrue)).getAmountOfCall()); }
                    @DisplayName("true: 2 arguments")  @Test void true2()  { assertEquals(1, newInstance(AB).execute(it -> it.indexOfFirstOrNull(callback2AsTrue)).getAmountOfCall()); }
                    @DisplayName("false: 0 arguments") @Test void false0() { assertEquals(0, newInstance(AB).execute(it -> it.indexOfFirstOrNull(callback0AsFalse)).getAmountOfCall()); }
                    @DisplayName("false: 1 argument")  @Test void false1() { assertEquals(2, newInstance(AB).execute(it -> it.indexOfFirstOrNull(callback1AsFalse)).getAmountOfCall()); }
                    @DisplayName("false: 2 arguments") @Test void false2() { assertEquals(2, newInstance(AB).execute(it -> it.indexOfFirstOrNull(callback2AsFalse)).getAmountOfCall()); }
                }
                @DisplayName("4 fields") @Nested class Test4 {
                    @DisplayName("true: 0 arguments")  @Test void true0()  { assertEquals(0, newInstance(ABCD).execute(it -> it.indexOfFirstOrNull(callback0AsTrue)).getAmountOfCall()); }
                    @DisplayName("true: 1 argument")   @Test void true1()  { assertEquals(1, newInstance(ABCD).execute(it -> it.indexOfFirstOrNull(callback1AsTrue)).getAmountOfCall()); }
                    @DisplayName("true: 2 arguments")  @Test void true2()  { assertEquals(1, newInstance(ABCD).execute(it -> it.indexOfFirstOrNull(callback2AsTrue)).getAmountOfCall()); }
                    @DisplayName("false: 0 arguments") @Test void false0() { assertEquals(0, newInstance(ABCD).execute(it -> it.indexOfFirstOrNull(callback0AsFalse)).getAmountOfCall()); }
                    @DisplayName("false: 1 argument")  @Test void false1() { assertEquals(4, newInstance(ABCD).execute(it -> it.indexOfFirstOrNull(callback1AsFalse)).getAmountOfCall()); }
                    @DisplayName("false: 2 arguments") @Test void false2() { assertEquals(4, newInstance(ABCD).execute(it -> it.indexOfFirstOrNull(callback2AsFalse)).getAmountOfCall()); }
                }
            }
            @TestInstance(PER_CLASS) @Nested class indexOfFirstIndexed {
                @Nested class empty {
                    @DisplayName("0 arguments") @Test void test0() { assertEquals(0, newInstance(EMPTY).executeWhileExpectingEmptyException(it -> it.indexOfFirstIndexed(predicate0AsFail)).getAmountOfCall()); }
                    @DisplayName("1 argument")  @Test void test1() { assertEquals(0, newInstance(EMPTY).executeWhileExpectingEmptyException(it -> it.indexOfFirstIndexed(predicate1AltAsFail)).getAmountOfCall()); }
                    @DisplayName("2 arguments") @Test void test2() { assertEquals(0, newInstance(EMPTY).executeWhileExpectingEmptyException(it -> it.indexOfFirstIndexed(predicate2AltAsFail)).getAmountOfCall()); }
                }
                @DisplayName("1 field") @Nested class Test1 {
                    @DisplayName("true: 0 arguments")  @Test void true0()  { assertEquals(0, newInstance(A).execute(                             it -> it.indexOfFirstIndexed(callback0AsTrue)).getAmountOfCall()); }
                    @DisplayName("true: 1 argument")   @Test void true1()  { assertEquals(0, newInstance(A).execute(                             it -> it.indexOfFirstIndexed(callback1AltAsTrue)).getAmountOfCall()); }
                    @DisplayName("true: 2 arguments")  @Test void true2()  { assertEquals(1, newInstance(A).execute(                             it -> it.indexOfFirstIndexed(callback2AltAsTrue)).getAmountOfCall()); }
                    @DisplayName("false: 0 arguments") @Test void false0() { assertEquals(0, newInstance(A).executeWhileExpectingIndexOutOfBound(it -> it.indexOfFirstIndexed(callback0AsFalse)).getAmountOfCall()); }
                    @DisplayName("false: 1 argument")  @Test void false1() { assertEquals(0, newInstance(A).executeWhileExpectingIndexOutOfBound(it -> it.indexOfFirstIndexed(callback1AltAsFalse)).getAmountOfCall()); }
                    @DisplayName("false: 2 arguments") @Test void false2() { assertEquals(1, newInstance(A).executeWhileExpectingIndexOutOfBound(it -> it.indexOfFirstIndexed(callback2AltAsFalse)).getAmountOfCall()); }
                }
                @DisplayName("2 fields") @Nested class Test2 {
                    @DisplayName("true: 0 arguments")  @Test void true0()  { assertEquals(0, newInstance(AB).execute(                             it -> it.indexOfFirstIndexed(callback0AsTrue)).getAmountOfCall()); }
                    @DisplayName("true: 1 argument")   @Test void true1()  { assertEquals(0, newInstance(AB).execute(                             it -> it.indexOfFirstIndexed(callback1AltAsTrue)).getAmountOfCall()); }
                    @DisplayName("true: 2 arguments")  @Test void true2()  { assertEquals(1, newInstance(AB).execute(                             it -> it.indexOfFirstIndexed(callback2AltAsTrue)).getAmountOfCall()); }
                    @DisplayName("false: 0 arguments") @Test void false0() { assertEquals(0, newInstance(AB).executeWhileExpectingIndexOutOfBound(it -> it.indexOfFirstIndexed(callback0AsFalse)).getAmountOfCall()); }
                    @DisplayName("false: 1 argument")  @Test void false1() { assertEquals(0, newInstance(AB).executeWhileExpectingIndexOutOfBound(it -> it.indexOfFirstIndexed(callback1AltAsFalse)).getAmountOfCall()); }
                    @DisplayName("false: 2 arguments") @Test void false2() { assertEquals(2, newInstance(AB).executeWhileExpectingIndexOutOfBound(it -> it.indexOfFirstIndexed(callback2AltAsFalse)).getAmountOfCall()); }
                }
                @DisplayName("4 fields") @Nested class Test4 {
                    @DisplayName("true: 0 arguments")  @Test void true0()  { assertEquals(0, newInstance(ABCD).execute(                             it -> it.indexOfFirstIndexed(callback0AsTrue)).getAmountOfCall()); }
                    @DisplayName("true: 1 argument")   @Test void true1()  { assertEquals(0, newInstance(ABCD).execute(                             it -> it.indexOfFirstIndexed(callback1AltAsTrue)).getAmountOfCall()); }
                    @DisplayName("true: 2 arguments")  @Test void true2()  { assertEquals(1, newInstance(ABCD).execute(                             it -> it.indexOfFirstIndexed(callback2AltAsTrue)).getAmountOfCall()); }
                    @DisplayName("false: 0 arguments") @Test void false0() { assertEquals(0, newInstance(ABCD).executeWhileExpectingIndexOutOfBound(it -> it.indexOfFirstIndexed(callback0AsFalse)).getAmountOfCall()); }
                    @DisplayName("false: 1 argument")  @Test void false1() { assertEquals(0, newInstance(ABCD).executeWhileExpectingIndexOutOfBound(it -> it.indexOfFirstIndexed(callback1AltAsFalse)).getAmountOfCall()); }
                    @DisplayName("false: 2 arguments") @Test void false2() { assertEquals(4, newInstance(ABCD).executeWhileExpectingIndexOutOfBound(it -> it.indexOfFirstIndexed(callback2AltAsFalse)).getAmountOfCall()); }
                }
            }
            @TestInstance(PER_CLASS) @Nested class indexOfFirstIndexedOrNull {
                @Nested class empty {
                    @DisplayName("0 arguments") @Test void test0() { assertEquals(0, newInstance(EMPTY).execute(it -> it.indexOfFirstIndexedOrNull(predicate0AsFail)).getAmountOfCall()); }
                    @DisplayName("1 argument")  @Test void test1() { assertEquals(0, newInstance(EMPTY).execute(it -> it.indexOfFirstIndexedOrNull(predicate1AltAsFail)).getAmountOfCall()); }
                    @DisplayName("2 arguments") @Test void test2() { assertEquals(0, newInstance(EMPTY).execute(it -> it.indexOfFirstIndexedOrNull(predicate2AltAsFail)).getAmountOfCall()); }
                }
                @DisplayName("1 field") @Nested class Test1 {
                    @DisplayName("true: 0 arguments")  @Test void true0()  { assertEquals(0, newInstance(A).execute(it -> it.indexOfFirstIndexedOrNull(callback0AsTrue)).getAmountOfCall()); }
                    @DisplayName("true: 1 argument")   @Test void true1()  { assertEquals(0, newInstance(A).execute(it -> it.indexOfFirstIndexedOrNull(callback1AltAsTrue)).getAmountOfCall()); }
                    @DisplayName("true: 2 arguments")  @Test void true2()  { assertEquals(1, newInstance(A).execute(it -> it.indexOfFirstIndexedOrNull(callback2AltAsTrue)).getAmountOfCall()); }
                    @DisplayName("false: 0 arguments") @Test void false0() { assertEquals(0, newInstance(A).execute(it -> it.indexOfFirstIndexedOrNull(callback0AsFalse)).getAmountOfCall()); }
                    @DisplayName("false: 1 argument")  @Test void false1() { assertEquals(0, newInstance(A).execute(it -> it.indexOfFirstIndexedOrNull(callback1AltAsFalse)).getAmountOfCall()); }
                    @DisplayName("false: 2 arguments") @Test void false2() { assertEquals(1, newInstance(A).execute(it -> it.indexOfFirstIndexedOrNull(callback2AltAsFalse)).getAmountOfCall()); }
                }
                @DisplayName("2 fields") @Nested class Test2 {
                    @DisplayName("true: 0 arguments")  @Test void true0()  { assertEquals(0, newInstance(AB).execute(it -> it.indexOfFirstIndexedOrNull(callback0AsTrue)).getAmountOfCall()); }
                    @DisplayName("true: 1 argument")   @Test void true1()  { assertEquals(0, newInstance(AB).execute(it -> it.indexOfFirstIndexedOrNull(callback1AltAsTrue)).getAmountOfCall()); }
                    @DisplayName("true: 2 arguments")  @Test void true2()  { assertEquals(1, newInstance(AB).execute(it -> it.indexOfFirstIndexedOrNull(callback2AltAsTrue)).getAmountOfCall()); }
                    @DisplayName("false: 0 arguments") @Test void false0() { assertEquals(0, newInstance(AB).execute(it -> it.indexOfFirstIndexedOrNull(callback0AsFalse)).getAmountOfCall()); }
                    @DisplayName("false: 1 argument")  @Test void false1() { assertEquals(0, newInstance(AB).execute(it -> it.indexOfFirstIndexedOrNull(callback1AltAsFalse)).getAmountOfCall()); }
                    @DisplayName("false: 2 arguments") @Test void false2() { assertEquals(2, newInstance(AB).execute(it -> it.indexOfFirstIndexedOrNull(callback2AltAsFalse)).getAmountOfCall()); }
                }
                @DisplayName("4 fields") @Nested class Test4 {
                    @DisplayName("true: 0 arguments")  @Test void true0()  { assertEquals(0, newInstance(ABCD).execute(it -> it.indexOfFirstIndexedOrNull(callback0AsTrue)).getAmountOfCall()); }
                    @DisplayName("true: 1 argument")   @Test void true1()  { assertEquals(0, newInstance(ABCD).execute(it -> it.indexOfFirstIndexedOrNull(callback1AltAsTrue)).getAmountOfCall()); }
                    @DisplayName("true: 2 arguments")  @Test void true2()  { assertEquals(1, newInstance(ABCD).execute(it -> it.indexOfFirstIndexedOrNull(callback2AltAsTrue)).getAmountOfCall()); }
                    @DisplayName("false: 0 arguments") @Test void false0() { assertEquals(0, newInstance(ABCD).execute(it -> it.indexOfFirstIndexedOrNull(callback0AsFalse)).getAmountOfCall()); }
                    @DisplayName("false: 1 argument")  @Test void false1() { assertEquals(0, newInstance(ABCD).execute(it -> it.indexOfFirstIndexedOrNull(callback1AltAsTrue)).getAmountOfCall()); }
                    @DisplayName("false: 2 arguments") @Test void false2() { assertEquals(4, newInstance(ABCD).execute(it -> it.indexOfFirstIndexedOrNull(callback2AltAsFalse)).getAmountOfCall()); }
                }
            }

            @TestInstance(PER_CLASS) @Nested class indexOfLast {
                @Nested class empty {
                    @DisplayName("0 arguments") @Test void test0() { assertEquals(0, newInstance(EMPTY).executeWhileExpectingEmptyException(it -> it.indexOfLast(predicate0AsFail)).getAmountOfCall()); }
                    @DisplayName("1 argument")  @Test void test1() { assertEquals(0, newInstance(EMPTY).executeWhileExpectingEmptyException(it -> it.indexOfLast(predicate1AsFail)).getAmountOfCall()); }
                    @DisplayName("2 arguments") @Test void test2() { assertEquals(0, newInstance(EMPTY).executeWhileExpectingEmptyException(it -> it.indexOfLast(predicate2AsFail)).getAmountOfCall()); }
                }
                @DisplayName("1 field") @Nested class Test1 {
                    @DisplayName("true: 0 arguments")  @Test void true0()  { assertEquals(0, newInstance(A).execute(                             it -> it.indexOfLast(callback0AsTrue)).getAmountOfCall()); }
                    @DisplayName("true: 1 argument")   @Test void true1()  { assertEquals(1, newInstance(A).execute(                             it -> it.indexOfLast(callback1AsTrue)).getAmountOfCall()); }
                    @DisplayName("true: 2 arguments")  @Test void true2()  { assertEquals(1, newInstance(A).execute(                             it -> it.indexOfLast(callback2AsTrue)).getAmountOfCall()); }
                    @DisplayName("false: 0 arguments") @Test void false0() { assertEquals(0, newInstance(A).executeWhileExpectingIndexOutOfBound(it -> it.indexOfLast(callback0AsFalse)).getAmountOfCall()); }
                    @DisplayName("false: 1 argument")  @Test void false1() { assertEquals(1, newInstance(A).executeWhileExpectingIndexOutOfBound(it -> it.indexOfLast(callback1AsFalse)).getAmountOfCall()); }
                    @DisplayName("false: 2 arguments") @Test void false2() { assertEquals(1, newInstance(A).executeWhileExpectingIndexOutOfBound(it -> it.indexOfLast(callback2AsFalse)).getAmountOfCall()); }
                }
                @DisplayName("2 fields") @Nested class Test2 {
                    @DisplayName("true: 0 arguments")  @Test void true0()  { assertEquals(0, newInstance(AB).execute(                             it -> it.indexOfLast(callback0AsTrue)).getAmountOfCall()); }
                    @DisplayName("true: 1 argument")   @Test void true1()  { assertEquals(1, newInstance(AB).execute(                             it -> it.indexOfLast(callback1AsTrue)).getAmountOfCall()); }
                    @DisplayName("true: 2 arguments")  @Test void true2()  { assertEquals(1, newInstance(AB).execute(                             it -> it.indexOfLast(callback2AsTrue)).getAmountOfCall()); }
                    @DisplayName("false: 0 arguments") @Test void false0() { assertEquals(0, newInstance(AB).executeWhileExpectingIndexOutOfBound(it -> it.indexOfLast(callback0AsFalse)).getAmountOfCall()); }
                    @DisplayName("false: 1 argument")  @Test void false1() { assertEquals(2, newInstance(AB).executeWhileExpectingIndexOutOfBound(it -> it.indexOfLast(callback1AsFalse)).getAmountOfCall()); }
                    @DisplayName("false: 2 arguments") @Test void false2() { assertEquals(2, newInstance(AB).executeWhileExpectingIndexOutOfBound(it -> it.indexOfLast(callback2AsFalse)).getAmountOfCall()); }
                }
                @DisplayName("4 fields") @Nested class Test4 {
                    @DisplayName("true: 0 arguments")  @Test void true0()  { assertEquals(0, newInstance(ABCD).execute(                             it -> it.indexOfLast(callback0AsTrue)).getAmountOfCall()); }
                    @DisplayName("true: 1 argument")   @Test void true1()  { assertEquals(1, newInstance(ABCD).execute(                             it -> it.indexOfLast(callback1AsTrue)).getAmountOfCall()); }
                    @DisplayName("true: 2 arguments")  @Test void true2()  { assertEquals(1, newInstance(ABCD).execute(                             it -> it.indexOfLast(callback2AsTrue)).getAmountOfCall()); }
                    @DisplayName("false: 0 arguments") @Test void false0() { assertEquals(0, newInstance(ABCD).executeWhileExpectingIndexOutOfBound(it -> it.indexOfLast(callback0AsFalse)).getAmountOfCall()); }
                    @DisplayName("false: 1 argument")  @Test void false1() { assertEquals(4, newInstance(ABCD).executeWhileExpectingIndexOutOfBound(it -> it.indexOfLast(callback1AsFalse)).getAmountOfCall()); }
                    @DisplayName("false: 2 arguments") @Test void false2() { assertEquals(4, newInstance(ABCD).executeWhileExpectingIndexOutOfBound(it -> it.indexOfLast(callback2AsFalse)).getAmountOfCall()); }
                }
            }
            @TestInstance(PER_CLASS) @Nested class indexOfLastOrNull {
                @Nested class empty {
                    @DisplayName("0 arguments") @Test void test0() { assertEquals(0, newInstance(EMPTY).execute(it -> it.indexOfLastOrNull(predicate0AsFail)).getAmountOfCall()); }
                    @DisplayName("1 argument")  @Test void test1() { assertEquals(0, newInstance(EMPTY).execute(it -> it.indexOfLastOrNull(predicate1AsFail)).getAmountOfCall()); }
                    @DisplayName("2 arguments") @Test void test2() { assertEquals(0, newInstance(EMPTY).execute(it -> it.indexOfLastOrNull(predicate2AsFail)).getAmountOfCall()); }
                }
                @DisplayName("1 field") @Nested class Test1 {
                    @DisplayName("true: 0 arguments")  @Test void true0()  { assertEquals(0, newInstance(A).execute(it -> it.indexOfLastOrNull(callback0AsTrue)).getAmountOfCall()); }
                    @DisplayName("true: 1 argument")   @Test void true1()  { assertEquals(1, newInstance(A).execute(it -> it.indexOfLastOrNull(callback1AsTrue)).getAmountOfCall()); }
                    @DisplayName("true: 2 arguments")  @Test void true2()  { assertEquals(1, newInstance(A).execute(it -> it.indexOfLastOrNull(callback2AsTrue)).getAmountOfCall()); }
                    @DisplayName("false: 0 arguments") @Test void false0() { assertEquals(0, newInstance(A).execute(it -> it.indexOfLastOrNull(callback0AsFalse)).getAmountOfCall()); }
                    @DisplayName("false: 1 argument")  @Test void false1() { assertEquals(1, newInstance(A).execute(it -> it.indexOfLastOrNull(callback1AsFalse)).getAmountOfCall()); }
                    @DisplayName("false: 2 arguments") @Test void false2() { assertEquals(1, newInstance(A).execute(it -> it.indexOfLastOrNull(callback2AsFalse)).getAmountOfCall()); }
                }
                @DisplayName("2 fields") @Nested class Test2 {
                    @DisplayName("true: 0 arguments")  @Test void true0()  { assertEquals(0, newInstance(AB).execute(it -> it.indexOfLastOrNull(callback0AsTrue)).getAmountOfCall()); }
                    @DisplayName("true: 1 argument")   @Test void true1()  { assertEquals(1, newInstance(AB).execute(it -> it.indexOfLastOrNull(callback1AsTrue)).getAmountOfCall()); }
                    @DisplayName("true: 2 arguments")  @Test void true2()  { assertEquals(1, newInstance(AB).execute(it -> it.indexOfLastOrNull(callback2AsTrue)).getAmountOfCall()); }
                    @DisplayName("false: 0 arguments") @Test void false0() { assertEquals(0, newInstance(AB).execute(it -> it.indexOfLastOrNull(callback0AsFalse)).getAmountOfCall()); }
                    @DisplayName("false: 1 argument")  @Test void false1() { assertEquals(2, newInstance(AB).execute(it -> it.indexOfLastOrNull(callback1AsFalse)).getAmountOfCall()); }
                    @DisplayName("false: 2 arguments") @Test void false2() { assertEquals(2, newInstance(AB).execute(it -> it.indexOfLastOrNull(callback2AsFalse)).getAmountOfCall()); }
                }
                @DisplayName("4 fields") @Nested class Test4 {
                    @DisplayName("true: 0 arguments")  @Test void true0()  { assertEquals(0, newInstance(ABCD).execute(it -> it.indexOfLastOrNull(callback0AsTrue)).getAmountOfCall()); }
                    @DisplayName("true: 1 argument")   @Test void true1()  { assertEquals(1, newInstance(ABCD).execute(it -> it.indexOfLastOrNull(callback1AsTrue)).getAmountOfCall()); }
                    @DisplayName("true: 2 arguments")  @Test void true2()  { assertEquals(1, newInstance(ABCD).execute(it -> it.indexOfLastOrNull(callback2AsTrue)).getAmountOfCall()); }
                    @DisplayName("false: 0 arguments") @Test void false0() { assertEquals(0, newInstance(ABCD).execute(it -> it.indexOfLastOrNull(callback0AsFalse)).getAmountOfCall()); }
                    @DisplayName("false: 1 argument")  @Test void false1() { assertEquals(4, newInstance(ABCD).execute(it -> it.indexOfLastOrNull(callback1AsFalse)).getAmountOfCall()); }
                    @DisplayName("false: 2 arguments") @Test void false2() { assertEquals(4, newInstance(ABCD).execute(it -> it.indexOfLastOrNull(callback2AsFalse)).getAmountOfCall()); }
                }
            }
            @TestInstance(PER_CLASS) @Nested class indexOfLastIndexed {
                @Nested class empty {
                    @DisplayName("0 arguments") @Test void test0() { assertEquals(0, newInstance(EMPTY).executeWhileExpectingEmptyException(it -> it.indexOfLastIndexed(predicate0AsFail)).getAmountOfCall()); }
                    @DisplayName("1 argument")  @Test void test1() { assertEquals(0, newInstance(EMPTY).executeWhileExpectingEmptyException(it -> it.indexOfLastIndexed(predicate1AltAsFail)).getAmountOfCall()); }
                    @DisplayName("2 arguments") @Test void test2() { assertEquals(0, newInstance(EMPTY).executeWhileExpectingEmptyException(it -> it.indexOfLastIndexed(predicate2AltAsFail)).getAmountOfCall()); }
                }
                @DisplayName("1 field") @Nested class Test1 {
                    @DisplayName("true: 0 arguments")  @Test void true0()  { assertEquals(0, newInstance(A).execute(                             it -> it.indexOfLastIndexed(callback0AsTrue)).getAmountOfCall()); }
                    @DisplayName("true: 1 argument")   @Test void true1()  { assertEquals(0, newInstance(A).execute(                             it -> it.indexOfLastIndexed(callback1AltAsTrue)).getAmountOfCall()); }
                    @DisplayName("true: 2 arguments")  @Test void true2()  { assertEquals(1, newInstance(A).execute(                             it -> it.indexOfLastIndexed(callback2AltAsTrue)).getAmountOfCall()); }
                    @DisplayName("false: 0 arguments") @Test void false0() { assertEquals(0, newInstance(A).executeWhileExpectingIndexOutOfBound(it -> it.indexOfLastIndexed(callback0AsFalse)).getAmountOfCall()); }
                    @DisplayName("false: 1 argument")  @Test void false1() { assertEquals(0, newInstance(A).executeWhileExpectingIndexOutOfBound(it -> it.indexOfLastIndexed(callback1AltAsFalse)).getAmountOfCall()); }
                    @DisplayName("false: 2 arguments") @Test void false2() { assertEquals(1, newInstance(A).executeWhileExpectingIndexOutOfBound(it -> it.indexOfLastIndexed(callback2AltAsFalse)).getAmountOfCall()); }
                }
                @DisplayName("2 fields") @Nested class Test2 {
                    @DisplayName("true: 0 arguments")  @Test void true0()  { assertEquals(0, newInstance(AB).execute(                             it -> it.indexOfLastIndexed(callback0AsTrue)).getAmountOfCall()); }
                    @DisplayName("true: 1 argument")   @Test void true1()  { assertEquals(0, newInstance(AB).execute(                             it -> it.indexOfLastIndexed(callback1AltAsTrue)).getAmountOfCall()); }
                    @DisplayName("true: 2 arguments")  @Test void true2()  { assertEquals(1, newInstance(AB).execute(                             it -> it.indexOfLastIndexed(callback2AltAsTrue)).getAmountOfCall()); }
                    @DisplayName("false: 0 arguments") @Test void false0() { assertEquals(0, newInstance(AB).executeWhileExpectingIndexOutOfBound(it -> it.indexOfLastIndexed(callback0AsFalse)).getAmountOfCall()); }
                    @DisplayName("false: 1 argument")  @Test void false1() { assertEquals(0, newInstance(AB).executeWhileExpectingIndexOutOfBound(it -> it.indexOfLastIndexed(callback1AltAsFalse)).getAmountOfCall()); }
                    @DisplayName("false: 2 arguments") @Test void false2() { assertEquals(2, newInstance(AB).executeWhileExpectingIndexOutOfBound(it -> it.indexOfLastIndexed(callback2AltAsFalse)).getAmountOfCall()); }
                }
                @DisplayName("4 fields") @Nested class Test4 {
                    @DisplayName("true: 0 arguments")  @Test void true0()  { assertEquals(0, newInstance(ABCD).execute(                             it -> it.indexOfLastIndexed(callback0AsTrue)).getAmountOfCall()); }
                    @DisplayName("true: 1 argument")   @Test void true1()  { assertEquals(0, newInstance(ABCD).execute(                             it -> it.indexOfLastIndexed(callback1AltAsTrue)).getAmountOfCall()); }
                    @DisplayName("true: 2 arguments")  @Test void true2()  { assertEquals(1, newInstance(ABCD).execute(                             it -> it.indexOfLastIndexed(callback2AltAsTrue)).getAmountOfCall()); }
                    @DisplayName("false: 0 arguments") @Test void false0() { assertEquals(0, newInstance(ABCD).executeWhileExpectingIndexOutOfBound(it -> it.indexOfLastIndexed(callback0AsFalse)).getAmountOfCall()); }
                    @DisplayName("false: 1 argument")  @Test void false1() { assertEquals(0, newInstance(ABCD).executeWhileExpectingIndexOutOfBound(it -> it.indexOfLastIndexed(callback1AltAsFalse)).getAmountOfCall()); }
                    @DisplayName("false: 2 arguments") @Test void false2() { assertEquals(4, newInstance(ABCD).executeWhileExpectingIndexOutOfBound(it -> it.indexOfLastIndexed(callback2AltAsFalse)).getAmountOfCall()); }
                }
            }
            @TestInstance(PER_CLASS) @Nested class indexOfLastIndexedOrNull {
                @Nested class empty {
                    @DisplayName("0 arguments") @Test void test0() { assertEquals(0, newInstance(EMPTY).execute(it -> it.indexOfLastIndexedOrNull(predicate0AsFail)).getAmountOfCall()); }
                    @DisplayName("1 argument")  @Test void test1() { assertEquals(0, newInstance(EMPTY).execute(it -> it.indexOfLastIndexedOrNull(predicate1AltAsFail)).getAmountOfCall()); }
                    @DisplayName("2 arguments") @Test void test2() { assertEquals(0, newInstance(EMPTY).execute(it -> it.indexOfLastIndexedOrNull(predicate2AltAsFail)).getAmountOfCall()); }
                }
                @DisplayName("1 field") @Nested class Test1 {
                    @DisplayName("true: 0 arguments")  @Test void true0()  { assertEquals(0, newInstance(A).execute(it -> it.indexOfLastIndexedOrNull(callback0AsTrue)).getAmountOfCall()); }
                    @DisplayName("true: 1 argument")   @Test void true1()  { assertEquals(0, newInstance(A).execute(it -> it.indexOfLastIndexedOrNull(callback1AltAsTrue)).getAmountOfCall()); }
                    @DisplayName("true: 2 arguments")  @Test void true2()  { assertEquals(1, newInstance(A).execute(it -> it.indexOfLastIndexedOrNull(callback2AltAsTrue)).getAmountOfCall()); }
                    @DisplayName("false: 0 arguments") @Test void false0() { assertEquals(0, newInstance(A).execute(it -> it.indexOfLastIndexedOrNull(callback0AsFalse)).getAmountOfCall()); }
                    @DisplayName("false: 1 argument")  @Test void false1() { assertEquals(0, newInstance(A).execute(it -> it.indexOfLastIndexedOrNull(callback1AltAsFalse)).getAmountOfCall()); }
                    @DisplayName("false: 2 arguments") @Test void false2() { assertEquals(1, newInstance(A).execute(it -> it.indexOfLastIndexedOrNull(callback2AltAsFalse)).getAmountOfCall()); }
                }
                @DisplayName("2 fields") @Nested class Test2 {
                    @DisplayName("true: 0 arguments")  @Test void true0()  { assertEquals(0, newInstance(AB).execute(it -> it.indexOfLastIndexedOrNull(callback0AsTrue)).getAmountOfCall()); }
                    @DisplayName("true: 1 argument")   @Test void true1()  { assertEquals(0, newInstance(AB).execute(it -> it.indexOfLastIndexedOrNull(callback1AltAsTrue)).getAmountOfCall()); }
                    @DisplayName("true: 2 arguments")  @Test void true2()  { assertEquals(1, newInstance(AB).execute(it -> it.indexOfLastIndexedOrNull(callback2AltAsTrue)).getAmountOfCall()); }
                    @DisplayName("false: 0 arguments") @Test void false0() { assertEquals(0, newInstance(AB).execute(it -> it.indexOfLastIndexedOrNull(callback0AsFalse)).getAmountOfCall()); }
                    @DisplayName("false: 1 argument")  @Test void false1() { assertEquals(0, newInstance(AB).execute(it -> it.indexOfLastIndexedOrNull(callback1AltAsFalse)).getAmountOfCall()); }
                    @DisplayName("false: 2 arguments") @Test void false2() { assertEquals(2, newInstance(AB).execute(it -> it.indexOfLastIndexedOrNull(callback2AltAsFalse)).getAmountOfCall()); }
                }
                @DisplayName("4 fields") @Nested class Test4 {
                    @DisplayName("true: 0 arguments")  @Test void true0()  { assertEquals(0, newInstance(ABCD).execute(it -> it.indexOfLastIndexedOrNull(callback0AsTrue)).getAmountOfCall()); }
                    @DisplayName("true: 1 argument")   @Test void true1()  { assertEquals(0, newInstance(ABCD).execute(it -> it.indexOfLastIndexedOrNull(callback1AltAsTrue)).getAmountOfCall()); }
                    @DisplayName("true: 2 arguments")  @Test void true2()  { assertEquals(1, newInstance(ABCD).execute(it -> it.indexOfLastIndexedOrNull(callback2AltAsTrue)).getAmountOfCall()); }
                    @DisplayName("false: 0 arguments") @Test void false0() { assertEquals(0, newInstance(ABCD).execute(it -> it.indexOfLastIndexedOrNull(callback0AsFalse)).getAmountOfCall()); }
                    @DisplayName("false: 1 argument")  @Test void false1() { assertEquals(0, newInstance(ABCD).execute(it -> it.indexOfLastIndexedOrNull(callback1AltAsTrue)).getAmountOfCall()); }
                    @DisplayName("false: 2 arguments") @Test void false2() { assertEquals(4, newInstance(ABCD).execute(it -> it.indexOfLastIndexedOrNull(callback2AltAsFalse)).getAmountOfCall()); }
                }
            }
        }

        @TestInstance(PER_CLASS) @Nested class firstIndexOf {
            @Nested class empty {
                                           @Test void direct()     { assertThrowsExactly(EmptyCollectionException.class, () -> newInstance(EMPTY).firstIndexOf("a")); }
                @DisplayName("from (min)") @Test void fromMin()    { assertThrowsExactly(EmptyCollectionException.class, () -> newInstance(EMPTY).firstIndexOf("a", MIN_INT_VALUE)); }
                @DisplayName("from (-1)")  @Test void fromMinus1() { assertThrowsExactly(EmptyCollectionException.class, () -> newInstance(EMPTY).firstIndexOf("a", -1)); }
                @DisplayName("from (0)")   @Test void from0()      { assertThrowsExactly(EmptyCollectionException.class, () -> newInstance(EMPTY).firstIndexOf("a", 0)); }
                @DisplayName("from (1)")   @Test void from1()      { assertThrowsExactly(EmptyCollectionException.class, () -> newInstance(EMPTY).firstIndexOf("a", 1)); }
                @DisplayName("from (max)") @Test void fromMax()    { assertThrowsExactly(EmptyCollectionException.class, () -> newInstance(EMPTY).firstIndexOf("a", MAX_INT_VALUE)); }
                @DisplayName("to (min)")   @Test void toMin()      { assertThrowsExactly(EmptyCollectionException.class, () -> newInstance(EMPTY).firstIndexOf("a", null, MIN_INT_VALUE)); }
                @DisplayName("to (-1)")    @Test void toMinus1()   { assertThrowsExactly(EmptyCollectionException.class, () -> newInstance(EMPTY).firstIndexOf("a", null, -1)); }
                @DisplayName("to (0)")     @Test void to0()        { assertThrowsExactly(EmptyCollectionException.class, () -> newInstance(EMPTY).firstIndexOf("a", null, 0)); }
                @DisplayName("to (1)")     @Test void to1()        { assertThrowsExactly(EmptyCollectionException.class, () -> newInstance(EMPTY).firstIndexOf("a", null, 1)); }
                @DisplayName("to (max)")   @Test void toMax()      { assertThrowsExactly(EmptyCollectionException.class, () -> newInstance(EMPTY).firstIndexOf("a", null, MAX_INT_VALUE)); }
            }
            @DisplayName("1 field") @Nested class Test1 {
                @Test void a() { assertEquals(0,                                            newInstance(A).firstIndexOf("a")); }
                @Test void e() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).firstIndexOf("e")); }
            }
            @DisplayName("2 fields") @Nested class Test2 {
                @Test void a() { assertEquals(0,                                            newInstance(AA).firstIndexOf("a")); }
                @Test void e() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(AA).firstIndexOf("e")); }
            }
            @DisplayName("4 fields") @Nested class Test4 {
                @Test void a() { assertEquals(0,                                            newInstance(ABAB).firstIndexOf("a")); }
                @Test void b() { assertEquals(1,                                            newInstance(ABAB).firstIndexOf("b")); }
                @Test void e() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).firstIndexOf("e")); }
            }

            @Nested class from {
                                   @Test void min()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).firstIndexOf("a", MIN_INT_VALUE)); }
                @DisplayName("-6") @Test void minus6() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).firstIndexOf("a", -6)); }
                @DisplayName("-5") @Test void minus5() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).firstIndexOf("a", -5)); }
                @DisplayName("-4") @Test void minus4() { assertEquals(0,                                            newInstance(ABAB).firstIndexOf("a", -4)); }
                @DisplayName("-3") @Test void minus3() { assertEquals(2,                                            newInstance(ABAB).firstIndexOf("a", -3)); }
                @DisplayName("-2") @Test void minus2() { assertEquals(2,                                            newInstance(ABAB).firstIndexOf("a", -2)); }
                @DisplayName("-1") @Test void minus1() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).firstIndexOf("a", -1)); }
                @DisplayName("0")  @Test void test0()  { assertEquals(0,                                            newInstance(ABAB).firstIndexOf("a", 0)); }
                @DisplayName("1")  @Test void test1()  { assertEquals(2,                                            newInstance(ABAB).firstIndexOf("a", 1)); }
                @DisplayName("2")  @Test void test2()  { assertEquals(2,                                            newInstance(ABAB).firstIndexOf("a", 2)); }
                @DisplayName("3")  @Test void test3()  { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).firstIndexOf("a", 3)); }
                @DisplayName("4")  @Test void test4()  { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).firstIndexOf("a", 4)); }
                @DisplayName("5")  @Test void test5()  { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).firstIndexOf("a", 5)); }
                                   @Test void max()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).firstIndexOf("a", MAX_INT_VALUE)); }
            }
            @Nested class to {
                                   @Test void min()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).firstIndexOf("a", null, MIN_INT_VALUE)); }
                @DisplayName("-6") @Test void minus6() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).firstIndexOf("a", null, -6)); }
                @DisplayName("-5") @Test void minus5() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).firstIndexOf("a", null, -5)); }
                @DisplayName("-4") @Test void minus4() { assertEquals(0,                                            newInstance(ABAB).firstIndexOf("a", null, -4)); }
                @DisplayName("-3") @Test void minus3() { assertEquals(0,                                            newInstance(ABAB).firstIndexOf("a", null, -3)); }
                @DisplayName("-2") @Test void minus2() { assertEquals(0,                                            newInstance(ABAB).firstIndexOf("a", null, -2)); }
                @DisplayName("-1") @Test void minus1() { assertEquals(0,                                            newInstance(ABAB).firstIndexOf("a", null, -1)); }
                @DisplayName("0")  @Test void test0()  { assertEquals(0,                                            newInstance(ABAB).firstIndexOf("a", null, 0)); }
                @DisplayName("1")  @Test void test1()  { assertEquals(0,                                            newInstance(ABAB).firstIndexOf("a", null, 1)); }
                @DisplayName("2")  @Test void test2()  { assertEquals(0,                                            newInstance(ABAB).firstIndexOf("a", null, 2)); }
                @DisplayName("3")  @Test void test3()  { assertEquals(0,                                            newInstance(ABAB).firstIndexOf("a", null, 3)); }
                @DisplayName("4")  @Test void test4()  { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).firstIndexOf("a", null, 4)); }
                @DisplayName("5")  @Test void test5()  { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).firstIndexOf("a", null, 5)); }
                                   @Test void max()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).firstIndexOf("a", null, MAX_INT_VALUE)); }
            }
            @DisplayName("from + to") @Nested class fromTo {
                @DisplayName("min, min") @Test void minMin()  { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).firstIndexOf("a", MIN_INT_VALUE, MIN_INT_VALUE)); }
                @DisplayName("min, 0")   @Test void min0()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).firstIndexOf("a", MIN_INT_VALUE, 0)); }
                @DisplayName("min, 1")   @Test void min1()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).firstIndexOf("a", MIN_INT_VALUE, 1)); }
                @DisplayName("min, 2")   @Test void min2()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).firstIndexOf("a", MIN_INT_VALUE, 2)); }
                @DisplayName("min, 3")   @Test void min3()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).firstIndexOf("a", MIN_INT_VALUE, 3)); }
                @DisplayName("min, max") @Test void minMax()  { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).firstIndexOf("a", MIN_INT_VALUE, MAX_INT_VALUE)); }

                @DisplayName("0, min") @Test void test0_Min() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).firstIndexOf("a", 0, MIN_INT_VALUE)); }
                @DisplayName("0, 0")   @Test void test0_0()   { assertEquals(0,                                            newInstance(ABAB).firstIndexOf("a", 0, 0)); }
                @DisplayName("0, 1")   @Test void test0_1()   { assertEquals(0,                                            newInstance(ABAB).firstIndexOf("a", 0, 1)); }
                @DisplayName("0, 2")   @Test void test0_2()   { assertEquals(0,                                            newInstance(ABAB).firstIndexOf("a", 0, 2)); }
                @DisplayName("0, 3")   @Test void test0_3()   { assertEquals(0,                                            newInstance(ABAB).firstIndexOf("a", 0, 3)); }
                @DisplayName("0, max") @Test void test0_Max() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).firstIndexOf("a", 0, MAX_INT_VALUE)); }

                @DisplayName("1, min") @Test void test1_Min() { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(ABAB).firstIndexOf("a", 1, MIN_INT_VALUE)); }
                @DisplayName("1, 0")   @Test void test1_0()   { assertThrowsExactly(InvalidIndexRangeException.class, () -> newInstance(ABAB).firstIndexOf("a", 1, 0)); }
                @DisplayName("1, 1")   @Test void test1_1()   { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(ABAB).firstIndexOf("a", 1, 1)); }
                @DisplayName("1, 2")   @Test void test1_2()   { assertEquals(2,                                             newInstance(ABAB).firstIndexOf("a", 1, 2)); }
                @DisplayName("1, 3")   @Test void test1_3()   { assertEquals(2,                                             newInstance(ABAB).firstIndexOf("a", 1, 3)); }
                @DisplayName("1, max") @Test void test1_Max() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).firstIndexOf("a", 1, MAX_INT_VALUE)); }

                @DisplayName("2, min") @Test void test2_Min() { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(ABAB).firstIndexOf("a", 2, MIN_INT_VALUE)); }
                @DisplayName("2, 0")   @Test void test2_0()   { assertThrowsExactly(InvalidIndexRangeException.class, () -> newInstance(ABAB).firstIndexOf("a", 2, 0)); }
                @DisplayName("2, 1")   @Test void test2_1()   { assertThrowsExactly(InvalidIndexRangeException.class, () -> newInstance(ABAB).firstIndexOf("a", 2, 1)); }
                @DisplayName("2, 2")   @Test void test2_2()   { assertEquals(2,                                             newInstance(ABAB).firstIndexOf("a", 2, 2)); }
                @DisplayName("2, 3")   @Test void test2_3()   { assertEquals(2,                                             newInstance(ABAB).firstIndexOf("a", 2, 3)); }
                @DisplayName("2, max") @Test void test2_Max() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).firstIndexOf("a", 2, MAX_INT_VALUE)); }

                @DisplayName("3, min") @Test void test3_Min() { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(ABAB).firstIndexOf("a", 3, MIN_INT_VALUE)); }
                @DisplayName("3, 0")   @Test void test3_0()   { assertThrowsExactly(InvalidIndexRangeException.class, () -> newInstance(ABAB).firstIndexOf("a", 3, 0)); }
                @DisplayName("3, 1")   @Test void test3_1()   { assertThrowsExactly(InvalidIndexRangeException.class, () -> newInstance(ABAB).firstIndexOf("a", 3, 1)); }
                @DisplayName("3, 2")   @Test void test3_2()   { assertThrowsExactly(InvalidIndexRangeException.class, () -> newInstance(ABAB).firstIndexOf("a", 3, 2)); }
                @DisplayName("3, 3")   @Test void test3_3()   { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(ABAB).firstIndexOf("a", 3, 3)); }
                @DisplayName("3, max") @Test void test3_Max() { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(ABAB).firstIndexOf("a", 3, MAX_INT_VALUE)); }

                @DisplayName("max, min") @Test void maxMin()  { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).firstIndexOf("a", MAX_INT_VALUE, MIN_INT_VALUE)); }
                @DisplayName("max, 0")   @Test void max0()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).firstIndexOf("a", MAX_INT_VALUE, 0)); }
                @DisplayName("max, 1")   @Test void max1()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).firstIndexOf("a", MAX_INT_VALUE, 1)); }
                @DisplayName("max, 2")   @Test void max2()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).firstIndexOf("a", MAX_INT_VALUE, 2)); }
                @DisplayName("max, 3")   @Test void max3()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).firstIndexOf("a", MAX_INT_VALUE, 3)); }
                @DisplayName("max, max") @Test void maxMax()  { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).firstIndexOf("a", MAX_INT_VALUE, MAX_INT_VALUE)); }
            }
        }
        @TestInstance(PER_CLASS) @Nested class firstIndexOfOrNull {
            @Nested class empty {
                                           @Test void direct()     { assertNull(newInstance(EMPTY).firstIndexOfOrNull("a")); }
                @DisplayName("from (min)") @Test void fromMin()    { assertNull(newInstance(EMPTY).firstIndexOfOrNull("a", MIN_INT_VALUE)); }
                @DisplayName("from (-1)")  @Test void fromMinus1() { assertNull(newInstance(EMPTY).firstIndexOfOrNull("a", -1)); }
                @DisplayName("from (0)")   @Test void from0()      { assertNull(newInstance(EMPTY).firstIndexOfOrNull("a", 0)); }
                @DisplayName("from (1)")   @Test void from1()      { assertNull(newInstance(EMPTY).firstIndexOfOrNull("a", 1)); }
                @DisplayName("from (max)") @Test void fromMax()    { assertNull(newInstance(EMPTY).firstIndexOfOrNull("a", MAX_INT_VALUE)); }
                @DisplayName("to (min)")   @Test void toMin()      { assertNull(newInstance(EMPTY).firstIndexOfOrNull("a", null, MIN_INT_VALUE)); }
                @DisplayName("to (-1)")    @Test void toMinus1()   { assertNull(newInstance(EMPTY).firstIndexOfOrNull("a", null, -1)); }
                @DisplayName("to (0)")     @Test void to0()        { assertNull(newInstance(EMPTY).firstIndexOfOrNull("a", null, 0)); }
                @DisplayName("to (1)")     @Test void to1()        { assertNull(newInstance(EMPTY).firstIndexOfOrNull("a", null, 1)); }
                @DisplayName("to (max)")   @Test void toMax()      { assertNull(newInstance(EMPTY).firstIndexOfOrNull("a", null, MAX_INT_VALUE)); }
            }
            @DisplayName("1 field") @Nested class Test1 {
                @Test void a() { assertEquals(0, newInstance(A).firstIndexOfOrNull("a")); }
                @Test void e() { assertNull(     newInstance(A).firstIndexOfOrNull("e")); }
            }
            @DisplayName("2 fields") @Nested class Test2 {
                @Test void a() { assertEquals(0, newInstance(AA).firstIndexOfOrNull("a")); }
                @Test void e() { assertNull(     newInstance(AA).firstIndexOfOrNull("e")); }
            }
            @DisplayName("4 fields") @Nested class Test4 {
                @Test void a() { assertEquals(0, newInstance(ABAB).firstIndexOfOrNull("a")); }
                @Test void b() { assertEquals(1, newInstance(ABAB).firstIndexOfOrNull("b")); }
                @Test void e() { assertNull(     newInstance(ABAB).firstIndexOfOrNull("e")); }
            }

            @Nested class from {
                                   @Test void min()    { assertNull(     newInstance(ABAB).firstIndexOfOrNull("a", MIN_INT_VALUE)); }
                @DisplayName("-6") @Test void minus6() { assertNull(     newInstance(ABAB).firstIndexOfOrNull("a", -6)); }
                @DisplayName("-5") @Test void minus5() { assertNull(     newInstance(ABAB).firstIndexOfOrNull("a", -5)); }
                @DisplayName("-4") @Test void minus4() { assertEquals(0, newInstance(ABAB).firstIndexOfOrNull("a", -4)); }
                @DisplayName("-3") @Test void minus3() { assertEquals(2, newInstance(ABAB).firstIndexOfOrNull("a", -3)); }
                @DisplayName("-2") @Test void minus2() { assertEquals(2, newInstance(ABAB).firstIndexOfOrNull("a", -2)); }
                @DisplayName("-1") @Test void minus1() { assertNull(     newInstance(ABAB).firstIndexOfOrNull("a", -1)); }
                @DisplayName("0")  @Test void test0()  { assertEquals(0, newInstance(ABAB).firstIndexOfOrNull("a", 0)); }
                @DisplayName("1")  @Test void test1()  { assertEquals(2, newInstance(ABAB).firstIndexOfOrNull("a", 1)); }
                @DisplayName("2")  @Test void test2()  { assertEquals(2, newInstance(ABAB).firstIndexOfOrNull("a", 2)); }
                @DisplayName("3")  @Test void test3()  { assertNull(     newInstance(ABAB).firstIndexOfOrNull("a", 3)); }
                @DisplayName("4")  @Test void test4()  { assertNull(     newInstance(ABAB).firstIndexOfOrNull("a", 4)); }
                @DisplayName("5")  @Test void test5()  { assertNull(     newInstance(ABAB).firstIndexOfOrNull("a", 5)); }
                                   @Test void max()    { assertNull(     newInstance(ABAB).firstIndexOfOrNull("a", MAX_INT_VALUE)); }
            }
            @Nested class to {
                                   @Test void min()    { assertNull(     newInstance(ABAB).firstIndexOfOrNull("a", null, MIN_INT_VALUE)); }
                @DisplayName("-6") @Test void minus6() { assertNull(     newInstance(ABAB).firstIndexOfOrNull("a", null, -6)); }
                @DisplayName("-5") @Test void minus5() { assertNull(     newInstance(ABAB).firstIndexOfOrNull("a", null, -5)); }
                @DisplayName("-4") @Test void minus4() { assertEquals(0, newInstance(ABAB).firstIndexOfOrNull("a", null, -4)); }
                @DisplayName("-3") @Test void minus3() { assertEquals(0, newInstance(ABAB).firstIndexOfOrNull("a", null, -3)); }
                @DisplayName("-2") @Test void minus2() { assertEquals(0, newInstance(ABAB).firstIndexOfOrNull("a", null, -2)); }
                @DisplayName("-1") @Test void minus1() { assertEquals(0, newInstance(ABAB).firstIndexOfOrNull("a", null, -1)); }
                @DisplayName("0")  @Test void test0()  { assertEquals(0, newInstance(ABAB).firstIndexOfOrNull("a", null, 0)); }
                @DisplayName("1")  @Test void test1()  { assertEquals(0, newInstance(ABAB).firstIndexOfOrNull("a", null, 1)); }
                @DisplayName("2")  @Test void test2()  { assertEquals(0, newInstance(ABAB).firstIndexOfOrNull("a", null, 2)); }
                @DisplayName("3")  @Test void test3()  { assertEquals(0, newInstance(ABAB).firstIndexOfOrNull("a", null, 3)); }
                @DisplayName("4")  @Test void test4()  { assertNull(     newInstance(ABAB).firstIndexOfOrNull("a", null, 4)); }
                @DisplayName("5")  @Test void test5()  { assertNull(     newInstance(ABAB).firstIndexOfOrNull("a", null, 5)); }
                                   @Test void max()    { assertNull(     newInstance(ABAB).firstIndexOfOrNull("a", null, MAX_INT_VALUE)); }
            }
            @DisplayName("from + to") @Nested class fromTo {
                @DisplayName("min, min") @Test void minMin()  { assertNull(newInstance(ABAB).firstIndexOfOrNull("a", MIN_INT_VALUE, MIN_INT_VALUE)); }
                @DisplayName("min, 0")   @Test void min0()    { assertNull(newInstance(ABAB).firstIndexOfOrNull("a", MIN_INT_VALUE, 0)); }
                @DisplayName("min, 1")   @Test void min1()    { assertNull(newInstance(ABAB).firstIndexOfOrNull("a", MIN_INT_VALUE, 1)); }
                @DisplayName("min, 2")   @Test void min2()    { assertNull(newInstance(ABAB).firstIndexOfOrNull("a", MIN_INT_VALUE, 2)); }
                @DisplayName("min, 3")   @Test void min3()    { assertNull(newInstance(ABAB).firstIndexOfOrNull("a", MIN_INT_VALUE, 3)); }
                @DisplayName("min, max") @Test void minMax()  { assertNull(newInstance(ABAB).firstIndexOfOrNull("a", MIN_INT_VALUE, MAX_INT_VALUE)); }

                @DisplayName("0, min") @Test void test0_Min() { assertNull(     newInstance(ABAB).firstIndexOfOrNull("a", 0, MIN_INT_VALUE)); }
                @DisplayName("0, 0")   @Test void test0_0()   { assertEquals(0, newInstance(ABAB).firstIndexOfOrNull("a", 0, 0)); }
                @DisplayName("0, 1")   @Test void test0_1()   { assertEquals(0, newInstance(ABAB).firstIndexOfOrNull("a", 0, 1)); }
                @DisplayName("0, 2")   @Test void test0_2()   { assertEquals(0, newInstance(ABAB).firstIndexOfOrNull("a", 0, 2)); }
                @DisplayName("0, 3")   @Test void test0_3()   { assertEquals(0, newInstance(ABAB).firstIndexOfOrNull("a", 0, 3)); }
                @DisplayName("0, max") @Test void test0_Max() { assertNull(     newInstance(ABAB).firstIndexOfOrNull("a", 0, MAX_INT_VALUE)); }

                @DisplayName("1, min") @Test void test1_Min() { assertNull(newInstance(ABAB).firstIndexOfOrNull("a", 1, MIN_INT_VALUE)); }
                @DisplayName("1, 0")   @Test void test1_0()   { assertNull(newInstance(ABAB).firstIndexOfOrNull("a", 1, 0)); }
                @DisplayName("1, 1")   @Test void test1_1()   { assertNull(newInstance(ABAB).firstIndexOfOrNull("a", 1, 1)); }
                @DisplayName("1, 2")   @Test void test1_2()   { assertEquals(2, newInstance(ABAB).firstIndexOfOrNull("a", 1, 2)); }
                @DisplayName("1, 3")   @Test void test1_3()   { assertEquals(2, newInstance(ABAB).firstIndexOfOrNull("a", 1, 3)); }
                @DisplayName("1, max") @Test void test1_Max() { assertNull(newInstance(ABAB).firstIndexOfOrNull("a", 1, MAX_INT_VALUE)); }

                @DisplayName("2, min") @Test void test2_Min() { assertNull(     newInstance(ABAB).firstIndexOfOrNull("a", 2, MIN_INT_VALUE)); }
                @DisplayName("2, 0")   @Test void test2_0()   { assertNull(     newInstance(ABAB).firstIndexOfOrNull("a", 2, 0)); }
                @DisplayName("2, 1")   @Test void test2_1()   { assertNull(     newInstance(ABAB).firstIndexOfOrNull("a", 2, 1)); }
                @DisplayName("2, 2")   @Test void test2_2()   { assertEquals(2, newInstance(ABAB).firstIndexOfOrNull("a", 2, 2)); }
                @DisplayName("2, 3")   @Test void test2_3()   { assertEquals(2, newInstance(ABAB).firstIndexOfOrNull("a", 2, 3)); }
                @DisplayName("2, max") @Test void test2_Max() { assertNull(     newInstance(ABAB).firstIndexOfOrNull("a", 2, MAX_INT_VALUE)); }

                @DisplayName("3, min") @Test void test3_Min() { assertNull(newInstance(ABAB).firstIndexOfOrNull("a", 3, MIN_INT_VALUE)); }
                @DisplayName("3, 0")   @Test void test3_0()   { assertNull(newInstance(ABAB).firstIndexOfOrNull("a", 3, 0)); }
                @DisplayName("3, 1")   @Test void test3_1()   { assertNull(newInstance(ABAB).firstIndexOfOrNull("a", 3, 1)); }
                @DisplayName("3, 2")   @Test void test3_2()   { assertNull(newInstance(ABAB).firstIndexOfOrNull("a", 3, 2)); }
                @DisplayName("3, 3")   @Test void test3_3()   { assertNull(newInstance(ABAB).firstIndexOfOrNull("a", 3, 3)); }
                @DisplayName("3, max") @Test void test3_Max() { assertNull(newInstance(ABAB).firstIndexOfOrNull("a", 3, MAX_INT_VALUE)); }

                @DisplayName("max, min") @Test void maxMin()  { assertNull(newInstance(ABAB).firstIndexOfOrNull("a", MAX_INT_VALUE, MIN_INT_VALUE)); }
                @DisplayName("max, 0")   @Test void max0()    { assertNull(newInstance(ABAB).firstIndexOfOrNull("a", MAX_INT_VALUE, 0)); }
                @DisplayName("max, 1")   @Test void max1()    { assertNull(newInstance(ABAB).firstIndexOfOrNull("a", MAX_INT_VALUE, 1)); }
                @DisplayName("max, 2")   @Test void max2()    { assertNull(newInstance(ABAB).firstIndexOfOrNull("a", MAX_INT_VALUE, 2)); }
                @DisplayName("max, 3")   @Test void max3()    { assertNull(newInstance(ABAB).firstIndexOfOrNull("a", MAX_INT_VALUE, 3)); }
                @DisplayName("max, max") @Test void maxMax()  { assertNull(newInstance(ABAB).firstIndexOfOrNull("a", MAX_INT_VALUE, MAX_INT_VALUE)); }
            }
        }

        @TestInstance(PER_CLASS) @Nested class lastIndexOf {
            @Nested class empty {
                                           @Test void direct()     { assertThrowsExactly(EmptyCollectionException.class, () -> newInstance(EMPTY).lastIndexOf("a")); }
                @DisplayName("from (min)") @Test void fromMin()    { assertThrowsExactly(EmptyCollectionException.class, () -> newInstance(EMPTY).lastIndexOf("a", MIN_INT_VALUE)); }
                @DisplayName("from (-1)")  @Test void fromMinus1() { assertThrowsExactly(EmptyCollectionException.class, () -> newInstance(EMPTY).lastIndexOf("a", -1)); }
                @DisplayName("from (0)")   @Test void from0()      { assertThrowsExactly(EmptyCollectionException.class, () -> newInstance(EMPTY).lastIndexOf("a", 0)); }
                @DisplayName("from (1)")   @Test void from1()      { assertThrowsExactly(EmptyCollectionException.class, () -> newInstance(EMPTY).lastIndexOf("a", 1)); }
                @DisplayName("from (max)") @Test void fromMax()    { assertThrowsExactly(EmptyCollectionException.class, () -> newInstance(EMPTY).lastIndexOf("a", MAX_INT_VALUE)); }
                @DisplayName("to (min)")   @Test void toMin()      { assertThrowsExactly(EmptyCollectionException.class, () -> newInstance(EMPTY).lastIndexOf("a", null, MIN_INT_VALUE)); }
                @DisplayName("to (-1)")    @Test void toMinus1()   { assertThrowsExactly(EmptyCollectionException.class, () -> newInstance(EMPTY).lastIndexOf("a", null, -1)); }
                @DisplayName("to (0)")     @Test void to0()        { assertThrowsExactly(EmptyCollectionException.class, () -> newInstance(EMPTY).lastIndexOf("a", null, 0)); }
                @DisplayName("to (1)")     @Test void to1()        { assertThrowsExactly(EmptyCollectionException.class, () -> newInstance(EMPTY).lastIndexOf("a", null, 1)); }
                @DisplayName("to (max)")   @Test void toMax()      { assertThrowsExactly(EmptyCollectionException.class, () -> newInstance(EMPTY).lastIndexOf("a", null, MAX_INT_VALUE)); }
            }
            @DisplayName("1 field") @Nested class Test1 {
                @Test void a() { assertEquals(0,                                            newInstance(A).lastIndexOf("a")); }
                @Test void e() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).lastIndexOf("e")); }
            }
            @DisplayName("2 fields") @Nested class Test2 {
                @Test void a() { assertEquals(1,                                            newInstance(AA).lastIndexOf("a")); }
                @Test void e() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(AA).lastIndexOf("e")); }
            }
            @DisplayName("4 fields") @Nested class Test4 {
                @Test void a() { assertEquals(2,                                            newInstance(ABAB).lastIndexOf("a")); }
                @Test void b() { assertEquals(3,                                            newInstance(ABAB).lastIndexOf("b")); }
                @Test void e() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).lastIndexOf("e")); }
            }

            @Nested class from {
                                   @Test void min()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).lastIndexOf("a", MIN_INT_VALUE)); }
                @DisplayName("-6") @Test void minus6() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).lastIndexOf("a", -6)); }
                @DisplayName("-5") @Test void minus5() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).lastIndexOf("a", -5)); }
                @DisplayName("-4") @Test void minus4() { assertEquals(2,                                            newInstance(ABAB).lastIndexOf("a", -4)); }
                @DisplayName("-3") @Test void minus3() { assertEquals(2,                                            newInstance(ABAB).lastIndexOf("a", -3)); }
                @DisplayName("-2") @Test void minus2() { assertEquals(2,                                            newInstance(ABAB).lastIndexOf("a", -2)); }
                @DisplayName("-1") @Test void minus1() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).lastIndexOf("a", -1)); }
                @DisplayName("0")  @Test void test0()  { assertEquals(2,                                            newInstance(ABAB).lastIndexOf("a", 0)); }
                @DisplayName("1")  @Test void test1()  { assertEquals(2,                                            newInstance(ABAB).lastIndexOf("a", 1)); }
                @DisplayName("2")  @Test void test2()  { assertEquals(2,                                            newInstance(ABAB).lastIndexOf("a", 2)); }
                @DisplayName("3")  @Test void test3()  { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).lastIndexOf("a", 3)); }
                @DisplayName("4")  @Test void test4()  { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).lastIndexOf("a", 4)); }
                @DisplayName("5")  @Test void test5()  { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).lastIndexOf("a", 5)); }
                                   @Test void max()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).lastIndexOf("a", MAX_INT_VALUE)); }
            }
            @Nested class to {
                                   @Test void min()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).lastIndexOf("a", null, MIN_INT_VALUE)); }
                @DisplayName("-6") @Test void minus6() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).lastIndexOf("a", null, -6)); }
                @DisplayName("-5") @Test void minus5() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).lastIndexOf("a", null, -5)); }
                @DisplayName("-4") @Test void minus4() { assertEquals(0,                                            newInstance(ABAB).lastIndexOf("a", null, -4)); }
                @DisplayName("-3") @Test void minus3() { assertEquals(0,                                            newInstance(ABAB).lastIndexOf("a", null, -3)); }
                @DisplayName("-2") @Test void minus2() { assertEquals(2,                                            newInstance(ABAB).lastIndexOf("a", null, -2)); }
                @DisplayName("-1") @Test void minus1() { assertEquals(2,                                            newInstance(ABAB).lastIndexOf("a", null, -1)); }
                @DisplayName("0")  @Test void test0()  { assertEquals(0,                                            newInstance(ABAB).lastIndexOf("a", null, 0)); }
                @DisplayName("1")  @Test void test1()  { assertEquals(0,                                            newInstance(ABAB).lastIndexOf("a", null, 1)); }
                @DisplayName("2")  @Test void test2()  { assertEquals(2,                                            newInstance(ABAB).lastIndexOf("a", null, 2)); }
                @DisplayName("3")  @Test void test3()  { assertEquals(2,                                            newInstance(ABAB).lastIndexOf("a", null, 3)); }
                @DisplayName("4")  @Test void test4()  { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).lastIndexOf("a", null, 4)); }
                @DisplayName("5")  @Test void test5()  { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).lastIndexOf("a", null, 5)); }
                                   @Test void max()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).lastIndexOf("a", null, MAX_INT_VALUE)); }
            }
            @DisplayName("from + to") @Nested class fromTo {
                @DisplayName("min, min") @Test void minMin()  { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).lastIndexOf("a", MIN_INT_VALUE, MIN_INT_VALUE)); }
                @DisplayName("min, 0")   @Test void min0()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).lastIndexOf("a", MIN_INT_VALUE, 0)); }
                @DisplayName("min, 1")   @Test void min1()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).lastIndexOf("a", MIN_INT_VALUE, 1)); }
                @DisplayName("min, 2")   @Test void min2()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).lastIndexOf("a", MIN_INT_VALUE, 2)); }
                @DisplayName("min, 3")   @Test void min3()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).lastIndexOf("a", MIN_INT_VALUE, 3)); }
                @DisplayName("min, max") @Test void minMax()  { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).lastIndexOf("a", MIN_INT_VALUE, MAX_INT_VALUE)); }

                @DisplayName("0, min") @Test void test0_Min() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).lastIndexOf("a", 0, MIN_INT_VALUE)); }
                @DisplayName("0, 0")   @Test void test0_0()   { assertEquals(0,                                            newInstance(ABAB).lastIndexOf("a", 0, 0)); }
                @DisplayName("0, 1")   @Test void test0_1()   { assertEquals(0,                                            newInstance(ABAB).lastIndexOf("a", 0, 1)); }
                @DisplayName("0, 2")   @Test void test0_2()   { assertEquals(2,                                            newInstance(ABAB).lastIndexOf("a", 0, 2)); }
                @DisplayName("0, 3")   @Test void test0_3()   { assertEquals(2,                                            newInstance(ABAB).lastIndexOf("a", 0, 3)); }
                @DisplayName("0, max") @Test void test0_Max() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).lastIndexOf("a", 0, MAX_INT_VALUE)); }

                @DisplayName("1, min") @Test void test1_Min() { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(ABAB).lastIndexOf("a", 1, MIN_INT_VALUE)); }
                @DisplayName("1, 0")   @Test void test1_0()   { assertThrowsExactly(InvalidIndexRangeException.class, () -> newInstance(ABAB).lastIndexOf("a", 1, 0)); }
                @DisplayName("1, 1")   @Test void test1_1()   { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(ABAB).lastIndexOf("a", 1, 1)); }
                @DisplayName("1, 2")   @Test void test1_2()   { assertEquals(2,                                             newInstance(ABAB).lastIndexOf("a", 1, 2)); }
                @DisplayName("1, 3")   @Test void test1_3()   { assertEquals(2,                                             newInstance(ABAB).lastIndexOf("a", 1, 3)); }
                @DisplayName("1, max") @Test void test1_Max() { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(ABAB).lastIndexOf("a", 1, MAX_INT_VALUE)); }

                @DisplayName("2, min") @Test void test2_Min() { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(ABAB).lastIndexOf("a", 2, MIN_INT_VALUE)); }
                @DisplayName("2, 0")   @Test void test2_0()   { assertThrowsExactly(InvalidIndexRangeException.class, () -> newInstance(ABAB).lastIndexOf("a", 2, 0)); }
                @DisplayName("2, 1")   @Test void test2_1()   { assertThrowsExactly(InvalidIndexRangeException.class, () -> newInstance(ABAB).lastIndexOf("a", 2, 1)); }
                @DisplayName("2, 2")   @Test void test2_2()   { assertEquals(2,                                             newInstance(ABAB).lastIndexOf("a", 2, 2)); }
                @DisplayName("2, 3")   @Test void test2_3()   { assertEquals(2,                                             newInstance(ABAB).lastIndexOf("a", 2, 3)); }
                @DisplayName("2, max") @Test void test2_Max() { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(ABAB).lastIndexOf("a", 2, MAX_INT_VALUE)); }

                @DisplayName("3, min") @Test void test3_Min() { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(ABAB).lastIndexOf("a", 3, MIN_INT_VALUE)); }
                @DisplayName("3, 0")   @Test void test3_0()   { assertThrowsExactly(InvalidIndexRangeException.class, () -> newInstance(ABAB).lastIndexOf("a", 3, 0)); }
                @DisplayName("3, 1")   @Test void test3_1()   { assertThrowsExactly(InvalidIndexRangeException.class, () -> newInstance(ABAB).lastIndexOf("a", 3, 1)); }
                @DisplayName("3, 2")   @Test void test3_2()   { assertThrowsExactly(InvalidIndexRangeException.class, () -> newInstance(ABAB).lastIndexOf("a", 3, 2)); }
                @DisplayName("3, 3")   @Test void test3_3()   { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(ABAB).lastIndexOf("a", 3, 3)); }
                @DisplayName("3, max") @Test void test3_Max() { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(ABAB).lastIndexOf("a", 3, MAX_INT_VALUE)); }

                @DisplayName("max, min") @Test void maxMin()  { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).lastIndexOf("a", MAX_INT_VALUE, MIN_INT_VALUE)); }
                @DisplayName("max, 0")   @Test void max0()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).lastIndexOf("a", MAX_INT_VALUE, 0)); }
                @DisplayName("max, 1")   @Test void max1()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).lastIndexOf("a", MAX_INT_VALUE, 1)); }
                @DisplayName("max, 2")   @Test void max2()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).lastIndexOf("a", MAX_INT_VALUE, 2)); }
                @DisplayName("max, 3")   @Test void max3()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).lastIndexOf("a", MAX_INT_VALUE, 3)); }
                @DisplayName("max, max") @Test void maxMax()  { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).lastIndexOf("a", MAX_INT_VALUE, MAX_INT_VALUE)); }
            }
        }
        @TestInstance(PER_CLASS) @Nested class lastIndexOfOrNull {
            @Nested class empty {
                                           @Test void direct()     { assertNull(newInstance(EMPTY).lastIndexOfOrNull("a")); }
                @DisplayName("from (min)") @Test void fromMin()    { assertNull(newInstance(EMPTY).lastIndexOfOrNull("a", MIN_INT_VALUE)); }
                @DisplayName("from (-1)")  @Test void fromMinus1() { assertNull(newInstance(EMPTY).lastIndexOfOrNull("a", -1)); }
                @DisplayName("from (0)")   @Test void from0()      { assertNull(newInstance(EMPTY).lastIndexOfOrNull("a", 0)); }
                @DisplayName("from (1)")   @Test void from1()      { assertNull(newInstance(EMPTY).lastIndexOfOrNull("a", 1)); }
                @DisplayName("from (max)") @Test void fromMax()    { assertNull(newInstance(EMPTY).lastIndexOfOrNull("a", MAX_INT_VALUE)); }
                @DisplayName("to (min)")   @Test void toMin()      { assertNull(newInstance(EMPTY).lastIndexOfOrNull("a", null, MIN_INT_VALUE)); }
                @DisplayName("to (-1)")    @Test void toMinus1()   { assertNull(newInstance(EMPTY).lastIndexOfOrNull("a", null, -1)); }
                @DisplayName("to (0)")     @Test void to0()        { assertNull(newInstance(EMPTY).lastIndexOfOrNull("a", null, 0)); }
                @DisplayName("to (1)")     @Test void to1()        { assertNull(newInstance(EMPTY).lastIndexOfOrNull("a", null, 1)); }
                @DisplayName("to (max)")   @Test void toMax()      { assertNull(newInstance(EMPTY).lastIndexOfOrNull("a", null, MAX_INT_VALUE)); }
            }
            @DisplayName("1 field") @Nested class Test1 {
                @Test void a() { assertEquals(0, newInstance(A).lastIndexOfOrNull("a")); }
                @Test void e() { assertNull(     newInstance(A).lastIndexOfOrNull("e")); }
            }
            @DisplayName("2 fields") @Nested class Test2 {
                @Test void a() { assertEquals(1, newInstance(AA).lastIndexOfOrNull("a")); }
                @Test void e() { assertNull(     newInstance(AA).lastIndexOfOrNull("e")); }
            }
            @DisplayName("4 fields") @Nested class Test4 {
                @Test void a() { assertEquals(2, newInstance(ABAB).lastIndexOfOrNull("a")); }
                @Test void b() { assertEquals(3, newInstance(ABAB).lastIndexOfOrNull("b")); }
                @Test void e() { assertNull(     newInstance(ABAB).lastIndexOfOrNull("e")); }
            }

            @Nested class from {
                                   @Test void min()    { assertNull(     newInstance(ABAB).lastIndexOfOrNull("a", MIN_INT_VALUE)); }
                @DisplayName("-6") @Test void minus6() { assertNull(     newInstance(ABAB).lastIndexOfOrNull("a", -6)); }
                @DisplayName("-5") @Test void minus5() { assertNull(     newInstance(ABAB).lastIndexOfOrNull("a", -5)); }
                @DisplayName("-4") @Test void minus4() { assertEquals(2, newInstance(ABAB).lastIndexOfOrNull("a", -4)); }
                @DisplayName("-3") @Test void minus3() { assertEquals(2, newInstance(ABAB).lastIndexOfOrNull("a", -3)); }
                @DisplayName("-2") @Test void minus2() { assertEquals(2, newInstance(ABAB).lastIndexOfOrNull("a", -2)); }
                @DisplayName("-1") @Test void minus1() { assertNull(     newInstance(ABAB).lastIndexOfOrNull("a", -1)); }
                @DisplayName("0")  @Test void test0()  { assertEquals(2, newInstance(ABAB).lastIndexOfOrNull("a", 0)); }
                @DisplayName("1")  @Test void test1()  { assertEquals(2, newInstance(ABAB).lastIndexOfOrNull("a", 1)); }
                @DisplayName("2")  @Test void test2()  { assertEquals(2, newInstance(ABAB).lastIndexOfOrNull("a", 2)); }
                @DisplayName("3")  @Test void test3()  { assertNull(     newInstance(ABAB).lastIndexOfOrNull("a", 3)); }
                @DisplayName("4")  @Test void test4()  { assertNull(     newInstance(ABAB).lastIndexOfOrNull("a", 4)); }
                @DisplayName("5")  @Test void test5()  { assertNull(     newInstance(ABAB).lastIndexOfOrNull("a", 5)); }
                                   @Test void max()    { assertNull(     newInstance(ABAB).lastIndexOfOrNull("a", MAX_INT_VALUE)); }
            }
            @Nested class to {
                                   @Test void min()    { assertNull(     newInstance(ABAB).lastIndexOfOrNull("a", null, MIN_INT_VALUE)); }
                @DisplayName("-6") @Test void minus6() { assertNull(     newInstance(ABAB).lastIndexOfOrNull("a", null, -6)); }
                @DisplayName("-5") @Test void minus5() { assertNull(     newInstance(ABAB).lastIndexOfOrNull("a", null, -5)); }
                @DisplayName("-4") @Test void minus4() { assertEquals(0, newInstance(ABAB).lastIndexOfOrNull("a", null, -4)); }
                @DisplayName("-3") @Test void minus3() { assertEquals(0, newInstance(ABAB).lastIndexOfOrNull("a", null, -3)); }
                @DisplayName("-2") @Test void minus2() { assertEquals(2, newInstance(ABAB).lastIndexOfOrNull("a", null, -2)); }
                @DisplayName("-1") @Test void minus1() { assertEquals(2, newInstance(ABAB).lastIndexOfOrNull("a", null, -1)); }
                @DisplayName("0")  @Test void test0()  { assertEquals(0, newInstance(ABAB).lastIndexOfOrNull("a", null, 0)); }
                @DisplayName("1")  @Test void test1()  { assertEquals(0, newInstance(ABAB).lastIndexOfOrNull("a", null, 1)); }
                @DisplayName("2")  @Test void test2()  { assertEquals(2, newInstance(ABAB).lastIndexOfOrNull("a", null, 2)); }
                @DisplayName("3")  @Test void test3()  { assertEquals(2, newInstance(ABAB).lastIndexOfOrNull("a", null, 3)); }
                @DisplayName("4")  @Test void test4()  { assertNull(     newInstance(ABAB).lastIndexOfOrNull("a", null, 4)); }
                @DisplayName("5")  @Test void test5()  { assertNull(     newInstance(ABAB).lastIndexOfOrNull("a", null, 5)); }
                                   @Test void max()    { assertNull(     newInstance(ABAB).lastIndexOfOrNull("a", null, MAX_INT_VALUE)); }
            }
            @DisplayName("from + to") @Nested class fromTo {
                @DisplayName("min, min") @Test void minMin()  { assertNull(newInstance(ABAB).lastIndexOfOrNull("a", MIN_INT_VALUE, MIN_INT_VALUE)); }
                @DisplayName("min, 0")   @Test void min0()    { assertNull(newInstance(ABAB).lastIndexOfOrNull("a", MIN_INT_VALUE, 0)); }
                @DisplayName("min, 1")   @Test void min1()    { assertNull(newInstance(ABAB).lastIndexOfOrNull("a", MIN_INT_VALUE, 1)); }
                @DisplayName("min, 2")   @Test void min2()    { assertNull(newInstance(ABAB).lastIndexOfOrNull("a", MIN_INT_VALUE, 2)); }
                @DisplayName("min, 3")   @Test void min3()    { assertNull(newInstance(ABAB).lastIndexOfOrNull("a", MIN_INT_VALUE, 3)); }
                @DisplayName("min, max") @Test void minMax()  { assertNull(newInstance(ABAB).lastIndexOfOrNull("a", MIN_INT_VALUE, MAX_INT_VALUE)); }

                @DisplayName("0, min") @Test void test0_Min() { assertNull(     newInstance(ABAB).lastIndexOfOrNull("a", 0, MIN_INT_VALUE)); }
                @DisplayName("0, 0")   @Test void test0_0()   { assertEquals(0, newInstance(ABAB).lastIndexOfOrNull("a", 0, 0)); }
                @DisplayName("0, 1")   @Test void test0_1()   { assertEquals(0, newInstance(ABAB).lastIndexOfOrNull("a", 0, 1)); }
                @DisplayName("0, 2")   @Test void test0_2()   { assertEquals(2, newInstance(ABAB).lastIndexOfOrNull("a", 0, 2)); }
                @DisplayName("0, 3")   @Test void test0_3()   { assertEquals(2, newInstance(ABAB).lastIndexOfOrNull("a", 0, 3)); }
                @DisplayName("0, max") @Test void test0_Max() { assertNull(     newInstance(ABAB).lastIndexOfOrNull("a", 0, MAX_INT_VALUE)); }

                @DisplayName("1, min") @Test void test1_Min() { assertNull(     newInstance(ABAB).lastIndexOfOrNull("a", 1, MIN_INT_VALUE)); }
                @DisplayName("1, 0")   @Test void test1_0()   { assertNull(     newInstance(ABAB).lastIndexOfOrNull("a", 1, 0)); }
                @DisplayName("1, 1")   @Test void test1_1()   { assertNull(     newInstance(ABAB).lastIndexOfOrNull("a", 1, 1)); }
                @DisplayName("1, 2")   @Test void test1_2()   { assertEquals(2, newInstance(ABAB).lastIndexOfOrNull("a", 1, 2)); }
                @DisplayName("1, 3")   @Test void test1_3()   { assertEquals(2, newInstance(ABAB).lastIndexOfOrNull("a", 1, 3)); }
                @DisplayName("1, max") @Test void test1_Max() { assertNull(     newInstance(ABAB).lastIndexOfOrNull("a", 1, MAX_INT_VALUE)); }

                @DisplayName("2, min") @Test void test2_Min() { assertNull(     newInstance(ABAB).lastIndexOfOrNull("a", 2, MIN_INT_VALUE)); }
                @DisplayName("2, 0")   @Test void test2_0()   { assertNull(     newInstance(ABAB).lastIndexOfOrNull("a", 2, 0)); }
                @DisplayName("2, 1")   @Test void test2_1()   { assertNull(     newInstance(ABAB).lastIndexOfOrNull("a", 2, 1)); }
                @DisplayName("2, 2")   @Test void test2_2()   { assertEquals(2, newInstance(ABAB).lastIndexOfOrNull("a", 2, 2)); }
                @DisplayName("2, 3")   @Test void test2_3()   { assertEquals(2, newInstance(ABAB).lastIndexOfOrNull("a", 2, 3)); }
                @DisplayName("2, max") @Test void test2_Max() { assertNull(     newInstance(ABAB).lastIndexOfOrNull("a", 2, MAX_INT_VALUE)); }

                @DisplayName("3, min") @Test void test3_Min() { assertNull(newInstance(ABAB).lastIndexOfOrNull("a", 3, MIN_INT_VALUE)); }
                @DisplayName("3, 0")   @Test void test3_0()   { assertNull(newInstance(ABAB).lastIndexOfOrNull("a", 3, 0)); }
                @DisplayName("3, 1")   @Test void test3_1()   { assertNull(newInstance(ABAB).lastIndexOfOrNull("a", 3, 1)); }
                @DisplayName("3, 2")   @Test void test3_2()   { assertNull(newInstance(ABAB).lastIndexOfOrNull("a", 3, 2)); }
                @DisplayName("3, 3")   @Test void test3_3()   { assertNull(newInstance(ABAB).lastIndexOfOrNull("a", 3, 3)); }
                @DisplayName("3, max") @Test void test3_Max() { assertNull(newInstance(ABAB).lastIndexOfOrNull("a", 3, MAX_INT_VALUE)); }

                @DisplayName("max, min") @Test void maxMin()  { assertNull(newInstance(ABAB).lastIndexOfOrNull("a", MAX_INT_VALUE, MIN_INT_VALUE)); }
                @DisplayName("max, 0")   @Test void max0()    { assertNull(newInstance(ABAB).lastIndexOfOrNull("a", MAX_INT_VALUE, 0)); }
                @DisplayName("max, 1")   @Test void max1()    { assertNull(newInstance(ABAB).lastIndexOfOrNull("a", MAX_INT_VALUE, 1)); }
                @DisplayName("max, 2")   @Test void max2()    { assertNull(newInstance(ABAB).lastIndexOfOrNull("a", MAX_INT_VALUE, 2)); }
                @DisplayName("max, 3")   @Test void max3()    { assertNull(newInstance(ABAB).lastIndexOfOrNull("a", MAX_INT_VALUE, 3)); }
                @DisplayName("max, max") @Test void maxMax()  { assertNull(newInstance(ABAB).lastIndexOfOrNull("a", MAX_INT_VALUE, MAX_INT_VALUE)); }
            }
        }

        @TestInstance(PER_CLASS) @Nested class indexOfFirst {
            @Nested class empty {
                                           @Test void direct()     { assertThrowsExactly(EmptyCollectionException.class, () -> newInstance(EMPTY).indexOfFirst(predicate0AsFail)); }
                @DisplayName("from (min)") @Test void fromMin()    { assertThrowsExactly(EmptyCollectionException.class, () -> newInstance(EMPTY).indexOfFirst(predicate0AsFail, MIN_INT_VALUE)); }
                @DisplayName("from (-1)")  @Test void fromMinus1() { assertThrowsExactly(EmptyCollectionException.class, () -> newInstance(EMPTY).indexOfFirst(predicate0AsFail, -1)); }
                @DisplayName("from (0)")   @Test void from0()      { assertThrowsExactly(EmptyCollectionException.class, () -> newInstance(EMPTY).indexOfFirst(predicate0AsFail, 0)); }
                @DisplayName("from (1)")   @Test void from1()      { assertThrowsExactly(EmptyCollectionException.class, () -> newInstance(EMPTY).indexOfFirst(predicate0AsFail, 1)); }
                @DisplayName("from (min)") @Test void fromMax()    { assertThrowsExactly(EmptyCollectionException.class, () -> newInstance(EMPTY).indexOfFirst(predicate0AsFail, MAX_INT_VALUE)); }
                @DisplayName("to (min)")   @Test void toMin()      { assertThrowsExactly(EmptyCollectionException.class, () -> newInstance(EMPTY).indexOfFirst(predicate0AsFail, null, MIN_INT_VALUE)); }
                @DisplayName("to (-1)")    @Test void toMinus1()   { assertThrowsExactly(EmptyCollectionException.class, () -> newInstance(EMPTY).indexOfFirst(predicate0AsFail, null, -1)); }
                @DisplayName("to (0)")     @Test void to0()        { assertThrowsExactly(EmptyCollectionException.class, () -> newInstance(EMPTY).indexOfFirst(predicate0AsFail, null, 0)); }
                @DisplayName("to (1)")     @Test void to1()        { assertThrowsExactly(EmptyCollectionException.class, () -> newInstance(EMPTY).indexOfFirst(predicate0AsFail, null, 1)); }
                @DisplayName("to (min)")   @Test void toMax()      { assertThrowsExactly(EmptyCollectionException.class, () -> newInstance(EMPTY).indexOfFirst(predicate0AsFail, null, MAX_INT_VALUE)); }
            }
            @DisplayName("boolean callbacks") @TestInstance(PER_CLASS) @Nested class BooleanCallbacks {
                @DisplayName("true: 0 arguments") @Nested class True0 {
                    @DisplayName("1 field")  @Test void test1() { assertEquals(0, newInstance(A)   .indexOfFirst(callback0AsTrue)); }
                    @DisplayName("2 fields") @Test void test2() { assertEquals(0, newInstance(AB)  .indexOfFirst(callback0AsTrue)); }
                    @DisplayName("4 fields") @Test void test4() { assertEquals(0, newInstance(ABCD).indexOfFirst(callback0AsTrue)); }
                }
                @DisplayName("true: 1 argument") @Nested class True1 {
                    @DisplayName("1 field")  @Test void test1() { assertEquals(0, newInstance(A)   .indexOfFirst(callback1AsTrue)); }
                    @DisplayName("2 fields") @Test void test2() { assertEquals(0, newInstance(AB)  .indexOfFirst(callback1AsTrue)); }
                    @DisplayName("4 fields") @Test void test4() { assertEquals(0, newInstance(ABCD).indexOfFirst(callback1AsTrue)); }
                }
                @DisplayName("true: 2 arguments") @Nested class True2 {
                    @DisplayName("1 field")  @Test void test1() { assertEquals(0, newInstance(A)   .indexOfFirst(callback2AsTrue)); }
                    @DisplayName("2 fields") @Test void test2() { assertEquals(0, newInstance(AB)  .indexOfFirst(callback2AsTrue)); }
                    @DisplayName("4 fields") @Test void test4() { assertEquals(0, newInstance(ABCD).indexOfFirst(callback2AsTrue)); }
                }
                @DisplayName("false: 0 arguments") @Nested class False0 {
                    @DisplayName("1 field")  @Test void test1() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A)   .indexOfFirst(callback0AsFalse)); }
                    @DisplayName("2 fields") @Test void test2() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(AB)  .indexOfFirst(callback0AsFalse)); }
                    @DisplayName("4 fields") @Test void test4() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABCD).indexOfFirst(callback0AsFalse)); }
                }
                @DisplayName("false: 1 argument") @Nested class False1 {
                    @DisplayName("1 field")  @Test void test1() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A)   .indexOfFirst(callback1AsFalse)); }
                    @DisplayName("2 fields") @Test void test2() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(AB)  .indexOfFirst(callback1AsFalse)); }
                    @DisplayName("4 fields") @Test void test4() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABCD).indexOfFirst(callback1AsFalse)); }
                }
                @DisplayName("false: 2 arguments") @Nested class False2 {
                    @DisplayName("1 field")  @Test void test1() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A)   .indexOfFirst(callback2AsFalse)); }
                    @DisplayName("2 fields") @Test void test2() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(AB)  .indexOfFirst(callback2AsFalse)); }
                    @DisplayName("4 fields") @Test void test4() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABCD).indexOfFirst(callback2AsFalse)); }
                }
            }
            @DisplayName("1 field") @Nested class Test1 {
                                  @Test void a()     { assertEquals(0,                                            newInstance(A).indexOfFirst(callbackIsA)); }
                                  @Test void e()     { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).indexOfFirst(callbackIsE)); }
                                  @Test void even()  { assertEquals(0,                                            newInstance(A).indexOfFirst(callbackIsEvenAlt)); }
                                  @Test void odd()   { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).indexOfFirst(callbackIsOddAlt)); }
                @DisplayName("0") @Test void test0() { assertEquals(0,                                            newInstance(A).indexOfFirst(callbackIs0Alt)); }
                @DisplayName("4") @Test void test4() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).indexOfFirst(callbackIs4Alt)); }
            }
            @DisplayName("2 fields") @Nested class Test2 {
                                  @Test void a()     { assertEquals(0,                                            newInstance(AB).indexOfFirst(callbackIsA)); }
                                  @Test void b()     { assertEquals(1,                                            newInstance(AB).indexOfFirst(callbackIsB)); }
                                  @Test void e()     { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(AB).indexOfFirst(callbackIsE)); }
                                  @Test void even()  { assertEquals(0,                                            newInstance(AB).indexOfFirst(callbackIsEvenAlt)); }
                                  @Test void odd()   { assertEquals(1,                                            newInstance(AB).indexOfFirst(callbackIsOddAlt)); }
                @DisplayName("0") @Test void test0() { assertEquals(0,                                            newInstance(AB).indexOfFirst(callbackIs0Alt)); }
                @DisplayName("1") @Test void test1() { assertEquals(1,                                            newInstance(AB).indexOfFirst(callbackIs1Alt)); }
                @DisplayName("4") @Test void test4() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(AB).indexOfFirst(callbackIs4Alt)); }
            }
            @DisplayName("4 fields") @Nested class Test4 {
                                  @Test void a()     { assertEquals(0,                                            newInstance(ABCD).indexOfFirst(callbackIsA)); }
                                  @Test void b()     { assertEquals(1,                                            newInstance(ABCD).indexOfFirst(callbackIsB)); }
                                  @Test void c()     { assertEquals(2,                                            newInstance(ABCD).indexOfFirst(callbackIsC)); }
                                  @Test void d()     { assertEquals(3,                                            newInstance(ABCD).indexOfFirst(callbackIsD)); }
                                  @Test void e()     { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABCD).indexOfFirst(callbackIsE)); }
                                  @Test void even()  { assertEquals(0,                                            newInstance(ABCD).indexOfFirst(callbackIsEvenAlt)); }
                                  @Test void odd()   { assertEquals(1,                                            newInstance(ABCD).indexOfFirst(callbackIsOddAlt)); }
                @DisplayName("0") @Test void test0() { assertEquals(0,                                            newInstance(ABCD).indexOfFirst(callbackIs0Alt)); }
                @DisplayName("1") @Test void test1() { assertEquals(1,                                            newInstance(ABCD).indexOfFirst(callbackIs1Alt)); }
                @DisplayName("2") @Test void test2() { assertEquals(2,                                            newInstance(ABCD).indexOfFirst(callbackIs2Alt)); }
                @DisplayName("3") @Test void test3() { assertEquals(3,                                            newInstance(ABCD).indexOfFirst(callbackIs3Alt)); }
                @DisplayName("4") @Test void test4() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABCD).indexOfFirst(callbackIs4Alt)); }
            }

            @Nested class from {
                                   @Test void min()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfFirst(predicate0AsFail, MIN_INT_VALUE)); }
                @DisplayName("-6") @Test void minus6() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfFirst(predicate0AsFail, -6)); }
                @DisplayName("-5") @Test void minus5() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfFirst(predicate0AsFail, -5)); }
                @DisplayName("-4") @Test void minus4() { assertEquals(0,                                            newInstance(ABAB).indexOfFirst(callbackIsA, -4)); }
                @DisplayName("-3") @Test void minus3() { assertEquals(2,                                            newInstance(ABAB).indexOfFirst(callbackIsA, -3)); }
                @DisplayName("-2") @Test void minus2() { assertEquals(2,                                            newInstance(ABAB).indexOfFirst(callbackIsA, -2)); }
                @DisplayName("-1") @Test void minus1() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfFirst(callbackIsA, -1)); }
                @DisplayName("0")  @Test void test0()  { assertEquals(0,                                            newInstance(ABAB).indexOfFirst(callbackIsA, 0)); }
                @DisplayName("1")  @Test void test1()  { assertEquals(2,                                            newInstance(ABAB).indexOfFirst(callbackIsA, 1)); }
                @DisplayName("2")  @Test void test2()  { assertEquals(2,                                            newInstance(ABAB).indexOfFirst(callbackIsA, 2)); }
                @DisplayName("3")  @Test void test3()  { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfFirst(callbackIsA, 3)); }
                @DisplayName("4")  @Test void test4()  { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfFirst(predicate0AsFail, 4)); }
                @DisplayName("5")  @Test void test5()  { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfFirst(predicate0AsFail, 5)); }
                                   @Test void max()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfFirst(predicate0AsFail, MAX_INT_VALUE)); }
            }
            @Nested class to {
                                   @Test void min()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfFirst(predicate0AsFail, null, MIN_INT_VALUE)); }
                @DisplayName("-6") @Test void minus6() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfFirst(predicate0AsFail, null, -6)); }
                @DisplayName("-5") @Test void minus5() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfFirst(predicate0AsFail, null, -5)); }
                @DisplayName("-4") @Test void minus4() { assertEquals(0,                                            newInstance(ABAB).indexOfFirst(callbackIsA, null, -4)); }
                @DisplayName("-3") @Test void minus3() { assertEquals(0,                                            newInstance(ABAB).indexOfFirst(callbackIsA, null, -3)); }
                @DisplayName("-2") @Test void minus2() { assertEquals(0,                                            newInstance(ABAB).indexOfFirst(callbackIsA, null, -2)); }
                @DisplayName("-1") @Test void minus1() { assertEquals(0,                                            newInstance(ABAB).indexOfFirst(callbackIsA, null, -1)); }
                @DisplayName("0")  @Test void test0()  { assertEquals(0,                                            newInstance(ABAB).indexOfFirst(callbackIsA, null, 0)); }
                @DisplayName("1")  @Test void test1()  { assertEquals(0,                                            newInstance(ABAB).indexOfFirst(callbackIsA, null, 1)); }
                @DisplayName("2")  @Test void test2()  { assertEquals(0,                                            newInstance(ABAB).indexOfFirst(callbackIsA, null, 2)); }
                @DisplayName("3")  @Test void test3()  { assertEquals(0,                                            newInstance(ABAB).indexOfFirst(callbackIsA, null, 3)); }
                @DisplayName("4")  @Test void test4()  { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfFirst(predicate0AsFail, null, 4)); }
                @DisplayName("5")  @Test void test5()  { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfFirst(predicate0AsFail, null, 5)); }
                                   @Test void max()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfFirst(predicate0AsFail, null, MAX_INT_VALUE)); }
            }
            @DisplayName("from + to") @Nested class fromTo {
                @DisplayName("min, min") @Test void minMin()  { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfFirst(predicate0AsFail, MIN_INT_VALUE, MIN_INT_VALUE)); }
                @DisplayName("min, 0")   @Test void min0()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfFirst(predicate0AsFail, MIN_INT_VALUE, 0)); }
                @DisplayName("min, 1")   @Test void min1()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfFirst(predicate0AsFail, MIN_INT_VALUE, 1)); }
                @DisplayName("min, 2")   @Test void min2()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfFirst(predicate0AsFail, MIN_INT_VALUE, 2)); }
                @DisplayName("min, 3")   @Test void min3()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfFirst(predicate0AsFail, MIN_INT_VALUE, 3)); }
                @DisplayName("min, max") @Test void minMax()  { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfFirst(predicate0AsFail, MIN_INT_VALUE, MAX_INT_VALUE)); }

                @DisplayName("0, min") @Test void test0_Min() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfFirst(predicate0AsFail, 0, MIN_INT_VALUE)); }
                @DisplayName("0, 0")   @Test void test0_0()   { assertEquals(0,                                            newInstance(ABAB).indexOfFirst(callbackIsA, 0, 0)); }
                @DisplayName("0, 1")   @Test void test0_1()   { assertEquals(0,                                            newInstance(ABAB).indexOfFirst(callbackIsA, 0, 1)); }
                @DisplayName("0, 2")   @Test void test0_2()   { assertEquals(0,                                            newInstance(ABAB).indexOfFirst(callbackIsA, 0, 2)); }
                @DisplayName("0, 3")   @Test void test0_3()   { assertEquals(0,                                            newInstance(ABAB).indexOfFirst(callbackIsA, 0, 3)); }
                @DisplayName("0, max") @Test void test0_Max() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfFirst(predicate0AsFail, 0, MAX_INT_VALUE)); }

                @DisplayName("1, min") @Test void test1_Min() { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(ABAB).indexOfFirst(predicate0AsFail, 1, MIN_INT_VALUE)); }
                @DisplayName("1, 0")   @Test void test1_0()   { assertThrowsExactly(InvalidIndexRangeException.class, () -> newInstance(ABAB).indexOfFirst(predicate0AsFail, 1, 0)); }
                @DisplayName("1, 1")   @Test void test1_1()   { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(ABAB).indexOfFirst(callbackIsA, 1, 1)); }
                @DisplayName("1, 2")   @Test void test1_2()   { assertEquals(2,                                             newInstance(ABAB).indexOfFirst(callbackIsA, 1, 2)); }
                @DisplayName("1, 3")   @Test void test1_3()   { assertEquals(2,                                             newInstance(ABAB).indexOfFirst(callbackIsA, 1, 3)); }
                @DisplayName("1, max") @Test void test1_Max() { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(ABAB).indexOfFirst(predicate0AsFail, 1, MAX_INT_VALUE)); }

                @DisplayName("2, min") @Test void test2_Min() { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(ABAB).indexOfFirst(predicate0AsFail, 2, MIN_INT_VALUE)); }
                @DisplayName("2, 0")   @Test void test2_0()   { assertThrowsExactly(InvalidIndexRangeException.class, () -> newInstance(ABAB).indexOfFirst(predicate0AsFail, 2, 0)); }
                @DisplayName("2, 1")   @Test void test2_1()   { assertThrowsExactly(InvalidIndexRangeException.class, () -> newInstance(ABAB).indexOfFirst(predicate0AsFail, 2, 1)); }
                @DisplayName("2, 2")   @Test void test2_2()   { assertEquals(2,                                             newInstance(ABAB).indexOfFirst(callbackIsA, 2, 2)); }
                @DisplayName("2, 3")   @Test void test2_3()   { assertEquals(2,                                             newInstance(ABAB).indexOfFirst(callbackIsA, 2, 3)); }
                @DisplayName("2, max") @Test void test2_Max() { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(ABAB).indexOfFirst(predicate0AsFail, 2, MAX_INT_VALUE)); }

                @DisplayName("3, min") @Test void test3_Min() { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(ABAB).indexOfFirst(predicate0AsFail, 3, MIN_INT_VALUE)); }
                @DisplayName("3, 0")   @Test void test3_0()   { assertThrowsExactly(InvalidIndexRangeException.class, () -> newInstance(ABAB).indexOfFirst(predicate0AsFail, 3, 0)); }
                @DisplayName("3, 1")   @Test void test3_1()   { assertThrowsExactly(InvalidIndexRangeException.class, () -> newInstance(ABAB).indexOfFirst(predicate0AsFail, 3, 1)); }
                @DisplayName("3, 2")   @Test void test3_2()   { assertThrowsExactly(InvalidIndexRangeException.class, () -> newInstance(ABAB).indexOfFirst(predicate0AsFail, 3, 2)); }
                @DisplayName("3, 3")   @Test void test3_3()   { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(ABAB).indexOfFirst(callbackIsA, 3, 3)); }
                @DisplayName("3, max") @Test void test3_Max() { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(ABAB).indexOfFirst(predicate0AsFail, 3, MAX_INT_VALUE)); }

                @DisplayName("max, min") @Test void maxMin()  { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfFirst(predicate0AsFail, MAX_INT_VALUE, MIN_INT_VALUE)); }
                @DisplayName("max, 0")   @Test void max0()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfFirst(predicate0AsFail, MAX_INT_VALUE, 0)); }
                @DisplayName("max, 1")   @Test void max1()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfFirst(predicate0AsFail, MAX_INT_VALUE, 1)); }
                @DisplayName("max, 2")   @Test void max2()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfFirst(predicate0AsFail, MAX_INT_VALUE, 2)); }
                @DisplayName("max, 3")   @Test void max3()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfFirst(predicate0AsFail, MAX_INT_VALUE, 3)); }
                @DisplayName("max, max") @Test void maxMax()  { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfFirst(predicate0AsFail, MAX_INT_VALUE, MAX_INT_VALUE)); }
            }
        }
        @TestInstance(PER_CLASS) @Nested class indexOfFirstOrNull {
            @Nested class empty {
                                           @Test void direct()     { assertNull(newInstance(EMPTY).indexOfFirstOrNull(predicate0AsFail)); }
                @DisplayName("from (min)") @Test void fromMin()    { assertNull(newInstance(EMPTY).indexOfFirstOrNull(predicate0AsFail, MIN_INT_VALUE)); }
                @DisplayName("from (-1)")  @Test void fromMinus1() { assertNull(newInstance(EMPTY).indexOfFirstOrNull(predicate0AsFail, -1)); }
                @DisplayName("from (0)")   @Test void from0()      { assertNull(newInstance(EMPTY).indexOfFirstOrNull(predicate0AsFail, 0)); }
                @DisplayName("from (1)")   @Test void from1()      { assertNull(newInstance(EMPTY).indexOfFirstOrNull(predicate0AsFail, 1)); }
                @DisplayName("from (min)") @Test void fromMax()    { assertNull(newInstance(EMPTY).indexOfFirstOrNull(predicate0AsFail, MAX_INT_VALUE)); }
                @DisplayName("to (min)")   @Test void toMin()      { assertNull(newInstance(EMPTY).indexOfFirstOrNull(predicate0AsFail, null, MIN_INT_VALUE)); }
                @DisplayName("to (-1)")    @Test void toMinus1()   { assertNull(newInstance(EMPTY).indexOfFirstOrNull(predicate0AsFail, null, -1)); }
                @DisplayName("to (0)")     @Test void to0()        { assertNull(newInstance(EMPTY).indexOfFirstOrNull(predicate0AsFail, null, 0)); }
                @DisplayName("to (1)")     @Test void to1()        { assertNull(newInstance(EMPTY).indexOfFirstOrNull(predicate0AsFail, null, 1)); }
                @DisplayName("to (min)")   @Test void toMax()      { assertNull(newInstance(EMPTY).indexOfFirstOrNull(predicate0AsFail, null, MAX_INT_VALUE)); }
            }
            @DisplayName("boolean callbacks") @TestInstance(PER_CLASS) @Nested class BooleanCallbacks {
                @DisplayName("true: 0 arguments") @Nested class True0 {
                    @DisplayName("1 field")  @Test void test1() { assertEquals(0, newInstance(A)   .indexOfFirstOrNull(callback0AsTrue)); }
                    @DisplayName("2 fields") @Test void test2() { assertEquals(0, newInstance(AB)  .indexOfFirstOrNull(callback0AsTrue)); }
                    @DisplayName("4 fields") @Test void test4() { assertEquals(0, newInstance(ABCD).indexOfFirstOrNull(callback0AsTrue)); }
                }
                @DisplayName("true: 1 argument") @Nested class True1 {
                    @DisplayName("1 field")  @Test void test1() { assertEquals(0, newInstance(A)   .indexOfFirstOrNull(callback1AsTrue)); }
                    @DisplayName("2 fields") @Test void test2() { assertEquals(0, newInstance(AB)  .indexOfFirstOrNull(callback1AsTrue)); }
                    @DisplayName("4 fields") @Test void test4() { assertEquals(0, newInstance(ABCD).indexOfFirstOrNull(callback1AsTrue)); }
                }
                @DisplayName("true: 2 arguments") @Nested class True2 {
                    @DisplayName("1 field")  @Test void test1() { assertEquals(0, newInstance(A)   .indexOfFirstOrNull(callback2AsTrue)); }
                    @DisplayName("2 fields") @Test void test2() { assertEquals(0, newInstance(AB)  .indexOfFirstOrNull(callback2AsTrue)); }
                    @DisplayName("4 fields") @Test void test4() { assertEquals(0, newInstance(ABCD).indexOfFirstOrNull(callback2AsTrue)); }
                }
                @DisplayName("false: 0 arguments") @Nested class False0 {
                    @DisplayName("1 field")  @Test void test1() { assertNull(newInstance(A)   .indexOfFirstOrNull(callback0AsFalse)); }
                    @DisplayName("2 fields") @Test void test2() { assertNull(newInstance(AB)  .indexOfFirstOrNull(callback0AsFalse)); }
                    @DisplayName("4 fields") @Test void test4() { assertNull(newInstance(ABCD).indexOfFirstOrNull(callback0AsFalse)); }
                }
                @DisplayName("false: 1 argument") @Nested class False1 {
                    @DisplayName("1 field")  @Test void test1() { assertNull(newInstance(A)   .indexOfFirstOrNull(callback1AsFalse)); }
                    @DisplayName("2 fields") @Test void test2() { assertNull(newInstance(AB)  .indexOfFirstOrNull(callback1AsFalse)); }
                    @DisplayName("4 fields") @Test void test4() { assertNull(newInstance(ABCD).indexOfFirstOrNull(callback1AsFalse)); }
                }
                @DisplayName("false: 2 arguments") @Nested class False2 {
                    @DisplayName("1 field")  @Test void test1() { assertNull(newInstance(A)   .indexOfFirstOrNull(callback2AsFalse)); }
                    @DisplayName("2 fields") @Test void test2() { assertNull(newInstance(AB)  .indexOfFirstOrNull(callback2AsFalse)); }
                    @DisplayName("4 fields") @Test void test4() { assertNull(newInstance(ABCD).indexOfFirstOrNull(callback2AsFalse)); }
                }
            }
            @DisplayName("1 field") @Nested class Test1 {
                                  @Test void a()     { assertEquals(0, newInstance(A).indexOfFirstOrNull(callbackIsA)); }
                                  @Test void e()     { assertNull(     newInstance(A).indexOfFirstOrNull(callbackIsE)); }
                                  @Test void even()  { assertEquals(0, newInstance(A).indexOfFirstOrNull(callbackIsEvenAlt)); }
                                  @Test void odd()   { assertNull(     newInstance(A).indexOfFirstOrNull(callbackIsOddAlt)); }
                @DisplayName("0") @Test void test0() { assertEquals(0, newInstance(A).indexOfFirstOrNull(callbackIs0Alt)); }
                @DisplayName("4") @Test void test4() { assertNull(     newInstance(A).indexOfFirstOrNull(callbackIs4Alt)); }
            }
            @DisplayName("2 fields") @Nested class Test2 {
                                  @Test void a()     { assertEquals(0, newInstance(AB).indexOfFirstOrNull(callbackIsA)); }
                                  @Test void b()     { assertEquals(1, newInstance(AB).indexOfFirstOrNull(callbackIsB)); }
                                  @Test void e()     { assertNull(     newInstance(AB).indexOfFirstOrNull(callbackIsE)); }
                                  @Test void even()  { assertEquals(0, newInstance(AB).indexOfFirstOrNull(callbackIsEvenAlt)); }
                                  @Test void odd()   { assertEquals(1, newInstance(AB).indexOfFirstOrNull(callbackIsOddAlt)); }
                @DisplayName("0") @Test void test0() { assertEquals(0, newInstance(AB).indexOfFirstOrNull(callbackIs0Alt)); }
                @DisplayName("1") @Test void test1() { assertEquals(1, newInstance(AB).indexOfFirstOrNull(callbackIs1Alt)); }
                @DisplayName("4") @Test void test4() { assertNull(     newInstance(AB).indexOfFirstOrNull(callbackIs4Alt)); }
            }
            @DisplayName("4 fields") @Nested class Test4 {
                                  @Test void a()     { assertEquals(0, newInstance(ABCD).indexOfFirstOrNull(callbackIsA)); }
                                  @Test void b()     { assertEquals(1, newInstance(ABCD).indexOfFirstOrNull(callbackIsB)); }
                                  @Test void c()     { assertEquals(2, newInstance(ABCD).indexOfFirstOrNull(callbackIsC)); }
                                  @Test void d()     { assertEquals(3, newInstance(ABCD).indexOfFirstOrNull(callbackIsD)); }
                                  @Test void e()     { assertNull(     newInstance(ABCD).indexOfFirstOrNull(callbackIsE)); }
                                  @Test void even()  { assertEquals(0, newInstance(ABCD).indexOfFirstOrNull(callbackIsEvenAlt)); }
                                  @Test void odd()   { assertEquals(1, newInstance(ABCD).indexOfFirstOrNull(callbackIsOddAlt)); }
                @DisplayName("0") @Test void test0() { assertEquals(0, newInstance(ABCD).indexOfFirstOrNull(callbackIs0Alt)); }
                @DisplayName("1") @Test void test1() { assertEquals(1, newInstance(ABCD).indexOfFirstOrNull(callbackIs1Alt)); }
                @DisplayName("2") @Test void test2() { assertEquals(2, newInstance(ABCD).indexOfFirstOrNull(callbackIs2Alt)); }
                @DisplayName("3") @Test void test3() { assertEquals(3, newInstance(ABCD).indexOfFirstOrNull(callbackIs3Alt)); }
                @DisplayName("4") @Test void test4() { assertNull(     newInstance(ABCD).indexOfFirstOrNull(callbackIs4Alt)); }
            }

            @Nested class from {
                                   @Test void min()    { assertNull(     newInstance(ABAB).indexOfFirstOrNull(predicate0AsFail, MIN_INT_VALUE)); }
                @DisplayName("-6") @Test void minus6() { assertNull(     newInstance(ABAB).indexOfFirstOrNull(predicate0AsFail, -6)); }
                @DisplayName("-5") @Test void minus5() { assertNull(     newInstance(ABAB).indexOfFirstOrNull(predicate0AsFail, -5)); }
                @DisplayName("-4") @Test void minus4() { assertEquals(0, newInstance(ABAB).indexOfFirstOrNull(callbackIsA, -4)); }
                @DisplayName("-3") @Test void minus3() { assertEquals(2, newInstance(ABAB).indexOfFirstOrNull(callbackIsA, -3)); }
                @DisplayName("-2") @Test void minus2() { assertEquals(2, newInstance(ABAB).indexOfFirstOrNull(callbackIsA, -2)); }
                @DisplayName("-1") @Test void minus1() { assertNull(     newInstance(ABAB).indexOfFirstOrNull(callbackIsA, -1)); }
                @DisplayName("0")  @Test void test0()  { assertEquals(0, newInstance(ABAB).indexOfFirstOrNull(callbackIsA, 0)); }
                @DisplayName("1")  @Test void test1()  { assertEquals(2, newInstance(ABAB).indexOfFirstOrNull(callbackIsA, 1)); }
                @DisplayName("2")  @Test void test2()  { assertEquals(2, newInstance(ABAB).indexOfFirstOrNull(callbackIsA, 2)); }
                @DisplayName("3")  @Test void test3()  { assertNull(     newInstance(ABAB).indexOfFirstOrNull(callbackIsA, 3)); }
                @DisplayName("4")  @Test void test4()  { assertNull(     newInstance(ABAB).indexOfFirstOrNull(predicate0AsFail, 4)); }
                @DisplayName("5")  @Test void test5()  { assertNull(     newInstance(ABAB).indexOfFirstOrNull(predicate0AsFail, 5)); }
                                   @Test void max()    { assertNull(     newInstance(ABAB).indexOfFirstOrNull(predicate0AsFail, MAX_INT_VALUE)); }
            }
            @Nested class to {
                                   @Test void min()    { assertNull(     newInstance(ABAB).indexOfFirstOrNull(predicate0AsFail, null, MIN_INT_VALUE)); }
                @DisplayName("-6") @Test void minus6() { assertNull(     newInstance(ABAB).indexOfFirstOrNull(predicate0AsFail, null, -6)); }
                @DisplayName("-5") @Test void minus5() { assertNull(     newInstance(ABAB).indexOfFirstOrNull(predicate0AsFail, null, -5)); }
                @DisplayName("-4") @Test void minus4() { assertEquals(0, newInstance(ABAB).indexOfFirstOrNull(callbackIsA, null, -4)); }
                @DisplayName("-3") @Test void minus3() { assertEquals(0, newInstance(ABAB).indexOfFirstOrNull(callbackIsA, null, -3)); }
                @DisplayName("-2") @Test void minus2() { assertEquals(0, newInstance(ABAB).indexOfFirstOrNull(callbackIsA, null, -2)); }
                @DisplayName("-1") @Test void minus1() { assertEquals(0, newInstance(ABAB).indexOfFirstOrNull(callbackIsA, null, -1)); }
                @DisplayName("0")  @Test void test0()  { assertEquals(0, newInstance(ABAB).indexOfFirstOrNull(callbackIsA, null, 0)); }
                @DisplayName("1")  @Test void test1()  { assertEquals(0, newInstance(ABAB).indexOfFirstOrNull(callbackIsA, null, 1)); }
                @DisplayName("2")  @Test void test2()  { assertEquals(0, newInstance(ABAB).indexOfFirstOrNull(callbackIsA, null, 2)); }
                @DisplayName("3")  @Test void test3()  { assertEquals(0, newInstance(ABAB).indexOfFirstOrNull(callbackIsA, null, 3)); }
                @DisplayName("4")  @Test void test4()  { assertNull(     newInstance(ABAB).indexOfFirstOrNull(predicate0AsFail, null, 4)); }
                @DisplayName("5")  @Test void test5()  { assertNull(     newInstance(ABAB).indexOfFirstOrNull(predicate0AsFail, null, 5)); }
                                   @Test void max()    { assertNull(     newInstance(ABAB).indexOfFirstOrNull(predicate0AsFail, null, MAX_INT_VALUE)); }
            }
            @DisplayName("from + to") @Nested class fromTo {
                @DisplayName("min, min") @Test void minMin()  { assertNull(newInstance(ABAB).indexOfFirstOrNull(predicate0AsFail, MIN_INT_VALUE, MIN_INT_VALUE)); }
                @DisplayName("min, 0")   @Test void min0()    { assertNull(newInstance(ABAB).indexOfFirstOrNull(predicate0AsFail, MIN_INT_VALUE, 0)); }
                @DisplayName("min, 1")   @Test void min1()    { assertNull(newInstance(ABAB).indexOfFirstOrNull(predicate0AsFail, MIN_INT_VALUE, 1)); }
                @DisplayName("min, 2")   @Test void min2()    { assertNull(newInstance(ABAB).indexOfFirstOrNull(predicate0AsFail, MIN_INT_VALUE, 2)); }
                @DisplayName("min, 3")   @Test void min3()    { assertNull(newInstance(ABAB).indexOfFirstOrNull(predicate0AsFail, MIN_INT_VALUE, 3)); }
                @DisplayName("min, max") @Test void minMax()  { assertNull(newInstance(ABAB).indexOfFirstOrNull(predicate0AsFail, MIN_INT_VALUE, MAX_INT_VALUE)); }

                @DisplayName("0, min") @Test void test0_Min() { assertNull(     newInstance(ABAB).indexOfFirstOrNull(predicate0AsFail, 0, MIN_INT_VALUE)); }
                @DisplayName("0, 0")   @Test void test0_0()   { assertEquals(0, newInstance(ABAB).indexOfFirstOrNull(callbackIsA, 0, 0)); }
                @DisplayName("0, 1")   @Test void test0_1()   { assertEquals(0, newInstance(ABAB).indexOfFirstOrNull(callbackIsA, 0, 1)); }
                @DisplayName("0, 2")   @Test void test0_2()   { assertEquals(0, newInstance(ABAB).indexOfFirstOrNull(callbackIsA, 0, 2)); }
                @DisplayName("0, 3")   @Test void test0_3()   { assertEquals(0, newInstance(ABAB).indexOfFirstOrNull(callbackIsA, 0, 3)); }
                @DisplayName("0, max") @Test void test0_Max() { assertNull(     newInstance(ABAB).indexOfFirstOrNull(predicate0AsFail, 0, MAX_INT_VALUE)); }

                @DisplayName("1, min") @Test void test1_Min() { assertNull(     newInstance(ABAB).indexOfFirstOrNull(predicate0AsFail, 1, MIN_INT_VALUE)); }
                @DisplayName("1, 0")   @Test void test1_0()   { assertNull(     newInstance(ABAB).indexOfFirstOrNull(predicate0AsFail, 1, 0)); }
                @DisplayName("1, 1")   @Test void test1_1()   { assertNull(     newInstance(ABAB).indexOfFirstOrNull(callbackIsA, 1, 1)); }
                @DisplayName("1, 2")   @Test void test1_2()   { assertEquals(2, newInstance(ABAB).indexOfFirstOrNull(callbackIsA, 1, 2)); }
                @DisplayName("1, 3")   @Test void test1_3()   { assertEquals(2, newInstance(ABAB).indexOfFirstOrNull(callbackIsA, 1, 3)); }
                @DisplayName("1, max") @Test void test1_Max() { assertNull(     newInstance(ABAB).indexOfFirstOrNull(predicate0AsFail, 1, MAX_INT_VALUE)); }

                @DisplayName("2, min") @Test void test2_Min() { assertNull(     newInstance(ABAB).indexOfFirstOrNull(predicate0AsFail, 2, MIN_INT_VALUE)); }
                @DisplayName("2, 0")   @Test void test2_0()   { assertNull(     newInstance(ABAB).indexOfFirstOrNull(predicate0AsFail, 2, 0)); }
                @DisplayName("2, 1")   @Test void test2_1()   { assertNull(     newInstance(ABAB).indexOfFirstOrNull(predicate0AsFail, 2, 1)); }
                @DisplayName("2, 2")   @Test void test2_2()   { assertEquals(2, newInstance(ABAB).indexOfFirstOrNull(callbackIsA, 2, 2)); }
                @DisplayName("2, 3")   @Test void test2_3()   { assertEquals(2, newInstance(ABAB).indexOfFirstOrNull(callbackIsA, 2, 3)); }
                @DisplayName("2, max") @Test void test2_Max() { assertNull(     newInstance(ABAB).indexOfFirstOrNull(predicate0AsFail, 2, MAX_INT_VALUE)); }

                @DisplayName("3, min") @Test void test3_Min() { assertNull(newInstance(ABAB).indexOfFirstOrNull(predicate0AsFail, 3, MIN_INT_VALUE)); }
                @DisplayName("3, 0")   @Test void test3_0()   { assertNull(newInstance(ABAB).indexOfFirstOrNull(predicate0AsFail, 3, 0)); }
                @DisplayName("3, 1")   @Test void test3_1()   { assertNull(newInstance(ABAB).indexOfFirstOrNull(predicate0AsFail, 3, 1)); }
                @DisplayName("3, 2")   @Test void test3_2()   { assertNull(newInstance(ABAB).indexOfFirstOrNull(predicate0AsFail, 3, 2)); }
                @DisplayName("3, 3")   @Test void test3_3()   { assertNull(newInstance(ABAB).indexOfFirstOrNull(callbackIsA, 3, 3)); }
                @DisplayName("3, max") @Test void test3_Max() { assertNull(newInstance(ABAB).indexOfFirstOrNull(predicate0AsFail, 3, MAX_INT_VALUE)); }

                @DisplayName("max, min") @Test void maxMin()  { assertNull(newInstance(ABAB).indexOfFirstOrNull(predicate0AsFail, MAX_INT_VALUE, MIN_INT_VALUE)); }
                @DisplayName("max, 0")   @Test void max0()    { assertNull(newInstance(ABAB).indexOfFirstOrNull(predicate0AsFail, MAX_INT_VALUE, 0)); }
                @DisplayName("max, 1")   @Test void max1()    { assertNull(newInstance(ABAB).indexOfFirstOrNull(predicate0AsFail, MAX_INT_VALUE, 1)); }
                @DisplayName("max, 2")   @Test void max2()    { assertNull(newInstance(ABAB).indexOfFirstOrNull(predicate0AsFail, MAX_INT_VALUE, 2)); }
                @DisplayName("max, 3")   @Test void max3()    { assertNull(newInstance(ABAB).indexOfFirstOrNull(predicate0AsFail, MAX_INT_VALUE, 3)); }
                @DisplayName("max, max") @Test void maxMax()  { assertNull(newInstance(ABAB).indexOfFirstOrNull(predicate0AsFail, MAX_INT_VALUE, MAX_INT_VALUE)); }
            }
        }
        @TestInstance(PER_CLASS) @Nested class indexOfFirstIndexed {
            @Nested class empty {
                                           @Test void direct()     { assertThrowsExactly(EmptyCollectionException.class, () -> newInstance(EMPTY).indexOfFirstIndexed(predicate0AsFail)); }
                @DisplayName("from (min)") @Test void fromMin()    { assertThrowsExactly(EmptyCollectionException.class, () -> newInstance(EMPTY).indexOfFirstIndexed(predicate0AsFail, MIN_INT_VALUE)); }
                @DisplayName("from (-1)")  @Test void fromMinus1() { assertThrowsExactly(EmptyCollectionException.class, () -> newInstance(EMPTY).indexOfFirstIndexed(predicate0AsFail, -1)); }
                @DisplayName("from (0)")   @Test void from0()      { assertThrowsExactly(EmptyCollectionException.class, () -> newInstance(EMPTY).indexOfFirstIndexed(predicate0AsFail, 0)); }
                @DisplayName("from (1)")   @Test void from1()      { assertThrowsExactly(EmptyCollectionException.class, () -> newInstance(EMPTY).indexOfFirstIndexed(predicate0AsFail, 1)); }
                @DisplayName("from (min)") @Test void fromMax()    { assertThrowsExactly(EmptyCollectionException.class, () -> newInstance(EMPTY).indexOfFirstIndexed(predicate0AsFail, MAX_INT_VALUE)); }
                @DisplayName("to (min)")   @Test void toMin()      { assertThrowsExactly(EmptyCollectionException.class, () -> newInstance(EMPTY).indexOfFirstIndexed(predicate0AsFail, null, MIN_INT_VALUE)); }
                @DisplayName("to (-1)")    @Test void toMinus1()   { assertThrowsExactly(EmptyCollectionException.class, () -> newInstance(EMPTY).indexOfFirstIndexed(predicate0AsFail, null, -1)); }
                @DisplayName("to (0)")     @Test void to0()        { assertThrowsExactly(EmptyCollectionException.class, () -> newInstance(EMPTY).indexOfFirstIndexed(predicate0AsFail, null, 0)); }
                @DisplayName("to (1)")     @Test void to1()        { assertThrowsExactly(EmptyCollectionException.class, () -> newInstance(EMPTY).indexOfFirstIndexed(predicate0AsFail, null, 1)); }
                @DisplayName("to (min)")   @Test void toMax()      { assertThrowsExactly(EmptyCollectionException.class, () -> newInstance(EMPTY).indexOfFirstIndexed(predicate0AsFail, null, MAX_INT_VALUE)); }
            }
            @DisplayName("boolean callbacks") @TestInstance(PER_CLASS) @Nested class BooleanCallbacks {
                @DisplayName("true: 0 arguments") @Nested class True0 {
                    @DisplayName("1 field")  @Test void test1() { assertEquals(0, newInstance(A)   .indexOfFirstIndexed(callback0AsTrue)); }
                    @DisplayName("2 fields") @Test void test2() { assertEquals(0, newInstance(AB)  .indexOfFirstIndexed(callback0AsTrue)); }
                    @DisplayName("4 fields") @Test void test4() { assertEquals(0, newInstance(ABCD).indexOfFirstIndexed(callback0AsTrue)); }
                }
                @DisplayName("true: 1 argument") @Nested class True1 {
                    @DisplayName("1 field")  @Test void test1() { assertEquals(0, newInstance(A)   .indexOfFirstIndexed(callback1AltAsTrue)); }
                    @DisplayName("2 fields") @Test void test2() { assertEquals(0, newInstance(AB)  .indexOfFirstIndexed(callback1AltAsTrue)); }
                    @DisplayName("4 fields") @Test void test4() { assertEquals(0, newInstance(ABCD).indexOfFirstIndexed(callback1AltAsTrue)); }
                }
                @DisplayName("true: 2 arguments") @Nested class True2 {
                    @DisplayName("1 field")  @Test void test1() { assertEquals(0, newInstance(A)   .indexOfFirstIndexed(callback2AltAsTrue)); }
                    @DisplayName("2 fields") @Test void test2() { assertEquals(0, newInstance(AB)  .indexOfFirstIndexed(callback2AltAsTrue)); }
                    @DisplayName("4 fields") @Test void test4() { assertEquals(0, newInstance(ABCD).indexOfFirstIndexed(callback2AltAsTrue)); }
                }
                @DisplayName("false: 0 arguments") @Nested class False0 {
                    @DisplayName("1 field")  @Test void test1() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A)   .indexOfFirstIndexed(callback0AsFalse)); }
                    @DisplayName("2 fields") @Test void test2() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(AB)  .indexOfFirstIndexed(callback0AsFalse)); }
                    @DisplayName("4 fields") @Test void test4() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABCD).indexOfFirstIndexed(callback0AsFalse)); }
                }
                @DisplayName("false: 1 argument") @Nested class False1 {
                    @DisplayName("1 field")  @Test void test1() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A)   .indexOfFirstIndexed(callback1AltAsFalse)); }
                    @DisplayName("2 fields") @Test void test2() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(AB)  .indexOfFirstIndexed(callback1AltAsFalse)); }
                    @DisplayName("4 fields") @Test void test4() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABCD).indexOfFirstIndexed(callback1AltAsFalse)); }
                }
                @DisplayName("false: 2 arguments") @Nested class False2 {
                    @DisplayName("1 field")  @Test void test1() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A)   .indexOfFirstIndexed(callback2AltAsFalse)); }
                    @DisplayName("2 fields") @Test void test2() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(AB)  .indexOfFirstIndexed(callback2AltAsFalse)); }
                    @DisplayName("4 fields") @Test void test4() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABCD).indexOfFirstIndexed(callback2AltAsFalse)); }
                }
            }
            @DisplayName("1 field") @Nested class Test1 {
                                  @Test void a()     { assertEquals(0,                                            newInstance(A).indexOfFirstIndexed(callbackIsAAlt)); }
                                  @Test void e()     { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).indexOfFirstIndexed(callbackIsEAlt)); }
                                  @Test void even()  { assertEquals(0,                                            newInstance(A).indexOfFirstIndexed(callbackIsEven)); }
                                  @Test void odd()   { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).indexOfFirstIndexed(callbackIsOdd)); }
                @DisplayName("0") @Test void test0() { assertEquals(0,                                            newInstance(A).indexOfFirstIndexed(callbackIs0)); }
                @DisplayName("4") @Test void test4() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).indexOfFirstIndexed(callbackIs4)); }
            }
            @DisplayName("2 fields") @Nested class Test2 {
                                  @Test void a()     { assertEquals(0,                                            newInstance(AB).indexOfFirstIndexed(callbackIsAAlt)); }
                                  @Test void b()     { assertEquals(1,                                            newInstance(AB).indexOfFirstIndexed(callbackIsBAlt)); }
                                  @Test void e()     { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(AB).indexOfFirstIndexed(callbackIsEAlt)); }
                                  @Test void even()  { assertEquals(0,                                            newInstance(AB).indexOfFirstIndexed(callbackIsEven)); }
                                  @Test void odd()   { assertEquals(1,                                            newInstance(AB).indexOfFirstIndexed(callbackIsOdd)); }
                @DisplayName("0") @Test void test0() { assertEquals(0,                                            newInstance(AB).indexOfFirstIndexed(callbackIs0)); }
                @DisplayName("1") @Test void test1() { assertEquals(1,                                            newInstance(AB).indexOfFirstIndexed(callbackIs1)); }
                @DisplayName("4") @Test void test4() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(AB).indexOfFirstIndexed(callbackIs4)); }
            }
            @DisplayName("4 fields") @Nested class Test4 {
                                  @Test void a()     { assertEquals(0,                                            newInstance(ABCD).indexOfFirstIndexed(callbackIsAAlt)); }
                                  @Test void b()     { assertEquals(1,                                            newInstance(ABCD).indexOfFirstIndexed(callbackIsBAlt)); }
                                  @Test void c()     { assertEquals(2,                                            newInstance(ABCD).indexOfFirstIndexed(callbackIsCAlt)); }
                                  @Test void d()     { assertEquals(3,                                            newInstance(ABCD).indexOfFirstIndexed(callbackIsDAlt)); }
                                  @Test void e()     { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABCD).indexOfFirstIndexed(callbackIsEAlt)); }
                                  @Test void even()  { assertEquals(0,                                            newInstance(ABCD).indexOfFirstIndexed(callbackIsEven)); }
                                  @Test void odd()   { assertEquals(1,                                            newInstance(ABCD).indexOfFirstIndexed(callbackIsOdd)); }
                @DisplayName("0") @Test void test0() { assertEquals(0,                                            newInstance(ABCD).indexOfFirstIndexed(callbackIs0)); }
                @DisplayName("1") @Test void test1() { assertEquals(1,                                            newInstance(ABCD).indexOfFirstIndexed(callbackIs1)); }
                @DisplayName("2") @Test void test2() { assertEquals(2,                                            newInstance(ABCD).indexOfFirstIndexed(callbackIs2)); }
                @DisplayName("3") @Test void test3() { assertEquals(3,                                            newInstance(ABCD).indexOfFirstIndexed(callbackIs3)); }
                @DisplayName("4") @Test void test4() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABCD).indexOfFirstIndexed(callbackIs4)); }
            }

            @Nested class from {
                                   @Test void min()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfFirstIndexed(predicate0AsFail, MIN_INT_VALUE)); }
                @DisplayName("-6") @Test void minus6() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfFirstIndexed(predicate0AsFail, -6)); }
                @DisplayName("-5") @Test void minus5() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfFirstIndexed(predicate0AsFail, -5)); }
                @DisplayName("-4") @Test void minus4() { assertEquals(0,                                            newInstance(ABAB).indexOfFirstIndexed(callbackIsEven, -4)); }
                @DisplayName("-3") @Test void minus3() { assertEquals(2,                                            newInstance(ABAB).indexOfFirstIndexed(callbackIsEven, -3)); }
                @DisplayName("-2") @Test void minus2() { assertEquals(2,                                            newInstance(ABAB).indexOfFirstIndexed(callbackIsEven, -2)); }
                @DisplayName("-1") @Test void minus1() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfFirstIndexed(callbackIsEven, -1)); }
                @DisplayName("0")  @Test void test0()  { assertEquals(0,                                            newInstance(ABAB).indexOfFirstIndexed(callbackIsEven, 0)); }
                @DisplayName("1")  @Test void test1()  { assertEquals(2,                                            newInstance(ABAB).indexOfFirstIndexed(callbackIsEven, 1)); }
                @DisplayName("2")  @Test void test2()  { assertEquals(2,                                            newInstance(ABAB).indexOfFirstIndexed(callbackIsEven, 2)); }
                @DisplayName("3")  @Test void test3()  { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfFirstIndexed(callbackIsEven, 3)); }
                @DisplayName("4")  @Test void test4()  { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfFirstIndexed(callbackIsEven, 4)); }
                @DisplayName("5")  @Test void test5()  { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfFirstIndexed(predicate0AsFail, 5)); }
                                   @Test void max()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfFirstIndexed(predicate0AsFail, MAX_INT_VALUE)); }
            }
            @Nested class to {
                                   @Test void min()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfFirstIndexed(predicate0AsFail, null, MIN_INT_VALUE)); }
                @DisplayName("-6") @Test void minus6() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfFirstIndexed(predicate0AsFail, null, -6)); }
                @DisplayName("-5") @Test void minus5() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfFirstIndexed(predicate0AsFail, null, -5)); }
                @DisplayName("-4") @Test void minus4() { assertEquals(0,                                            newInstance(ABAB).indexOfFirstIndexed(callbackIsEven, null, -4)); }
                @DisplayName("-3") @Test void minus3() { assertEquals(0,                                            newInstance(ABAB).indexOfFirstIndexed(callbackIsEven, null, -3)); }
                @DisplayName("-2") @Test void minus2() { assertEquals(0,                                            newInstance(ABAB).indexOfFirstIndexed(callbackIsEven, null, -2)); }
                @DisplayName("-1") @Test void minus1() { assertEquals(0,                                            newInstance(ABAB).indexOfFirstIndexed(callbackIsEven, null, -1)); }
                @DisplayName("0")  @Test void test0()  { assertEquals(0,                                            newInstance(ABAB).indexOfFirstIndexed(callbackIsEven, null, 0)); }
                @DisplayName("1")  @Test void test1()  { assertEquals(0,                                            newInstance(ABAB).indexOfFirstIndexed(callbackIsEven, null, 1)); }
                @DisplayName("2")  @Test void test2()  { assertEquals(0,                                            newInstance(ABAB).indexOfFirstIndexed(callbackIsEven, null, 2)); }
                @DisplayName("3")  @Test void test3()  { assertEquals(0,                                            newInstance(ABAB).indexOfFirstIndexed(callbackIsEven, null, 3)); }
                @DisplayName("4")  @Test void test4()  { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfFirstIndexed(predicate0AsFail, null, 4)); }
                @DisplayName("5")  @Test void test5()  { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfFirstIndexed(predicate0AsFail, null, 5)); }
                                   @Test void max()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfFirstIndexed(predicate0AsFail, null, MAX_INT_VALUE)); }
            }
            @DisplayName("from + to") @Nested class fromTo {
                @DisplayName("min, min") @Test void minMin()  { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfFirstIndexed(predicate0AsFail, MIN_INT_VALUE, MIN_INT_VALUE)); }
                @DisplayName("min, 0")   @Test void min0()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfFirstIndexed(predicate0AsFail, MIN_INT_VALUE, 0)); }
                @DisplayName("min, 1")   @Test void min1()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfFirstIndexed(predicate0AsFail, MIN_INT_VALUE, 1)); }
                @DisplayName("min, 2")   @Test void min2()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfFirstIndexed(predicate0AsFail, MIN_INT_VALUE, 2)); }
                @DisplayName("min, 3")   @Test void min3()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfFirstIndexed(predicate0AsFail, MIN_INT_VALUE, 3)); }
                @DisplayName("min, max") @Test void minMax()  { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfFirstIndexed(predicate0AsFail, MIN_INT_VALUE, MAX_INT_VALUE)); }

                @DisplayName("0, min") @Test void test0_Min() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfFirstIndexed(predicate0AsFail, 0, MIN_INT_VALUE)); }
                @DisplayName("0, 0")   @Test void test0_0()   { assertEquals(0,                                            newInstance(ABAB).indexOfFirstIndexed(callbackIsEven, 0, 0)); }
                @DisplayName("0, 1")   @Test void test0_1()   { assertEquals(0,                                            newInstance(ABAB).indexOfFirstIndexed(callbackIsEven, 0, 1)); }
                @DisplayName("0, 2")   @Test void test0_2()   { assertEquals(0,                                            newInstance(ABAB).indexOfFirstIndexed(callbackIsEven, 0, 2)); }
                @DisplayName("0, 3")   @Test void test0_3()   { assertEquals(0,                                            newInstance(ABAB).indexOfFirstIndexed(callbackIsEven, 0, 3)); }
                @DisplayName("0, max") @Test void test0_Max() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfFirstIndexed(predicate0AsFail, 0, MAX_INT_VALUE)); }

                @DisplayName("1, min") @Test void test1_Min() { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(ABAB).indexOfFirstIndexed(predicate0AsFail, 1, MIN_INT_VALUE)); }
                @DisplayName("1, 0")   @Test void test1_0()   { assertThrowsExactly(InvalidIndexRangeException.class, () -> newInstance(ABAB).indexOfFirstIndexed(predicate0AsFail, 1, 0)); }
                @DisplayName("1, 1")   @Test void test1_1()   { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(ABAB).indexOfFirstIndexed(callbackIsEven, 1, 1)); }
                @DisplayName("1, 2")   @Test void test1_2()   { assertEquals(2,                                             newInstance(ABAB).indexOfFirstIndexed(callbackIsEven, 1, 2)); }
                @DisplayName("1, 3")   @Test void test1_3()   { assertEquals(2,                                             newInstance(ABAB).indexOfFirstIndexed(callbackIsEven, 1, 3)); }
                @DisplayName("1, max") @Test void test1_Max() { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(ABAB).indexOfFirstIndexed(predicate0AsFail, 1, MAX_INT_VALUE)); }

                @DisplayName("2, min") @Test void test2_Min() { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(ABAB).indexOfFirstIndexed(predicate0AsFail, 2, MIN_INT_VALUE)); }
                @DisplayName("2, 0")   @Test void test2_0()   { assertThrowsExactly(InvalidIndexRangeException.class, () -> newInstance(ABAB).indexOfFirstIndexed(predicate0AsFail, 2, 0)); }
                @DisplayName("2, 1")   @Test void test2_1()   { assertThrowsExactly(InvalidIndexRangeException.class, () -> newInstance(ABAB).indexOfFirstIndexed(predicate0AsFail, 2, 1)); }
                @DisplayName("2, 2")   @Test void test2_2()   { assertEquals(2,                                             newInstance(ABAB).indexOfFirstIndexed(callbackIsEven, 2, 2)); }
                @DisplayName("2, 3")   @Test void test2_3()   { assertEquals(2,                                             newInstance(ABAB).indexOfFirstIndexed(callbackIsEven, 2, 3)); }
                @DisplayName("2, max") @Test void test2_Max() { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(ABAB).indexOfFirstIndexed(predicate0AsFail, 2, MAX_INT_VALUE)); }

                @DisplayName("3, min") @Test void test3_Min() { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(ABAB).indexOfFirstIndexed(predicate0AsFail, 3, MIN_INT_VALUE)); }
                @DisplayName("3, 0")   @Test void test3_0()   { assertThrowsExactly(InvalidIndexRangeException.class, () -> newInstance(ABAB).indexOfFirstIndexed(predicate0AsFail, 3, 0)); }
                @DisplayName("3, 1")   @Test void test3_1()   { assertThrowsExactly(InvalidIndexRangeException.class, () -> newInstance(ABAB).indexOfFirstIndexed(predicate0AsFail, 3, 1)); }
                @DisplayName("3, 2")   @Test void test3_2()   { assertThrowsExactly(InvalidIndexRangeException.class, () -> newInstance(ABAB).indexOfFirstIndexed(predicate0AsFail, 3, 2)); }
                @DisplayName("3, 3")   @Test void test3_3()   { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(ABAB).indexOfFirstIndexed(callbackIsEven, 3, 3)); }
                @DisplayName("3, max") @Test void test3_Max() { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(ABAB).indexOfFirstIndexed(predicate0AsFail, 3, MAX_INT_VALUE)); }

                @DisplayName("max, min") @Test void maxMin()  { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfFirstIndexed(predicate0AsFail, MAX_INT_VALUE, MIN_INT_VALUE)); }
                @DisplayName("max, 0")   @Test void max0()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfFirstIndexed(predicate0AsFail, MAX_INT_VALUE, 0)); }
                @DisplayName("max, 1")   @Test void max1()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfFirstIndexed(predicate0AsFail, MAX_INT_VALUE, 1)); }
                @DisplayName("max, 2")   @Test void max2()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfFirstIndexed(predicate0AsFail, MAX_INT_VALUE, 2)); }
                @DisplayName("max, 3")   @Test void max3()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfFirstIndexed(predicate0AsFail, MAX_INT_VALUE, 3)); }
                @DisplayName("max, max") @Test void maxMax()  { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfFirstIndexed(predicate0AsFail, MAX_INT_VALUE, MAX_INT_VALUE)); }
            }
        }
        @TestInstance(PER_CLASS) @Nested class indexOfFirstIndexedOrNull {
            @Nested class empty {
                                           @Test void direct()     { assertNull(newInstance(EMPTY).indexOfFirstIndexedOrNull(predicate0AsFail)); }
                @DisplayName("from (min)") @Test void fromMin()    { assertNull(newInstance(EMPTY).indexOfFirstIndexedOrNull(predicate0AsFail, MIN_INT_VALUE)); }
                @DisplayName("from (-1)")  @Test void fromMinus1() { assertNull(newInstance(EMPTY).indexOfFirstIndexedOrNull(predicate0AsFail, -1)); }
                @DisplayName("from (0)")   @Test void from0()      { assertNull(newInstance(EMPTY).indexOfFirstIndexedOrNull(predicate0AsFail, 0)); }
                @DisplayName("from (1)")   @Test void from1()      { assertNull(newInstance(EMPTY).indexOfFirstIndexedOrNull(predicate0AsFail, 1)); }
                @DisplayName("from (min)") @Test void fromMax()    { assertNull(newInstance(EMPTY).indexOfFirstIndexedOrNull(predicate0AsFail, MAX_INT_VALUE)); }
                @DisplayName("to (min)")   @Test void toMin()      { assertNull(newInstance(EMPTY).indexOfFirstIndexedOrNull(predicate0AsFail, null, MIN_INT_VALUE)); }
                @DisplayName("to (-1)")    @Test void toMinus1()   { assertNull(newInstance(EMPTY).indexOfFirstIndexedOrNull(predicate0AsFail, null, -1)); }
                @DisplayName("to (0)")     @Test void to0()        { assertNull(newInstance(EMPTY).indexOfFirstIndexedOrNull(predicate0AsFail, null, 0)); }
                @DisplayName("to (1)")     @Test void to1()        { assertNull(newInstance(EMPTY).indexOfFirstIndexedOrNull(predicate0AsFail, null, 1)); }
                @DisplayName("to (min)")   @Test void toMax()      { assertNull(newInstance(EMPTY).indexOfFirstIndexedOrNull(predicate0AsFail, null, MAX_INT_VALUE)); }
            }
            @DisplayName("boolean callbacks") @TestInstance(PER_CLASS) @Nested class BooleanCallbacks {
                @DisplayName("true: 0 arguments") @Nested class True0 {
                    @DisplayName("1 field")  @Test void test1() { assertEquals(0, newInstance(A)   .indexOfFirstIndexedOrNull(callback0AsTrue)); }
                    @DisplayName("2 fields") @Test void test2() { assertEquals(0, newInstance(AB)  .indexOfFirstIndexedOrNull(callback0AsTrue)); }
                    @DisplayName("4 fields") @Test void test4() { assertEquals(0, newInstance(ABCD).indexOfFirstIndexedOrNull(callback0AsTrue)); }
                }
                @DisplayName("true: 1 argument") @Nested class True1 {
                    @DisplayName("1 field")  @Test void test1() { assertEquals(0, newInstance(A)   .indexOfFirstIndexedOrNull(callback1AltAsTrue)); }
                    @DisplayName("2 fields") @Test void test2() { assertEquals(0, newInstance(AB)  .indexOfFirstIndexedOrNull(callback1AltAsTrue)); }
                    @DisplayName("4 fields") @Test void test4() { assertEquals(0, newInstance(ABCD).indexOfFirstIndexedOrNull(callback1AltAsTrue)); }
                }
                @DisplayName("true: 2 arguments") @Nested class True2 {
                    @DisplayName("1 field")  @Test void test1() { assertEquals(0, newInstance(A)   .indexOfFirstIndexedOrNull(callback2AltAsTrue)); }
                    @DisplayName("2 fields") @Test void test2() { assertEquals(0, newInstance(AB)  .indexOfFirstIndexedOrNull(callback2AltAsTrue)); }
                    @DisplayName("4 fields") @Test void test4() { assertEquals(0, newInstance(ABCD).indexOfFirstIndexedOrNull(callback2AltAsTrue)); }
                }
                @DisplayName("false: 0 arguments") @Nested class False0 {
                    @DisplayName("1 field")  @Test void test1() { assertNull(newInstance(A)   .indexOfFirstIndexedOrNull(callback0AsFalse)); }
                    @DisplayName("2 fields") @Test void test2() { assertNull(newInstance(AB)  .indexOfFirstIndexedOrNull(callback0AsFalse)); }
                    @DisplayName("4 fields") @Test void test4() { assertNull(newInstance(ABCD).indexOfFirstIndexedOrNull(callback0AsFalse)); }
                }
                @DisplayName("false: 1 argument") @Nested class False1 {
                    @DisplayName("1 field")  @Test void test1() { assertNull(newInstance(A)   .indexOfFirstIndexedOrNull(callback1AltAsFalse)); }
                    @DisplayName("2 fields") @Test void test2() { assertNull(newInstance(AB)  .indexOfFirstIndexedOrNull(callback1AltAsFalse)); }
                    @DisplayName("4 fields") @Test void test4() { assertNull(newInstance(ABCD).indexOfFirstIndexedOrNull(callback1AltAsFalse)); }
                }
                @DisplayName("false: 2 arguments") @Nested class False2 {
                    @DisplayName("1 field")  @Test void test1() { assertNull(newInstance(A)   .indexOfFirstIndexedOrNull(callback2AltAsFalse)); }
                    @DisplayName("2 fields") @Test void test2() { assertNull(newInstance(AB)  .indexOfFirstIndexedOrNull(callback2AltAsFalse)); }
                    @DisplayName("4 fields") @Test void test4() { assertNull(newInstance(ABCD).indexOfFirstIndexedOrNull(callback2AltAsFalse)); }
                }
            }
            @DisplayName("1 field") @Nested class Test1 {
                                  @Test void a()     { assertEquals(0, newInstance(A).indexOfFirstIndexedOrNull(callbackIsAAlt)); }
                                  @Test void e()     { assertNull(     newInstance(A).indexOfFirstIndexedOrNull(callbackIsEAlt)); }
                                  @Test void even()  { assertEquals(0, newInstance(A).indexOfFirstIndexedOrNull(callbackIsEven)); }
                                  @Test void odd()   { assertNull(     newInstance(A).indexOfFirstIndexedOrNull(callbackIsOdd)); }
                @DisplayName("0") @Test void test0() { assertEquals(0, newInstance(A).indexOfFirstIndexedOrNull(callbackIs0)); }
                @DisplayName("4") @Test void test4() { assertNull(     newInstance(A).indexOfFirstIndexedOrNull(callbackIs4)); }
            }
            @DisplayName("2 fields") @Nested class Test2 {
                                  @Test void a()     { assertEquals(0, newInstance(AB).indexOfFirstIndexedOrNull(callbackIsAAlt)); }
                                  @Test void b()     { assertEquals(1, newInstance(AB).indexOfFirstIndexedOrNull(callbackIsBAlt)); }
                                  @Test void e()     { assertNull(     newInstance(AB).indexOfFirstIndexedOrNull(callbackIsEAlt)); }
                                  @Test void even()  { assertEquals(0, newInstance(AB).indexOfFirstIndexedOrNull(callbackIsEven)); }
                                  @Test void odd()   { assertEquals(1, newInstance(AB).indexOfFirstIndexedOrNull(callbackIsOdd)); }
                @DisplayName("0") @Test void test0() { assertEquals(0, newInstance(AB).indexOfFirstIndexedOrNull(callbackIs0)); }
                @DisplayName("1") @Test void test1() { assertEquals(1, newInstance(AB).indexOfFirstIndexedOrNull(callbackIs1)); }
                @DisplayName("4") @Test void test4() { assertNull(     newInstance(AB).indexOfFirstIndexedOrNull(callbackIs4)); }
            }
            @DisplayName("4 fields") @Nested class Test4 {
                                  @Test void a()     { assertEquals(0, newInstance(ABCD).indexOfFirstIndexedOrNull(callbackIsAAlt)); }
                                  @Test void b()     { assertEquals(1, newInstance(ABCD).indexOfFirstIndexedOrNull(callbackIsBAlt)); }
                                  @Test void c()     { assertEquals(2, newInstance(ABCD).indexOfFirstIndexedOrNull(callbackIsCAlt)); }
                                  @Test void d()     { assertEquals(3, newInstance(ABCD).indexOfFirstIndexedOrNull(callbackIsDAlt)); }
                                  @Test void e()     { assertNull(     newInstance(ABCD).indexOfFirstIndexedOrNull(callbackIsEAlt)); }
                                  @Test void even()  { assertEquals(0, newInstance(ABCD).indexOfFirstIndexedOrNull(callbackIsEven)); }
                                  @Test void odd()   { assertEquals(1, newInstance(ABCD).indexOfFirstIndexedOrNull(callbackIsOdd)); }
                @DisplayName("0") @Test void test0() { assertEquals(0, newInstance(ABCD).indexOfFirstIndexedOrNull(callbackIs0)); }
                @DisplayName("1") @Test void test1() { assertEquals(1, newInstance(ABCD).indexOfFirstIndexedOrNull(callbackIs1)); }
                @DisplayName("2") @Test void test2() { assertEquals(2, newInstance(ABCD).indexOfFirstIndexedOrNull(callbackIs2)); }
                @DisplayName("3") @Test void test3() { assertEquals(3, newInstance(ABCD).indexOfFirstIndexedOrNull(callbackIs3)); }
                @DisplayName("4") @Test void test4() { assertNull(     newInstance(ABCD).indexOfFirstIndexedOrNull(callbackIs4)); }
            }

            @Nested class from {
                                   @Test void min()    { assertNull(     newInstance(ABAB).indexOfFirstIndexedOrNull(predicate0AsFail, MIN_INT_VALUE)); }
                @DisplayName("-6") @Test void minus6() { assertNull(     newInstance(ABAB).indexOfFirstIndexedOrNull(predicate0AsFail, -6)); }
                @DisplayName("-5") @Test void minus5() { assertNull(     newInstance(ABAB).indexOfFirstIndexedOrNull(predicate0AsFail, -5)); }
                @DisplayName("-4") @Test void minus4() { assertEquals(0, newInstance(ABAB).indexOfFirstIndexedOrNull(callbackIsEven, -4)); }
                @DisplayName("-3") @Test void minus3() { assertEquals(2, newInstance(ABAB).indexOfFirstIndexedOrNull(callbackIsEven, -3)); }
                @DisplayName("-2") @Test void minus2() { assertEquals(2, newInstance(ABAB).indexOfFirstIndexedOrNull(callbackIsEven, -2)); }
                @DisplayName("-1") @Test void minus1() { assertNull(     newInstance(ABAB).indexOfFirstIndexedOrNull(callbackIsEven, -1)); }
                @DisplayName("0")  @Test void test0()  { assertEquals(0, newInstance(ABAB).indexOfFirstIndexedOrNull(callbackIsEven, 0)); }
                @DisplayName("1")  @Test void test1()  { assertEquals(2, newInstance(ABAB).indexOfFirstIndexedOrNull(callbackIsEven, 1)); }
                @DisplayName("2")  @Test void test2()  { assertEquals(2, newInstance(ABAB).indexOfFirstIndexedOrNull(callbackIsEven, 2)); }
                @DisplayName("3")  @Test void test3()  { assertNull(     newInstance(ABAB).indexOfFirstIndexedOrNull(callbackIsEven, 3)); }
                @DisplayName("4")  @Test void test4()  { assertNull(     newInstance(ABAB).indexOfFirstIndexedOrNull(predicate0AsFail, 4)); }
                @DisplayName("5")  @Test void test5()  { assertNull(     newInstance(ABAB).indexOfFirstIndexedOrNull(predicate0AsFail, 5)); }
                                   @Test void max()    { assertNull(     newInstance(ABAB).indexOfFirstIndexedOrNull(predicate0AsFail, MAX_INT_VALUE)); }
            }
            @Nested class to {
                                   @Test void min()    { assertNull(     newInstance(ABAB).indexOfFirstIndexedOrNull(predicate0AsFail, null, MIN_INT_VALUE)); }
                @DisplayName("-6") @Test void minus6() { assertNull(     newInstance(ABAB).indexOfFirstIndexedOrNull(predicate0AsFail, null, -6)); }
                @DisplayName("-5") @Test void minus5() { assertNull(     newInstance(ABAB).indexOfFirstIndexedOrNull(predicate0AsFail, null, -5)); }
                @DisplayName("-4") @Test void minus4() { assertEquals(0, newInstance(ABAB).indexOfFirstIndexedOrNull(callbackIsEven, null, -4)); }
                @DisplayName("-3") @Test void minus3() { assertEquals(0, newInstance(ABAB).indexOfFirstIndexedOrNull(callbackIsEven, null, -3)); }
                @DisplayName("-2") @Test void minus2() { assertEquals(0, newInstance(ABAB).indexOfFirstIndexedOrNull(callbackIsEven, null, -2)); }
                @DisplayName("-1") @Test void minus1() { assertEquals(0, newInstance(ABAB).indexOfFirstIndexedOrNull(callbackIsEven, null, -1)); }
                @DisplayName("0")  @Test void test0()  { assertEquals(0, newInstance(ABAB).indexOfFirstIndexedOrNull(callbackIsEven, null, 0)); }
                @DisplayName("1")  @Test void test1()  { assertEquals(0, newInstance(ABAB).indexOfFirstIndexedOrNull(callbackIsEven, null, 1)); }
                @DisplayName("2")  @Test void test2()  { assertEquals(0, newInstance(ABAB).indexOfFirstIndexedOrNull(callbackIsEven, null, 2)); }
                @DisplayName("3")  @Test void test3()  { assertEquals(0, newInstance(ABAB).indexOfFirstIndexedOrNull(callbackIsEven, null, 3)); }
                @DisplayName("4")  @Test void test4()  { assertNull(     newInstance(ABAB).indexOfFirstIndexedOrNull(predicate0AsFail, null, 4)); }
                @DisplayName("5")  @Test void test5()  { assertNull(     newInstance(ABAB).indexOfFirstIndexedOrNull(predicate0AsFail, null, 5)); }
                                   @Test void max()    { assertNull(     newInstance(ABAB).indexOfFirstIndexedOrNull(predicate0AsFail, null, MAX_INT_VALUE)); }
            }
            @DisplayName("from + to") @Nested class fromTo {
                @DisplayName("min, min") @Test void minMin()  { assertNull(newInstance(ABAB).indexOfFirstIndexedOrNull(predicate0AsFail, MIN_INT_VALUE, MIN_INT_VALUE)); }
                @DisplayName("min, 0")   @Test void min0()    { assertNull(newInstance(ABAB).indexOfFirstIndexedOrNull(predicate0AsFail, MIN_INT_VALUE, 0)); }
                @DisplayName("min, 1")   @Test void min1()    { assertNull(newInstance(ABAB).indexOfFirstIndexedOrNull(predicate0AsFail, MIN_INT_VALUE, 1)); }
                @DisplayName("min, 2")   @Test void min2()    { assertNull(newInstance(ABAB).indexOfFirstIndexedOrNull(predicate0AsFail, MIN_INT_VALUE, 2)); }
                @DisplayName("min, 3")   @Test void min3()    { assertNull(newInstance(ABAB).indexOfFirstIndexedOrNull(predicate0AsFail, MIN_INT_VALUE, 3)); }
                @DisplayName("min, max") @Test void minMax()  { assertNull(newInstance(ABAB).indexOfFirstIndexedOrNull(predicate0AsFail, MIN_INT_VALUE, MAX_INT_VALUE)); }

                @DisplayName("0, min") @Test void test0_Min() { assertNull(     newInstance(ABAB).indexOfFirstIndexedOrNull(predicate0AsFail, 0, MIN_INT_VALUE)); }
                @DisplayName("0, 0")   @Test void test0_0()   { assertEquals(0, newInstance(ABAB).indexOfFirstIndexedOrNull(callbackIsEven, 0, 0)); }
                @DisplayName("0, 1")   @Test void test0_1()   { assertEquals(0, newInstance(ABAB).indexOfFirstIndexedOrNull(callbackIsEven, 0, 1)); }
                @DisplayName("0, 2")   @Test void test0_2()   { assertEquals(0, newInstance(ABAB).indexOfFirstIndexedOrNull(callbackIsEven, 0, 2)); }
                @DisplayName("0, 3")   @Test void test0_3()   { assertEquals(0, newInstance(ABAB).indexOfFirstIndexedOrNull(callbackIsEven, 0, 3)); }
                @DisplayName("0, max") @Test void test0_Max() { assertNull(     newInstance(ABAB).indexOfFirstIndexedOrNull(predicate0AsFail, 0, MAX_INT_VALUE)); }

                @DisplayName("1, min") @Test void test1_Min() { assertNull(     newInstance(ABAB).indexOfFirstIndexedOrNull(predicate0AsFail, 1, MIN_INT_VALUE)); }
                @DisplayName("1, 0")   @Test void test1_0()   { assertNull(     newInstance(ABAB).indexOfFirstIndexedOrNull(predicate0AsFail, 1, 0)); }
                @DisplayName("1, 1")   @Test void test1_1()   { assertNull(     newInstance(ABAB).indexOfFirstIndexedOrNull(callbackIsEven, 1, 1)); }
                @DisplayName("1, 2")   @Test void test1_2()   { assertEquals(2, newInstance(ABAB).indexOfFirstIndexedOrNull(callbackIsEven, 1, 2)); }
                @DisplayName("1, 3")   @Test void test1_3()   { assertEquals(2, newInstance(ABAB).indexOfFirstIndexedOrNull(callbackIsEven, 1, 3)); }
                @DisplayName("1, max") @Test void test1_Max() { assertNull(     newInstance(ABAB).indexOfFirstIndexedOrNull(predicate0AsFail, 1, MAX_INT_VALUE)); }

                @DisplayName("2, min") @Test void test2_Min() { assertNull(     newInstance(ABAB).indexOfFirstIndexedOrNull(predicate0AsFail, 2, MIN_INT_VALUE)); }
                @DisplayName("2, 0")   @Test void test2_0()   { assertNull(     newInstance(ABAB).indexOfFirstIndexedOrNull(predicate0AsFail, 2, 0)); }
                @DisplayName("2, 1")   @Test void test2_1()   { assertNull(     newInstance(ABAB).indexOfFirstIndexedOrNull(predicate0AsFail, 2, 1)); }
                @DisplayName("2, 2")   @Test void test2_2()   { assertEquals(2, newInstance(ABAB).indexOfFirstIndexedOrNull(callbackIsEven, 2, 2)); }
                @DisplayName("2, 3")   @Test void test2_3()   { assertEquals(2, newInstance(ABAB).indexOfFirstIndexedOrNull(callbackIsEven, 2, 3)); }
                @DisplayName("2, max") @Test void test2_Max() { assertNull(     newInstance(ABAB).indexOfFirstIndexedOrNull(predicate0AsFail, 2, MAX_INT_VALUE)); }

                @DisplayName("3, min") @Test void test3_Min() { assertNull(newInstance(ABAB).indexOfFirstIndexedOrNull(predicate0AsFail, 3, MIN_INT_VALUE)); }
                @DisplayName("3, 0")   @Test void test3_0()   { assertNull(newInstance(ABAB).indexOfFirstIndexedOrNull(predicate0AsFail, 3, 0)); }
                @DisplayName("3, 1")   @Test void test3_1()   { assertNull(newInstance(ABAB).indexOfFirstIndexedOrNull(predicate0AsFail, 3, 1)); }
                @DisplayName("3, 2")   @Test void test3_2()   { assertNull(newInstance(ABAB).indexOfFirstIndexedOrNull(predicate0AsFail, 3, 2)); }
                @DisplayName("3, 3")   @Test void test3_3()   { assertNull(newInstance(ABAB).indexOfFirstIndexedOrNull(callbackIsEven, 3, 3)); }
                @DisplayName("3, max") @Test void test3_Max() { assertNull(newInstance(ABAB).indexOfFirstIndexedOrNull(predicate0AsFail, 3, MAX_INT_VALUE)); }

                @DisplayName("max, min") @Test void maxMin()  { assertNull(newInstance(ABAB).indexOfFirstIndexedOrNull(predicate0AsFail, MAX_INT_VALUE, MIN_INT_VALUE)); }
                @DisplayName("max, 0")   @Test void max0()    { assertNull(newInstance(ABAB).indexOfFirstIndexedOrNull(predicate0AsFail, MAX_INT_VALUE, 0)); }
                @DisplayName("max, 1")   @Test void max1()    { assertNull(newInstance(ABAB).indexOfFirstIndexedOrNull(predicate0AsFail, MAX_INT_VALUE, 1)); }
                @DisplayName("max, 2")   @Test void max2()    { assertNull(newInstance(ABAB).indexOfFirstIndexedOrNull(predicate0AsFail, MAX_INT_VALUE, 2)); }
                @DisplayName("max, 3")   @Test void max3()    { assertNull(newInstance(ABAB).indexOfFirstIndexedOrNull(predicate0AsFail, MAX_INT_VALUE, 3)); }
                @DisplayName("max, max") @Test void maxMax()  { assertNull(newInstance(ABAB).indexOfFirstIndexedOrNull(predicate0AsFail, MAX_INT_VALUE, MAX_INT_VALUE)); }
            }
        }

        @TestInstance(PER_CLASS) @Nested class indexOfLast {
            @Nested class empty {
                                           @Test void direct()     { assertThrowsExactly(EmptyCollectionException.class, () -> newInstance(EMPTY).indexOfLast(predicate0AsFail)); }
                @DisplayName("from (min)") @Test void fromMin()    { assertThrowsExactly(EmptyCollectionException.class, () -> newInstance(EMPTY).indexOfLast(predicate0AsFail, MIN_INT_VALUE)); }
                @DisplayName("from (-1)")  @Test void fromMinus1() { assertThrowsExactly(EmptyCollectionException.class, () -> newInstance(EMPTY).indexOfLast(predicate0AsFail, -1)); }
                @DisplayName("from (0)")   @Test void from0()      { assertThrowsExactly(EmptyCollectionException.class, () -> newInstance(EMPTY).indexOfLast(predicate0AsFail, 0)); }
                @DisplayName("from (1)")   @Test void from1()      { assertThrowsExactly(EmptyCollectionException.class, () -> newInstance(EMPTY).indexOfLast(predicate0AsFail, 1)); }
                @DisplayName("from (min)") @Test void fromMax()    { assertThrowsExactly(EmptyCollectionException.class, () -> newInstance(EMPTY).indexOfLast(predicate0AsFail, MAX_INT_VALUE)); }
                @DisplayName("to (min)")   @Test void toMin()      { assertThrowsExactly(EmptyCollectionException.class, () -> newInstance(EMPTY).indexOfLast(predicate0AsFail, null, MIN_INT_VALUE)); }
                @DisplayName("to (-1)")    @Test void toMinus1()   { assertThrowsExactly(EmptyCollectionException.class, () -> newInstance(EMPTY).indexOfLast(predicate0AsFail, null, -1)); }
                @DisplayName("to (0)")     @Test void to0()        { assertThrowsExactly(EmptyCollectionException.class, () -> newInstance(EMPTY).indexOfLast(predicate0AsFail, null, 0)); }
                @DisplayName("to (1)")     @Test void to1()        { assertThrowsExactly(EmptyCollectionException.class, () -> newInstance(EMPTY).indexOfLast(predicate0AsFail, null, 1)); }
                @DisplayName("to (min)")   @Test void toMax()      { assertThrowsExactly(EmptyCollectionException.class, () -> newInstance(EMPTY).indexOfLast(predicate0AsFail, null, MAX_INT_VALUE)); }
            }
            @DisplayName("boolean callbacks") @TestInstance(PER_CLASS) @Nested class BooleanCallbacks {
                @DisplayName("true: 0 arguments") @Nested class True0 {
                    @DisplayName("1 field")  @Test void test1() { assertEquals(0, newInstance(A)   .indexOfLast(callback0AsTrue)); }
                    @DisplayName("2 fields") @Test void test2() { assertEquals(1, newInstance(AB)  .indexOfLast(callback0AsTrue)); }
                    @DisplayName("4 fields") @Test void test4() { assertEquals(3, newInstance(ABCD).indexOfLast(callback0AsTrue)); }
                }
                @DisplayName("true: 1 argument") @Nested class True1 {
                    @DisplayName("1 field")  @Test void test1() { assertEquals(0, newInstance(A)   .indexOfLast(callback1AsTrue)); }
                    @DisplayName("2 fields") @Test void test2() { assertEquals(1, newInstance(AB)  .indexOfLast(callback1AsTrue)); }
                    @DisplayName("4 fields") @Test void test4() { assertEquals(3, newInstance(ABCD).indexOfLast(callback1AsTrue)); }
                }
                @DisplayName("true: 2 arguments") @Nested class True2 {
                    @DisplayName("1 field")  @Test void test1() { assertEquals(0, newInstance(A)   .indexOfLast(callback2AsTrue)); }
                    @DisplayName("2 fields") @Test void test2() { assertEquals(1, newInstance(AB)  .indexOfLast(callback2AsTrue)); }
                    @DisplayName("4 fields") @Test void test4() { assertEquals(3, newInstance(ABCD).indexOfLast(callback2AsTrue)); }
                }
                @DisplayName("false: 0 arguments") @Nested class False0 {
                    @DisplayName("1 field")  @Test void test1() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A)   .indexOfLast(callback0AsFalse)); }
                    @DisplayName("2 fields") @Test void test2() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(AB)  .indexOfLast(callback0AsFalse)); }
                    @DisplayName("4 fields") @Test void test4() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABCD).indexOfLast(callback0AsFalse)); }
                }
                @DisplayName("false: 1 argument") @Nested class False1 {
                    @DisplayName("1 field")  @Test void test1() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A)   .indexOfLast(callback1AsFalse)); }
                    @DisplayName("2 fields") @Test void test2() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(AB)  .indexOfLast(callback1AsFalse)); }
                    @DisplayName("4 fields") @Test void test4() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABCD).indexOfLast(callback1AsFalse)); }
                }
                @DisplayName("false: 2 arguments") @Nested class False2 {
                    @DisplayName("1 field")  @Test void test1() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A)   .indexOfLast(callback2AsFalse)); }
                    @DisplayName("2 fields") @Test void test2() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(AB)  .indexOfLast(callback2AsFalse)); }
                    @DisplayName("4 fields") @Test void test4() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABCD).indexOfLast(callback2AsFalse)); }
                }
            }
            @DisplayName("1 field") @Nested class Test1 {
                                  @Test void a()     { assertEquals(0,                                            newInstance(A).indexOfLast(callbackIsA)); }
                                  @Test void e()     { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).indexOfLast(callbackIsE)); }
                                  @Test void even()  { assertEquals(0,                                            newInstance(A).indexOfLast(callbackIsEvenAlt)); }
                                  @Test void odd()   { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).indexOfLast(callbackIsOddAlt)); }
                @DisplayName("0") @Test void test0() { assertEquals(0,                                            newInstance(A).indexOfLast(callbackIs0Alt)); }
                @DisplayName("4") @Test void test4() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).indexOfLast(callbackIs4Alt)); }
            }
            @DisplayName("2 fields") @Nested class Test2 {
                                  @Test void a()     { assertEquals(0,                                            newInstance(AB).indexOfLast(callbackIsA)); }
                                  @Test void b()     { assertEquals(1,                                            newInstance(AB).indexOfLast(callbackIsB)); }
                                  @Test void e()     { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(AB).indexOfLast(callbackIsE)); }
                                  @Test void even()  { assertEquals(0,                                            newInstance(AB).indexOfLast(callbackIsEvenAlt)); }
                                  @Test void odd()   { assertEquals(1,                                            newInstance(AB).indexOfLast(callbackIsOddAlt)); }
                @DisplayName("0") @Test void test0() { assertEquals(0,                                            newInstance(AB).indexOfLast(callbackIs0Alt)); }
                @DisplayName("1") @Test void test1() { assertEquals(1,                                            newInstance(AB).indexOfLast(callbackIs1Alt)); }
                @DisplayName("4") @Test void test4() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(AB).indexOfLast(callbackIs4Alt)); }
            }
            @DisplayName("4 fields") @Nested class Test4 {
                                  @Test void a()     { assertEquals(0,                                            newInstance(ABCD).indexOfLast(callbackIsA)); }
                                  @Test void b()     { assertEquals(1,                                            newInstance(ABCD).indexOfLast(callbackIsB)); }
                                  @Test void c()     { assertEquals(2,                                            newInstance(ABCD).indexOfLast(callbackIsC)); }
                                  @Test void d()     { assertEquals(3,                                            newInstance(ABCD).indexOfLast(callbackIsD)); }
                                  @Test void e()     { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABCD).indexOfLast(callbackIsE)); }
                                  @Test void even()  { assertEquals(2,                                            newInstance(ABCD).indexOfLast(callbackIsEvenAlt)); }
                                  @Test void odd()   { assertEquals(3,                                            newInstance(ABCD).indexOfLast(callbackIsOddAlt)); }
                @DisplayName("0") @Test void test0() { assertEquals(0,                                            newInstance(ABCD).indexOfLast(callbackIs0Alt)); }
                @DisplayName("1") @Test void test1() { assertEquals(1,                                            newInstance(ABCD).indexOfLast(callbackIs1Alt)); }
                @DisplayName("2") @Test void test2() { assertEquals(2,                                            newInstance(ABCD).indexOfLast(callbackIs2Alt)); }
                @DisplayName("3") @Test void test3() { assertEquals(3,                                            newInstance(ABCD).indexOfLast(callbackIs3Alt)); }
                @DisplayName("4") @Test void test4() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABCD).indexOfLast(callbackIs4Alt)); }
            }

            @Nested class from {
                                   @Test void min()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfLast(predicate0AsFail, MIN_INT_VALUE)); }
                @DisplayName("-6") @Test void minus6() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfLast(predicate0AsFail, -6)); }
                @DisplayName("-5") @Test void minus5() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfLast(predicate0AsFail, -5)); }
                @DisplayName("-4") @Test void minus4() { assertEquals(2,                                            newInstance(ABAB).indexOfLast(callbackIsA, -4)); }
                @DisplayName("-3") @Test void minus3() { assertEquals(2,                                            newInstance(ABAB).indexOfLast(callbackIsA, -3)); }
                @DisplayName("-2") @Test void minus2() { assertEquals(2,                                            newInstance(ABAB).indexOfLast(callbackIsA, -2)); }
                @DisplayName("-1") @Test void minus1() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfLast(callbackIsA, -1)); }
                @DisplayName("0")  @Test void test0()  { assertEquals(2,                                            newInstance(ABAB).indexOfLast(callbackIsA, 0)); }
                @DisplayName("1")  @Test void test1()  { assertEquals(2,                                            newInstance(ABAB).indexOfLast(callbackIsA, 1)); }
                @DisplayName("2")  @Test void test2()  { assertEquals(2,                                            newInstance(ABAB).indexOfLast(callbackIsA, 2)); }
                @DisplayName("3")  @Test void test3()  { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfLast(callbackIsA, 3)); }
                @DisplayName("4")  @Test void test4()  { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfLast(predicate0AsFail, 4)); }
                @DisplayName("5")  @Test void test5()  { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfLast(predicate0AsFail, 5)); }
                                   @Test void max()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfLast(predicate0AsFail, MAX_INT_VALUE)); }
            }
            @Nested class to {
                                   @Test void min()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfLast(predicate0AsFail, null, MIN_INT_VALUE)); }
                @DisplayName("-6") @Test void minus6() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfLast(predicate0AsFail, null, -6)); }
                @DisplayName("-5") @Test void minus5() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfLast(predicate0AsFail, null, -5)); }
                @DisplayName("-4") @Test void minus4() { assertEquals(0,                                            newInstance(ABAB).indexOfLast(callbackIsA, null, -4)); }
                @DisplayName("-3") @Test void minus3() { assertEquals(0,                                            newInstance(ABAB).indexOfLast(callbackIsA, null, -3)); }
                @DisplayName("-2") @Test void minus2() { assertEquals(2,                                            newInstance(ABAB).indexOfLast(callbackIsA, null, -2)); }
                @DisplayName("-1") @Test void minus1() { assertEquals(2,                                            newInstance(ABAB).indexOfLast(callbackIsA, null, -1)); }
                @DisplayName("0")  @Test void test0()  { assertEquals(0,                                            newInstance(ABAB).indexOfLast(callbackIsA, null, 0)); }
                @DisplayName("1")  @Test void test1()  { assertEquals(0,                                            newInstance(ABAB).indexOfLast(callbackIsA, null, 1)); }
                @DisplayName("2")  @Test void test2()  { assertEquals(2,                                            newInstance(ABAB).indexOfLast(callbackIsA, null, 2)); }
                @DisplayName("3")  @Test void test3()  { assertEquals(2,                                            newInstance(ABAB).indexOfLast(callbackIsA, null, 3)); }
                @DisplayName("4")  @Test void test4()  { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfLast(predicate0AsFail, null, 4)); }
                @DisplayName("5")  @Test void test5()  { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfLast(predicate0AsFail, null, 5)); }
                                   @Test void max()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfLast(predicate0AsFail, null, MAX_INT_VALUE)); }
            }
            @DisplayName("from + to") @Nested class fromTo {
                @DisplayName("min, min") @Test void minMin()  { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfLast(predicate0AsFail, MIN_INT_VALUE, MIN_INT_VALUE)); }
                @DisplayName("min, 0")   @Test void min0()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfLast(predicate0AsFail, MIN_INT_VALUE, 0)); }
                @DisplayName("min, 1")   @Test void min1()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfLast(predicate0AsFail, MIN_INT_VALUE, 1)); }
                @DisplayName("min, 2")   @Test void min2()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfLast(predicate0AsFail, MIN_INT_VALUE, 2)); }
                @DisplayName("min, 3")   @Test void min3()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfLast(predicate0AsFail, MIN_INT_VALUE, 3)); }
                @DisplayName("min, max") @Test void minMax()  { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfLast(predicate0AsFail, MIN_INT_VALUE, MAX_INT_VALUE)); }

                @DisplayName("0, min") @Test void test0_Min() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfLast(predicate0AsFail, 0, MIN_INT_VALUE)); }
                @DisplayName("0, 0")   @Test void test0_0()   { assertEquals(0,                                            newInstance(ABAB).indexOfLast(callbackIsA, 0, 0)); }
                @DisplayName("0, 1")   @Test void test0_1()   { assertEquals(0,                                            newInstance(ABAB).indexOfLast(callbackIsA, 0, 1)); }
                @DisplayName("0, 2")   @Test void test0_2()   { assertEquals(2,                                            newInstance(ABAB).indexOfLast(callbackIsA, 0, 2)); }
                @DisplayName("0, 3")   @Test void test0_3()   { assertEquals(2,                                            newInstance(ABAB).indexOfLast(callbackIsA, 0, 3)); }
                @DisplayName("0, max") @Test void test0_Max() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfLast(predicate0AsFail, 0, MAX_INT_VALUE)); }

                @DisplayName("1, min") @Test void test1_Min() { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(ABAB).indexOfLast(predicate0AsFail, 1, MIN_INT_VALUE)); }
                @DisplayName("1, 0")   @Test void test1_0()   { assertThrowsExactly(InvalidIndexRangeException.class, () -> newInstance(ABAB).indexOfLast(predicate0AsFail, 1, 0)); }
                @DisplayName("1, 1")   @Test void test1_1()   { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(ABAB).indexOfLast(callbackIsA, 1, 1)); }
                @DisplayName("1, 2")   @Test void test1_2()   { assertEquals(2,                                             newInstance(ABAB).indexOfLast(callbackIsA, 1, 2)); }
                @DisplayName("1, 3")   @Test void test1_3()   { assertEquals(2,                                             newInstance(ABAB).indexOfLast(callbackIsA, 1, 3)); }
                @DisplayName("1, max") @Test void test1_Max() { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(ABAB).indexOfLast(predicate0AsFail, 1, MAX_INT_VALUE)); }

                @DisplayName("2, min") @Test void test2_Min() { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(ABAB).indexOfLast(predicate0AsFail, 2, MIN_INT_VALUE)); }
                @DisplayName("2, 0")   @Test void test2_0()   { assertThrowsExactly(InvalidIndexRangeException.class, () -> newInstance(ABAB).indexOfLast(predicate0AsFail, 2, 0)); }
                @DisplayName("2, 1")   @Test void test2_1()   { assertThrowsExactly(InvalidIndexRangeException.class, () -> newInstance(ABAB).indexOfLast(predicate0AsFail, 2, 1)); }
                @DisplayName("2, 2")   @Test void test2_2()   { assertEquals(2,                                             newInstance(ABAB).indexOfLast(callbackIsA, 2, 2)); }
                @DisplayName("2, 3")   @Test void test2_3()   { assertEquals(2,                                             newInstance(ABAB).indexOfLast(callbackIsA, 2, 3)); }
                @DisplayName("2, max") @Test void test2_Max() { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(ABAB).indexOfLast(predicate0AsFail, 2, MAX_INT_VALUE)); }

                @DisplayName("3, min") @Test void test3_Min() { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(ABAB).indexOfLast(predicate0AsFail, 3, MIN_INT_VALUE)); }
                @DisplayName("3, 0")   @Test void test3_0()   { assertThrowsExactly(InvalidIndexRangeException.class, () -> newInstance(ABAB).indexOfLast(predicate0AsFail, 3, 0)); }
                @DisplayName("3, 1")   @Test void test3_1()   { assertThrowsExactly(InvalidIndexRangeException.class, () -> newInstance(ABAB).indexOfLast(predicate0AsFail, 3, 1)); }
                @DisplayName("3, 2")   @Test void test3_2()   { assertThrowsExactly(InvalidIndexRangeException.class, () -> newInstance(ABAB).indexOfLast(predicate0AsFail, 3, 2)); }
                @DisplayName("3, 3")   @Test void test3_3()   { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(ABAB).indexOfLast(callbackIsA, 3, 3)); }
                @DisplayName("3, max") @Test void test3_Max() { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(ABAB).indexOfLast(predicate0AsFail, 3, MAX_INT_VALUE)); }

                @DisplayName("max, min") @Test void maxMin()  { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfLast(predicate0AsFail, MAX_INT_VALUE, MIN_INT_VALUE)); }
                @DisplayName("max, 0")   @Test void max0()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfLast(predicate0AsFail, MAX_INT_VALUE, 0)); }
                @DisplayName("max, 1")   @Test void max1()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfLast(predicate0AsFail, MAX_INT_VALUE, 1)); }
                @DisplayName("max, 2")   @Test void max2()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfLast(predicate0AsFail, MAX_INT_VALUE, 2)); }
                @DisplayName("max, 3")   @Test void max3()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfLast(predicate0AsFail, MAX_INT_VALUE, 3)); }
                @DisplayName("max, max") @Test void maxMax()  { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfLast(predicate0AsFail, MAX_INT_VALUE, MAX_INT_VALUE)); }
            }
        }
        @TestInstance(PER_CLASS) @Nested class indexOfLastOrNull {
            @Nested class empty {
                                           @Test void direct()     { assertNull(newInstance(EMPTY).indexOfLastOrNull(predicate0AsFail)); }
                @DisplayName("from (min)") @Test void fromMin()    { assertNull(newInstance(EMPTY).indexOfLastOrNull(predicate0AsFail, MIN_INT_VALUE)); }
                @DisplayName("from (-1)")  @Test void fromMinus1() { assertNull(newInstance(EMPTY).indexOfLastOrNull(predicate0AsFail, -1)); }
                @DisplayName("from (0)")   @Test void from0()      { assertNull(newInstance(EMPTY).indexOfLastOrNull(predicate0AsFail, 0)); }
                @DisplayName("from (1)")   @Test void from1()      { assertNull(newInstance(EMPTY).indexOfLastOrNull(predicate0AsFail, 1)); }
                @DisplayName("from (min)") @Test void fromMax()    { assertNull(newInstance(EMPTY).indexOfLastOrNull(predicate0AsFail, MAX_INT_VALUE)); }
                @DisplayName("to (min)")   @Test void toMin()      { assertNull(newInstance(EMPTY).indexOfLastOrNull(predicate0AsFail, null, MIN_INT_VALUE)); }
                @DisplayName("to (-1)")    @Test void toMinus1()   { assertNull(newInstance(EMPTY).indexOfLastOrNull(predicate0AsFail, null, -1)); }
                @DisplayName("to (0)")     @Test void to0()        { assertNull(newInstance(EMPTY).indexOfLastOrNull(predicate0AsFail, null, 0)); }
                @DisplayName("to (1)")     @Test void to1()        { assertNull(newInstance(EMPTY).indexOfLastOrNull(predicate0AsFail, null, 1)); }
                @DisplayName("to (min)")   @Test void toMax()      { assertNull(newInstance(EMPTY).indexOfLastOrNull(predicate0AsFail, null, MAX_INT_VALUE)); }
            }
            @DisplayName("boolean callbacks") @TestInstance(PER_CLASS) @Nested class BooleanCallbacks {
                @DisplayName("true: 0 arguments") @Nested class True0 {
                    @DisplayName("1 field")  @Test void test1() { assertEquals(0, newInstance(A)   .indexOfLastOrNull(callback0AsTrue)); }
                    @DisplayName("2 fields") @Test void test2() { assertEquals(1, newInstance(AB)  .indexOfLastOrNull(callback0AsTrue)); }
                    @DisplayName("4 fields") @Test void test4() { assertEquals(3, newInstance(ABCD).indexOfLastOrNull(callback0AsTrue)); }
                }
                @DisplayName("true: 1 argument") @Nested class True1 {
                    @DisplayName("1 field")  @Test void test1() { assertEquals(0, newInstance(A)   .indexOfLastOrNull(callback1AsTrue)); }
                    @DisplayName("2 fields") @Test void test2() { assertEquals(1, newInstance(AB)  .indexOfLastOrNull(callback1AsTrue)); }
                    @DisplayName("4 fields") @Test void test4() { assertEquals(3, newInstance(ABCD).indexOfLastOrNull(callback1AsTrue)); }
                }
                @DisplayName("true: 2 arguments") @Nested class True2 {
                    @DisplayName("1 field")  @Test void test1() { assertEquals(0, newInstance(A)   .indexOfLastOrNull(callback2AsTrue)); }
                    @DisplayName("2 fields") @Test void test2() { assertEquals(1, newInstance(AB)  .indexOfLastOrNull(callback2AsTrue)); }
                    @DisplayName("4 fields") @Test void test4() { assertEquals(3, newInstance(ABCD).indexOfLastOrNull(callback2AsTrue)); }
                }
                @DisplayName("false: 0 arguments") @Nested class False0 {
                    @DisplayName("1 field")  @Test void test1() { assertNull(newInstance(A)   .indexOfLastOrNull(callback0AsFalse)); }
                    @DisplayName("2 fields") @Test void test2() { assertNull(newInstance(AB)  .indexOfLastOrNull(callback0AsFalse)); }
                    @DisplayName("4 fields") @Test void test4() { assertNull(newInstance(ABCD).indexOfLastOrNull(callback0AsFalse)); }
                }
                @DisplayName("false: 1 argument") @Nested class False1 {
                    @DisplayName("1 field")  @Test void test1() { assertNull(newInstance(A)   .indexOfLastOrNull(callback1AsFalse)); }
                    @DisplayName("2 fields") @Test void test2() { assertNull(newInstance(AB)  .indexOfLastOrNull(callback1AsFalse)); }
                    @DisplayName("4 fields") @Test void test4() { assertNull(newInstance(ABCD).indexOfLastOrNull(callback1AsFalse)); }
                }
                @DisplayName("false: 2 arguments") @Nested class False2 {
                    @DisplayName("1 field")  @Test void test1() { assertNull(newInstance(A)   .indexOfLastOrNull(callback2AsFalse)); }
                    @DisplayName("2 fields") @Test void test2() { assertNull(newInstance(AB)  .indexOfLastOrNull(callback2AsFalse)); }
                    @DisplayName("4 fields") @Test void test4() { assertNull(newInstance(ABCD).indexOfLastOrNull(callback2AsFalse)); }
                }
            }
            @DisplayName("1 field") @Nested class Test1 {
                                  @Test void a()     { assertEquals(0, newInstance(A).indexOfLastOrNull(callbackIsA)); }
                                  @Test void e()     { assertNull(     newInstance(A).indexOfLastOrNull(callbackIsE)); }
                                  @Test void even()  { assertEquals(0, newInstance(A).indexOfLastOrNull(callbackIsEvenAlt)); }
                                  @Test void odd()   { assertNull(     newInstance(A).indexOfLastOrNull(callbackIsOddAlt)); }
                @DisplayName("0") @Test void test0() { assertEquals(0, newInstance(A).indexOfLastOrNull(callbackIs0Alt)); }
                @DisplayName("4") @Test void test4() { assertNull(     newInstance(A).indexOfLastOrNull(callbackIs4Alt)); }
            }
            @DisplayName("2 fields") @Nested class Test2 {
                                  @Test void a()     { assertEquals(0, newInstance(AB).indexOfLastOrNull(callbackIsA)); }
                                  @Test void b()     { assertEquals(1, newInstance(AB).indexOfLastOrNull(callbackIsB)); }
                                  @Test void e()     { assertNull(     newInstance(AB).indexOfLastOrNull(callbackIsE)); }
                                  @Test void even()  { assertEquals(0, newInstance(AB).indexOfLastOrNull(callbackIsEvenAlt)); }
                                  @Test void odd()   { assertEquals(1, newInstance(AB).indexOfLastOrNull(callbackIsOddAlt)); }
                @DisplayName("0") @Test void test0() { assertEquals(0, newInstance(AB).indexOfLastOrNull(callbackIs0Alt)); }
                @DisplayName("1") @Test void test1() { assertEquals(1, newInstance(AB).indexOfLastOrNull(callbackIs1Alt)); }
                @DisplayName("4") @Test void test4() { assertNull(     newInstance(AB).indexOfLastOrNull(callbackIs4Alt)); }
            }
            @DisplayName("4 fields") @Nested class Test4 {
                                  @Test void a()     { assertEquals(0, newInstance(ABCD).indexOfLastOrNull(callbackIsA)); }
                                  @Test void b()     { assertEquals(1, newInstance(ABCD).indexOfLastOrNull(callbackIsB)); }
                                  @Test void c()     { assertEquals(2, newInstance(ABCD).indexOfLastOrNull(callbackIsC)); }
                                  @Test void d()     { assertEquals(3, newInstance(ABCD).indexOfLastOrNull(callbackIsD)); }
                                  @Test void e()     { assertNull(     newInstance(ABCD).indexOfLastOrNull(callbackIsE)); }
                                  @Test void even()  { assertEquals(2, newInstance(ABCD).indexOfLastOrNull(callbackIsEvenAlt)); }
                                  @Test void odd()   { assertEquals(3, newInstance(ABCD).indexOfLastOrNull(callbackIsOddAlt)); }
                @DisplayName("0") @Test void test0() { assertEquals(0, newInstance(ABCD).indexOfLastOrNull(callbackIs0Alt)); }
                @DisplayName("1") @Test void test1() { assertEquals(1, newInstance(ABCD).indexOfLastOrNull(callbackIs1Alt)); }
                @DisplayName("2") @Test void test2() { assertEquals(2, newInstance(ABCD).indexOfLastOrNull(callbackIs2Alt)); }
                @DisplayName("3") @Test void test3() { assertEquals(3, newInstance(ABCD).indexOfLastOrNull(callbackIs3Alt)); }
                @DisplayName("4") @Test void test4() { assertNull(     newInstance(ABCD).indexOfLastOrNull(callbackIs4Alt)); }
            }

            @Nested class from {
                                   @Test void min()    { assertNull(     newInstance(ABAB).indexOfLastOrNull(predicate0AsFail, MIN_INT_VALUE)); }
                @DisplayName("-6") @Test void minus6() { assertNull(     newInstance(ABAB).indexOfLastOrNull(predicate0AsFail, -6)); }
                @DisplayName("-5") @Test void minus5() { assertNull(     newInstance(ABAB).indexOfLastOrNull(predicate0AsFail, -5)); }
                @DisplayName("-4") @Test void minus4() { assertEquals(2, newInstance(ABAB).indexOfLastOrNull(callbackIsA, -4)); }
                @DisplayName("-3") @Test void minus3() { assertEquals(2, newInstance(ABAB).indexOfLastOrNull(callbackIsA, -3)); }
                @DisplayName("-2") @Test void minus2() { assertEquals(2, newInstance(ABAB).indexOfLastOrNull(callbackIsA, -2)); }
                @DisplayName("-1") @Test void minus1() { assertNull(     newInstance(ABAB).indexOfLastOrNull(callbackIsA, -1)); }
                @DisplayName("0")  @Test void test0()  { assertEquals(2, newInstance(ABAB).indexOfLastOrNull(callbackIsA, 0)); }
                @DisplayName("1")  @Test void test1()  { assertEquals(2, newInstance(ABAB).indexOfLastOrNull(callbackIsA, 1)); }
                @DisplayName("2")  @Test void test2()  { assertEquals(2, newInstance(ABAB).indexOfLastOrNull(callbackIsA, 2)); }
                @DisplayName("3")  @Test void test3()  { assertNull(     newInstance(ABAB).indexOfLastOrNull(callbackIsA, 3)); }
                @DisplayName("4")  @Test void test4()  { assertNull(     newInstance(ABAB).indexOfLastOrNull(predicate0AsFail, 4)); }
                @DisplayName("5")  @Test void test5()  { assertNull(     newInstance(ABAB).indexOfLastOrNull(predicate0AsFail, 5)); }
                                   @Test void max()    { assertNull(     newInstance(ABAB).indexOfLastOrNull(predicate0AsFail, MAX_INT_VALUE)); }
            }
            @Nested class to {
                                   @Test void min()    { assertNull(     newInstance(ABAB).indexOfLastOrNull(predicate0AsFail, null, MIN_INT_VALUE)); }
                @DisplayName("-6") @Test void minus6() { assertNull(     newInstance(ABAB).indexOfLastOrNull(predicate0AsFail, null, -6)); }
                @DisplayName("-5") @Test void minus5() { assertNull(     newInstance(ABAB).indexOfLastOrNull(predicate0AsFail, null, -5)); }
                @DisplayName("-4") @Test void minus4() { assertEquals(0, newInstance(ABAB).indexOfLastOrNull(callbackIsA, null, -4)); }
                @DisplayName("-3") @Test void minus3() { assertEquals(0, newInstance(ABAB).indexOfLastOrNull(callbackIsA, null, -3)); }
                @DisplayName("-2") @Test void minus2() { assertEquals(2, newInstance(ABAB).indexOfLastOrNull(callbackIsA, null, -2)); }
                @DisplayName("-1") @Test void minus1() { assertEquals(2, newInstance(ABAB).indexOfLastOrNull(callbackIsA, null, -1)); }
                @DisplayName("0")  @Test void test0()  { assertEquals(0, newInstance(ABAB).indexOfLastOrNull(callbackIsA, null, 0)); }
                @DisplayName("1")  @Test void test1()  { assertEquals(0, newInstance(ABAB).indexOfLastOrNull(callbackIsA, null, 1)); }
                @DisplayName("2")  @Test void test2()  { assertEquals(2, newInstance(ABAB).indexOfLastOrNull(callbackIsA, null, 2)); }
                @DisplayName("3")  @Test void test3()  { assertEquals(2, newInstance(ABAB).indexOfLastOrNull(callbackIsA, null, 3)); }
                @DisplayName("4")  @Test void test4()  { assertNull(     newInstance(ABAB).indexOfLastOrNull(predicate0AsFail, null, 4)); }
                @DisplayName("5")  @Test void test5()  { assertNull(     newInstance(ABAB).indexOfLastOrNull(predicate0AsFail, null, 5)); }
                                   @Test void max()    { assertNull(     newInstance(ABAB).indexOfLastOrNull(predicate0AsFail, null, MAX_INT_VALUE)); }
            }
            @DisplayName("from + to") @Nested class fromTo {
                @DisplayName("min, min") @Test void minMin()  { assertNull(newInstance(ABAB).indexOfLastOrNull(predicate0AsFail, MIN_INT_VALUE, MIN_INT_VALUE)); }
                @DisplayName("min, 0")   @Test void min0()    { assertNull(newInstance(ABAB).indexOfLastOrNull(predicate0AsFail, MIN_INT_VALUE, 0)); }
                @DisplayName("min, 1")   @Test void min1()    { assertNull(newInstance(ABAB).indexOfLastOrNull(predicate0AsFail, MIN_INT_VALUE, 1)); }
                @DisplayName("min, 2")   @Test void min2()    { assertNull(newInstance(ABAB).indexOfLastOrNull(predicate0AsFail, MIN_INT_VALUE, 2)); }
                @DisplayName("min, 3")   @Test void min3()    { assertNull(newInstance(ABAB).indexOfLastOrNull(predicate0AsFail, MIN_INT_VALUE, 3)); }
                @DisplayName("min, max") @Test void minMax()  { assertNull(newInstance(ABAB).indexOfLastOrNull(predicate0AsFail, MIN_INT_VALUE, MAX_INT_VALUE)); }

                @DisplayName("0, min") @Test void test0_Min() { assertNull(     newInstance(ABAB).indexOfLastOrNull(predicate0AsFail, 0, MIN_INT_VALUE)); }
                @DisplayName("0, 0")   @Test void test0_0()   { assertEquals(0, newInstance(ABAB).indexOfLastOrNull(callbackIsA, 0, 0)); }
                @DisplayName("0, 1")   @Test void test0_1()   { assertEquals(0, newInstance(ABAB).indexOfLastOrNull(callbackIsA, 0, 1)); }
                @DisplayName("0, 2")   @Test void test0_2()   { assertEquals(2, newInstance(ABAB).indexOfLastOrNull(callbackIsA, 0, 2)); }
                @DisplayName("0, 3")   @Test void test0_3()   { assertEquals(2, newInstance(ABAB).indexOfLastOrNull(callbackIsA, 0, 3)); }
                @DisplayName("0, max") @Test void test0_Max() { assertNull(     newInstance(ABAB).indexOfLastOrNull(predicate0AsFail, 0, MAX_INT_VALUE)); }

                @DisplayName("1, min") @Test void test1_Min() { assertNull(     newInstance(ABAB).indexOfLastOrNull(predicate0AsFail, 1, MIN_INT_VALUE)); }
                @DisplayName("1, 0")   @Test void test1_0()   { assertNull(     newInstance(ABAB).indexOfLastOrNull(predicate0AsFail, 1, 0)); }
                @DisplayName("1, 1")   @Test void test1_1()   { assertNull(     newInstance(ABAB).indexOfLastOrNull(callbackIsA, 1, 1)); }
                @DisplayName("1, 2")   @Test void test1_2()   { assertEquals(2, newInstance(ABAB).indexOfLastOrNull(callbackIsA, 1, 2)); }
                @DisplayName("1, 3")   @Test void test1_3()   { assertEquals(2, newInstance(ABAB).indexOfLastOrNull(callbackIsA, 1, 3)); }
                @DisplayName("1, max") @Test void test1_Max() { assertNull(     newInstance(ABAB).indexOfLastOrNull(predicate0AsFail, 1, MAX_INT_VALUE)); }

                @DisplayName("2, min") @Test void test2_Min() { assertNull(     newInstance(ABAB).indexOfLastOrNull(predicate0AsFail, 2, MIN_INT_VALUE)); }
                @DisplayName("2, 0")   @Test void test2_0()   { assertNull(     newInstance(ABAB).indexOfLastOrNull(predicate0AsFail, 2, 0)); }
                @DisplayName("2, 1")   @Test void test2_1()   { assertNull(     newInstance(ABAB).indexOfLastOrNull(predicate0AsFail, 2, 1)); }
                @DisplayName("2, 2")   @Test void test2_2()   { assertEquals(2, newInstance(ABAB).indexOfLastOrNull(callbackIsA, 2, 2)); }
                @DisplayName("2, 3")   @Test void test2_3()   { assertEquals(2, newInstance(ABAB).indexOfLastOrNull(callbackIsA, 2, 3)); }
                @DisplayName("2, max") @Test void test2_Max() { assertNull(     newInstance(ABAB).indexOfLastOrNull(predicate0AsFail, 2, MAX_INT_VALUE)); }

                @DisplayName("3, min") @Test void test3_Min() { assertNull(newInstance(ABAB).indexOfLastOrNull(predicate0AsFail, 3, MIN_INT_VALUE)); }
                @DisplayName("3, 0")   @Test void test3_0()   { assertNull(newInstance(ABAB).indexOfLastOrNull(predicate0AsFail, 3, 0)); }
                @DisplayName("3, 1")   @Test void test3_1()   { assertNull(newInstance(ABAB).indexOfLastOrNull(predicate0AsFail, 3, 1)); }
                @DisplayName("3, 2")   @Test void test3_2()   { assertNull(newInstance(ABAB).indexOfLastOrNull(predicate0AsFail, 3, 2)); }
                @DisplayName("3, 3")   @Test void test3_3()   { assertNull(newInstance(ABAB).indexOfLastOrNull(callbackIsA, 3, 3)); }
                @DisplayName("3, max") @Test void test3_Max() { assertNull(newInstance(ABAB).indexOfLastOrNull(predicate0AsFail, 3, MAX_INT_VALUE)); }

                @DisplayName("max, min") @Test void maxMin()  { assertNull(newInstance(ABAB).indexOfLastOrNull(predicate0AsFail, MAX_INT_VALUE, MIN_INT_VALUE)); }
                @DisplayName("max, 0")   @Test void max0()    { assertNull(newInstance(ABAB).indexOfLastOrNull(predicate0AsFail, MAX_INT_VALUE, 0)); }
                @DisplayName("max, 1")   @Test void max1()    { assertNull(newInstance(ABAB).indexOfLastOrNull(predicate0AsFail, MAX_INT_VALUE, 1)); }
                @DisplayName("max, 2")   @Test void max2()    { assertNull(newInstance(ABAB).indexOfLastOrNull(predicate0AsFail, MAX_INT_VALUE, 2)); }
                @DisplayName("max, 3")   @Test void max3()    { assertNull(newInstance(ABAB).indexOfLastOrNull(predicate0AsFail, MAX_INT_VALUE, 3)); }
                @DisplayName("max, max") @Test void maxMax()  { assertNull(newInstance(ABAB).indexOfLastOrNull(predicate0AsFail, MAX_INT_VALUE, MAX_INT_VALUE)); }
            }
        }
        @TestInstance(PER_CLASS) @Nested class indexOfLastIndexed {
            @Nested class empty {
                                           @Test void direct()     { assertThrowsExactly(EmptyCollectionException.class, () -> newInstance(EMPTY).indexOfLastIndexed(predicate0AsFail)); }
                @DisplayName("from (min)") @Test void fromMin()    { assertThrowsExactly(EmptyCollectionException.class, () -> newInstance(EMPTY).indexOfLastIndexed(predicate0AsFail, MIN_INT_VALUE)); }
                @DisplayName("from (-1)")  @Test void fromMinus1() { assertThrowsExactly(EmptyCollectionException.class, () -> newInstance(EMPTY).indexOfLastIndexed(predicate0AsFail, -1)); }
                @DisplayName("from (0)")   @Test void from0()      { assertThrowsExactly(EmptyCollectionException.class, () -> newInstance(EMPTY).indexOfLastIndexed(predicate0AsFail, 0)); }
                @DisplayName("from (1)")   @Test void from1()      { assertThrowsExactly(EmptyCollectionException.class, () -> newInstance(EMPTY).indexOfLastIndexed(predicate0AsFail, 1)); }
                @DisplayName("from (min)") @Test void fromMax()    { assertThrowsExactly(EmptyCollectionException.class, () -> newInstance(EMPTY).indexOfLastIndexed(predicate0AsFail, MAX_INT_VALUE)); }
                @DisplayName("to (min)")   @Test void toMin()      { assertThrowsExactly(EmptyCollectionException.class, () -> newInstance(EMPTY).indexOfLastIndexed(predicate0AsFail, null, MIN_INT_VALUE)); }
                @DisplayName("to (-1)")    @Test void toMinus1()   { assertThrowsExactly(EmptyCollectionException.class, () -> newInstance(EMPTY).indexOfLastIndexed(predicate0AsFail, null, -1)); }
                @DisplayName("to (0)")     @Test void to0()        { assertThrowsExactly(EmptyCollectionException.class, () -> newInstance(EMPTY).indexOfLastIndexed(predicate0AsFail, null, 0)); }
                @DisplayName("to (1)")     @Test void to1()        { assertThrowsExactly(EmptyCollectionException.class, () -> newInstance(EMPTY).indexOfLastIndexed(predicate0AsFail, null, 1)); }
                @DisplayName("to (min)")   @Test void toMax()      { assertThrowsExactly(EmptyCollectionException.class, () -> newInstance(EMPTY).indexOfLastIndexed(predicate0AsFail, null, MAX_INT_VALUE)); }
            }
            @DisplayName("boolean callbacks") @TestInstance(PER_CLASS) @Nested class BooleanCallbacks {
                @DisplayName("true: 0 arguments") @Nested class True0 {
                    @DisplayName("1 field")  @Test void test1() { assertEquals(0, newInstance(A)   .indexOfLastIndexed(callback0AsTrue)); }
                    @DisplayName("2 fields") @Test void test2() { assertEquals(1, newInstance(AB)  .indexOfLastIndexed(callback0AsTrue)); }
                    @DisplayName("4 fields") @Test void test4() { assertEquals(3, newInstance(ABCD).indexOfLastIndexed(callback0AsTrue)); }
                }
                @DisplayName("true: 1 argument") @Nested class True1 {
                    @DisplayName("1 field")  @Test void test1() { assertEquals(0, newInstance(A)   .indexOfLastIndexed(callback1AltAsTrue)); }
                    @DisplayName("2 fields") @Test void test2() { assertEquals(1, newInstance(AB)  .indexOfLastIndexed(callback1AltAsTrue)); }
                    @DisplayName("4 fields") @Test void test4() { assertEquals(3, newInstance(ABCD).indexOfLastIndexed(callback1AltAsTrue)); }
                }
                @DisplayName("true: 2 arguments") @Nested class True2 {
                    @DisplayName("1 field")  @Test void test1() { assertEquals(0, newInstance(A)   .indexOfLastIndexed(callback2AltAsTrue)); }
                    @DisplayName("2 fields") @Test void test2() { assertEquals(1, newInstance(AB)  .indexOfLastIndexed(callback2AltAsTrue)); }
                    @DisplayName("4 fields") @Test void test4() { assertEquals(3, newInstance(ABCD).indexOfLastIndexed(callback2AltAsTrue)); }
                }
                @DisplayName("false: 0 arguments") @Nested class False0 {
                    @DisplayName("1 field")  @Test void test1() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A)   .indexOfLastIndexed(callback0AsFalse)); }
                    @DisplayName("2 fields") @Test void test2() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(AB)  .indexOfLastIndexed(callback0AsFalse)); }
                    @DisplayName("4 fields") @Test void test4() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABCD).indexOfLastIndexed(callback0AsFalse)); }
                }
                @DisplayName("false: 1 argument") @Nested class False1 {
                    @DisplayName("1 field")  @Test void test1() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A)   .indexOfLastIndexed(callback1AltAsFalse)); }
                    @DisplayName("2 fields") @Test void test2() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(AB)  .indexOfLastIndexed(callback1AltAsFalse)); }
                    @DisplayName("4 fields") @Test void test4() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABCD).indexOfLastIndexed(callback1AltAsFalse)); }
                }
                @DisplayName("false: 2 arguments") @Nested class False2 {
                    @DisplayName("1 field")  @Test void test1() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A)   .indexOfLastIndexed(callback2AltAsFalse)); }
                    @DisplayName("2 fields") @Test void test2() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(AB)  .indexOfLastIndexed(callback2AltAsFalse)); }
                    @DisplayName("4 fields") @Test void test4() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABCD).indexOfLastIndexed(callback2AltAsFalse)); }
                }
            }
            @DisplayName("1 field") @Nested class Test1 {
                                  @Test void a()     { assertEquals(0,                                            newInstance(A).indexOfLastIndexed(callbackIsAAlt)); }
                                  @Test void e()     { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).indexOfLastIndexed(callbackIsEAlt)); }
                                  @Test void even()  { assertEquals(0,                                            newInstance(A).indexOfLastIndexed(callbackIsEven)); }
                                  @Test void odd()   { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).indexOfLastIndexed(callbackIsOdd)); }
                @DisplayName("0") @Test void test0() { assertEquals(0,                                            newInstance(A).indexOfLastIndexed(callbackIs0)); }
                @DisplayName("4") @Test void test4() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).indexOfLastIndexed(callbackIs4)); }
            }
            @DisplayName("2 fields") @Nested class Test2 {
                                  @Test void a()     { assertEquals(0,                                            newInstance(AB).indexOfLastIndexed(callbackIsAAlt)); }
                                  @Test void b()     { assertEquals(1,                                            newInstance(AB).indexOfLastIndexed(callbackIsBAlt)); }
                                  @Test void e()     { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(AB).indexOfLastIndexed(callbackIsEAlt)); }
                                  @Test void even()  { assertEquals(0,                                            newInstance(AB).indexOfLastIndexed(callbackIsEven)); }
                                  @Test void odd()   { assertEquals(1,                                            newInstance(AB).indexOfLastIndexed(callbackIsOdd)); }
                @DisplayName("0") @Test void test0() { assertEquals(0,                                            newInstance(AB).indexOfLastIndexed(callbackIs0)); }
                @DisplayName("1") @Test void test1() { assertEquals(1,                                            newInstance(AB).indexOfLastIndexed(callbackIs1)); }
                @DisplayName("4") @Test void test4() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(AB).indexOfLastIndexed(callbackIs4)); }
            }
            @DisplayName("4 fields") @Nested class Test4 {
                                  @Test void a()     { assertEquals(0,                                            newInstance(ABCD).indexOfLastIndexed(callbackIsAAlt)); }
                                  @Test void b()     { assertEquals(1,                                            newInstance(ABCD).indexOfLastIndexed(callbackIsBAlt)); }
                                  @Test void c()     { assertEquals(2,                                            newInstance(ABCD).indexOfLastIndexed(callbackIsCAlt)); }
                                  @Test void d()     { assertEquals(3,                                            newInstance(ABCD).indexOfLastIndexed(callbackIsDAlt)); }
                                  @Test void e()     { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABCD).indexOfLastIndexed(callbackIsEAlt)); }
                                  @Test void even()  { assertEquals(2,                                            newInstance(ABCD).indexOfLastIndexed(callbackIsEven)); }
                                  @Test void odd()   { assertEquals(3,                                            newInstance(ABCD).indexOfLastIndexed(callbackIsOdd)); }
                @DisplayName("0") @Test void test0() { assertEquals(0,                                            newInstance(ABCD).indexOfLastIndexed(callbackIs0)); }
                @DisplayName("1") @Test void test1() { assertEquals(1,                                            newInstance(ABCD).indexOfLastIndexed(callbackIs1)); }
                @DisplayName("2") @Test void test2() { assertEquals(2,                                            newInstance(ABCD).indexOfLastIndexed(callbackIs2)); }
                @DisplayName("3") @Test void test3() { assertEquals(3,                                            newInstance(ABCD).indexOfLastIndexed(callbackIs3)); }
                @DisplayName("4") @Test void test4() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABCD).indexOfLastIndexed(callbackIs4)); }
            }

            @Nested class from {
                                   @Test void min()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfLastIndexed(predicate0AsFail, MIN_INT_VALUE)); }
                @DisplayName("-6") @Test void minus6() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfLastIndexed(predicate0AsFail, -6)); }
                @DisplayName("-5") @Test void minus5() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfLastIndexed(predicate0AsFail, -5)); }
                @DisplayName("-4") @Test void minus4() { assertEquals(2,                                            newInstance(ABAB).indexOfLastIndexed(callbackIsEven, -4)); }
                @DisplayName("-3") @Test void minus3() { assertEquals(2,                                            newInstance(ABAB).indexOfLastIndexed(callbackIsEven, -3)); }
                @DisplayName("-2") @Test void minus2() { assertEquals(2,                                            newInstance(ABAB).indexOfLastIndexed(callbackIsEven, -2)); }
                @DisplayName("-1") @Test void minus1() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfLastIndexed(callbackIsEven, -1)); }
                @DisplayName("0")  @Test void test0()  { assertEquals(2,                                            newInstance(ABAB).indexOfLastIndexed(callbackIsEven, 0)); }
                @DisplayName("1")  @Test void test1()  { assertEquals(2,                                            newInstance(ABAB).indexOfLastIndexed(callbackIsEven, 1)); }
                @DisplayName("2")  @Test void test2()  { assertEquals(2,                                            newInstance(ABAB).indexOfLastIndexed(callbackIsEven, 2)); }
                @DisplayName("3")  @Test void test3()  { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfLastIndexed(callbackIsEven, 3)); }
                @DisplayName("4")  @Test void test4()  { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfLastIndexed(callbackIsEven, 4)); }
                @DisplayName("5")  @Test void test5()  { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfLastIndexed(predicate0AsFail, 5)); }
                                   @Test void max()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfLastIndexed(predicate0AsFail, MAX_INT_VALUE)); }
            }
            @Nested class to {
                                   @Test void min()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfLastIndexed(predicate0AsFail, null, MIN_INT_VALUE)); }
                @DisplayName("-6") @Test void minus6() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfLastIndexed(predicate0AsFail, null, -6)); }
                @DisplayName("-5") @Test void minus5() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfLastIndexed(predicate0AsFail, null, -5)); }
                @DisplayName("-4") @Test void minus4() { assertEquals(0,                                            newInstance(ABAB).indexOfLastIndexed(callbackIsEven, null, -4)); }
                @DisplayName("-3") @Test void minus3() { assertEquals(0,                                            newInstance(ABAB).indexOfLastIndexed(callbackIsEven, null, -3)); }
                @DisplayName("-2") @Test void minus2() { assertEquals(2,                                            newInstance(ABAB).indexOfLastIndexed(callbackIsEven, null, -2)); }
                @DisplayName("-1") @Test void minus1() { assertEquals(2,                                            newInstance(ABAB).indexOfLastIndexed(callbackIsEven, null, -1)); }
                @DisplayName("0")  @Test void test0()  { assertEquals(0,                                            newInstance(ABAB).indexOfLastIndexed(callbackIsEven, null, 0)); }
                @DisplayName("1")  @Test void test1()  { assertEquals(0,                                            newInstance(ABAB).indexOfLastIndexed(callbackIsEven, null, 1)); }
                @DisplayName("2")  @Test void test2()  { assertEquals(2,                                            newInstance(ABAB).indexOfLastIndexed(callbackIsEven, null, 2)); }
                @DisplayName("3")  @Test void test3()  { assertEquals(2,                                            newInstance(ABAB).indexOfLastIndexed(callbackIsEven, null, 3)); }
                @DisplayName("4")  @Test void test4()  { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfLastIndexed(predicate0AsFail, null, 4)); }
                @DisplayName("5")  @Test void test5()  { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfLastIndexed(predicate0AsFail, null, 5)); }
                                   @Test void max()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfLastIndexed(predicate0AsFail, null, MAX_INT_VALUE)); }
            }
            @DisplayName("from + to") @Nested class fromTo {
                @DisplayName("min, min") @Test void minMin()  { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfLastIndexed(predicate0AsFail, MIN_INT_VALUE, MIN_INT_VALUE)); }
                @DisplayName("min, 0")   @Test void min0()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfLastIndexed(predicate0AsFail, MIN_INT_VALUE, 0)); }
                @DisplayName("min, 1")   @Test void min1()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfLastIndexed(predicate0AsFail, MIN_INT_VALUE, 1)); }
                @DisplayName("min, 2")   @Test void min2()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfLastIndexed(predicate0AsFail, MIN_INT_VALUE, 2)); }
                @DisplayName("min, 3")   @Test void min3()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfLastIndexed(predicate0AsFail, MIN_INT_VALUE, 3)); }
                @DisplayName("min, max") @Test void minMax()  { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfLastIndexed(predicate0AsFail, MIN_INT_VALUE, MAX_INT_VALUE)); }

                @DisplayName("0, min") @Test void test0_Min() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfLastIndexed(predicate0AsFail, 0, MIN_INT_VALUE)); }
                @DisplayName("0, 0")   @Test void test0_0()   { assertEquals(0,                                            newInstance(ABAB).indexOfLastIndexed(callbackIsEven, 0, 0)); }
                @DisplayName("0, 1")   @Test void test0_1()   { assertEquals(0,                                            newInstance(ABAB).indexOfLastIndexed(callbackIsEven, 0, 1)); }
                @DisplayName("0, 2")   @Test void test0_2()   { assertEquals(2,                                            newInstance(ABAB).indexOfLastIndexed(callbackIsEven, 0, 2)); }
                @DisplayName("0, 3")   @Test void test0_3()   { assertEquals(2,                                            newInstance(ABAB).indexOfLastIndexed(callbackIsEven, 0, 3)); }
                @DisplayName("0, max") @Test void test0_Max() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfLastIndexed(predicate0AsFail, 0, MAX_INT_VALUE)); }

                @DisplayName("1, min") @Test void test1_Min() { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(ABAB).indexOfLastIndexed(predicate0AsFail, 1, MIN_INT_VALUE)); }
                @DisplayName("1, 0")   @Test void test1_0()   { assertThrowsExactly(InvalidIndexRangeException.class, () -> newInstance(ABAB).indexOfLastIndexed(predicate0AsFail, 1, 0)); }
                @DisplayName("1, 1")   @Test void test1_1()   { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(ABAB).indexOfLastIndexed(callbackIsEven, 1, 1)); }
                @DisplayName("1, 2")   @Test void test1_2()   { assertEquals(2,                                             newInstance(ABAB).indexOfLastIndexed(callbackIsEven, 1, 2)); }
                @DisplayName("1, 3")   @Test void test1_3()   { assertEquals(2,                                             newInstance(ABAB).indexOfLastIndexed(callbackIsEven, 1, 3)); }
                @DisplayName("1, max") @Test void test1_Max() { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(ABAB).indexOfLastIndexed(predicate0AsFail, 1, MAX_INT_VALUE)); }

                @DisplayName("2, min") @Test void test2_Min() { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(ABAB).indexOfLastIndexed(predicate0AsFail, 2, MIN_INT_VALUE)); }
                @DisplayName("2, 0")   @Test void test2_0()   { assertThrowsExactly(InvalidIndexRangeException.class, () -> newInstance(ABAB).indexOfLastIndexed(predicate0AsFail, 2, 0)); }
                @DisplayName("2, 1")   @Test void test2_1()   { assertThrowsExactly(InvalidIndexRangeException.class, () -> newInstance(ABAB).indexOfLastIndexed(predicate0AsFail, 2, 1)); }
                @DisplayName("2, 2")   @Test void test2_2()   { assertEquals(2,                                             newInstance(ABAB).indexOfLastIndexed(callbackIsEven, 2, 2)); }
                @DisplayName("2, 3")   @Test void test2_3()   { assertEquals(2,                                             newInstance(ABAB).indexOfLastIndexed(callbackIsEven, 2, 3)); }
                @DisplayName("2, max") @Test void test2_Max() { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(ABAB).indexOfLastIndexed(predicate0AsFail, 2, MAX_INT_VALUE)); }

                @DisplayName("3, min") @Test void test3_Min() { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(ABAB).indexOfLastIndexed(predicate0AsFail, 3, MIN_INT_VALUE)); }
                @DisplayName("3, 0")   @Test void test3_0()   { assertThrowsExactly(InvalidIndexRangeException.class, () -> newInstance(ABAB).indexOfLastIndexed(predicate0AsFail, 3, 0)); }
                @DisplayName("3, 1")   @Test void test3_1()   { assertThrowsExactly(InvalidIndexRangeException.class, () -> newInstance(ABAB).indexOfLastIndexed(predicate0AsFail, 3, 1)); }
                @DisplayName("3, 2")   @Test void test3_2()   { assertThrowsExactly(InvalidIndexRangeException.class, () -> newInstance(ABAB).indexOfLastIndexed(predicate0AsFail, 3, 2)); }
                @DisplayName("3, 3")   @Test void test3_3()   { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(ABAB).indexOfLastIndexed(callbackIsEven, 3, 3)); }
                @DisplayName("3, max") @Test void test3_Max() { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(ABAB).indexOfLastIndexed(predicate0AsFail, 3, MAX_INT_VALUE)); }

                @DisplayName("max, min") @Test void maxMin()  { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfLastIndexed(predicate0AsFail, MAX_INT_VALUE, MIN_INT_VALUE)); }
                @DisplayName("max, 0")   @Test void max0()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfLastIndexed(predicate0AsFail, MAX_INT_VALUE, 0)); }
                @DisplayName("max, 1")   @Test void max1()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfLastIndexed(predicate0AsFail, MAX_INT_VALUE, 1)); }
                @DisplayName("max, 2")   @Test void max2()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfLastIndexed(predicate0AsFail, MAX_INT_VALUE, 2)); }
                @DisplayName("max, 3")   @Test void max3()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfLastIndexed(predicate0AsFail, MAX_INT_VALUE, 3)); }
                @DisplayName("max, max") @Test void maxMax()  { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABAB).indexOfLastIndexed(predicate0AsFail, MAX_INT_VALUE, MAX_INT_VALUE)); }
            }
        }
        @TestInstance(PER_CLASS) @Nested class indexOfLastIndexedOrNull {
            @Nested class empty {
                                           @Test void direct()     { assertNull(newInstance(EMPTY).indexOfLastIndexedOrNull(predicate0AsFail)); }
                @DisplayName("from (min)") @Test void fromMin()    { assertNull(newInstance(EMPTY).indexOfLastIndexedOrNull(predicate0AsFail, MIN_INT_VALUE)); }
                @DisplayName("from (-1)")  @Test void fromMinus1() { assertNull(newInstance(EMPTY).indexOfLastIndexedOrNull(predicate0AsFail, -1)); }
                @DisplayName("from (0)")   @Test void from0()      { assertNull(newInstance(EMPTY).indexOfLastIndexedOrNull(predicate0AsFail, 0)); }
                @DisplayName("from (1)")   @Test void from1()      { assertNull(newInstance(EMPTY).indexOfLastIndexedOrNull(predicate0AsFail, 1)); }
                @DisplayName("from (min)") @Test void fromMax()    { assertNull(newInstance(EMPTY).indexOfLastIndexedOrNull(predicate0AsFail, MAX_INT_VALUE)); }
                @DisplayName("to (min)")   @Test void toMin()      { assertNull(newInstance(EMPTY).indexOfLastIndexedOrNull(predicate0AsFail, null, MIN_INT_VALUE)); }
                @DisplayName("to (-1)")    @Test void toMinus1()   { assertNull(newInstance(EMPTY).indexOfLastIndexedOrNull(predicate0AsFail, null, -1)); }
                @DisplayName("to (0)")     @Test void to0()        { assertNull(newInstance(EMPTY).indexOfLastIndexedOrNull(predicate0AsFail, null, 0)); }
                @DisplayName("to (1)")     @Test void to1()        { assertNull(newInstance(EMPTY).indexOfLastIndexedOrNull(predicate0AsFail, null, 1)); }
                @DisplayName("to (min)")   @Test void toMax()      { assertNull(newInstance(EMPTY).indexOfLastIndexedOrNull(predicate0AsFail, null, MAX_INT_VALUE)); }
            }
            @DisplayName("boolean callbacks") @TestInstance(PER_CLASS) @Nested class BooleanCallbacks {
                @DisplayName("true: 0 arguments") @Nested class True0 {
                    @DisplayName("1 field")  @Test void test1() { assertEquals(0, newInstance(A)   .indexOfLastIndexedOrNull(callback0AsTrue)); }
                    @DisplayName("2 fields") @Test void test2() { assertEquals(1, newInstance(AB)  .indexOfLastIndexedOrNull(callback0AsTrue)); }
                    @DisplayName("4 fields") @Test void test4() { assertEquals(3, newInstance(ABCD).indexOfLastIndexedOrNull(callback0AsTrue)); }
                }
                @DisplayName("true: 1 argument") @Nested class True1 {
                    @DisplayName("1 field")  @Test void test1() { assertEquals(0, newInstance(A)   .indexOfLastIndexedOrNull(callback1AltAsTrue)); }
                    @DisplayName("2 fields") @Test void test2() { assertEquals(1, newInstance(AB)  .indexOfLastIndexedOrNull(callback1AltAsTrue)); }
                    @DisplayName("4 fields") @Test void test4() { assertEquals(3, newInstance(ABCD).indexOfLastIndexedOrNull(callback1AltAsTrue)); }
                }
                @DisplayName("true: 2 arguments") @Nested class True2 {
                    @DisplayName("1 field")  @Test void test1() { assertEquals(0, newInstance(A)   .indexOfLastIndexedOrNull(callback2AltAsTrue)); }
                    @DisplayName("2 fields") @Test void test2() { assertEquals(1, newInstance(AB)  .indexOfLastIndexedOrNull(callback2AltAsTrue)); }
                    @DisplayName("4 fields") @Test void test4() { assertEquals(3, newInstance(ABCD).indexOfLastIndexedOrNull(callback2AltAsTrue)); }
                }
                @DisplayName("false: 0 arguments") @Nested class False0 {
                    @DisplayName("1 field")  @Test void test1() { assertNull(newInstance(A)   .indexOfLastIndexedOrNull(callback0AsFalse)); }
                    @DisplayName("2 fields") @Test void test2() { assertNull(newInstance(AB)  .indexOfLastIndexedOrNull(callback0AsFalse)); }
                    @DisplayName("4 fields") @Test void test4() { assertNull(newInstance(ABCD).indexOfLastIndexedOrNull(callback0AsFalse)); }
                }
                @DisplayName("false: 1 argument") @Nested class False1 {
                    @DisplayName("1 field")  @Test void test1() { assertNull(newInstance(A)   .indexOfLastIndexedOrNull(callback1AltAsFalse)); }
                    @DisplayName("2 fields") @Test void test2() { assertNull(newInstance(AB)  .indexOfLastIndexedOrNull(callback1AltAsFalse)); }
                    @DisplayName("4 fields") @Test void test4() { assertNull(newInstance(ABCD).indexOfLastIndexedOrNull(callback1AltAsFalse)); }
                }
                @DisplayName("false: 2 arguments") @Nested class False2 {
                    @DisplayName("1 field")  @Test void test1() { assertNull(newInstance(A)   .indexOfLastIndexedOrNull(callback2AltAsFalse)); }
                    @DisplayName("2 fields") @Test void test2() { assertNull(newInstance(AB)  .indexOfLastIndexedOrNull(callback2AltAsFalse)); }
                    @DisplayName("4 fields") @Test void test4() { assertNull(newInstance(ABCD).indexOfLastIndexedOrNull(callback2AltAsFalse)); }
                }
            }
            @DisplayName("1 field") @Nested class Test1 {
                                  @Test void a()     { assertEquals(0, newInstance(A).indexOfLastIndexedOrNull(callbackIsAAlt)); }
                                  @Test void e()     { assertNull(     newInstance(A).indexOfLastIndexedOrNull(callbackIsEAlt)); }
                                  @Test void even()  { assertEquals(0, newInstance(A).indexOfLastIndexedOrNull(callbackIsEven)); }
                                  @Test void odd()   { assertNull(     newInstance(A).indexOfLastIndexedOrNull(callbackIsOdd)); }
                @DisplayName("0") @Test void test0() { assertEquals(0, newInstance(A).indexOfLastIndexedOrNull(callbackIs0)); }
                @DisplayName("4") @Test void test4() { assertNull(     newInstance(A).indexOfLastIndexedOrNull(callbackIs4)); }
            }
            @DisplayName("2 fields") @Nested class Test2 {
                                  @Test void a()     { assertEquals(0, newInstance(AB).indexOfLastIndexedOrNull(callbackIsAAlt)); }
                                  @Test void b()     { assertEquals(1, newInstance(AB).indexOfLastIndexedOrNull(callbackIsBAlt)); }
                                  @Test void e()     { assertNull(     newInstance(AB).indexOfLastIndexedOrNull(callbackIsEAlt)); }
                                  @Test void even()  { assertEquals(0, newInstance(AB).indexOfLastIndexedOrNull(callbackIsEven)); }
                                  @Test void odd()   { assertEquals(1, newInstance(AB).indexOfLastIndexedOrNull(callbackIsOdd)); }
                @DisplayName("0") @Test void test0() { assertEquals(0, newInstance(AB).indexOfLastIndexedOrNull(callbackIs0)); }
                @DisplayName("1") @Test void test1() { assertEquals(1, newInstance(AB).indexOfLastIndexedOrNull(callbackIs1)); }
                @DisplayName("4") @Test void test4() { assertNull(     newInstance(AB).indexOfLastIndexedOrNull(callbackIs4)); }
            }
            @DisplayName("4 fields") @Nested class Test4 {
                                  @Test void a()     { assertEquals(0, newInstance(ABCD).indexOfLastIndexedOrNull(callbackIsAAlt)); }
                                  @Test void b()     { assertEquals(1, newInstance(ABCD).indexOfLastIndexedOrNull(callbackIsBAlt)); }
                                  @Test void c()     { assertEquals(2, newInstance(ABCD).indexOfLastIndexedOrNull(callbackIsCAlt)); }
                                  @Test void d()     { assertEquals(3, newInstance(ABCD).indexOfLastIndexedOrNull(callbackIsDAlt)); }
                                  @Test void e()     { assertNull(     newInstance(ABCD).indexOfLastIndexedOrNull(callbackIsEAlt)); }
                                  @Test void even()  { assertEquals(2, newInstance(ABCD).indexOfLastIndexedOrNull(callbackIsEven)); }
                                  @Test void odd()   { assertEquals(3, newInstance(ABCD).indexOfLastIndexedOrNull(callbackIsOdd)); }
                @DisplayName("0") @Test void test0() { assertEquals(0, newInstance(ABCD).indexOfLastIndexedOrNull(callbackIs0)); }
                @DisplayName("1") @Test void test1() { assertEquals(1, newInstance(ABCD).indexOfLastIndexedOrNull(callbackIs1)); }
                @DisplayName("2") @Test void test2() { assertEquals(2, newInstance(ABCD).indexOfLastIndexedOrNull(callbackIs2)); }
                @DisplayName("3") @Test void test3() { assertEquals(3, newInstance(ABCD).indexOfLastIndexedOrNull(callbackIs3)); }
                @DisplayName("4") @Test void test4() { assertNull(     newInstance(ABCD).indexOfLastIndexedOrNull(callbackIs4)); }
            }

            @Nested class from {
                                   @Test void min()    { assertNull(     newInstance(ABAB).indexOfLastIndexedOrNull(predicate0AsFail, MIN_INT_VALUE)); }
                @DisplayName("-6") @Test void minus6() { assertNull(     newInstance(ABAB).indexOfLastIndexedOrNull(predicate0AsFail, -6)); }
                @DisplayName("-5") @Test void minus5() { assertNull(     newInstance(ABAB).indexOfLastIndexedOrNull(predicate0AsFail, -5)); }
                @DisplayName("-4") @Test void minus4() { assertEquals(2, newInstance(ABAB).indexOfLastIndexedOrNull(callbackIsEven, -4)); }
                @DisplayName("-3") @Test void minus3() { assertEquals(2, newInstance(ABAB).indexOfLastIndexedOrNull(callbackIsEven, -3)); }
                @DisplayName("-2") @Test void minus2() { assertEquals(2, newInstance(ABAB).indexOfLastIndexedOrNull(callbackIsEven, -2)); }
                @DisplayName("-1") @Test void minus1() { assertNull(     newInstance(ABAB).indexOfLastIndexedOrNull(callbackIsEven, -1)); }
                @DisplayName("0")  @Test void test0()  { assertEquals(2, newInstance(ABAB).indexOfLastIndexedOrNull(callbackIsEven, 0)); }
                @DisplayName("1")  @Test void test1()  { assertEquals(2, newInstance(ABAB).indexOfLastIndexedOrNull(callbackIsEven, 1)); }
                @DisplayName("2")  @Test void test2()  { assertEquals(2, newInstance(ABAB).indexOfLastIndexedOrNull(callbackIsEven, 2)); }
                @DisplayName("3")  @Test void test3()  { assertNull(     newInstance(ABAB).indexOfLastIndexedOrNull(callbackIsEven, 3)); }
                @DisplayName("4")  @Test void test4()  { assertNull(     newInstance(ABAB).indexOfLastIndexedOrNull(predicate0AsFail, 4)); }
                @DisplayName("5")  @Test void test5()  { assertNull(     newInstance(ABAB).indexOfLastIndexedOrNull(predicate0AsFail, 5)); }
                                   @Test void max()    { assertNull(     newInstance(ABAB).indexOfLastIndexedOrNull(predicate0AsFail, MAX_INT_VALUE)); }
            }
            @Nested class to {
                                   @Test void min()    { assertNull(     newInstance(ABAB).indexOfLastIndexedOrNull(predicate0AsFail, null, MIN_INT_VALUE)); }
                @DisplayName("-6") @Test void minus6() { assertNull(     newInstance(ABAB).indexOfLastIndexedOrNull(predicate0AsFail, null, -6)); }
                @DisplayName("-5") @Test void minus5() { assertNull(     newInstance(ABAB).indexOfLastIndexedOrNull(predicate0AsFail, null, -5)); }
                @DisplayName("-4") @Test void minus4() { assertEquals(0, newInstance(ABAB).indexOfLastIndexedOrNull(callbackIsEven, null, -4)); }
                @DisplayName("-3") @Test void minus3() { assertEquals(0, newInstance(ABAB).indexOfLastIndexedOrNull(callbackIsEven, null, -3)); }
                @DisplayName("-2") @Test void minus2() { assertEquals(2, newInstance(ABAB).indexOfLastIndexedOrNull(callbackIsEven, null, -2)); }
                @DisplayName("-1") @Test void minus1() { assertEquals(2, newInstance(ABAB).indexOfLastIndexedOrNull(callbackIsEven, null, -1)); }
                @DisplayName("0")  @Test void test0()  { assertEquals(0, newInstance(ABAB).indexOfLastIndexedOrNull(callbackIsEven, null, 0)); }
                @DisplayName("1")  @Test void test1()  { assertEquals(0, newInstance(ABAB).indexOfLastIndexedOrNull(callbackIsEven, null, 1)); }
                @DisplayName("2")  @Test void test2()  { assertEquals(2, newInstance(ABAB).indexOfLastIndexedOrNull(callbackIsEven, null, 2)); }
                @DisplayName("3")  @Test void test3()  { assertEquals(2, newInstance(ABAB).indexOfLastIndexedOrNull(callbackIsEven, null, 3)); }
                @DisplayName("4")  @Test void test4()  { assertNull(     newInstance(ABAB).indexOfLastIndexedOrNull(predicate0AsFail, null, 4)); }
                @DisplayName("5")  @Test void test5()  { assertNull(     newInstance(ABAB).indexOfLastIndexedOrNull(predicate0AsFail, null, 5)); }
                                   @Test void max()    { assertNull(     newInstance(ABAB).indexOfLastIndexedOrNull(predicate0AsFail, null, MAX_INT_VALUE)); }
            }
            @DisplayName("from + to") @Nested class fromTo {
                @DisplayName("min, min") @Test void minMin()  { assertNull(newInstance(ABAB).indexOfLastIndexedOrNull(predicate0AsFail, MIN_INT_VALUE, MIN_INT_VALUE)); }
                @DisplayName("min, 0")   @Test void min0()    { assertNull(newInstance(ABAB).indexOfLastIndexedOrNull(predicate0AsFail, MIN_INT_VALUE, 0)); }
                @DisplayName("min, 1")   @Test void min1()    { assertNull(newInstance(ABAB).indexOfLastIndexedOrNull(predicate0AsFail, MIN_INT_VALUE, 1)); }
                @DisplayName("min, 2")   @Test void min2()    { assertNull(newInstance(ABAB).indexOfLastIndexedOrNull(predicate0AsFail, MIN_INT_VALUE, 2)); }
                @DisplayName("min, 3")   @Test void min3()    { assertNull(newInstance(ABAB).indexOfLastIndexedOrNull(predicate0AsFail, MIN_INT_VALUE, 3)); }
                @DisplayName("min, max") @Test void minMax()  { assertNull(newInstance(ABAB).indexOfLastIndexedOrNull(predicate0AsFail, MIN_INT_VALUE, MAX_INT_VALUE)); }

                @DisplayName("0, min") @Test void test0_Min() { assertNull(     newInstance(ABAB).indexOfLastIndexedOrNull(predicate0AsFail, 0, MIN_INT_VALUE)); }
                @DisplayName("0, 0")   @Test void test0_0()   { assertEquals(0, newInstance(ABAB).indexOfLastIndexedOrNull(callbackIsEven, 0, 0)); }
                @DisplayName("0, 1")   @Test void test0_1()   { assertEquals(0, newInstance(ABAB).indexOfLastIndexedOrNull(callbackIsEven, 0, 1)); }
                @DisplayName("0, 2")   @Test void test0_2()   { assertEquals(2, newInstance(ABAB).indexOfLastIndexedOrNull(callbackIsEven, 0, 2)); }
                @DisplayName("0, 3")   @Test void test0_3()   { assertEquals(2, newInstance(ABAB).indexOfLastIndexedOrNull(callbackIsEven, 0, 3)); }
                @DisplayName("0, max") @Test void test0_Max() { assertNull(     newInstance(ABAB).indexOfLastIndexedOrNull(predicate0AsFail, 0, MAX_INT_VALUE)); }

                @DisplayName("1, min") @Test void test1_Min() { assertNull(     newInstance(ABAB).indexOfLastIndexedOrNull(predicate0AsFail, 1, MIN_INT_VALUE)); }
                @DisplayName("1, 0")   @Test void test1_0()   { assertNull(     newInstance(ABAB).indexOfLastIndexedOrNull(predicate0AsFail, 1, 0)); }
                @DisplayName("1, 1")   @Test void test1_1()   { assertNull(     newInstance(ABAB).indexOfLastIndexedOrNull(callbackIsEven, 1, 1)); }
                @DisplayName("1, 2")   @Test void test1_2()   { assertEquals(2, newInstance(ABAB).indexOfLastIndexedOrNull(callbackIsEven, 1, 2)); }
                @DisplayName("1, 3")   @Test void test1_3()   { assertEquals(2, newInstance(ABAB).indexOfLastIndexedOrNull(callbackIsEven, 1, 3)); }
                @DisplayName("1, max") @Test void test1_Max() { assertNull(     newInstance(ABAB).indexOfLastIndexedOrNull(predicate0AsFail, 1, MAX_INT_VALUE)); }

                @DisplayName("2, min") @Test void test2_Min() { assertNull(     newInstance(ABAB).indexOfLastIndexedOrNull(predicate0AsFail, 2, MIN_INT_VALUE)); }
                @DisplayName("2, 0")   @Test void test2_0()   { assertNull(     newInstance(ABAB).indexOfLastIndexedOrNull(predicate0AsFail, 2, 0)); }
                @DisplayName("2, 1")   @Test void test2_1()   { assertNull(     newInstance(ABAB).indexOfLastIndexedOrNull(predicate0AsFail, 2, 1)); }
                @DisplayName("2, 2")   @Test void test2_2()   { assertEquals(2, newInstance(ABAB).indexOfLastIndexedOrNull(callbackIsEven, 2, 2)); }
                @DisplayName("2, 3")   @Test void test2_3()   { assertEquals(2, newInstance(ABAB).indexOfLastIndexedOrNull(callbackIsEven, 2, 3)); }
                @DisplayName("2, max") @Test void test2_Max() { assertNull(     newInstance(ABAB).indexOfLastIndexedOrNull(predicate0AsFail, 2, MAX_INT_VALUE)); }

                @DisplayName("3, min") @Test void test3_Min() { assertNull(newInstance(ABAB).indexOfLastIndexedOrNull(predicate0AsFail, 3, MIN_INT_VALUE)); }
                @DisplayName("3, 0")   @Test void test3_0()   { assertNull(newInstance(ABAB).indexOfLastIndexedOrNull(predicate0AsFail, 3, 0)); }
                @DisplayName("3, 1")   @Test void test3_1()   { assertNull(newInstance(ABAB).indexOfLastIndexedOrNull(predicate0AsFail, 3, 1)); }
                @DisplayName("3, 2")   @Test void test3_2()   { assertNull(newInstance(ABAB).indexOfLastIndexedOrNull(predicate0AsFail, 3, 2)); }
                @DisplayName("3, 3")   @Test void test3_3()   { assertNull(newInstance(ABAB).indexOfLastIndexedOrNull(callbackIsEven, 3, 3)); }
                @DisplayName("3, max") @Test void test3_Max() { assertNull(newInstance(ABAB).indexOfLastIndexedOrNull(predicate0AsFail, 3, MAX_INT_VALUE)); }

                @DisplayName("max, min") @Test void maxMin()  { assertNull(newInstance(ABAB).indexOfLastIndexedOrNull(predicate0AsFail, MAX_INT_VALUE, MIN_INT_VALUE)); }
                @DisplayName("max, 0")   @Test void max0()    { assertNull(newInstance(ABAB).indexOfLastIndexedOrNull(predicate0AsFail, MAX_INT_VALUE, 0)); }
                @DisplayName("max, 1")   @Test void max1()    { assertNull(newInstance(ABAB).indexOfLastIndexedOrNull(predicate0AsFail, MAX_INT_VALUE, 1)); }
                @DisplayName("max, 2")   @Test void max2()    { assertNull(newInstance(ABAB).indexOfLastIndexedOrNull(predicate0AsFail, MAX_INT_VALUE, 2)); }
                @DisplayName("max, 3")   @Test void max3()    { assertNull(newInstance(ABAB).indexOfLastIndexedOrNull(predicate0AsFail, MAX_INT_VALUE, 3)); }
                @DisplayName("max, max") @Test void maxMax()  { assertNull(newInstance(ABAB).indexOfLastIndexedOrNull(predicate0AsFail, MAX_INT_VALUE, MAX_INT_VALUE)); }
            }
        }

    }

}

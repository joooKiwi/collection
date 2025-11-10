import condition.DisableIfNormalCondition;
import condition.DisableIfNormalViewerCondition;
import instance.CollectionHolderForTest;
import instance.GenericCollectionHolder_AllAlias;
import instance.GenericCollectionHolder_AnyAlias;
import joookiwi.collection.java.CollectionHolder;
import org.jetbrains.annotations.NotNullByDefault;
import org.junit.jupiter.api.Disabled;
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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;
import static value.Arrays.A;
import static value.Arrays.AB;
import static value.Arrays.ABCD;
import static value.Arrays.EMPTY;
import static value.Callbacks.predicate0AsFail;
import static value.Callbacks.predicate1AsFail;
import static value.Callbacks.predicate2AsFail;
import static value.Callbacks_Boolean.callback0AsFalse;
import static value.Callbacks_Boolean.callback0AsTrue;
import static value.Callbacks_Boolean.callback1AsFalse;
import static value.Callbacks_Boolean.callback1AsTrue;
import static value.Callbacks_Boolean.callback2AsFalse;
import static value.Callbacks_Boolean.callback2AsTrue;
import static value.Callbacks_Numeric.callbackIs0Alt;
import static value.Callbacks_Numeric.callbackIs1Alt;
import static value.Callbacks_Numeric.callbackIs2Alt;
import static value.Callbacks_Numeric.callbackIs3Alt;
import static value.Callbacks_Numeric.callbackIs4Alt;
import static value.Callbacks_Numeric.callbackIsEvenAlt;
import static value.Callbacks_Numeric.callbackIsOddAlt;
import static value.Callbacks_String.callbackIsA;
import static value.Callbacks_String.callbackIsB;
import static value.Callbacks_String.callbackIsC;
import static value.Callbacks_String.callbackIsD;
import static value.Callbacks_String.callbackIsE;
import static value.Instances.everyExtensionMethodInstancesAsArguments;
import static value.Instances.everyInstancesAsArguments;
import static value.ReusableFields.EMPTY_ARRAY;
import static value.ReusableFields_Null.NULL_PREDICATE0;
import static value.ReusableFields_Null.NULL_PREDICATE1;
import static value.ReusableFields_Null.NULL_PREDICATE2;
import static value.ReusableFields_Null.NULL_VARARGS;

@NotNullByDefault
@DisplayNameGeneration(Simple.class)
@DisplayName("CollectionHolder tests (all|any|none)") @TestInstance(PER_CLASS) class CollectionHolder06_AllAnyNoneTests {

    @TestInstance(PER_CLASS) @Nested class EmptyCollectionHolder extends AbstractEmptyCollectionHolderTests {
        @Nested class all {
            @DisplayName("∅")                       @Test void testEmpty()     { assertTrue(instance.all()); }
            @DisplayName("null (T, int) → boolean") @Test void test2Arg()      { assertTrue(instance.all(NULL_PREDICATE2)); }
            @DisplayName("null (T) → boolean")      @Test void test1Arg()      { assertTrue(instance.all(NULL_PREDICATE1)); }
            @DisplayName("null () → boolean")       @Test void test0Arg()      { assertTrue(instance.all(NULL_PREDICATE0)); }
            @DisplayName("null array")              @Test void testNullArray() { assertTrue(instance.all(NULL_VARARGS)); }
            @DisplayName("[]")                      @Test void testArray()     { assertTrue(instance.all(EMPTY_ARRAY)); }
        }
        @Nested class every {
            @DisplayName("∅")                       @Test void testEmpty()     { assertTrue(instance.every()); }
            @DisplayName("null (T, int) → boolean") @Test void test2Arg()      { assertTrue(instance.every(NULL_PREDICATE2)); }
            @DisplayName("null (T) → boolean")      @Test void test1Arg()      { assertTrue(instance.every(NULL_PREDICATE1)); }
            @DisplayName("null () → boolean")       @Test void test0Arg()      { assertTrue(instance.every(NULL_PREDICATE0)); }
            @DisplayName("null array")              @Test void testNullArray() { assertTrue(instance.every(NULL_VARARGS)); }
            @DisplayName("[]")                      @Test void testArray()     { assertTrue(instance.every(EMPTY_ARRAY)); }
        }

        @Nested class any {
            @DisplayName("∅")                       @Test void testEmpty()     { assertFalse(instance.any()); }
            @DisplayName("null (T, int) → boolean") @Test void test2Arg()      { assertFalse(instance.any(NULL_PREDICATE2)); }
            @DisplayName("null (T) → boolean")      @Test void test1Arg()      { assertFalse(instance.any(NULL_PREDICATE1)); }
            @DisplayName("null () → boolean")       @Test void test0Arg()      { assertFalse(instance.any(NULL_PREDICATE0)); }
            @DisplayName("null array")              @Test void testNullArray() { assertFalse(instance.any(NULL_VARARGS)); }
            @DisplayName("[]")                      @Test void testArray()     { assertFalse(instance.any(EMPTY_ARRAY)); }
        }
        @Nested class some {
            @DisplayName("∅")                       @Test void testEmpty()     { assertFalse(instance.some()); }
            @DisplayName("null (T, int) → boolean") @Test void test2Arg()      { assertFalse(instance.some(NULL_PREDICATE2)); }
            @DisplayName("null (T) → boolean")      @Test void test1Arg()      { assertFalse(instance.some(NULL_PREDICATE1)); }
            @DisplayName("null () → boolean")       @Test void test0Arg()      { assertFalse(instance.some(NULL_PREDICATE0)); }
            @DisplayName("null array")              @Test void testNullArray() { assertFalse(instance.some(NULL_VARARGS)); }
            @DisplayName("[]")                      @Test void testArray()     { assertFalse(instance.some(EMPTY_ARRAY)); }
        }

        @Nested class none {
            @DisplayName("∅")                       @Test void testEmpty()     { assertTrue(instance.none()); }
            @DisplayName("null (T, int) → boolean") @Test void test2Arg()      { assertTrue(instance.none(NULL_PREDICATE2)); }
            @DisplayName("null (T) → boolean")      @Test void test1Arg()      { assertTrue(instance.none(NULL_PREDICATE1)); }
            @DisplayName("null () → boolean")       @Test void test0Arg()      { assertTrue(instance.none(NULL_PREDICATE0)); }
            @DisplayName("null array")              @Test void testNullArray() { assertTrue(instance.none(NULL_VARARGS)); }
            @DisplayName("[]")                      @Test void testArray()     { assertTrue(instance.none(EMPTY_ARRAY)); }
        }
    }

    @TestInstance(PER_CLASS) @Nested class aliases {
        @TestInstance(PER_CLASS) @Nested class GenericCollectionHolder {
            @Nested class every {
                @DisplayName("(T, int) → boolean") @Test void test2Arg() { assertEquals(1, new GenericCollectionHolder_AllAlias().execute(it -> it.every(callback2AsTrue)).amountOfCall); }
                @DisplayName("(T) → boolean")      @Test void test1Arg() { assertEquals(1, new GenericCollectionHolder_AllAlias().execute(it -> it.every(callback1AsTrue)).amountOfCall); }
                @DisplayName("() → boolean")       @Test void test0Arg() { assertEquals(1, new GenericCollectionHolder_AllAlias().execute(it -> it.every(callback0AsTrue)).amountOfCall); }
            }
            @Nested class some {
                @Disabled @DisplayName("∅")                  @Test void testEmpty() { assertEquals(1, new GenericCollectionHolder_AnyAlias().execute(it -> it.some()).amountOfCall); }
                @DisplayName("(T, int) → boolean") @Test void test2Arg()  { assertEquals(1, new GenericCollectionHolder_AnyAlias().execute(it -> it.some(callback2AsTrue)).amountOfCall); }
                @DisplayName("(T) → boolean")      @Test void test1Arg()  { assertEquals(1, new GenericCollectionHolder_AnyAlias().execute(it -> it.some(callback1AsTrue)).amountOfCall); }
                @DisplayName("() → boolean")       @Test void test0Arg()  { assertEquals(1, new GenericCollectionHolder_AnyAlias().execute(it -> it.some(callback0AsTrue)).amountOfCall); }
            }
        }

//        @Nested class every {
//            @DisplayName("MinimalistCollectionHolder<T>, (T, int) → boolean") @Test void minimalist2Arg() { assertTrue(every(new ArrayAsMinimalistCollection<>(A), callback2AsTrue)); }
//            @DisplayName("CollectionHolder<T>, (T, int) → boolean")           @Test void normal2Arg()     { assertTrue(every(new ArrayAsCollection<>(A),           callback2AsTrue)); }
//            @DisplayName("T[], (T, int) → boolean")                           @Test void array2Arg()      { assertTrue(every(A,                                    callback2AsTrue)); }
//            @DisplayName("MinimalistCollectionHolder<T>, (T) → boolean")      @Test void minimalist1Arg() { assertTrue(every(new ArrayAsMinimalistCollection<>(A), callback1AsTrue)); }
//            @DisplayName("CollectionHolder<T>, (T) → boolean")                @Test void normal1Arg()     { assertTrue(every(new ArrayAsCollection<>(A),           callback1AsTrue)); }
//            @DisplayName("T[], (T) → boolean")                                @Test void array1Arg()      { assertTrue(every(A,                                    callback1AsTrue)); }
//            @DisplayName("MinimalistCollectionHolder<T>, () → boolean")       @Test void minimalist2Arg() { assertTrue(every(new ArrayAsMinimalistCollection<>(A), callback0AsTrue)); }
//            @DisplayName("CollectionHolder<T>, () → boolean")                 @Test void normal0Arg()     { assertTrue(every(new ArrayAsCollection<>(A),           callback0AsTrue)); }
//            @DisplayName("T[], () → boolean")                                 @Test void array0Arg()      { assertTrue(every(A,                                    callback0AsTrue)); }
//        }
//        @Nested class some {
//            @DisplayName("MinimalistCollectionHolder<T>, ∅")                  @Test void minimalistEmpty() { assertTrue(some(new ArrayAsMinimalistCollection<>(A))); }
//            @DisplayName("CollectionHolder<T>, ∅")                            @Test void normalEmpty()     { assertTrue(some(new ArrayAsCollection<>(A)          )); }
//            @DisplayName("T[], ∅")                                            @Test void arrayEmpty()      { assertTrue(some(A                                   )); }
//            @DisplayName("MinimalistCollectionHolder<T>, (T, int) → boolean") @Test void minimalist2Arg()  { assertTrue(some(new ArrayAsMinimalistCollection<>(A), callback2AsTrue)); }
//            @DisplayName("CollectionHolder<T>, (T, int) → boolean")           @Test void normal2Arg()      { assertTrue(some(new ArrayAsCollection<>(A),           callback2AsTrue)); }
//            @DisplayName("T[], (T, int) → boolean")                           @Test void array2Arg()       { assertTrue(some(A,                                    callback2AsTrue)); }
//            @DisplayName("MinimalistCollectionHolder<T>, (T) → boolean")      @Test void minimalist1Arg()  { assertTrue(some(new ArrayAsMinimalistCollection<>(A), callback1AsTrue)); }
//            @DisplayName("CollectionHolder<T>, (T) → boolean")                @Test void normal1Arg()      { assertTrue(some(new ArrayAsCollection<>(A),           callback1AsTrue)); }
//            @DisplayName("T[], (T) → boolean")                                @Test void array1Arg()       { assertTrue(some(A,                                    callback1AsTrue)); }
//            @DisplayName("MinimalistCollectionHolder<T>, () → boolean")       @Test void minimalist2Arg()  { assertTrue(some(new ArrayAsMinimalistCollection<>(A), callback0AsTrue)); }
//            @DisplayName("CollectionHolder<T>, () → boolean")                 @Test void normal0Arg()      { assertTrue(some(new ArrayAsCollection<>(A),           callback0AsTrue)); }
//            @DisplayName("T[], () → boolean")                                 @Test void array0Arg()       { assertTrue(some(A,                                    callback0AsTrue)); }
//        }

    }

    @FieldSource("values")
    @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class methods extends AbstractMethodsTests {

        //#region -------------------- Required test configuration --------------------

        static final Arguments[] values = everyExtensionMethodInstancesAsArguments;

        public methods(final CollectionHolderForTest<?, ?> instance) { super(instance); }

        //#endregion -------------------- Required test configuration --------------------

        @Nested class all {
            @DisplayName("(T, int) → boolean") @Test void test2Arg() { assertTrue(methods.this.<String>getInstance().all(predicate2AsFail)); }
            @DisplayName("(T) → boolean")      @Test void test1Arg() { assertTrue(methods.this.<String>getInstance().all(predicate1AsFail)); }
            @DisplayName("() → boolean")       @Test void test0Arg() { assertTrue(                     getInstance().all(predicate0AsFail)); }
        }
        @Nested class any {
            @DisplayName("∅")                  @Test void testEmpty() { assertFalse(                     getInstance().any()); }
            @DisplayName("(T, int) → boolean") @Test void test2Arg()  { assertFalse(methods.this.<String>getInstance().any(predicate2AsFail)); }
            @DisplayName("(T) → boolean")      @Test void test1Arg()  { assertFalse(methods.this.<String>getInstance().any(predicate1AsFail)); }
            @DisplayName("() → boolean")       @Test void test0Arg()  { assertFalse(                     getInstance().any(predicate0AsFail)); }
        }
        @Nested class none {
            @DisplayName("∅")                  @Test void testEmpty() { assertTrue(                     getInstance().none()); }
            @DisplayName("(T, int) → boolean") @Test void test2Arg()  { assertTrue(methods.this.<String>getInstance().none(predicate2AsFail)); }
            @DisplayName("(T) → boolean")      @Test void test1Arg()  { assertTrue(methods.this.<String>getInstance().none(predicate1AsFail)); }
            @DisplayName("() → boolean")       @Test void test0Arg()  { assertTrue(                     getInstance().none(predicate0AsFail)); }
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

            @Nested class all {
                @DisplayName("true: () → boolean")        @Test void true0Arg()  { assertEquals(0, newInstance(AB).execute(it -> it.all(callback0AsTrue)).getAmountOfCall()); }
                @DisplayName("true: (T) → boolean")       @Test void true1Arg()  { assertEquals(2, newInstance(AB).execute(it -> it.all(callback1AsTrue)).getAmountOfCall()); }
                @DisplayName("true: (T, int) → boolean")  @Test void true2Arg()  { assertEquals(2, newInstance(AB).execute(it -> it.all(callback2AsTrue)).getAmountOfCall()); }
                @DisplayName("false: () → boolean")       @Test void false0Arg() { assertEquals(0, newInstance(AB).execute(it -> it.all(callback0AsFalse)).getAmountOfCall()); }
                @DisplayName("false: (T) → boolean")      @Test void false1Arg() { assertEquals(1, newInstance(AB).execute(it -> it.all(callback1AsFalse)).getAmountOfCall()); }
                @DisplayName("false: (T, int) → boolean") @Test void false2Arg() { assertEquals(1, newInstance(AB).execute(it -> it.all(callback2AsFalse)).getAmountOfCall()); }
            }
            @Nested class any {
                @DisplayName("no predicate")              @Test void noPredicate() { assertEquals(0, newInstance(AB).execute(CollectionHolder::any).getAmountOfCall()); }
                @DisplayName("true: () → boolean")        @Test void true0Arg()    { assertEquals(0, newInstance(AB).execute(it -> it.any(callback0AsTrue)).getAmountOfCall()); }
                @DisplayName("true: (T) → boolean")       @Test void true1Arg()    { assertEquals(1, newInstance(AB).execute(it -> it.any(callback1AsTrue)).getAmountOfCall()); }
                @DisplayName("true: (T, int) → boolean")  @Test void true2Arg()    { assertEquals(1, newInstance(AB).execute(it -> it.any(callback2AsTrue)).getAmountOfCall()); }
                @DisplayName("false: () → boolean")       @Test void false0Arg()   { assertEquals(0, newInstance(AB).execute(it -> it.any(callback0AsFalse)).getAmountOfCall()); }
                @DisplayName("false: (T) → boolean")      @Test void false1Arg()   { assertEquals(2, newInstance(AB).execute(it -> it.any(callback1AsFalse)).getAmountOfCall()); }
                @DisplayName("false: (T, int) → boolean") @Test void false2Arg()   { assertEquals(2, newInstance(AB).execute(it -> it.any(callback2AsFalse)).getAmountOfCall()); }
            }
            @Nested class none {
                @DisplayName("no predicate")              @Test void noPredicate() { assertEquals(0, newInstance(AB).execute(CollectionHolder::none).getAmountOfCall()); }
                @DisplayName("true: () → boolean")        @Test void true0Arg()    { assertEquals(0, newInstance(AB).execute(it -> it.none(callback0AsTrue)).getAmountOfCall()); }
                @DisplayName("true: (T) → boolean")       @Test void true1Arg()    { assertEquals(1, newInstance(AB).execute(it -> it.none(callback1AsTrue)).getAmountOfCall()); }
                @DisplayName("true: (T, int) → boolean")  @Test void true2Arg()    { assertEquals(1, newInstance(AB).execute(it -> it.none(callback2AsTrue)).getAmountOfCall()); }
                @DisplayName("false: () → boolean")       @Test void false0Arg()   { assertEquals(0, newInstance(AB).execute(it -> it.none(callback0AsFalse)).getAmountOfCall()); }
                @DisplayName("false: (T) → boolean")      @Test void false1Arg()   { assertEquals(2, newInstance(AB).execute(it -> it.none(callback1AsFalse)).getAmountOfCall()); }
                @DisplayName("false: (T, int) → boolean") @Test void false2Arg()   { assertEquals(2, newInstance(AB).execute(it -> it.none(callback2AsFalse)).getAmountOfCall()); }
            }

        }

        @TestInstance(PER_CLASS) @Nested class all {
            @Nested class empty {
                @DisplayName("(T, int) → boolean") @Test void test2Arg() { assertTrue(newInstance(EMPTY).all(predicate2AsFail)); }
                @DisplayName("(T) → boolean")      @Test void test1Arg() { assertTrue(newInstance(EMPTY).all(predicate1AsFail)); }
                @DisplayName("() → boolean")       @Test void test0Arg() { assertTrue(newInstance(EMPTY).all(predicate0AsFail)); }
            }
            @DisplayName("boolean callbacks") @TestInstance(PER_CLASS) @Nested class BooleanCallbacks {
                @DisplayName("true: 0 arguments") @Nested class True0 {
                    @DisplayName("1 field")  @Test void test1() { assertTrue(newInstance(A)   .all(callback0AsTrue)); }
                    @DisplayName("2 fields") @Test void test2() { assertTrue(newInstance(AB)  .all(callback0AsTrue)); }
                    @DisplayName("4 fields") @Test void test4() { assertTrue(newInstance(ABCD).all(callback0AsTrue)); }
                }
                @DisplayName("true: 1 argument") @Nested class True1 {
                    @DisplayName("1 field")  @Test void test1() { assertTrue(newInstance(A)   .all(callback1AsTrue)); }
                    @DisplayName("2 fields") @Test void test2() { assertTrue(newInstance(AB)  .all(callback1AsTrue)); }
                    @DisplayName("4 fields") @Test void test4() { assertTrue(newInstance(ABCD).all(callback1AsTrue)); }
                }
                @DisplayName("true: 2 arguments") @Nested class True2 {
                    @DisplayName("1 field")  @Test void test1() { assertTrue(newInstance(A)   .all(callback2AsTrue)); }
                    @DisplayName("2 fields") @Test void test2() { assertTrue(newInstance(AB)  .all(callback2AsTrue)); }
                    @DisplayName("4 fields") @Test void test4() { assertTrue(newInstance(ABCD).all(callback2AsTrue)); }
                }
                @DisplayName("false: 0 arguments") @Nested class False0 {
                    @DisplayName("1 field")  @Test void test1() { assertFalse(newInstance(A)   .all(callback0AsFalse)); }
                    @DisplayName("2 fields") @Test void test2() { assertFalse(newInstance(AB)  .all(callback0AsFalse)); }
                    @DisplayName("4 fields") @Test void test4() { assertFalse(newInstance(ABCD).all(callback0AsFalse)); }
                }
                @DisplayName("false: 1 argument") @Nested class False1 {
                    @DisplayName("1 field")  @Test void test1() { assertFalse(newInstance(A)   .all(callback1AsFalse)); }
                    @DisplayName("2 fields") @Test void test2() { assertFalse(newInstance(AB)  .all(callback1AsFalse)); }
                    @DisplayName("4 fields") @Test void test4() { assertFalse(newInstance(ABCD).all(callback1AsFalse)); }
                }
                @DisplayName("false: 2 arguments") @Nested class False2 {
                    @DisplayName("1 field")  @Test void test1() { assertFalse(newInstance(A)   .all(callback2AsFalse)); }
                    @DisplayName("2 fields") @Test void test2() { assertFalse(newInstance(AB)  .all(callback2AsFalse)); }
                    @DisplayName("4 fields") @Test void test4() { assertFalse(newInstance(ABCD).all(callback2AsFalse)); }
                }
            }
            @DisplayName("1 field") @Nested class Test1 {
                                  @Test void a()     { assertTrue( newInstance(A).all(callbackIsA)); }
                                  @Test void e()     { assertFalse(newInstance(A).all(callbackIsE)); }
                                  @Test void even()  { assertTrue( newInstance(A).all(callbackIsEvenAlt)); }
                                  @Test void odd()   { assertFalse(newInstance(A).all(callbackIsOddAlt)); }
                @DisplayName("0") @Test void test0() { assertTrue( newInstance(A).all(callbackIs0Alt)); }
                @DisplayName("4") @Test void test4() { assertFalse(newInstance(A).all(callbackIs4Alt)); }
            }
            @DisplayName("2 fields") @Nested class Test2 {
                                  @Test void a()     { assertFalse(newInstance(AB).all(callbackIsA)); }
                                  @Test void b()     { assertFalse(newInstance(AB).all(callbackIsB)); }
                                  @Test void e()     { assertFalse(newInstance(AB).all(callbackIsE)); }
                                  @Test void even()  { assertFalse(newInstance(AB).all(callbackIsEvenAlt)); }
                                  @Test void odd()   { assertFalse(newInstance(AB).all(callbackIsOddAlt)); }
                @DisplayName("0") @Test void test0() { assertFalse(newInstance(AB).all(callbackIs0Alt)); }
                @DisplayName("1") @Test void test1() { assertFalse(newInstance(AB).all(callbackIs1Alt)); }
                @DisplayName("4") @Test void test4() { assertFalse(newInstance(AB).all(callbackIs4Alt)); }
            }
            @DisplayName("4 fields") @Nested class Test4 {
                                  @Test void a()     { assertFalse(newInstance(ABCD).all(callbackIsA)); }
                                  @Test void b()     { assertFalse(newInstance(ABCD).all(callbackIsB)); }
                                  @Test void c()     { assertFalse(newInstance(ABCD).all(callbackIsC)); }
                                  @Test void d()     { assertFalse(newInstance(ABCD).all(callbackIsD)); }
                                  @Test void e()     { assertFalse(newInstance(ABCD).all(callbackIsE)); }
                                  @Test void even()  { assertFalse(newInstance(ABCD).all(callbackIsEvenAlt)); }
                                  @Test void odd()   { assertFalse(newInstance(ABCD).all(callbackIsOddAlt)); }
                @DisplayName("0") @Test void test0() { assertFalse(newInstance(ABCD).all(callbackIs0Alt)); }
                @DisplayName("1") @Test void test1() { assertFalse(newInstance(ABCD).all(callbackIs1Alt)); }
                @DisplayName("2") @Test void test2() { assertFalse(newInstance(ABCD).all(callbackIs2Alt)); }
                @DisplayName("3") @Test void test3() { assertFalse(newInstance(ABCD).all(callbackIs3Alt)); }
                @DisplayName("4") @Test void test4() { assertFalse(newInstance(ABCD).all(callbackIs4Alt)); }
            }
        }
        @TestInstance(PER_CLASS) @Nested class any {
            @DisplayName("no predicate") @Nested class NoPredicate {
                                         @Test void empty() { assertFalse(newInstance(EMPTY).any()); }
                @DisplayName("1 field")  @Test void test1() { assertTrue( newInstance(A)    .any()); }
                @DisplayName("2 fields") @Test void test2() { assertTrue( newInstance(AB)   .any()); }
                @DisplayName("4 fields") @Test void test4() { assertTrue( newInstance(ABCD) .any()); }
            }
            @DisplayName("null predicate") @TestInstance(PER_CLASS) @Nested class NullPredicate {
                @DisplayName("(T, int) → boolean") @Nested class Test2Arg {
                                             @Test void empty() { assertFalse(newInstance(EMPTY).any(NULL_PREDICATE2)); }
                    @DisplayName("1 field")  @Test void test1() { assertTrue( newInstance(A)    .any(NULL_PREDICATE2)); }
                    @DisplayName("2 fields") @Test void test2() { assertTrue( newInstance(AB)   .any(NULL_PREDICATE2)); }
                    @DisplayName("4 fields") @Test void test4() { assertTrue( newInstance(ABCD) .any(NULL_PREDICATE2)); }
                }
                @DisplayName("(T) → boolean") @Nested class Test1Arg {
                                             @Test void empty() { assertFalse(newInstance(EMPTY).any(NULL_PREDICATE1)); }
                    @DisplayName("1 field")  @Test void test1() { assertTrue( newInstance(A)    .any(NULL_PREDICATE1)); }
                    @DisplayName("2 fields") @Test void test2() { assertTrue( newInstance(AB)   .any(NULL_PREDICATE1)); }
                    @DisplayName("4 fields") @Test void test4() { assertTrue( newInstance(ABCD) .any(NULL_PREDICATE1)); }
                }
                @DisplayName("() → boolean") @Nested class Test0Arg {
                                             @Test void empty() { assertFalse(newInstance(EMPTY).any(NULL_PREDICATE0)); }
                    @DisplayName("1 field")  @Test void test1() { assertTrue( newInstance(A)    .any(NULL_PREDICATE0)); }
                    @DisplayName("2 fields") @Test void test2() { assertTrue( newInstance(AB)   .any(NULL_PREDICATE0)); }
                    @DisplayName("4 fields") @Test void test4() { assertTrue( newInstance(ABCD) .any(NULL_PREDICATE0)); }
                }
            }
            @DisplayName("with predicate") @TestInstance(PER_CLASS) @Nested class WithPredicate {
                @Nested class empty {
                    @DisplayName("(T, int) → boolean") @Test void test2Arg() { assertFalse(newInstance(EMPTY).any(predicate2AsFail)); }
                    @DisplayName("(T) → boolean")      @Test void test1Arg() { assertFalse(newInstance(EMPTY).any(predicate1AsFail)); }
                    @DisplayName("() → boolean")       @Test void test0Arg() { assertFalse(newInstance(EMPTY).any(predicate0AsFail)); }
                }
                @DisplayName("boolean callbacks") @TestInstance(PER_CLASS) @Nested class BooleanCallbacks {
                    @DisplayName("true: 0 arguments") @Nested class True0 {
                        @DisplayName("1 field")  @Test void test1() { assertTrue(newInstance(A)   .any(callback0AsTrue)); }
                        @DisplayName("2 fields") @Test void test2() { assertTrue(newInstance(AB)  .any(callback0AsTrue)); }
                        @DisplayName("4 fields") @Test void test4() { assertTrue(newInstance(ABCD).any(callback0AsTrue)); }
                    }
                    @DisplayName("true: 1 argument") @Nested class True1 {
                        @DisplayName("1 field")  @Test void test1() { assertTrue(newInstance(A)   .any(callback1AsTrue)); }
                        @DisplayName("2 fields") @Test void test2() { assertTrue(newInstance(AB)  .any(callback1AsTrue)); }
                        @DisplayName("4 fields") @Test void test4() { assertTrue(newInstance(ABCD).any(callback1AsTrue)); }
                    }
                    @DisplayName("true: 2 arguments") @Nested class True2 {
                        @DisplayName("1 field")  @Test void test1() { assertTrue(newInstance(A)   .any(callback2AsTrue)); }
                        @DisplayName("2 fields") @Test void test2() { assertTrue(newInstance(AB)  .any(callback2AsTrue)); }
                        @DisplayName("4 fields") @Test void test4() { assertTrue(newInstance(ABCD).any(callback2AsTrue)); }
                    }
                    @DisplayName("false: 0 arguments") @Nested class False0 {
                        @DisplayName("1 field")  @Test void test1() { assertFalse(newInstance(A)   .any(callback0AsFalse)); }
                        @DisplayName("2 fields") @Test void test2() { assertFalse(newInstance(AB)  .any(callback0AsFalse)); }
                        @DisplayName("4 fields") @Test void test4() { assertFalse(newInstance(ABCD).any(callback0AsFalse)); }
                    }
                    @DisplayName("false: 1 argument") @Nested class False1 {
                        @DisplayName("1 field")  @Test void test1() { assertFalse(newInstance(A)   .any(callback1AsFalse)); }
                        @DisplayName("2 fields") @Test void test2() { assertFalse(newInstance(AB)  .any(callback1AsFalse)); }
                        @DisplayName("4 fields") @Test void test4() { assertFalse(newInstance(ABCD).any(callback1AsFalse)); }
                    }
                    @DisplayName("false: 2 arguments") @Nested class False2 {
                        @DisplayName("1 field")  @Test void test1() { assertFalse(newInstance(A)   .any(callback2AsFalse)); }
                        @DisplayName("2 fields") @Test void test2() { assertFalse(newInstance(AB)  .any(callback2AsFalse)); }
                        @DisplayName("4 fields") @Test void test4() { assertFalse(newInstance(ABCD).any(callback2AsFalse)); }
                    }
                }
                @DisplayName("1 field") @Nested class Test1 {
                                      @Test void a()     { assertTrue( newInstance(A).any(callbackIsA)); }
                                      @Test void e()     { assertFalse(newInstance(A).any(callbackIsE)); }
                                      @Test void even()  { assertTrue( newInstance(A).any(callbackIsEvenAlt)); }
                                      @Test void odd()   { assertFalse(newInstance(A).any(callbackIsOddAlt)); }
                    @DisplayName("0") @Test void test0() { assertTrue( newInstance(A).any(callbackIs0Alt)); }
                    @DisplayName("4") @Test void test4() { assertFalse(newInstance(A).any(callbackIs4Alt)); }
                }
                @DisplayName("2 fields") @Nested class Test2 {
                                      @Test void a()     { assertTrue( newInstance(AB).any(callbackIsA)); }
                                      @Test void b()     { assertTrue( newInstance(AB).any(callbackIsB)); }
                                      @Test void e()     { assertFalse(newInstance(AB).any(callbackIsE)); }
                                      @Test void even()  { assertTrue( newInstance(AB).any(callbackIsEvenAlt)); }
                                      @Test void odd()   { assertTrue( newInstance(AB).any(callbackIsOddAlt)); }
                    @DisplayName("0") @Test void test0() { assertTrue( newInstance(AB).any(callbackIs0Alt)); }
                    @DisplayName("1") @Test void test1() { assertTrue( newInstance(AB).any(callbackIs1Alt)); }
                    @DisplayName("4") @Test void test4() { assertFalse(newInstance(AB).any(callbackIs4Alt)); }
                }
                @DisplayName("4 fields") @Nested class Test4 {
                                      @Test void a()     { assertTrue( newInstance(ABCD).any(callbackIsA)); }
                                      @Test void b()     { assertTrue( newInstance(ABCD).any(callbackIsB)); }
                                      @Test void c()     { assertTrue( newInstance(ABCD).any(callbackIsC)); }
                                      @Test void d()     { assertTrue( newInstance(ABCD).any(callbackIsD)); }
                                      @Test void e()     { assertFalse(newInstance(ABCD).any(callbackIsE)); }
                                      @Test void even()  { assertTrue( newInstance(ABCD).any(callbackIsEvenAlt)); }
                                      @Test void odd()   { assertTrue( newInstance(ABCD).any(callbackIsOddAlt)); }
                    @DisplayName("0") @Test void test0() { assertTrue( newInstance(ABCD).any(callbackIs0Alt)); }
                    @DisplayName("1") @Test void test1() { assertTrue( newInstance(ABCD).any(callbackIs1Alt)); }
                    @DisplayName("2") @Test void test2() { assertTrue( newInstance(ABCD).any(callbackIs2Alt)); }
                    @DisplayName("3") @Test void test3() { assertTrue( newInstance(ABCD).any(callbackIs3Alt)); }
                    @DisplayName("4") @Test void test4() { assertFalse(newInstance(ABCD).any(callbackIs4Alt)); }
                }
            }
        }
        @TestInstance(PER_CLASS) @Nested class none {
            @DisplayName("no predicate") @Nested class NoPredicate {
                                         @Test void empty() { assertTrue( newInstance(EMPTY).none()); }
                @DisplayName("1 field")  @Test void test1() { assertFalse(newInstance(A)    .none()); }
                @DisplayName("2 fields") @Test void test2() { assertFalse(newInstance(AB)   .none()); }
                @DisplayName("4 fields") @Test void test4() { assertFalse(newInstance(ABCD) .none()); }
            }
            @DisplayName("null predicate") @TestInstance(PER_CLASS) @Nested class NullPredicate {
                @DisplayName("(T, int) → boolean") @Nested class Test2Arg {
                                             @Test void empty() { assertTrue( newInstance(EMPTY).none(NULL_PREDICATE2)); }
                    @DisplayName("1 field")  @Test void test1() { assertFalse(newInstance(A)    .none(NULL_PREDICATE2)); }
                    @DisplayName("2 fields") @Test void test2() { assertFalse(newInstance(AB)   .none(NULL_PREDICATE2)); }
                    @DisplayName("4 fields") @Test void test4() { assertFalse(newInstance(ABCD) .none(NULL_PREDICATE2)); }
                }
                @DisplayName("(T) → boolean") @Nested class Test1Arg {
                                             @Test void empty() { assertTrue( newInstance(EMPTY).none(NULL_PREDICATE1)); }
                    @DisplayName("1 field")  @Test void test1() { assertFalse(newInstance(A)    .none(NULL_PREDICATE1)); }
                    @DisplayName("2 fields") @Test void test2() { assertFalse(newInstance(AB)   .none(NULL_PREDICATE1)); }
                    @DisplayName("4 fields") @Test void test4() { assertFalse(newInstance(ABCD) .none(NULL_PREDICATE1)); }
                }
                @DisplayName("() → boolean") @Nested class Test0Arg {
                                             @Test void empty() { assertTrue( newInstance(EMPTY).none(NULL_PREDICATE0)); }
                    @DisplayName("1 field")  @Test void test1() { assertFalse(newInstance(A)    .none(NULL_PREDICATE0)); }
                    @DisplayName("2 fields") @Test void test2() { assertFalse(newInstance(AB)   .none(NULL_PREDICATE0)); }
                    @DisplayName("4 fields") @Test void test4() { assertFalse(newInstance(ABCD) .none(NULL_PREDICATE0)); }
                }
            }
            @DisplayName("with predicate") @TestInstance(PER_CLASS) @Nested class WithPredicate {
                @Nested class empty {
                    @DisplayName("(T, int) → boolean") @Test void test2Arg() { assertTrue(newInstance(EMPTY).none(predicate2AsFail)); }
                    @DisplayName("(T) → boolean")      @Test void test1Arg() { assertTrue(newInstance(EMPTY).none(predicate1AsFail)); }
                    @DisplayName("() → boolean")       @Test void test0Arg() { assertTrue(newInstance(EMPTY).none(predicate0AsFail)); }
                }
                @DisplayName("boolean callbacks") @TestInstance(PER_CLASS) @Nested class BooleanCallbacks {
                    @DisplayName("true: 0 arguments") @Nested class True0 {
                        @DisplayName("1 field")  @Test void test1() { assertFalse(newInstance(A)   .none(callback0AsTrue)); }
                        @DisplayName("2 fields") @Test void test2() { assertFalse(newInstance(AB)  .none(callback0AsTrue)); }
                        @DisplayName("4 fields") @Test void test4() { assertFalse(newInstance(ABCD).none(callback0AsTrue)); }
                    }
                    @DisplayName("true: 1 argument") @Nested class True1 {
                        @DisplayName("1 field")  @Test void test1() { assertFalse(newInstance(A)   .none(callback1AsTrue)); }
                        @DisplayName("2 fields") @Test void test2() { assertFalse(newInstance(AB)  .none(callback1AsTrue)); }
                        @DisplayName("4 fields") @Test void test4() { assertFalse(newInstance(ABCD).none(callback1AsTrue)); }
                    }
                    @DisplayName("true: 2 arguments") @Nested class True2 {
                        @DisplayName("1 field")  @Test void test1() { assertFalse(newInstance(A)   .none(callback2AsTrue)); }
                        @DisplayName("2 fields") @Test void test2() { assertFalse(newInstance(AB)  .none(callback2AsTrue)); }
                        @DisplayName("4 fields") @Test void test4() { assertFalse(newInstance(ABCD).none(callback2AsTrue)); }
                    }
                    @DisplayName("false: 0 arguments") @Nested class False0 {
                        @DisplayName("1 field")  @Test void test1() { assertTrue(newInstance(A)   .none(callback0AsFalse)); }
                        @DisplayName("2 fields") @Test void test2() { assertTrue(newInstance(AB)  .none(callback0AsFalse)); }
                        @DisplayName("4 fields") @Test void test4() { assertTrue(newInstance(ABCD).none(callback0AsFalse)); }
                    }
                    @DisplayName("false: 1 argument") @Nested class False1 {
                        @DisplayName("1 field")  @Test void test1() { assertTrue(newInstance(A)   .none(callback1AsFalse)); }
                        @DisplayName("2 fields") @Test void test2() { assertTrue(newInstance(AB)  .none(callback1AsFalse)); }
                        @DisplayName("4 fields") @Test void test4() { assertTrue(newInstance(ABCD).none(callback1AsFalse)); }
                    }
                    @DisplayName("false: 2 arguments") @Nested class False2 {
                        @DisplayName("1 field")  @Test void test1() { assertTrue(newInstance(A)   .none(callback2AsFalse)); }
                        @DisplayName("2 fields") @Test void test2() { assertTrue(newInstance(AB)  .none(callback2AsFalse)); }
                        @DisplayName("4 fields") @Test void test4() { assertTrue(newInstance(ABCD).none(callback2AsFalse)); }
                    }
                }
                @DisplayName("1 field") @Nested class Test1 {
                                      @Test void a()     { assertFalse(newInstance(A).none(callbackIsA)); }
                                      @Test void e()     { assertTrue( newInstance(A).none(callbackIsE)); }
                                      @Test void even()  { assertFalse(newInstance(A).none(callbackIsEvenAlt)); }
                                      @Test void odd()   { assertTrue( newInstance(A).none(callbackIsOddAlt)); }
                    @DisplayName("0") @Test void test0() { assertFalse(newInstance(A).none(callbackIs0Alt)); }
                    @DisplayName("4") @Test void test4() { assertTrue( newInstance(A).none(callbackIs4Alt)); }
                }
                @DisplayName("2 fields") @Nested class Test2 {
                                      @Test void a()     { assertFalse(newInstance(AB).none(callbackIsA)); }
                                      @Test void b()     { assertFalse(newInstance(AB).none(callbackIsB)); }
                                      @Test void e()     { assertTrue( newInstance(AB).none(callbackIsE)); }
                                      @Test void even()  { assertFalse(newInstance(AB).none(callbackIsEvenAlt)); }
                                      @Test void odd()   { assertFalse(newInstance(AB).none(callbackIsOddAlt)); }
                    @DisplayName("0") @Test void test0() { assertFalse(newInstance(AB).none(callbackIs0Alt)); }
                    @DisplayName("1") @Test void test1() { assertFalse(newInstance(AB).none(callbackIs1Alt)); }
                    @DisplayName("4") @Test void test4() { assertTrue( newInstance(AB).none(callbackIs4Alt)); }
                }
                @DisplayName("4 fields") @Nested class Test4 {
                                      @Test void a()     { assertFalse(newInstance(ABCD).none(callbackIsA)); }
                                      @Test void b()     { assertFalse(newInstance(ABCD).none(callbackIsB)); }
                                      @Test void c()     { assertFalse(newInstance(ABCD).none(callbackIsC)); }
                                      @Test void d()     { assertFalse(newInstance(ABCD).none(callbackIsD)); }
                                      @Test void e()     { assertTrue( newInstance(ABCD).none(callbackIsE)); }
                                      @Test void even()  { assertFalse(newInstance(ABCD).none(callbackIsEvenAlt)); }
                                      @Test void odd()   { assertFalse(newInstance(ABCD).none(callbackIsOddAlt)); }
                    @DisplayName("0") @Test void test0() { assertFalse(newInstance(ABCD).none(callbackIs0Alt)); }
                    @DisplayName("1") @Test void test1() { assertFalse(newInstance(ABCD).none(callbackIs1Alt)); }
                    @DisplayName("2") @Test void test2() { assertFalse(newInstance(ABCD).none(callbackIs2Alt)); }
                    @DisplayName("3") @Test void test3() { assertFalse(newInstance(ABCD).none(callbackIs3Alt)); }
                    @DisplayName("4") @Test void test4() { assertTrue( newInstance(ABCD).none(callbackIs4Alt)); }
                }
            }
        }

    }

}

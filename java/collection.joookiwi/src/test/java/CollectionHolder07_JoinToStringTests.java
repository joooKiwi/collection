import condition.DisableIfNormalCondition;
import condition.DisableIfNormalViewerCondition;
import instance.CollectionHolderForTest;
import instance.GenericCollectionHolder_JoinToStringAlias;
import joookiwi.collection.java.CollectionHolder;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator.Simple;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedClass;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.FieldSource;
import test.AbstractEmptyCollectionHolderTests;
import test.AbstractInstancesTests;
import test.AbstractMethodsTests;
import test.AbstractReflectionTests;

import static helper.InvokeMethod.invokeMethod;
import static joookiwi.collection.java.method.Join.join;
import static joookiwi.collection.java.method.JoinToString.joinToString;
import static joookiwi.collection.java.CollectionConstants.DEFAULT_EMPTY_COLLECTION;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;
import static value.Arrays.A;
import static value.Arrays.AB;
import static value.Arrays.ABCD;
import static value.Arrays.EMPTY;

@NotNullByDefault
@DisplayNameGeneration(Simple.class)
@DisplayName("CollectionHolder tests (joinToString)") @TestInstance(PER_CLASS) class CollectionHolder07_JoinToStringTests {

    @TestInstance(PER_CLASS) @Nested class EmptyCollectionHolder extends AbstractEmptyCollectionHolderTests {
        @Nested class joinToString {

            @DisplayName("∅") @Test void noArg() { assertEquals(DEFAULT_EMPTY_COLLECTION, instance.joinToString()); }

            @FieldSource("value.JoinToStringValues#separator_extendedArguments")
            @ParameterizedTest(name = "{0}") @DisplayName("separator") void separator(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(instance, "joinToString", types, values)); }

            @FieldSource("value.JoinToStringValues#nullPrefix_extendedArguments")
            @FieldSource("value.JoinToStringValues#nullPrefix_extendedArgumentsAdded")
            @ParameterizedTest(name = "{0}") @DisplayName("null prefix") void nullPrefix(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(instance, "joinToString", types, values)); }
            @FieldSource("value.JoinToStringValues#prefix_extendedArguments")
            @FieldSource("value.JoinToStringValues#prefix_extendedArgumentsAdded")
            @ParameterizedTest(name = "{0}") @DisplayName("prefix") void prefix(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { assertEquals("<]", invokeMethod(instance, "joinToString", types, values)); }

            @FieldSource("value.JoinToStringValues#nullPrefix_nullPostfix_extendedArguments3")
            @FieldSource("value.JoinToStringValues#nullPrefix_nullPostfix_extendedArguments4")
            @FieldSource("value.JoinToStringValues#nullPrefix_nullPostfix_extendedArguments5")
            @FieldSource("value.JoinToStringValues#nullPrefix_nullPostfix_extendedArguments6")
            @FieldSource("value.JoinToStringValues#nullPrefix_nullPostfix_extendedArgumentsAdded1")
            @FieldSource("value.JoinToStringValues#nullPrefix_nullPostfix_extendedArgumentsAdded2")
            @ParameterizedTest(name = "{0}") @DisplayName("null prefix, null postfix") void nullPrefix_nullPostfix(final @Nullable Object[] values, final Class<?>[] types) { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(instance, "joinToString", types, values)); }
            @FieldSource("value.JoinToStringValues#nullPrefix_postfix_extendedArguments3")
            @FieldSource("value.JoinToStringValues#nullPrefix_postfix_extendedArguments4")
            @FieldSource("value.JoinToStringValues#nullPrefix_postfix_extendedArguments5")
            @FieldSource("value.JoinToStringValues#nullPrefix_postfix_extendedArguments6")
            @FieldSource("value.JoinToStringValues#nullPrefix_postfix_extendedArgumentsAdded1")
            @FieldSource("value.JoinToStringValues#nullPrefix_postfix_extendedArgumentsAdded2")
            @ParameterizedTest(name = "{0}") @DisplayName("null prefix, postfix") void nullPrefix_postfix(final @Nullable Object[] values, final Class<?>[] types) { assertEquals("[>", invokeMethod(instance, "joinToString", types, values)); }
            @FieldSource("value.JoinToStringValues#prefix_nullPostfix_extendedArguments3")
            @FieldSource("value.JoinToStringValues#prefix_nullPostfix_extendedArguments4")
            @FieldSource("value.JoinToStringValues#prefix_nullPostfix_extendedArguments5")
            @FieldSource("value.JoinToStringValues#prefix_nullPostfix_extendedArguments6")
            @FieldSource("value.JoinToStringValues#prefix_nullPostfix_extendedArgumentsAdded1")
            @FieldSource("value.JoinToStringValues#prefix_nullPostfix_extendedArgumentsAdded2")
            @ParameterizedTest(name = "{0}") @DisplayName("prefix, null postfix") void prefix_nullPostfix(final @Nullable Object[] values, final Class<?>[] types) { assertEquals("<]", invokeMethod(instance, "joinToString", types, values)); }
            @FieldSource("value.JoinToStringValues#prefix_postfix_extendedArguments3")
            @FieldSource("value.JoinToStringValues#prefix_postfix_extendedArguments4")
            @FieldSource("value.JoinToStringValues#prefix_postfix_extendedArguments5")
            @FieldSource("value.JoinToStringValues#prefix_postfix_extendedArguments6")
            @FieldSource("value.JoinToStringValues#prefix_postfix_extendedArgumentsAdded1")
            @FieldSource("value.JoinToStringValues#prefix_postfix_extendedArgumentsAdded2")
            @ParameterizedTest(name = "{0}") @DisplayName("prefix, postfix") void prefix_postfix(final @Nullable Object[] values, final Class<?>[] types) { assertEquals("{>", invokeMethod(instance, "joinToString", types, values)); }

        }
        @Nested class join {

            @DisplayName("∅") @Test void noArg() { assertEquals(DEFAULT_EMPTY_COLLECTION, instance.join()); }

            @FieldSource("value.JoinToStringValues#separator_extendedArguments")
            @ParameterizedTest(name = "{0}") @DisplayName("separator") void separator(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(instance, "join", types, values)); }

            @FieldSource("value.JoinToStringValues#nullPrefix_extendedArguments")
            @FieldSource("value.JoinToStringValues#nullPrefix_extendedArgumentsAdded")
            @ParameterizedTest(name = "{0}") @DisplayName("null prefix") void nullPrefix(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(instance, "join", types, values)); }
            @FieldSource("value.JoinToStringValues#prefix_extendedArguments")
            @FieldSource("value.JoinToStringValues#prefix_extendedArgumentsAdded")
            @ParameterizedTest(name = "{0}") @DisplayName("prefix") void prefix(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { assertEquals("<]", invokeMethod(instance, "join", types, values)); }

            @FieldSource("value.JoinToStringValues#nullPrefix_nullPostfix_extendedArguments3")
            @FieldSource("value.JoinToStringValues#nullPrefix_nullPostfix_extendedArguments4")
            @FieldSource("value.JoinToStringValues#nullPrefix_nullPostfix_extendedArguments5")
            @FieldSource("value.JoinToStringValues#nullPrefix_nullPostfix_extendedArguments6")
            @FieldSource("value.JoinToStringValues#nullPrefix_nullPostfix_extendedArgumentsAdded1")
            @FieldSource("value.JoinToStringValues#nullPrefix_nullPostfix_extendedArgumentsAdded2")
            @ParameterizedTest(name = "{0}") @DisplayName("null prefix, null postfix") void nullPrefix_nullPostfix(final @Nullable Object[] values, final Class<?>[] types) { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(instance, "join", types, values)); }
            @FieldSource("value.JoinToStringValues#nullPrefix_postfix_extendedArguments3")
            @FieldSource("value.JoinToStringValues#nullPrefix_postfix_extendedArguments4")
            @FieldSource("value.JoinToStringValues#nullPrefix_postfix_extendedArguments5")
            @FieldSource("value.JoinToStringValues#nullPrefix_postfix_extendedArguments6")
            @FieldSource("value.JoinToStringValues#nullPrefix_postfix_extendedArgumentsAdded1")
            @FieldSource("value.JoinToStringValues#nullPrefix_postfix_extendedArgumentsAdded2")
            @ParameterizedTest(name = "{0}") @DisplayName("null prefix, postfix") void nullPrefix_postfix(final @Nullable Object[] values, final Class<?>[] types) { assertEquals("[>", invokeMethod(instance, "join", types, values)); }
            @FieldSource("value.JoinToStringValues#prefix_nullPostfix_extendedArguments3")
            @FieldSource("value.JoinToStringValues#prefix_nullPostfix_extendedArguments4")
            @FieldSource("value.JoinToStringValues#prefix_nullPostfix_extendedArguments5")
            @FieldSource("value.JoinToStringValues#prefix_nullPostfix_extendedArguments6")
            @FieldSource("value.JoinToStringValues#prefix_nullPostfix_extendedArgumentsAdded1")
            @FieldSource("value.JoinToStringValues#prefix_nullPostfix_extendedArgumentsAdded2")
            @ParameterizedTest(name = "{0}") @DisplayName("prefix, null postfix") void prefix_nullPostfix(final @Nullable Object[] values, final Class<?>[] types) { assertEquals("<]", invokeMethod(instance, "join", types, values)); }
            @FieldSource("value.JoinToStringValues#prefix_postfix_extendedArguments3")
            @FieldSource("value.JoinToStringValues#prefix_postfix_extendedArguments4")
            @FieldSource("value.JoinToStringValues#prefix_postfix_extendedArguments5")
            @FieldSource("value.JoinToStringValues#prefix_postfix_extendedArguments6")
            @FieldSource("value.JoinToStringValues#prefix_postfix_extendedArgumentsAdded1")
            @FieldSource("value.JoinToStringValues#prefix_postfix_extendedArgumentsAdded2")
            @ParameterizedTest(name = "{0}") @DisplayName("prefix, postfix") void prefix_postfix(final @Nullable Object[] values, final Class<?>[] types) { assertEquals("{>", invokeMethod(instance, "join", types, values)); }

        }
    }

    @TestInstance(PER_CLASS) @Nested class aliases {

        @FieldSource("value.JoinToStringValues#arguments0")
        @FieldSource("value.JoinToStringValues#arguments1")
        @FieldSource("value.JoinToStringValues#arguments2")
        @FieldSource("value.JoinToStringValues#arguments3")
        @FieldSource("value.JoinToStringValues#arguments4")
        @FieldSource("value.JoinToStringValues#arguments5")
        @FieldSource("value.JoinToStringValues#arguments6")
        @ParameterizedTest(name = "{0}") @DisplayName("GenericCollectionHolder") void GenericCollectionHolder(final @Nullable Object[] values, final Class<?>[] types) { assertEquals(1, new GenericCollectionHolder_JoinToStringAlias().execute(it -> invokeMethod(it, "join", types, values)).amountOfCall); }

        @Nested class join {}

    }

    @FieldSource("value.Instances#everyExtensionMethodInstancesAsArguments")
    @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class methods extends AbstractMethodsTests {
        //#region -------------------- Required test constructor --------------------

        public methods(final CollectionHolderForTest<?, ?> instance) { super(instance); }

        //#endregion -------------------- Required test constructor --------------------

        @DisplayName("∅") @Test void noArg() { assertEquals(DEFAULT_EMPTY_COLLECTION, instance.joinToString()); }

        @FieldSource("value.JoinToStringValues#separator_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_arguments")
        @ParameterizedTest(name = "{0}") @DisplayName("separator") void separator(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(instance, "joinToString", types, values)); }

        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_arguments")
        @ParameterizedTest(name = "{0}") @DisplayName("prefix") void prefix(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { assertEquals("<]", invokeMethod(instance, "joinToString", types, values)); }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_arguments")
        @ParameterizedTest(name = "{0}") @DisplayName("null prefix") void nullPrefix(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(instance, "joinToString", types, values)); }

        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_arguments")
        @ParameterizedTest(name = "{0}") @DisplayName("postfix") void postfix(final @Nullable Object[] values, final Class<?>[] types) { assertEquals("[>", invokeMethod(instance, "joinToString", types, values)); }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_arguments")
        @ParameterizedTest(name = "{0}") @DisplayName("null postfix") void nullPostfix(final @Nullable Object[] values, final Class<?>[] types) { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(instance, "joinToString", types, values)); }
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_arguments")
        @ParameterizedTest(name = "{0}") @DisplayName("postfix") void prefix_postfix(final @Nullable Object[] values, final Class<?>[] types) { assertEquals("{>", invokeMethod(instance, "joinToString", types, values)); }

        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_minus500Limit_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_minus6Limit_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_minus5Limit_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_minus4Limit_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_minus3Limit_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_minus2Limit_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_minus1Limit_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_0Limit_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_1Limit_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_2Limit_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_3Limit_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_4Limit_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_5Limit_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_500Limit_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_nullLimit_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_0Limit_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_1Limit_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_2Limit_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_3Limit_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_4Limit_arguments")
        @ParameterizedTest(name = "{0}") @DisplayName("limit") void limit(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(instance, "joinToString", types, values)); }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_0Limit_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_1Limit_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_2Limit_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_3Limit_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_4Limit_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_0Limit_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_1Limit_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_2Limit_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_3Limit_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_4Limit_arguments")
        @ParameterizedTest(name = "{0}") @DisplayName("postfix + limit") void postfix_limit(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { assertEquals("[>", invokeMethod(instance, "joinToString", types, values)); }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_0Limit_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_1Limit_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_2Limit_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_3Limit_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_4Limit_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_0Limit_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_1Limit_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_2Limit_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_3Limit_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_4Limit_arguments")
        @ParameterizedTest(name = "{0}") @DisplayName("prefix + limit") void prefix_limit(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { assertEquals("<]", invokeMethod(instance, "joinToString", types, values)); }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_0Limit_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_1Limit_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_2Limit_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_3Limit_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_4Limit_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_0Limit_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_1Limit_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_2Limit_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_3Limit_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_4Limit_arguments")
        @ParameterizedTest(name = "{0}") @DisplayName("prefix + postfix + limit") void prefix_postfix_limit(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { assertEquals("{>", invokeMethod(instance, "joinToString", types, values)); }

        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_nullLimit_truncated_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_nullLimit_nullTruncated_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_0Limit_truncated_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_1Limit_truncated_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_2Limit_truncated_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_3Limit_truncated_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_4Limit_truncated_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_nullLimit_truncated_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_0Limit_truncated_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_1Limit_truncated_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_2Limit_truncated_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_3Limit_truncated_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_4Limit_truncated_arguments")
        @ParameterizedTest(name = "{0}") @DisplayName("truncate") void truncate(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(instance, "joinToString", types, values)); }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_nullLimit_truncated_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_0Limit_truncated_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_1Limit_truncated_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_2Limit_truncated_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_3Limit_truncated_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_4Limit_truncated_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_nullLimit_truncated_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_0Limit_truncated_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_1Limit_truncated_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_2Limit_truncated_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_3Limit_truncated_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_4Limit_truncated_arguments")
        @ParameterizedTest(name = "{0}") @DisplayName("postfix + truncate") void postfix_truncate(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { assertEquals("[>", invokeMethod(instance, "joinToString", types, values)); }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_nullLimit_truncated_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_0Limit_truncated_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_1Limit_truncated_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_2Limit_truncated_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_3Limit_truncated_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_4Limit_truncated_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_nullLimit_truncated_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_0Limit_truncated_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_1Limit_truncated_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_2Limit_truncated_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_3Limit_truncated_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_4Limit_truncated_arguments")
        @ParameterizedTest(name = "{0}") @DisplayName("prefix + truncate") void prefix_truncate(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { assertEquals("<]", invokeMethod(instance, "joinToString", types, values)); }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_nullLimit_truncated_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_0Limit_truncated_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_1Limit_truncated_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_2Limit_truncated_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_3Limit_truncated_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_4Limit_truncated_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_nullLimit_truncated_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_0Limit_truncated_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_1Limit_truncated_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_2Limit_truncated_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_3Limit_truncated_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_4Limit_truncated_arguments")
        @ParameterizedTest(name = "{0}") @DisplayName("prefix + postfix + truncate") void prefix_postfix_truncate(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { assertEquals("{>", invokeMethod(instance, "joinToString", types, values)); }

        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_nullLimit_nullTruncated_nullTransform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_nullLimit_nullTruncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_nullLimit_truncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_0Limit_nullTruncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_1Limit_nullTruncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_2Limit_nullTruncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_3Limit_nullTruncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_4Limit_nullTruncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_0Limit_truncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_1Limit_truncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_2Limit_truncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_3Limit_truncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_4Limit_truncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_nullLimit_nullTruncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_nullLimit_nullTruncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_nullLimit_truncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_0Limit_nullTruncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_1Limit_nullTruncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_2Limit_nullTruncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_3Limit_nullTruncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_4Limit_nullTruncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_0Limit_truncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_1Limit_truncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_2Limit_truncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_3Limit_truncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_4Limit_truncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_nullLimit_nullTruncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_nullLimit_truncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_0Limit_nullTruncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_1Limit_nullTruncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_2Limit_nullTruncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_3Limit_nullTruncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_4Limit_nullTruncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_0Limit_truncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_1Limit_truncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_2Limit_truncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_3Limit_truncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_4Limit_truncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_nullLimit_nullTruncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_nullLimit_nullTruncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_nullLimit_truncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_0Limit_nullTruncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_1Limit_nullTruncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_2Limit_nullTruncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_3Limit_nullTruncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_4Limit_nullTruncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_0Limit_truncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_1Limit_truncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_2Limit_truncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_3Limit_truncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_4Limit_truncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_nullLimit_nullTruncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_nullLimit_truncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_0Limit_nullTruncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_1Limit_nullTruncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_2Limit_nullTruncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_3Limit_nullTruncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_4Limit_nullTruncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_0Limit_truncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_1Limit_truncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_2Limit_truncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_3Limit_truncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_4Limit_truncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_nullLimit_nullTruncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_nullLimit_nullTruncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_nullLimit_truncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_0Limit_nullTruncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_1Limit_nullTruncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_2Limit_nullTruncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_3Limit_nullTruncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_4Limit_nullTruncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_0Limit_truncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_1Limit_truncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_2Limit_truncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_3Limit_truncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_4Limit_truncated_2Transform_arguments")
        @ParameterizedTest(name = "{0}") @DisplayName("transform") void transform(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(instance, "joinToString", types, values)); }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_nullLimit_nullTruncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_nullLimit_truncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_0Limit_nullTruncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_1Limit_nullTruncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_2Limit_nullTruncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_3Limit_nullTruncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_4Limit_nullTruncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_0Limit_truncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_1Limit_truncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_2Limit_truncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_3Limit_truncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_4Limit_truncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_nullLimit_nullTruncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_nullLimit_nullTruncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_nullLimit_truncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_0Limit_nullTruncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_1Limit_nullTruncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_2Limit_nullTruncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_3Limit_nullTruncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_4Limit_nullTruncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_0Limit_truncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_1Limit_truncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_2Limit_truncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_3Limit_truncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_4Limit_truncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_nullLimit_nullTruncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_nullLimit_truncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_0Limit_nullTruncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_1Limit_nullTruncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_2Limit_nullTruncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_3Limit_nullTruncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_4Limit_nullTruncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_0Limit_truncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_1Limit_truncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_2Limit_truncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_3Limit_truncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_4Limit_truncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_nullLimit_nullTruncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_nullLimit_nullTruncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_nullLimit_truncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_0Limit_nullTruncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_1Limit_nullTruncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_2Limit_nullTruncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_3Limit_nullTruncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_4Limit_nullTruncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_0Limit_truncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_1Limit_truncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_2Limit_truncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_3Limit_truncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_4Limit_truncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_nullLimit_nullTruncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_nullLimit_truncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_0Limit_nullTruncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_1Limit_nullTruncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_2Limit_nullTruncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_3Limit_nullTruncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_4Limit_nullTruncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_0Limit_truncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_1Limit_truncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_2Limit_truncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_3Limit_truncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_4Limit_truncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_nullLimit_nullTruncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_nullLimit_nullTruncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_nullLimit_truncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_0Limit_nullTruncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_1Limit_nullTruncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_2Limit_nullTruncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_3Limit_nullTruncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_4Limit_nullTruncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_0Limit_truncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_1Limit_truncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_2Limit_truncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_3Limit_truncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_4Limit_truncated_2Transform_arguments")
        @ParameterizedTest(name = "{0}") @DisplayName("postfix + transform") void postfix_transform(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { assertEquals("[>", invokeMethod(instance, "joinToString", types, values)); }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_nullLimit_nullTruncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_nullLimit_truncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_0Limit_nullTruncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_1Limit_nullTruncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_2Limit_nullTruncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_3Limit_nullTruncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_4Limit_nullTruncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_0Limit_truncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_1Limit_truncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_2Limit_truncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_3Limit_truncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_4Limit_truncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_nullLimit_nullTruncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_nullLimit_nullTruncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_nullLimit_truncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_0Limit_nullTruncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_1Limit_nullTruncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_2Limit_nullTruncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_3Limit_nullTruncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_4Limit_nullTruncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_0Limit_truncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_1Limit_truncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_2Limit_truncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_3Limit_truncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_4Limit_truncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_nullLimit_nullTruncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_nullLimit_truncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_0Limit_nullTruncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_1Limit_nullTruncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_2Limit_nullTruncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_3Limit_nullTruncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_4Limit_nullTruncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_0Limit_truncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_1Limit_truncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_2Limit_truncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_3Limit_truncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_4Limit_truncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_nullLimit_nullTruncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_nullLimit_nullTruncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_nullLimit_truncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_0Limit_nullTruncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_1Limit_nullTruncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_2Limit_nullTruncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_3Limit_nullTruncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_4Limit_nullTruncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_0Limit_truncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_1Limit_truncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_2Limit_truncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_3Limit_truncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_4Limit_truncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_nullLimit_nullTruncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_nullLimit_truncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_0Limit_nullTruncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_1Limit_nullTruncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_2Limit_nullTruncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_3Limit_nullTruncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_4Limit_nullTruncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_0Limit_truncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_1Limit_truncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_2Limit_truncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_3Limit_truncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_4Limit_truncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_nullLimit_nullTruncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_nullLimit_nullTruncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_nullLimit_truncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_0Limit_nullTruncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_1Limit_nullTruncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_2Limit_nullTruncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_3Limit_nullTruncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_4Limit_nullTruncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_0Limit_truncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_1Limit_truncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_2Limit_truncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_3Limit_truncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_4Limit_truncated_2Transform_arguments")
        @ParameterizedTest(name = "{0}") @DisplayName("prefix + transform") void prefix_transform(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { assertEquals("<]", invokeMethod(instance, "joinToString", types, values)); }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_nullLimit_nullTruncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_nullLimit_truncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_0Limit_nullTruncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_1Limit_nullTruncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_2Limit_nullTruncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_3Limit_nullTruncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_4Limit_nullTruncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_0Limit_truncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_1Limit_truncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_2Limit_truncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_3Limit_truncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_4Limit_truncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_nullLimit_nullTruncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_nullLimit_nullTruncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_nullLimit_truncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_0Limit_nullTruncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_1Limit_nullTruncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_2Limit_nullTruncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_3Limit_nullTruncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_4Limit_nullTruncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_0Limit_truncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_1Limit_truncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_2Limit_truncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_3Limit_truncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_4Limit_truncated_0Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_nullLimit_nullTruncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_nullLimit_truncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_0Limit_nullTruncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_1Limit_nullTruncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_2Limit_nullTruncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_3Limit_nullTruncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_4Limit_nullTruncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_0Limit_truncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_1Limit_truncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_2Limit_truncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_3Limit_truncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_4Limit_truncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_nullLimit_nullTruncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_nullLimit_nullTruncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_nullLimit_truncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_0Limit_nullTruncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_1Limit_nullTruncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_2Limit_nullTruncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_3Limit_nullTruncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_4Limit_nullTruncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_0Limit_truncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_1Limit_truncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_2Limit_truncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_3Limit_truncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_4Limit_truncated_1Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_nullLimit_nullTruncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_nullLimit_truncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_0Limit_nullTruncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_1Limit_nullTruncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_2Limit_nullTruncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_3Limit_nullTruncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_4Limit_nullTruncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_0Limit_truncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_1Limit_truncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_2Limit_truncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_3Limit_truncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_4Limit_truncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_nullLimit_nullTruncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_nullLimit_nullTruncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_nullLimit_truncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_0Limit_nullTruncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_1Limit_nullTruncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_2Limit_nullTruncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_3Limit_nullTruncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_4Limit_nullTruncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_0Limit_truncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_1Limit_truncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_2Limit_truncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_3Limit_truncated_2Transform_arguments")
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_4Limit_truncated_2Transform_arguments")
        @ParameterizedTest(name = "{0}") @DisplayName("prefix + postfix + transform") void prefix_postfix_transform(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { assertEquals("{>", invokeMethod(instance, "joinToString", types, values)); }

    }

    @FieldSource("value.Instances#everyInstancesAsArguments")
    @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/  @Nested class instances extends AbstractInstancesTests {
        //#region -------------------- Required test constructor --------------------

        public instances(final Class<CollectionHolderForTest<?, ?>> instanceClass) { super(instanceClass); }

        //#endregion -------------------- Required test constructor --------------------

        @ExtendWith({DisableIfNormalCondition.class, DisableIfNormalViewerCondition.class,})
        @DisplayName("get() being called") @TestInstance(PER_CLASS) @Nested class GetBeingCalled {
            public final instances rootInstance = instances.this;

            @TestInstance(PER_CLASS) @Nested class empty {
                @DisplayName("∅") @Test void noArg() { assertEquals(0, newInstance(EMPTY).execute(CollectionHolder::joinToString).getAmountOfCall()); }

                @FieldSource("value.JoinToStringValues#anySeparator_arguments")
                @ParameterizedTest(name = "{0}") @DisplayName("separator") void separator(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { assertEquals(0, newInstance(EMPTY).execute(it -> invokeMethod(it, "joinToString", types, values)).getAmountOfCall()); }

                @FieldSource("value.JoinToStringValues#anySeparator_anyPrefix_arguments")
                @ParameterizedTest(name = "{0}") @DisplayName("prefix") void prefix(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { assertEquals(0, newInstance(EMPTY).execute(it -> invokeMethod(it, "joinToString", types, values)).getAmountOfCall()); }

                @FieldSource("value.JoinToStringValues#anySeparator_anyPrefix_anyPostfix_arguments")
                @ParameterizedTest(name = "{0}") @DisplayName("postfix") void postfix(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { assertEquals(0, newInstance(EMPTY).execute(it -> invokeMethod(it, "joinToString", types, values)).getAmountOfCall()); }

                @FieldSource("value.JoinToStringValues#anySeparator_anyPrefix_anyPostfix_anyLimit_arguments")
                @ParameterizedTest(name = "{0}") @DisplayName("limit") void limit(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { assertEquals(0, newInstance(EMPTY).execute(it -> invokeMethod(it, "joinToString", types, values)).getAmountOfCall()); }

                @FieldSource("value.JoinToStringValues#anySeparator_anyPrefix_anyPostfix_anyLimit_anyTruncate_arguments")
                @ParameterizedTest(name = "{0}") @DisplayName("truncate") void truncate(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { assertEquals(0, newInstance(EMPTY).execute(it -> invokeMethod(it, "joinToString", types, values)).getAmountOfCall()); }

                @FieldSource("value.JoinToStringValues#anySeparator_anyPrefix_anyPostfix_anyLimit_anyTruncate_anyFailCallbacks_arguments")
                @ParameterizedTest(name = "{0}") @DisplayName("transform") void transform(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { assertEquals(0, newInstance(EMPTY).execute(it -> invokeMethod(it, "joinToString", types, values)).getAmountOfCall()); }
             }

            @TestInstance(PER_CLASS) @DisplayName("1 field") @Nested class Test1 {
                @DisplayName("∅") @Test void noArg() { assertEquals(1, newInstance(A).execute(CollectionHolder::joinToString).getAmountOfCall()); }

                @FieldSource("value.JoinToStringValues#anySeparator_arguments")
                @ParameterizedTest(name = "{0}") @DisplayName("separator") void separator(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { assertEquals(1, newInstance(A).execute(it -> invokeMethod(it, "joinToString", types, values)).getAmountOfCall()); }

                @FieldSource("value.JoinToStringValues#anySeparator_anyPrefix_arguments")
                @ParameterizedTest(name = "{0}") @DisplayName("prefix") void prefix(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { assertEquals(1, newInstance(A).execute(it -> invokeMethod(it, "joinToString", types, values)).getAmountOfCall()); }

                @FieldSource("value.JoinToStringValues#anySeparator_anyPrefix_anyPostfix_arguments")
                @ParameterizedTest(name = "{0}") @DisplayName("postfix") void postfix(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { assertEquals(1, newInstance(A).execute(it -> invokeMethod(it, "joinToString", types, values)).getAmountOfCall()); }

                @FieldSource("value.JoinToStringValues#anySeparator_anyPrefix_anyPostfix_0Limit_arguments")
                @ParameterizedTest(name = "{0}") @DisplayName("limit 0") void limit0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { assertEquals(0, newInstance(A).execute(it -> invokeMethod(it, "joinToString", types, values)).getAmountOfCall()); }
                @FieldSource("value.JoinToStringValues#anySeparator_anyPrefix_anyPostfix_1Limit_arguments")
                @FieldSource("value.JoinToStringValues#anySeparator_anyPrefix_anyPostfix_nullLimit_arguments")
                @ParameterizedTest(name = "{0}") @DisplayName("limit 1") void limit1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { assertEquals(1, newInstance(A).execute(it -> invokeMethod(it, "joinToString", types, values)).getAmountOfCall()); }

                @FieldSource("value.JoinToStringValues#anySeparator_anyPrefix_anyPostfix_0Limit_anyTruncate_arguments")
                @ParameterizedTest(name = "{0}") @DisplayName("limit 0 + truncate") void limit0Truncate(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { assertEquals(0, newInstance(A).execute(it -> invokeMethod(it, "joinToString", types, values)).getAmountOfCall()); }
                @FieldSource("value.JoinToStringValues#anySeparator_anyPrefix_anyPostfix_1Limit_anyTruncate_arguments")
                @FieldSource("value.JoinToStringValues#anySeparator_anyPrefix_anyPostfix_nullLimit_anyTruncate_arguments")
                @ParameterizedTest(name = "{0}") @DisplayName("limit 1 + truncate") void limit1Truncate(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { assertEquals(1, newInstance(A).execute(it -> invokeMethod(it, "joinToString", types, values)).getAmountOfCall()); }

                @FieldSource("value.JoinToStringValues#anySeparator_anyPrefix_anyPostfix_0Limit_anyTruncate_anyFailCallbacks_arguments")
                @FieldSource("value.JoinToStringValues#anySeparator_anyPrefix_anyPostfix_nullLimit_anyTruncate_0Callbacks_arguments")
                @ParameterizedTest(name = "{0}") @DisplayName("limit 0 + transform") void limit0Transform(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { assertEquals(0, newInstance(A).execute(it -> invokeMethod(it, "joinToString", types, values)).getAmountOfCall()); }
                @FieldSource("value.JoinToStringValues#anySeparator_anyPrefix_anyPostfix_1Limit_anyTruncate_0Callbacks_arguments")
                @FieldSource("value.JoinToStringValues#anySeparator_anyPrefix_anyPostfix_nullLimit_anyTruncate_0Callbacks_arguments")
                @ParameterizedTest(name = "{0}") @DisplayName("limit 1 + transform 1") void limit1Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { assertEquals(0, newInstance(A).execute(it -> invokeMethod(it, "joinToString", types, values)).getAmountOfCall()); }
                @FieldSource("value.JoinToStringValues#anySeparator_anyPrefix_anyPostfix_1Limit_anyTruncate_1Callbacks_arguments")
                @FieldSource("value.JoinToStringValues#anySeparator_anyPrefix_anyPostfix_nullLimit_anyTruncate_1Callbacks_arguments")
                @ParameterizedTest(name = "{0}") @DisplayName("limit 1 + transform 1") void limit1Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { assertEquals(1, newInstance(A).execute(it -> invokeMethod(it, "joinToString", types, values)).getAmountOfCall()); }
                @FieldSource("value.JoinToStringValues#anySeparator_anyPrefix_anyPostfix_1Limit_anyTruncate_2Callbacks_arguments")
                @FieldSource("value.JoinToStringValues#anySeparator_anyPrefix_anyPostfix_nullLimit_anyTruncate_2Callbacks_arguments")
                @ParameterizedTest(name = "{0}") @DisplayName("limit 1 + transform 2") void limit1Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { assertEquals(1, newInstance(A).execute(it -> invokeMethod(it, "joinToString", types, values)).getAmountOfCall()); }

             }

            @TestInstance(PER_CLASS) @DisplayName("2 fields") @Nested class Test2 {
                @DisplayName("∅") @Test void noArg() { assertEquals(2, newInstance(AB).execute(CollectionHolder::joinToString).getAmountOfCall()); }

                @FieldSource("value.JoinToStringValues#anySeparator_arguments")
                @ParameterizedTest(name = "{0}") @DisplayName("separator") void separator(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { assertEquals(2, newInstance(AB).execute(it -> invokeMethod(it, "joinToString", types, values)).getAmountOfCall()); }

                @FieldSource("value.JoinToStringValues#anySeparator_anyPrefix_arguments")
                @ParameterizedTest(name = "{0}") @DisplayName("prefix") void prefix(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { assertEquals(2, newInstance(AB).execute(it -> invokeMethod(it, "joinToString", types, values)).getAmountOfCall()); }

                @FieldSource("value.JoinToStringValues#anySeparator_anyPrefix_anyPostfix_arguments")
                @ParameterizedTest(name = "{0}") @DisplayName("postfix") void postfix(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { assertEquals(2, newInstance(AB).execute(it -> invokeMethod(it, "joinToString", types, values)).getAmountOfCall()); }

                @FieldSource("value.JoinToStringValues#anySeparator_anyPrefix_anyPostfix_0Limit_arguments")
                @ParameterizedTest(name = "{0}") @DisplayName("limit 0") void limit0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { assertEquals(0, newInstance(AB).execute(it -> invokeMethod(it, "joinToString", types, values)).getAmountOfCall()); }
                @FieldSource("value.JoinToStringValues#anySeparator_anyPrefix_anyPostfix_1Limit_arguments")
                @ParameterizedTest(name = "{0}") @DisplayName("limit 1") void limit1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { assertEquals(1, newInstance(AB).execute(it -> invokeMethod(it, "joinToString", types, values)).getAmountOfCall()); }
                @FieldSource("value.JoinToStringValues#anySeparator_anyPrefix_anyPostfix_2Limit_arguments")
                @FieldSource("value.JoinToStringValues#anySeparator_anyPrefix_anyPostfix_nullLimit_arguments")
                @ParameterizedTest(name = "{0}") @DisplayName("limit 2") void limit2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { assertEquals(2, newInstance(AB).execute(it -> invokeMethod(it, "joinToString", types, values)).getAmountOfCall()); }

                @FieldSource("value.JoinToStringValues#anySeparator_anyPrefix_anyPostfix_0Limit_anyTruncate_arguments")
                @ParameterizedTest(name = "{0}") @DisplayName("limit 0 + truncate") void limit0Truncate(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { assertEquals(0, newInstance(AB).execute(it -> invokeMethod(it, "joinToString", types, values)).getAmountOfCall()); }
                @FieldSource("value.JoinToStringValues#anySeparator_anyPrefix_anyPostfix_1Limit_anyTruncate_arguments")
                @ParameterizedTest(name = "{0}") @DisplayName("limit 1 + truncate") void limit1Truncate(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { assertEquals(1, newInstance(AB).execute(it -> invokeMethod(it, "joinToString", types, values)).getAmountOfCall()); }
                @FieldSource("value.JoinToStringValues#anySeparator_anyPrefix_anyPostfix_2Limit_anyTruncate_arguments")
                @FieldSource("value.JoinToStringValues#anySeparator_anyPrefix_anyPostfix_nullLimit_anyTruncate_arguments")
                @ParameterizedTest(name = "{0}") @DisplayName("limit 2 + truncate") void limit2Truncate(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { assertEquals(2, newInstance(AB).execute(it -> invokeMethod(it, "joinToString", types, values)).getAmountOfCall()); }

                @FieldSource("value.JoinToStringValues#anySeparator_anyPrefix_anyPostfix_0Limit_anyTruncate_anyFailCallbacks_arguments")
                @ParameterizedTest(name = "{0}") @DisplayName("limit 0 + transform") void limit0Transform(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { assertEquals(0, newInstance(AB).execute(it -> invokeMethod(it, "joinToString", types, values)).getAmountOfCall()); }
                @FieldSource("value.JoinToStringValues#anySeparator_anyPrefix_anyPostfix_1Limit_anyTruncate_0Callbacks_arguments")
                @ParameterizedTest(name = "{0}") @DisplayName("limit 1 + transform 1") void limit1Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { assertEquals(0, newInstance(AB).execute(it -> invokeMethod(it, "joinToString", types, values)).getAmountOfCall()); }
                @FieldSource("value.JoinToStringValues#anySeparator_anyPrefix_anyPostfix_1Limit_anyTruncate_1Callbacks_arguments")
                @ParameterizedTest(name = "{0}") @DisplayName("limit 1 + transform 1") void limit1Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { assertEquals(1, newInstance(AB).execute(it -> invokeMethod(it, "joinToString", types, values)).getAmountOfCall()); }
                @FieldSource("value.JoinToStringValues#anySeparator_anyPrefix_anyPostfix_1Limit_anyTruncate_2Callbacks_arguments")
                @ParameterizedTest(name = "{0}") @DisplayName("limit 1 + transform 2") void limit1Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { assertEquals(1, newInstance(AB).execute(it -> invokeMethod(it, "joinToString", types, values)).getAmountOfCall()); }
                @FieldSource("value.JoinToStringValues#anySeparator_anyPrefix_anyPostfix_2Limit_anyTruncate_0Callbacks_arguments")
                @FieldSource("value.JoinToStringValues#anySeparator_anyPrefix_anyPostfix_nullLimit_anyTruncate_0Callbacks_arguments")
                @ParameterizedTest(name = "{0}") @DisplayName("limit 2 + transform 1") void limit2Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { assertEquals(0, newInstance(AB).execute(it -> invokeMethod(it, "joinToString", types, values)).getAmountOfCall()); }
                @FieldSource("value.JoinToStringValues#anySeparator_anyPrefix_anyPostfix_2Limit_anyTruncate_1Callbacks_arguments")
                @FieldSource("value.JoinToStringValues#anySeparator_anyPrefix_anyPostfix_nullLimit_anyTruncate_1Callbacks_arguments")
                @ParameterizedTest(name = "{0}") @DisplayName("limit 2 + transform 1") void limit2Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { assertEquals(2, newInstance(AB).execute(it -> invokeMethod(it, "joinToString", types, values)).getAmountOfCall()); }
                @FieldSource("value.JoinToStringValues#anySeparator_anyPrefix_anyPostfix_2Limit_anyTruncate_2Callbacks_arguments")
                @FieldSource("value.JoinToStringValues#anySeparator_anyPrefix_anyPostfix_nullLimit_anyTruncate_2Callbacks_arguments")
                @ParameterizedTest(name = "{0}") @DisplayName("limit 2 + transform 2") void limit2Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { assertEquals(2, newInstance(AB).execute(it -> invokeMethod(it, "joinToString", types, values)).getAmountOfCall()); }

            }

            @TestInstance(PER_CLASS) @DisplayName("4 fields") @Nested class Test4 {
                @DisplayName("∅") @Test void noArg() { assertEquals(4, newInstance(ABCD).execute(CollectionHolder::joinToString).getAmountOfCall()); }

                @FieldSource("value.JoinToStringValues#anySeparator_arguments")
                @ParameterizedTest(name = "{0}") @DisplayName("separator") void separator(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { assertEquals(4, newInstance(ABCD).execute(it -> invokeMethod(it, "joinToString", types, values)).getAmountOfCall()); }

                @FieldSource("value.JoinToStringValues#anySeparator_anyPrefix_arguments")
                @ParameterizedTest(name = "{0}") @DisplayName("prefix") void prefix(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { assertEquals(4, newInstance(ABCD).execute(it -> invokeMethod(it, "joinToString", types, values)).getAmountOfCall()); }

                @FieldSource("value.JoinToStringValues#anySeparator_anyPrefix_anyPostfix_arguments")
                @ParameterizedTest(name = "{0}") @DisplayName("postfix") void postfix(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { assertEquals(4, newInstance(ABCD).execute(it -> invokeMethod(it, "joinToString", types, values)).getAmountOfCall()); }

                @FieldSource("value.JoinToStringValues#anySeparator_anyPrefix_anyPostfix_0Limit_arguments")
                @ParameterizedTest(name = "{0}") @DisplayName("limit 0") void limit0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { assertEquals(0, newInstance(ABCD).execute(it -> invokeMethod(it, "joinToString", types, values)).getAmountOfCall()); }
                @FieldSource("value.JoinToStringValues#anySeparator_anyPrefix_anyPostfix_1Limit_arguments")
                @ParameterizedTest(name = "{0}") @DisplayName("limit 1") void limit1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { assertEquals(1, newInstance(ABCD).execute(it -> invokeMethod(it, "joinToString", types, values)).getAmountOfCall()); }
                @FieldSource("value.JoinToStringValues#anySeparator_anyPrefix_anyPostfix_2Limit_arguments")
                @ParameterizedTest(name = "{0}") @DisplayName("limit 2") void limit2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { assertEquals(2, newInstance(ABCD).execute(it -> invokeMethod(it, "joinToString", types, values)).getAmountOfCall()); }
                @FieldSource("value.JoinToStringValues#anySeparator_anyPrefix_anyPostfix_3Limit_arguments")
                @ParameterizedTest(name = "{0}") @DisplayName("limit 3") void limit3(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { assertEquals(3, newInstance(ABCD).execute(it -> invokeMethod(it, "joinToString", types, values)).getAmountOfCall()); }
                @FieldSource("value.JoinToStringValues#anySeparator_anyPrefix_anyPostfix_4Limit_arguments")
                @FieldSource("value.JoinToStringValues#anySeparator_anyPrefix_anyPostfix_nullLimit_arguments")
                @ParameterizedTest(name = "{0}") @DisplayName("limit 4") void limit4(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { assertEquals(4, newInstance(ABCD).execute(it -> invokeMethod(it, "joinToString", types, values)).getAmountOfCall()); }

                @FieldSource("value.JoinToStringValues#anySeparator_anyPrefix_anyPostfix_0Limit_anyTruncate_arguments")
                @ParameterizedTest(name = "{0}") @DisplayName("limit 0 + truncate") void limit0Truncate(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { assertEquals(0, newInstance(ABCD).execute(it -> invokeMethod(it, "joinToString", types, values)).getAmountOfCall()); }
                @FieldSource("value.JoinToStringValues#anySeparator_anyPrefix_anyPostfix_1Limit_anyTruncate_arguments")
                @ParameterizedTest(name = "{0}") @DisplayName("limit 1 + truncate") void limit1Truncate(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { assertEquals(1, newInstance(ABCD).execute(it -> invokeMethod(it, "joinToString", types, values)).getAmountOfCall()); }
                @FieldSource("value.JoinToStringValues#anySeparator_anyPrefix_anyPostfix_2Limit_anyTruncate_arguments")
                @ParameterizedTest(name = "{0}") @DisplayName("limit 2 + truncate") void limit2Truncate(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { assertEquals(2, newInstance(ABCD).execute(it -> invokeMethod(it, "joinToString", types, values)).getAmountOfCall()); }
                @FieldSource("value.JoinToStringValues#anySeparator_anyPrefix_anyPostfix_3Limit_anyTruncate_arguments")
                @ParameterizedTest(name = "{0}") @DisplayName("limit 3 + truncate") void limit3Truncate(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { assertEquals(3, newInstance(ABCD).execute(it -> invokeMethod(it, "joinToString", types, values)).getAmountOfCall()); }
                @FieldSource("value.JoinToStringValues#anySeparator_anyPrefix_anyPostfix_4Limit_anyTruncate_arguments")
                @FieldSource("value.JoinToStringValues#anySeparator_anyPrefix_anyPostfix_nullLimit_anyTruncate_arguments")
                @ParameterizedTest(name = "{0}") @DisplayName("limit 4 + truncate") void limit4Truncate(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { assertEquals(4, newInstance(ABCD).execute(it -> invokeMethod(it, "joinToString", types, values)).getAmountOfCall()); }

                @FieldSource("value.JoinToStringValues#anySeparator_anyPrefix_anyPostfix_0Limit_anyTruncate_anyFailCallbacks_arguments")
                @ParameterizedTest(name = "{0}") @DisplayName("limit 0 + transform") void limit0Transform(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { assertEquals(0, newInstance(ABCD).execute(it -> invokeMethod(it, "joinToString", types, values)).getAmountOfCall()); }
                @FieldSource("value.JoinToStringValues#anySeparator_anyPrefix_anyPostfix_1Limit_anyTruncate_0Callbacks_arguments")
                @ParameterizedTest(name = "{0}") @DisplayName("limit 1 + transform 0") void limit1Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { assertEquals(0, newInstance(ABCD).execute(it -> invokeMethod(it, "joinToString", types, values)).getAmountOfCall()); }
                @FieldSource("value.JoinToStringValues#anySeparator_anyPrefix_anyPostfix_1Limit_anyTruncate_1Callbacks_arguments")
                @ParameterizedTest(name = "{0}") @DisplayName("limit 1 + transform 1") void limit1Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { assertEquals(1, newInstance(ABCD).execute(it -> invokeMethod(it, "joinToString", types, values)).getAmountOfCall()); }
                @FieldSource("value.JoinToStringValues#anySeparator_anyPrefix_anyPostfix_1Limit_anyTruncate_2Callbacks_arguments")
                @ParameterizedTest(name = "{0}") @DisplayName("limit 1 + transform 2") void limit1Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { assertEquals(1, newInstance(ABCD).execute(it -> invokeMethod(it, "joinToString", types, values)).getAmountOfCall()); }
                @FieldSource("value.JoinToStringValues#anySeparator_anyPrefix_anyPostfix_2Limit_anyTruncate_0Callbacks_arguments")
                @ParameterizedTest(name = "{0}") @DisplayName("limit 2 + transform 0") void limit2Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { assertEquals(0, newInstance(ABCD).execute(it -> invokeMethod(it, "joinToString", types, values)).getAmountOfCall()); }
                @FieldSource("value.JoinToStringValues#anySeparator_anyPrefix_anyPostfix_2Limit_anyTruncate_1Callbacks_arguments")
                @ParameterizedTest(name = "{0}") @DisplayName("limit 2 + transform 1") void limit2Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { assertEquals(2, newInstance(ABCD).execute(it -> invokeMethod(it, "joinToString", types, values)).getAmountOfCall()); }
                @FieldSource("value.JoinToStringValues#anySeparator_anyPrefix_anyPostfix_2Limit_anyTruncate_2Callbacks_arguments")
                @ParameterizedTest(name = "{0}") @DisplayName("limit 2 + transform 2") void limit2Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { assertEquals(2, newInstance(ABCD).execute(it -> invokeMethod(it, "joinToString", types, values)).getAmountOfCall()); }
                @FieldSource("value.JoinToStringValues#anySeparator_anyPrefix_anyPostfix_3Limit_anyTruncate_0Callbacks_arguments")
                @ParameterizedTest(name = "{0}") @DisplayName("limit 3 + transform 0") void limit3Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { assertEquals(0, newInstance(ABCD).execute(it -> invokeMethod(it, "joinToString", types, values)).getAmountOfCall()); }
                @FieldSource("value.JoinToStringValues#anySeparator_anyPrefix_anyPostfix_3Limit_anyTruncate_1Callbacks_arguments")
                @ParameterizedTest(name = "{0}") @DisplayName("limit 3 + transform 0") void limit3Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { assertEquals(3, newInstance(ABCD).execute(it -> invokeMethod(it, "joinToString", types, values)).getAmountOfCall()); }
                @FieldSource("value.JoinToStringValues#anySeparator_anyPrefix_anyPostfix_3Limit_anyTruncate_2Callbacks_arguments")
                @ParameterizedTest(name = "{0}") @DisplayName("limit 3 + transform 0") void limit3Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { assertEquals(3, newInstance(ABCD).execute(it -> invokeMethod(it, "joinToString", types, values)).getAmountOfCall()); }
                @FieldSource("value.JoinToStringValues#anySeparator_anyPrefix_anyPostfix_4Limit_anyTruncate_0Callbacks_arguments")
                @FieldSource("value.JoinToStringValues#anySeparator_anyPrefix_anyPostfix_nullLimit_anyTruncate_0Callbacks_arguments")
                @ParameterizedTest(name = "{0}") @DisplayName("limit 4 + transform 0") void limit4Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { assertEquals(0, newInstance(ABCD).execute(it -> invokeMethod(it, "joinToString", types, values)).getAmountOfCall()); }
                @FieldSource("value.JoinToStringValues#anySeparator_anyPrefix_anyPostfix_4Limit_anyTruncate_1Callbacks_arguments")
                @FieldSource("value.JoinToStringValues#anySeparator_anyPrefix_anyPostfix_nullLimit_anyTruncate_1Callbacks_arguments")
                @ParameterizedTest(name = "{0}") @DisplayName("limit 4 + transform 1") void limit4Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { assertEquals(4, newInstance(ABCD).execute(it -> invokeMethod(it, "joinToString", types, values)).getAmountOfCall()); }
                @FieldSource("value.JoinToStringValues#anySeparator_anyPrefix_anyPostfix_4Limit_anyTruncate_2Callbacks_arguments")
                @FieldSource("value.JoinToStringValues#anySeparator_anyPrefix_anyPostfix_nullLimit_anyTruncate_2Callbacks_arguments")
                @ParameterizedTest(name = "{0}") @DisplayName("limit 4 + transform 2") void limit4Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { assertEquals(4, newInstance(ABCD).execute(it -> invokeMethod(it, "joinToString", types, values)).getAmountOfCall()); }

            }

        }

        @Nested class nothing {
                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, newInstance(EMPTY).joinToString()); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[a]",                    newInstance(A).joinToString()); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[a, b]",                 newInstance(AB).joinToString()); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[a, b, c, d]",           newInstance(ABCD).joinToString()); }
        }

        @FieldSource("value.JoinToStringValues#separator_arguments")
        @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class separator extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public separator(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[a]",                    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[a;b]",                  invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[a;b;c;d]",              invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#nullSeparator_arguments")
        @DisplayName("null separator") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class NullSeparator extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public NullSeparator(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[a]",                    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[a, b]",                 invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[a, b, c, d]",           invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }

        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_arguments")
        @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class prefix extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public prefix(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]",           invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<a]",          invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<a, b]",       invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<a, b, c, d]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_arguments")
        @DisplayName("null prefix") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class NullPrefix extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public NullPrefix(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[a]",                    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[a, b]",                 invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[a, b, c, d]",           invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#separator_prefix_arguments")
        @DisplayName("separator + prefix") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]",        invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<a]",       invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<a;b]",     invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<a;b;c;d]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }

        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_arguments")
        @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class postfix extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public postfix(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>",           invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[a>",          invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[a, b>",       invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[a, b, c, d>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_arguments")
        @DisplayName("null postfix") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class NullPostfix extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public NullPostfix(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[a]",                    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[a, b]",                 invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[a, b, c, d]",           invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_arguments")
        @DisplayName("prefix + postfix") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Postfix extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Postfix(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>",           invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{a>",          invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{a, b>",       invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{a, b, c, d>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_arguments")
        @DisplayName("separator + postfix") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Postfix extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Postfix(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

            @Test void empty() { assertEquals("[>",        invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[a>",       invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[a;b>",     invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[a;b;c;d>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_arguments")
        @DisplayName("separator + prefix + postfix") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Postfix extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Postfix(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>",        invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{a>",       invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{a;b>",     invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{a;b;c;d>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }

        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_minus500Limit_arguments")
        @DisplayName("-500 limit") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Minus500Limit extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Minus500Limit(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_minus6Limit_arguments")
        @DisplayName("-6 limit") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Minus6Limit extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Minus6Limit(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_minus5Limit_arguments")
        @DisplayName("-5 limit") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Minus5Limit extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Minus5Limit(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_minus4Limit_arguments")
        @DisplayName("-4 limit") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Minus4Limit extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Minus4Limit(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_minus3Limit_arguments")
        @DisplayName("-3 limit") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Minus3Limit extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Minus3Limit(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[a, …]",                 invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_minus2Limit_arguments")
        @DisplayName("-2 limit") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Minus2Limit extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Minus2Limit(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[a, b, …]",              invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_minus1Limit_arguments")
        @DisplayName("-1 limit") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Minus1Limit extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Minus1Limit(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[a, …]",                 invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[a, b, c, …]",           invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_0Limit_arguments")
        @DisplayName("0 limit") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Limit0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Limit0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_1Limit_arguments")
        @DisplayName("1 limit") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Limit1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Limit1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[a]",                    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[a, …]",                 invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[a, …]",                 invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_2Limit_arguments")
        @DisplayName("2 limit") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Limit2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Limit2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[a]",                    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[a, b]",                 invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[a, b, …]",              invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_3Limit_arguments")
        @DisplayName("3 limit") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Limit3 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Limit3(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[a]",                    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[a, b]",                 invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[a, b, c, …]",           invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_4Limit_arguments")
        @DisplayName("4 limit") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Limit4 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Limit4(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[a]",                    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[a, b]",                 invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[a, b, c, d]",           invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_5Limit_arguments")
        @DisplayName("5 limit") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Limit5 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Limit5(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[a]",                    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[a, b]",                 invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[a, b, c, d]",           invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_500Limit_arguments")
        @DisplayName("500 limit") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Limit500 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Limit500(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[a]",                    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[a, b]",                 invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[a, b, c, d]",           invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_nullLimit_arguments")
        @DisplayName("null limit") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class NullLimit extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public NullLimit(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[a]",                    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[a, b]",                 invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[a, b, c, d]",           invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_0Limit_arguments")
        @DisplayName("postfix + 0 limit") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Postfix_Limit0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Postfix_Limit0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>", invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[>", invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[>", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_1Limit_arguments")
        @DisplayName("postfix + 1 limit") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Postfix_Limit1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Postfix_Limit1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>",     invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[a>",    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[a, …>", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[a, …>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_2Limit_arguments")
        @DisplayName("postfix + 2 limit") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Postfix_Limit2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Postfix_Limit2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>",        invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[a>",       invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[a, b>",    invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[a, b, …>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_3Limit_arguments")
        @DisplayName("postfix + 3 limit") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Postfix_Limit3 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Postfix_Limit3(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>",           invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[a>",          invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[a, b>",       invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[a, b, c, …>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_4Limit_arguments")
        @DisplayName("postfix + 4 limit") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Postfix_Limit4 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Postfix_Limit4(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>",           invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[a>",          invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[a, b>",       invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[a, b, c, d>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_0Limit_arguments")
        @DisplayName("prefix + 0 limit") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Limit0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Limit0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]", invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<]", invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<]", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_1Limit_arguments")
        @DisplayName("prefix + 1 limit") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Limit1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Limit1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]",     invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<a]",    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<a, …]", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<a, …]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_2Limit_arguments")
        @DisplayName("prefix + 2 limit") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Limit2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Limit2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]",        invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<a]",       invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<a, b]",    invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<a, b, …]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_3Limit_arguments")
        @DisplayName("prefix + 3 limit") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Limit3 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Limit3(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]",           invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<a]",          invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<a, b]",       invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<a, b, c, …]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_4Limit_arguments")
        @DisplayName("prefix + 4 limit") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Limit4 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Limit4(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]",           invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<a]",          invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<a, b]",       invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<a, b, c, d]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_0Limit_arguments")
        @DisplayName("prefix + postfix + 0 limit") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Postfix_Limit0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Postfix_Limit0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

            @Test void empty() { assertEquals("{>", invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{>", invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{>", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_1Limit_arguments")
        @DisplayName("prefix + postfix + 1 limit") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Postfix_Limit1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Postfix_Limit1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

            @Test void empty() { assertEquals("{>",     invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{a>",    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{a, …>", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{a, …>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_2Limit_arguments")
        @DisplayName("prefix + postfix + 2 limit") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Postfix_Limit2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Postfix_Limit2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

            @Test void empty() { assertEquals("{>",        invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{a>",       invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{a, b>",    invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{a, b, …>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_3Limit_arguments")
        @DisplayName("prefix + postfix + 3 limit") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Postfix_Limit3 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Postfix_Limit3(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

            @Test void empty() { assertEquals("{>",           invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{a>",          invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{a, b>",       invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{a, b, c, …>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_4Limit_arguments")
        @DisplayName("prefix + postfix + 4 limit") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Postfix_Limit4 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Postfix_Limit4(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

            @Test void empty() { assertEquals("{>",           invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{a>",          invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{a, b>",       invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{a, b, c, d>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_0Limit_arguments")
        @DisplayName("separator + 0 limit") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Limit0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Limit0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_1Limit_arguments")
        @DisplayName("separator + 1 limit") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Limit1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Limit1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[a]",                    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[a;…]",                 invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[a;…]",                 invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_2Limit_arguments")
        @DisplayName("separator + 2 limit") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Limit2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Limit2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[a]",                    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[a;b]",                  invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[a;b;…]",                invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_3Limit_arguments")
        @DisplayName("separator + 3 limit") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Limit3 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Limit3(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[a]",                    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[a;b]",                 invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[a;b;c;…]",           invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_4Limit_arguments")
        @DisplayName("separator + 4 limit") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Limit4 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Limit4(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[a]",                    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[a;b]",                 invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[a;b;c;d]",           invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_0Limit_arguments")
        @DisplayName("separator + postfix + 0 limit") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Postfix_Limit0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Postfix_Limit0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>", invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[>", invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[>", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_1Limit_arguments")
        @DisplayName("separator + postfix + 1 limit") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Postfix_Limit1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Postfix_Limit1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>",    invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[a>",   invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[a;…>", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[a;…>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_2Limit_arguments")
        @DisplayName("separator + postfix + 2 limit") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Postfix_Limit2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Postfix_Limit2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>",      invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[a>",     invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[a;b>",   invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[a;b;…>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_3Limit_arguments")
        @DisplayName("separator + postfix + 3 limit") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Postfix_Limit3 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Postfix_Limit3(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>",        invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[a>",       invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[a;b>",     invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[a;b;c;…>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_4Limit_arguments")
        @DisplayName("separator + postfix + 4 limit") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Postfix_Limit4 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Postfix_Limit4(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>",        invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[a>",       invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[a;b>",     invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[a;b;c;d>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_0Limit_arguments")
        @DisplayName("separator + prefix + 0 limit") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Limit0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Limit0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]", invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<]", invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<]", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_1Limit_arguments")
        @DisplayName("separator + prefix + 1 limit") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Limit1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Limit1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]",    invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<a]",   invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<a;…]", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<a;…]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_2Limit_arguments")
        @DisplayName("separator + prefix + 2 limit") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Limit2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Limit2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]",      invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<a]",     invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<a;b]",   invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<a;b;…]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_3Limit_arguments")
        @DisplayName("separator + prefix + 3 limit") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Limit3 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Limit3(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]",        invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<a]",       invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<a;b]",     invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<a;b;c;…]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_4Limit_arguments")
        @DisplayName("separator + prefix + 4 limit") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Limit4 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Limit4(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]",        invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<a]",       invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<a;b]",     invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<a;b;c;d]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_0Limit_arguments")
        @DisplayName("separator + prefix + postfix + 0 limit") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Postfix_Limit0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Postfix_Limit0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>", invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{>", invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{>", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_1Limit_arguments")
        @DisplayName("separator + prefix + postfix + 1 limit") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Postfix_Limit1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Postfix_Limit1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>",    invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{a>",   invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{a;…>", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{a;…>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_2Limit_arguments")
        @DisplayName("separator + prefix + postfix + 2 limit") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Postfix_Limit2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Postfix_Limit2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>",      invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{a>",     invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{a;b>",   invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{a;b;…>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_3Limit_arguments")
        @DisplayName("separator + prefix + postfix + 3 limit") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Postfix_Limit3 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Postfix_Limit3(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>",        invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{a>",       invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{a;b>",     invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{a;b;c;…>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_4Limit_arguments")
        @DisplayName("separator + prefix + postfix + 4 limit") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Postfix_Limit4 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Postfix_Limit4(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>",        invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{a>",       invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{a;b>",     invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{a;b;c;d>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }

        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_nullLimit_truncated_arguments")
        @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class truncated extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public truncated(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[a]",                    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[a, b]",                 invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[a, b, c, d]",           invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_nullLimit_nullTruncated_arguments")
        @DisplayName("null truncated") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class NullTruncated extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public NullTruncated(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[a]",                    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[a, b]",                 invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[a, b, c, d]",           invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_0Limit_truncated_arguments")
        @DisplayName("limit 0 + truncated") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Limit0_Truncated extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Limit0_Truncated(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

            @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_1Limit_truncated_arguments")
        @DisplayName("limit 1 + truncated") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Limit1_Truncated extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Limit1_Truncated(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

            @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[a]",                    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[a, ‥]",                 invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[a, ‥]",                 invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_2Limit_truncated_arguments")
        @DisplayName("limit 2 + truncated") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Limit2_Truncated extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Limit2_Truncated(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

            @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[a]",                    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[a, b]",                 invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[a, b, ‥]",              invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_3Limit_truncated_arguments")
        @DisplayName("limit 3 + truncated") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Limit3_Truncated extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Limit3_Truncated(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

            @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[a]",                    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[a, b]",                 invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[a, b, c, ‥]",           invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_4Limit_truncated_arguments")
        @DisplayName("limit 4 + truncated") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Limit4_Truncated extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Limit4_Truncated(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

            @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[a]",                    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[a, b]",                 invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[a, b, c, d]",           invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_nullLimit_truncated_arguments")
        @DisplayName("postfix + truncated") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Postfix_Truncated extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Postfix_Truncated(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>",           invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[a>",          invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[a, b>",       invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[a, b, c, d>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_0Limit_truncated_arguments")
        @DisplayName("postfix + limit 0 + truncated") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Postfix_Limit0_Truncated extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Postfix_Limit0_Truncated(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>", invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[>", invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[>", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_1Limit_truncated_arguments")
        @DisplayName("postfix + limit 1 + truncated") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Postfix_Limit1_Truncated extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Postfix_Limit1_Truncated(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>",     invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[a>",    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[a, ‥>", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[a, ‥>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_2Limit_truncated_arguments")
        @DisplayName("postfix + limit 2 + truncated") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Postfix_Limit2_Truncated extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Postfix_Limit2_Truncated(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>",        invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[a>",       invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[a, b>",    invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[a, b, ‥>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_3Limit_truncated_arguments")
        @DisplayName("postfix + limit 3 + truncated") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Postfix_Limit3_Truncated extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Postfix_Limit3_Truncated(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>",           invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[a>",          invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[a, b>",       invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[a, b, c, ‥>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_4Limit_truncated_arguments")
        @DisplayName("postfix + limit 4 + truncated") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Postfix_Limit4_Truncated extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Postfix_Limit4_Truncated(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>",           invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[a>",          invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[a, b>",       invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[a, b, c, d>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_nullLimit_truncated_arguments")
        @DisplayName("prefix + truncated") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Truncated extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Truncated(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]",           invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<a]",          invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<a, b]",       invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<a, b, c, d]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_0Limit_truncated_arguments")
        @DisplayName("prefix + limit 0 + truncated") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Limit0_Truncated extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Limit0_Truncated(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]", invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<]", invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<]", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_1Limit_truncated_arguments")
        @DisplayName("prefix + limit 1 + truncated") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Limit1_Truncated extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Limit1_Truncated(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]",     invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<a]",    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<a, ‥]", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<a, ‥]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_2Limit_truncated_arguments")
        @DisplayName("prefix + limit 2 + truncated") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Limit2_Truncated extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Limit2_Truncated(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]",        invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<a]",       invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<a, b]",    invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<a, b, ‥]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_3Limit_truncated_arguments")
        @DisplayName("prefix + limit 3 + truncated") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Limit3_Truncated extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Limit3_Truncated(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]",           invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<a]",          invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<a, b]",       invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<a, b, c, ‥]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_4Limit_truncated_arguments")
        @DisplayName("prefix + limit 4 + truncated") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Limit4_Truncated extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Limit4_Truncated(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]",           invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<a]",          invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<a, b]",       invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<a, b, c, d]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_nullLimit_truncated_arguments")
        @DisplayName("prefix + postfix + truncated") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Postfix_Truncated extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Postfix_Truncated(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>",           invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{a>",          invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{a, b>",       invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{a, b, c, d>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_0Limit_truncated_arguments")
        @DisplayName("prefix + postfix + limit 0 + truncated") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Postfix_Limit0_Truncated extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Postfix_Limit0_Truncated(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>", invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{>", invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{>", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_1Limit_truncated_arguments")
        @DisplayName("prefix + postfix + limit 1 + truncated") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Postfix_Limit1_Truncated extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Postfix_Limit1_Truncated(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>",     invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{a>",    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{a, ‥>", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{a, ‥>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_2Limit_truncated_arguments")
        @DisplayName("prefix + postfix + limit 2 + truncated") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Postfix_Limit2_Truncated extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Postfix_Limit2_Truncated(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>",        invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{a>",       invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{a, b>",    invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{a, b, ‥>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_3Limit_truncated_arguments")
        @DisplayName("prefix + postfix + limit 3 + truncated") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Postfix_Limit3_Truncated extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Postfix_Limit3_Truncated(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>",           invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{a>",          invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{a, b>",       invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{a, b, c, ‥>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_4Limit_truncated_arguments")
        @DisplayName("prefix + postfix + limit 4 + truncated") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Postfix_Limit4_Truncated extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Postfix_Limit4_Truncated(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>",           invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{a>",          invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{a, b>",       invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{a, b, c, d>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_nullLimit_truncated_arguments")
        @DisplayName("separator + truncated") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Truncated extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Truncated(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[a]",                    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[a;b]",                  invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[a;b;c;d]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_0Limit_truncated_arguments")
        @DisplayName("separator + limit 0 + truncated") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Limit0_Truncated extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Limit0_Truncated(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_1Limit_truncated_arguments")
        @DisplayName("separator + limit 1 + truncated") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Limit1_Truncated extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Limit1_Truncated(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[a]",                    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[a;‥]",                  invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[a;‥]",                  invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_2Limit_truncated_arguments")
        @DisplayName("separator + limit 2 + truncated") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Limit2_Truncated extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Limit2_Truncated(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[a]",                    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[a;b]",                  invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[a;b;‥]",                invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_3Limit_truncated_arguments")
        @DisplayName("separator + limit 3 + truncated") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Limit3_Truncated extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Limit3_Truncated(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[a]",                    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[a;b]",                  invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[a;b;c;‥]",              invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_4Limit_truncated_arguments")
        @DisplayName("separator + limit 4 + truncated") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Limit4_Truncated extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Limit4_Truncated(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[a]",                    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[a;b]",                  invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[a;b;c;d]",              invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_nullLimit_truncated_arguments")
        @DisplayName("separator + postfix + truncated") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Postfix_Truncated extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Postfix_Truncated(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>",        invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[a>",       invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[a;b>",     invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[a;b;c;d>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_0Limit_truncated_arguments")
        @DisplayName("separator + postfix + limit 0 + truncated") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Postfix_Limit0_Truncated extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Postfix_Limit0_Truncated(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>", invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[>", invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[>", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_1Limit_truncated_arguments")
        @DisplayName("separator + postfix + limit 1 + truncated") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Postfix_Limit1_Truncated extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Postfix_Limit1_Truncated(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>",    invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[a>",   invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[a;‥>", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[a;‥>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_2Limit_truncated_arguments")
        @DisplayName("separator + postfix + limit 2 + truncated") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Postfix_Limit2_Truncated extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Postfix_Limit2_Truncated(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>",      invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[a>",     invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[a;b>",   invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[a;b;‥>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_3Limit_truncated_arguments")
        @DisplayName("separator + postfix + limit 3 + truncated") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Postfix_Limit3_Truncated extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Postfix_Limit3_Truncated(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>",        invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[a>",       invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[a;b>",     invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[a;b;c;‥>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_4Limit_truncated_arguments")
        @DisplayName("separator + postfix + limit 4 + truncated") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Postfix_Limit4_Truncated extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Postfix_Limit4_Truncated(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>",        invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[a>",       invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[a;b>",     invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[a;b;c;d>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_nullLimit_truncated_arguments")
        @DisplayName("separator + prefix + truncated") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Truncated extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Truncated(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]",        invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<a]",       invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<a;b]",     invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<a;b;c;d]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_0Limit_truncated_arguments")
        @DisplayName("separator + prefix + limit 0 + truncated") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Limit0_Truncated extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Limit0_Truncated(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]", invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<]", invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<]", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_1Limit_truncated_arguments")
        @DisplayName("separator + prefix + limit 1 + truncated") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Limit1_Truncated extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Limit1_Truncated(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]",    invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<a]",   invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<a;‥]", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<a;‥]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_2Limit_truncated_arguments")
        @DisplayName("separator + prefix + limit 2 + truncated") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Limit2_Truncated extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Limit2_Truncated(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]",      invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<a]",     invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<a;b]",   invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<a;b;‥]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_3Limit_truncated_arguments")
        @DisplayName("separator + prefix + limit 3 + truncated") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Limit3_Truncated extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Limit3_Truncated(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]",        invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<a]",       invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<a;b]",     invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<a;b;c;‥]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_4Limit_truncated_arguments")
        @DisplayName("separator + prefix + limit 4 + truncated") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Limit4_Truncated extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Limit4_Truncated(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]",        invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<a]",       invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<a;b]",     invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<a;b;c;d]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_nullLimit_truncated_arguments")
        @DisplayName("separator + prefix + postfix + truncated") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Postfix_Truncated extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Postfix_Truncated(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>",        invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{a>",       invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{a;b>",     invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{a;b;c;d>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_0Limit_truncated_arguments")
        @DisplayName("separator + prefix + postfix + limit 0 + truncated") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Postfix_Limit0_Truncated extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Postfix_Limit0_Truncated(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>", invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{>", invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{>", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_1Limit_truncated_arguments")
        @DisplayName("separator + prefix + postfix + limit 1 + truncated") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Postfix_Limit1_Truncated extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Postfix_Limit1_Truncated(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>",    invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{a>",   invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{a;‥>", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{a;‥>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_2Limit_truncated_arguments")
        @DisplayName("separator + prefix + postfix + limit 2 + truncated") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Postfix_Limit2_Truncated extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Postfix_Limit2_Truncated(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>",      invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{a>",     invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{a;b>",   invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{a;b;‥>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_3Limit_truncated_arguments")
        @DisplayName("separator + prefix + postfix + limit 3 + truncated") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Postfix_Limit3_Truncated extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Postfix_Limit3_Truncated(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>",        invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{a>",       invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{a;b>",     invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{a;b;c;‥>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_4Limit_truncated_arguments")
        @DisplayName("separator + prefix + postfix + limit 4 + truncated") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Postfix_Limit4_Truncated extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Postfix_Limit4_Truncated(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>",        invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{a>",       invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{a;b>",     invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{a;b;c;d>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }

        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_nullLimit_nullTruncated_nullTransform_arguments")
        @DisplayName("null transform") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class NullTransform extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public NullTransform(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[a]",                    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[a, b]",                 invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[a, b, c, d]",           invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }

        }

        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_nullLimit_nullTruncated_0Transform_arguments")
        @DisplayName("transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[E]",                    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[E, E]",                 invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[E, E, E, E]",           invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_nullLimit_truncated_0Transform_arguments")
        @DisplayName("truncated + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Truncated_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Truncated_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[E]",                    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[E, E]",                 invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[E, E, E, E]",           invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_0Limit_nullTruncated_0Transform_arguments")
        @DisplayName("limit 0 + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Limit0_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Limit0_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_1Limit_nullTruncated_0Transform_arguments")
        @DisplayName("limit 1 + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Limit1_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Limit1_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[E]",                    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[E, …]",                 invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[E, …]",           invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_2Limit_nullTruncated_0Transform_arguments")
        @DisplayName("limit 2 + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Limit2_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Limit2_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[E]",                    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[E, E]",                 invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[E, E, …]",           invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_3Limit_nullTruncated_0Transform_arguments")
        @DisplayName("limit 3 + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Limit3_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Limit3_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[E]",                    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[E, E]",                 invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[E, E, E, …]",           invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_4Limit_nullTruncated_0Transform_arguments")
        @DisplayName("limit 4 + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Limit4_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Limit4_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[E]",                    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[E, E]",                 invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[E, E, E, E]",           invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_0Limit_truncated_0Transform_arguments")
        @DisplayName("limit 0 + truncated + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Limit0_Truncated_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Limit0_Truncated_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_1Limit_truncated_0Transform_arguments")
        @DisplayName("limit 1 + truncated + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Limit1_Truncated_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Limit1_Truncated_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[E]",                    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[E, ‥]",                 invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[E, ‥]",           invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_2Limit_truncated_0Transform_arguments")
        @DisplayName("limit 2 + truncated + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Limit2_Truncated_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Limit2_Truncated_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[E]",                    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[E, E]",                 invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[E, E, ‥]",           invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_3Limit_truncated_0Transform_arguments")
        @DisplayName("limit 3 + truncated + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Limit3_Truncated_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Limit3_Truncated_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[E]",                    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[E, E]",                 invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[E, E, E, ‥]",           invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_4Limit_truncated_0Transform_arguments")
        @DisplayName("limit 4 + truncated + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Limit4_Truncated_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Limit4_Truncated_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[E]",                    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[E, E]",                 invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[E, E, E, E]",           invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_nullLimit_nullTruncated_0Transform_arguments")
        @DisplayName("postfix + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Postfix_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Postfix_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>",           invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[E>",          invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[E, E>",       invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[E, E, E, E>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_nullLimit_truncated_0Transform_arguments")
        @DisplayName("postfix + truncated + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Postfix_Truncated_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Postfix_Truncated_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>",           invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[E>",          invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[E, E>",       invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[E, E, E, E>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_0Limit_nullTruncated_0Transform_arguments")
        @DisplayName("postfix + limit 0 + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Postfix_Limit0_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Postfix_Limit0_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>", invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[>", invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[>", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_1Limit_nullTruncated_0Transform_arguments")
        @DisplayName("postfix + limit 1 + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Postfix_Limit1_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Postfix_Limit1_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>",     invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[E>",    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[E, …>", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[E, …>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_2Limit_nullTruncated_0Transform_arguments")
        @DisplayName("postfix + limit 2 + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Postfix_Limit2_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Postfix_Limit2_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>",        invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[E>",       invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[E, E>",    invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[E, E, …>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_3Limit_nullTruncated_0Transform_arguments")
        @DisplayName("postfix + limit 3 + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Postfix_Limit3_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Postfix_Limit3_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>",           invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[E>",          invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[E, E>",       invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[E, E, E, …>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_4Limit_nullTruncated_0Transform_arguments")
        @DisplayName("postfix + limit 4 + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Postfix_Limit4_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Postfix_Limit4_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>",           invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[E>",          invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[E, E>",       invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[E, E, E, E>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_0Limit_truncated_0Transform_arguments")
        @DisplayName("postfix + limit 0 + truncated + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Postfix_Limit0_Truncated_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Postfix_Limit0_Truncated_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>", invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[>", invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[>", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_1Limit_truncated_0Transform_arguments")
        @DisplayName("postfix + limit 1 + truncated + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Postfix_Limit1_Truncated_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Postfix_Limit1_Truncated_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>",     invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[E>",    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[E, ‥>", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[E, ‥>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_2Limit_truncated_0Transform_arguments")
        @DisplayName("postfix + limit 2 + truncated + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Postfix_Limit2_Truncated_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Postfix_Limit2_Truncated_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>",        invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[E>",       invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[E, E>",    invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[E, E, ‥>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_3Limit_truncated_0Transform_arguments")
        @DisplayName("postfix + limit 3 + truncated + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Postfix_Limit3_Truncated_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Postfix_Limit3_Truncated_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>",           invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[E>",          invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[E, E>",       invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[E, E, E, ‥>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_4Limit_truncated_0Transform_arguments")
        @DisplayName("postfix + limit 4 + truncated + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Postfix_Limit4_Truncated_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Postfix_Limit4_Truncated_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>",           invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[E>",          invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[E, E>",       invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[E, E, E, E>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_nullLimit_nullTruncated_0Transform_arguments")
        @DisplayName("prefix + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]",           invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<E]",          invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<E, E]",       invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<E, E, E, E]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_nullLimit_truncated_0Transform_arguments")
        @DisplayName("prefix + truncated + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Truncated_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Truncated_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]",           invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<E]",          invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<E, E]",       invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<E, E, E, E]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_0Limit_nullTruncated_0Transform_arguments")
        @DisplayName("prefix + limit 0 + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Limit0_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Limit0_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]", invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<]", invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<]", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_1Limit_nullTruncated_0Transform_arguments")
        @DisplayName("prefix + limit 1 + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Limit1_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Limit1_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]",     invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<E]",    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<E, …]", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<E, …]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_2Limit_nullTruncated_0Transform_arguments")
        @DisplayName("prefix + limit 2 + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Limit2_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Limit2_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]",        invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<E]",       invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<E, E]",    invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<E, E, …]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_3Limit_nullTruncated_0Transform_arguments")
        @DisplayName("prefix + limit 3 + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Limit3_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Limit3_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]",           invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<E]",          invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<E, E]",       invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<E, E, E, …]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_4Limit_nullTruncated_0Transform_arguments")
        @DisplayName("prefix + limit 4 + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Limit4_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Limit4_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]",           invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<E]",          invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<E, E]",       invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<E, E, E, E]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_0Limit_truncated_0Transform_arguments")
        @DisplayName("prefix + limit 0 + truncated + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Limit0_Truncated_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Limit0_Truncated_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]", invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<]", invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<]", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_1Limit_truncated_0Transform_arguments")
        @DisplayName("prefix + limit 1 + truncated + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Limit1_Truncated_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Limit1_Truncated_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]",     invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<E]",    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<E, ‥]", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<E, ‥]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_2Limit_truncated_0Transform_arguments")
        @DisplayName("prefix + limit 2 + truncated + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Limit2_Truncated_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Limit2_Truncated_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]",        invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<E]",       invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<E, E]",    invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<E, E, ‥]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_3Limit_truncated_0Transform_arguments")
        @DisplayName("prefix + limit 3 + truncated + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Limit3_Truncated_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Limit3_Truncated_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]",           invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<E]",          invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<E, E]",       invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<E, E, E, ‥]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_4Limit_truncated_0Transform_arguments")
        @DisplayName("prefix + limit 4 + truncated + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Limit4_Truncated_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Limit4_Truncated_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]",           invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<E]",          invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<E, E]",       invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<E, E, E, E]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_nullLimit_nullTruncated_0Transform_arguments")
        @DisplayName("prefix + postfix + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Postfix_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Postfix_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>",           invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{E>",          invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{E, E>",       invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{E, E, E, E>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_nullLimit_truncated_0Transform_arguments")
        @DisplayName("prefix + postfix + truncated + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Postfix_Truncated_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Postfix_Truncated_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>",           invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{E>",          invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{E, E>",       invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{E, E, E, E>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_0Limit_nullTruncated_0Transform_arguments")
        @DisplayName("prefix + postfix + limit 0 + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Postfix_Limit0_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Postfix_Limit0_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>", invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{>", invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{>", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_1Limit_nullTruncated_0Transform_arguments")
        @DisplayName("prefix + postfix + limit 1 + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Postfix_Limit1_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Postfix_Limit1_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>",     invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{E>",    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{E, …>", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{E, …>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_2Limit_nullTruncated_0Transform_arguments")
        @DisplayName("prefix + postfix + limit 2 + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Postfix_Limit2_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Postfix_Limit2_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>",        invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{E>",       invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{E, E>",    invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{E, E, …>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_3Limit_nullTruncated_0Transform_arguments")
        @DisplayName("prefix + postfix + limit 3 + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Postfix_Limit3_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Postfix_Limit3_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>",           invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{E>",          invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{E, E>",       invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{E, E, E, …>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_4Limit_nullTruncated_0Transform_arguments")
        @DisplayName("prefix + postfix + limit 4 + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Postfix_Limit4_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Postfix_Limit4_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>",           invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{E>",          invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{E, E>",       invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{E, E, E, E>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_0Limit_truncated_0Transform_arguments")
        @DisplayName("prefix + postfix + limit 0 + truncated + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Postfix_Limit0_Truncated_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Postfix_Limit0_Truncated_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>", invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{>", invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{>", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_1Limit_truncated_0Transform_arguments")
        @DisplayName("prefix + postfix + limit 1 + truncated + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Postfix_Limit1_Truncated_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Postfix_Limit1_Truncated_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>",     invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{E>",    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{E, ‥>", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{E, ‥>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_2Limit_truncated_0Transform_arguments")
        @DisplayName("prefix + postfix + limit 2 + truncated + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Postfix_Limit2_Truncated_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Postfix_Limit2_Truncated_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>",        invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{E>",       invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{E, E>",    invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{E, E, ‥>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_3Limit_truncated_0Transform_arguments")
        @DisplayName("prefix + postfix + limit 3 + truncated + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Postfix_Limit3_Truncated_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Postfix_Limit3_Truncated_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>",           invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{E>",          invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{E, E>",       invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{E, E, E, ‥>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_4Limit_truncated_0Transform_arguments")
        @DisplayName("prefix + postfix + limit 4 + truncated + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Postfix_Limit4_Truncated_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Postfix_Limit4_Truncated_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>",           invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{E>",          invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{E, E>",       invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{E, E, E, E>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_nullLimit_nullTruncated_0Transform_arguments")
        @DisplayName("separator + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[E]",                    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[E;E]",                  invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[E;E;E;E]",              invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_nullLimit_truncated_0Transform_arguments")
        @DisplayName("separator + truncated + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Truncated_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Truncated_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[E]",                    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[E;E]",                  invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[E;E;E;E]",              invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_0Limit_nullTruncated_0Transform_arguments")
        @DisplayName("separator + limit 0 + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Limit0_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Limit0_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_1Limit_nullTruncated_0Transform_arguments")
        @DisplayName("separator + limit 1 + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Limit1_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Limit1_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[E]",                    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[E;…]",                  invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[E;…]",            invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_2Limit_nullTruncated_0Transform_arguments")
        @DisplayName("separator + limit 2 + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Limit2_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Limit2_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[E]",                    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[E;E]",                  invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[E;E;…]",             invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_3Limit_nullTruncated_0Transform_arguments")
        @DisplayName("separator + limit 3 + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Limit3_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Limit3_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[E]",                    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[E;E]",                  invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[E;E;E;…]",              invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_4Limit_nullTruncated_0Transform_arguments")
        @DisplayName("separator + limit 4 + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Limit4_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Limit4_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[E]",                    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[E;E]",                  invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[E;E;E;E]",              invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_0Limit_truncated_0Transform_arguments")
        @DisplayName("separator + limit 0 + truncated + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Limit0_Truncated_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Limit0_Truncated_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_1Limit_truncated_0Transform_arguments")
        @DisplayName("separator + limit 1 + truncated + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Limit1_Truncated_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Limit1_Truncated_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[E]",                    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[E;‥]",                  invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[E;‥]",                  invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_2Limit_truncated_0Transform_arguments")
        @DisplayName("separator + limit 2 + truncated + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Limit2_Truncated_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Limit2_Truncated_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[E]",                    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[E;E]",                  invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[E;E;‥]",                invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_3Limit_truncated_0Transform_arguments")
        @DisplayName("separator + limit 3 + truncated + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Limit3_Truncated_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Limit3_Truncated_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[E]",                    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[E;E]",                  invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[E;E;E;‥]",             invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_4Limit_truncated_0Transform_arguments")
        @DisplayName("separator + limit 4 + truncated + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Limit4_Truncated_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Limit4_Truncated_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[E]",                    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[E;E]",                  invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[E;E;E;E]",              invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_nullLimit_nullTruncated_0Transform_arguments")
        @DisplayName("separator + postfix + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Postfix_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Postfix_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>",        invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[E>",       invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[E;E>",     invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[E;E;E;E>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_nullLimit_truncated_0Transform_arguments")
        @DisplayName("separator + postfix + truncated + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Postfix_Truncated_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Postfix_Truncated_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>",        invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[E>",       invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[E;E>",     invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[E;E;E;E>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_0Limit_nullTruncated_0Transform_arguments")
        @DisplayName("separator + postfix + limit 0 + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Postfix_Limit0_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Postfix_Limit0_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>", invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[>", invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[>", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_1Limit_nullTruncated_0Transform_arguments")
        @DisplayName("separator + postfix + limit 1 + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Postfix_Limit1_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Postfix_Limit1_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>",    invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[E>",   invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[E;…>", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[E;…>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_2Limit_nullTruncated_0Transform_arguments")
        @DisplayName("separator + postfix + limit 2 + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Postfix_Limit2_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Postfix_Limit2_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>",      invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[E>",     invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[E;E>",   invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[E;E;…>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_3Limit_nullTruncated_0Transform_arguments")
        @DisplayName("separator + postfix + limit 3 + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Postfix_Limit3_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Postfix_Limit3_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>",        invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[E>",       invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[E;E>",     invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[E;E;E;…>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_4Limit_nullTruncated_0Transform_arguments")
        @DisplayName("separator + postfix + limit 4 + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Postfix_Limit4_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Postfix_Limit4_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>",        invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[E>",       invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[E;E>",     invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[E;E;E;E>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_0Limit_truncated_0Transform_arguments")
        @DisplayName("separator + postfix + limit 0 + truncated + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Postfix_Limit0_Truncated_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Postfix_Limit0_Truncated_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>", invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[>", invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[>", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_1Limit_truncated_0Transform_arguments")
        @DisplayName("separator + postfix + limit 1 + truncated + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Postfix_Limit1_Truncated_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Postfix_Limit1_Truncated_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>",    invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[E>",   invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[E;‥>", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[E;‥>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_2Limit_truncated_0Transform_arguments")
        @DisplayName("separator + postfix + limit 2 + truncated + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Postfix_Limit2_Truncated_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Postfix_Limit2_Truncated_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>",      invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[E>",     invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[E;E>",   invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[E;E;‥>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_3Limit_truncated_0Transform_arguments")
        @DisplayName("separator + postfix + limit 3 + truncated + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Postfix_Limit3_Truncated_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Postfix_Limit3_Truncated_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>",        invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[E>",       invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[E;E>",     invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[E;E;E;‥>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_4Limit_truncated_0Transform_arguments")
        @DisplayName("separator + postfix + limit 4 + truncated + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Postfix_Limit4_Truncated_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Postfix_Limit4_Truncated_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>",        invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[E>",       invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[E;E>",     invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[E;E;E;E>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_nullLimit_nullTruncated_0Transform_arguments")
        @DisplayName("separator + prefix + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]",        invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<E]",       invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<E;E]",     invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<E;E;E;E]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_nullLimit_truncated_0Transform_arguments")
        @DisplayName("separator + prefix + truncated + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Truncated_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Truncated_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]",        invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<E]",       invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<E;E]",     invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<E;E;E;E]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_0Limit_nullTruncated_0Transform_arguments")
        @DisplayName("separator + prefix + limit 0 + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Limit0_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Limit0_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]", invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<]", invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<]", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_1Limit_nullTruncated_0Transform_arguments")
        @DisplayName("separator + prefix + limit 1 + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Limit1_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Limit1_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]",    invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<E]",   invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<E;…]", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<E;…]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_2Limit_nullTruncated_0Transform_arguments")
        @DisplayName("separator + prefix + limit 2 + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Limit2_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Limit2_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]",      invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<E]",     invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<E;E]",   invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<E;E;…]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_3Limit_nullTruncated_0Transform_arguments")
        @DisplayName("separator + prefix + limit 3 + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Limit3_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Limit3_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]",        invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<E]",       invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<E;E]",     invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<E;E;E;…]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_4Limit_nullTruncated_0Transform_arguments")
        @DisplayName("separator + prefix + limit 4 + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Limit4_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Limit4_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]",        invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<E]",       invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<E;E]",     invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<E;E;E;E]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_0Limit_truncated_0Transform_arguments")
        @DisplayName("separator + prefix + limit 0 + truncated + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Limit0_Truncated_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Limit0_Truncated_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]", invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<]", invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<]", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_1Limit_truncated_0Transform_arguments")
        @DisplayName("separator + prefix + limit 1 + truncated + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Limit1_Truncated_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Limit1_Truncated_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]",    invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<E]",   invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<E;‥]", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<E;‥]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_2Limit_truncated_0Transform_arguments")
        @DisplayName("separator + prefix + limit 2 + truncated + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Limit2_Truncated_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Limit2_Truncated_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]",      invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<E]",     invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<E;E]",   invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<E;E;‥]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_3Limit_truncated_0Transform_arguments")
        @DisplayName("separator + prefix + limit 3 + truncated + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Limit3_Truncated_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Limit3_Truncated_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]",        invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<E]",       invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<E;E]",     invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<E;E;E;‥]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_4Limit_truncated_0Transform_arguments")
        @DisplayName("separator + prefix + limit 4 + truncated + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Limit4_Truncated_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Limit4_Truncated_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]",        invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<E]",       invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<E;E]",     invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<E;E;E;E]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_nullLimit_nullTruncated_0Transform_arguments")
        @DisplayName("separator + prefix + postfix + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Postfix_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Postfix_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>",        invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{E>",       invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{E;E>",     invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{E;E;E;E>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_nullLimit_truncated_0Transform_arguments")
        @DisplayName("separator + prefix + postfix + truncated + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Postfix_Truncated_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Postfix_Truncated_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>",        invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{E>",       invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{E;E>",     invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{E;E;E;E>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_0Limit_nullTruncated_0Transform_arguments")
        @DisplayName("separator + prefix + postfix + limit 0 + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Postfix_Limit0_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Postfix_Limit0_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>", invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{>", invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{>", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_1Limit_nullTruncated_0Transform_arguments")
        @DisplayName("separator + prefix + postfix + limit 1 + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Postfix_Limit1_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Postfix_Limit1_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>",    invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{E>",   invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{E;…>", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{E;…>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_2Limit_nullTruncated_0Transform_arguments")
        @DisplayName("separator + prefix + postfix + limit 2 + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Postfix_Limit2_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Postfix_Limit2_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>",      invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{E>",     invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{E;E>",   invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{E;E;…>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_3Limit_nullTruncated_0Transform_arguments")
        @DisplayName("separator + prefix + postfix + limit 3 + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Postfix_Limit3_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Postfix_Limit3_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>",        invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{E>",       invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{E;E>",     invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{E;E;E;…>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_4Limit_nullTruncated_0Transform_arguments")
        @DisplayName("separator + prefix + postfix + limit 4 + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Postfix_Limit4_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Postfix_Limit4_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>",        invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{E>",       invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{E;E>",     invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{E;E;E;E>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_0Limit_truncated_0Transform_arguments")
        @DisplayName("separator + prefix + postfix + limit 0 + truncated + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Postfix_Limit0_Truncated_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Postfix_Limit0_Truncated_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>", invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{>", invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{>", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_1Limit_truncated_0Transform_arguments")
        @DisplayName("separator + prefix + postfix + limit 1 + truncated + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Postfix_Limit1_Truncated_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Postfix_Limit1_Truncated_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>",    invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{E>",   invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{E;‥>", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{E;‥>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_2Limit_truncated_0Transform_arguments")
        @DisplayName("separator + prefix + postfix + limit 2 + truncated + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Postfix_Limit2_Truncated_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Postfix_Limit2_Truncated_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>",      invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{E>",     invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{E;E>",   invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{E;E;‥>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_3Limit_truncated_0Transform_arguments")
        @DisplayName("separator + prefix + postfix + limit 3 + truncated + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Postfix_Limit3_Truncated_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Postfix_Limit3_Truncated_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>",        invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{E>",       invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{E;E>",     invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{E;E;E;‥>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_4Limit_truncated_0Transform_arguments")
        @DisplayName("separator + prefix + postfix + limit 4 + truncated + transform () → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Postfix_Limit4_Truncated_Transform0 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Postfix_Limit4_Truncated_Transform0(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>",        invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{E>",       invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{E;E>",     invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{E;E;E;E>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }

        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_nullLimit_nullTruncated_1Transform_arguments")
        @DisplayName("transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[A]",                    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[A, B]",                 invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[A, B, C, D]",           invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_nullLimit_truncated_1Transform_arguments")
        @DisplayName("truncated + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Truncated_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Truncated_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[A]",                    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[A, B]",                 invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[A, B, C, D]",           invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_0Limit_nullTruncated_1Transform_arguments")
        @DisplayName("limit 0 + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Limit0_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Limit0_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_1Limit_nullTruncated_1Transform_arguments")
        @DisplayName("limit 1 + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Limit1_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Limit1_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[A]",                    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[A, …]",                 invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[A, …]",           invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_2Limit_nullTruncated_1Transform_arguments")
        @DisplayName("limit 2 + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Limit2_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Limit2_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[A]",                    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[A, B]",                 invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[A, B, …]",           invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_3Limit_nullTruncated_1Transform_arguments")
        @DisplayName("limit 3 + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Limit3_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Limit3_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[A]",                    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[A, B]",                 invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[A, B, C, …]",           invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_4Limit_nullTruncated_1Transform_arguments")
        @DisplayName("limit 4 + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Limit4_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Limit4_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[A]",                    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[A, B]",                 invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[A, B, C, D]",           invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_0Limit_truncated_1Transform_arguments")
        @DisplayName("limit 0 + truncated + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Limit0_Truncated_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Limit0_Truncated_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_1Limit_truncated_1Transform_arguments")
        @DisplayName("limit 1 + truncated + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Limit1_Truncated_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Limit1_Truncated_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[A]",                    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[A, ‥]",                 invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[A, ‥]",           invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_2Limit_truncated_1Transform_arguments")
        @DisplayName("limit 2 + truncated + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Limit2_Truncated_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Limit2_Truncated_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[A]",                    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[A, B]",                 invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[A, B, ‥]",           invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_3Limit_truncated_1Transform_arguments")
        @DisplayName("limit 3 + truncated + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Limit3_Truncated_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Limit3_Truncated_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[A]",                    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[A, B]",                 invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[A, B, C, ‥]",           invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_4Limit_truncated_1Transform_arguments")
        @DisplayName("limit 4 + truncated + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Limit4_Truncated_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Limit4_Truncated_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[A]",                    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[A, B]",                 invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[A, B, C, D]",           invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_nullLimit_nullTruncated_1Transform_arguments")
        @DisplayName("postfix + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Postfix_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Postfix_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>",           invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[A>",          invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[A, B>",       invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[A, B, C, D>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_nullLimit_truncated_1Transform_arguments")
        @DisplayName("postfix + truncated + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Postfix_Truncated_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Postfix_Truncated_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>",           invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[A>",          invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[A, B>",       invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[A, B, C, D>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_0Limit_nullTruncated_1Transform_arguments")
        @DisplayName("postfix + limit 0 + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Postfix_Limit0_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Postfix_Limit0_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>", invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[>", invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[>", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_1Limit_nullTruncated_1Transform_arguments")
        @DisplayName("postfix + limit 1 + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Postfix_Limit1_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Postfix_Limit1_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>",     invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[A>",    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[A, …>", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[A, …>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_2Limit_nullTruncated_1Transform_arguments")
        @DisplayName("postfix + limit 2 + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Postfix_Limit2_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Postfix_Limit2_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>",        invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[A>",       invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[A, B>",    invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[A, B, …>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_3Limit_nullTruncated_1Transform_arguments")
        @DisplayName("postfix + limit 3 + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Postfix_Limit3_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Postfix_Limit3_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>",           invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[A>",          invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[A, B>",       invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[A, B, C, …>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_4Limit_nullTruncated_1Transform_arguments")
        @DisplayName("postfix + limit 4 + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Postfix_Limit4_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Postfix_Limit4_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>",           invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[A>",          invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[A, B>",       invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[A, B, C, D>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_0Limit_truncated_1Transform_arguments")
        @DisplayName("postfix + limit 0 + truncated + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Postfix_Limit0_Truncated_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Postfix_Limit0_Truncated_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>", invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[>", invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[>", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_1Limit_truncated_1Transform_arguments")
        @DisplayName("postfix + limit 1 + truncated + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Postfix_Limit1_Truncated_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Postfix_Limit1_Truncated_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>",     invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[A>",    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[A, ‥>", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[A, ‥>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_2Limit_truncated_1Transform_arguments")
        @DisplayName("postfix + limit 2 + truncated + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Postfix_Limit2_Truncated_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Postfix_Limit2_Truncated_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>",        invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[A>",       invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[A, B>",    invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[A, B, ‥>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_3Limit_truncated_1Transform_arguments")
        @DisplayName("postfix + limit 3 + truncated + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Postfix_Limit3_Truncated_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Postfix_Limit3_Truncated_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>",           invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[A>",          invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[A, B>",       invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[A, B, C, ‥>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_4Limit_truncated_1Transform_arguments")
        @DisplayName("postfix + limit 4 + truncated + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Postfix_Limit4_Truncated_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Postfix_Limit4_Truncated_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>",           invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[A>",          invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[A, B>",       invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[A, B, C, D>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_nullLimit_nullTruncated_1Transform_arguments")
        @DisplayName("prefix + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]",           invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<A]",          invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<A, B]",       invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<A, B, C, D]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_nullLimit_truncated_1Transform_arguments")
        @DisplayName("prefix + truncated + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Truncated_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Truncated_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]",           invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<A]",          invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<A, B]",       invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<A, B, C, D]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_0Limit_nullTruncated_1Transform_arguments")
        @DisplayName("prefix + limit 0 + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Limit0_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Limit0_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]", invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<]", invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<]", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_1Limit_nullTruncated_1Transform_arguments")
        @DisplayName("prefix + limit 1 + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Limit1_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Limit1_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]",     invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<A]",    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<A, …]", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<A, …]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_2Limit_nullTruncated_1Transform_arguments")
        @DisplayName("prefix + limit 2 + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Limit2_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Limit2_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]",        invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<A]",       invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<A, B]",    invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<A, B, …]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_3Limit_nullTruncated_1Transform_arguments")
        @DisplayName("prefix + limit 3 + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Limit3_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Limit3_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]",           invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<A]",          invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<A, B]",       invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<A, B, C, …]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_4Limit_nullTruncated_1Transform_arguments")
        @DisplayName("prefix + limit 4 + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Limit4_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Limit4_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]",           invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<A]",          invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<A, B]",       invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<A, B, C, D]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_0Limit_truncated_1Transform_arguments")
        @DisplayName("prefix + limit 0 + truncated + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Limit0_Truncated_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Limit0_Truncated_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]", invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<]", invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<]", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_1Limit_truncated_1Transform_arguments")
        @DisplayName("prefix + limit 1 + truncated + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Limit1_Truncated_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Limit1_Truncated_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]",     invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<A]",    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<A, ‥]", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<A, ‥]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_2Limit_truncated_1Transform_arguments")
        @DisplayName("prefix + limit 2 + truncated + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Limit2_Truncated_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Limit2_Truncated_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]",        invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<A]",       invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<A, B]",    invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<A, B, ‥]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_3Limit_truncated_1Transform_arguments")
        @DisplayName("prefix + limit 3 + truncated + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Limit3_Truncated_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Limit3_Truncated_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]",           invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<A]",          invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<A, B]",       invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<A, B, C, ‥]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_4Limit_truncated_1Transform_arguments")
        @DisplayName("prefix + limit 4 + truncated + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Limit4_Truncated_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Limit4_Truncated_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]",           invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<A]",          invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<A, B]",       invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<A, B, C, D]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_nullLimit_nullTruncated_1Transform_arguments")
        @DisplayName("prefix + postfix + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Postfix_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Postfix_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>",           invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{A>",          invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{A, B>",       invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{A, B, C, D>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_nullLimit_truncated_1Transform_arguments")
        @DisplayName("prefix + postfix + truncated + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Postfix_Truncated_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Postfix_Truncated_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>",           invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{A>",          invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{A, B>",       invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{A, B, C, D>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_0Limit_nullTruncated_1Transform_arguments")
        @DisplayName("prefix + postfix + limit 0 + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Postfix_Limit0_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Postfix_Limit0_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>", invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{>", invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{>", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_1Limit_nullTruncated_1Transform_arguments")
        @DisplayName("prefix + postfix + limit 1 + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Postfix_Limit1_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Postfix_Limit1_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>",     invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{A>",    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{A, …>", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{A, …>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_2Limit_nullTruncated_1Transform_arguments")
        @DisplayName("prefix + postfix + limit 2 + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Postfix_Limit2_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Postfix_Limit2_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>",        invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{A>",       invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{A, B>",    invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{A, B, …>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_3Limit_nullTruncated_1Transform_arguments")
        @DisplayName("prefix + postfix + limit 3 + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Postfix_Limit3_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Postfix_Limit3_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>",           invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{A>",          invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{A, B>",       invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{A, B, C, …>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_4Limit_nullTruncated_1Transform_arguments")
        @DisplayName("prefix + postfix + limit 4 + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Postfix_Limit4_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Postfix_Limit4_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>",           invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{A>",          invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{A, B>",       invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{A, B, C, D>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_0Limit_truncated_1Transform_arguments")
        @DisplayName("prefix + postfix + limit 0 + truncated + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Postfix_Limit0_Truncated_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Postfix_Limit0_Truncated_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>", invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{>", invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{>", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_1Limit_truncated_1Transform_arguments")
        @DisplayName("prefix + postfix + limit 1 + truncated + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Postfix_Limit1_Truncated_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Postfix_Limit1_Truncated_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>",     invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{A>",    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{A, ‥>", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{A, ‥>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_2Limit_truncated_1Transform_arguments")
        @DisplayName("prefix + postfix + limit 2 + truncated + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Postfix_Limit2_Truncated_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Postfix_Limit2_Truncated_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>",        invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{A>",       invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{A, B>",    invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{A, B, ‥>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_3Limit_truncated_1Transform_arguments")
        @DisplayName("prefix + postfix + limit 3 + truncated + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Postfix_Limit3_Truncated_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Postfix_Limit3_Truncated_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>",           invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{A>",          invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{A, B>",       invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{A, B, C, ‥>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_4Limit_truncated_1Transform_arguments")
        @DisplayName("prefix + postfix + limit 4 + truncated + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Postfix_Limit4_Truncated_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Postfix_Limit4_Truncated_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>",           invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{A>",          invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{A, B>",       invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{A, B, C, D>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_nullLimit_nullTruncated_1Transform_arguments")
        @DisplayName("separator + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[A]",                    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[A;B]",                  invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[A;B;C;D]",              invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_nullLimit_truncated_1Transform_arguments")
        @DisplayName("separator + truncated + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Truncated_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Truncated_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[A]",                    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[A;B]",                  invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[A;B;C;D]",              invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_0Limit_nullTruncated_1Transform_arguments")
        @DisplayName("separator + limit 0 + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Limit0_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Limit0_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_1Limit_nullTruncated_1Transform_arguments")
        @DisplayName("separator + limit 1 + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Limit1_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Limit1_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[A]",                    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[A;…]",                  invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[A;…]",            invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_2Limit_nullTruncated_1Transform_arguments")
        @DisplayName("separator + limit 2 + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Limit2_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Limit2_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[A]",                    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[A;B]",                  invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[A;B;…]",             invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_3Limit_nullTruncated_1Transform_arguments")
        @DisplayName("separator + limit 3 + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Limit3_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Limit3_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[A]",                    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[A;B]",                  invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[A;B;C;…]",              invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_4Limit_nullTruncated_1Transform_arguments")
        @DisplayName("separator + limit 4 + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Limit4_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Limit4_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[A]",                    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[A;B]",                  invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[A;B;C;D]",              invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_0Limit_truncated_1Transform_arguments")
        @DisplayName("separator + limit 0 + truncated + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Limit0_Truncated_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Limit0_Truncated_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_1Limit_truncated_1Transform_arguments")
        @DisplayName("separator + limit 1 + truncated + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Limit1_Truncated_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Limit1_Truncated_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[A]",                    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[A;‥]",                  invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[A;‥]",                  invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_2Limit_truncated_1Transform_arguments")
        @DisplayName("separator + limit 2 + truncated + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Limit2_Truncated_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Limit2_Truncated_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[A]",                    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[A;B]",                  invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[A;B;‥]",                invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_3Limit_truncated_1Transform_arguments")
        @DisplayName("separator + limit 3 + truncated + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Limit3_Truncated_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Limit3_Truncated_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[A]",                    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[A;B]",                  invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[A;B;C;‥]",             invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_4Limit_truncated_1Transform_arguments")
        @DisplayName("separator + limit 4 + truncated + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Limit4_Truncated_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Limit4_Truncated_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[A]",                    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[A;B]",                  invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[A;B;C;D]",              invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_nullLimit_nullTruncated_1Transform_arguments")
        @DisplayName("separator + postfix + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Postfix_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Postfix_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>",        invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[A>",       invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[A;B>",     invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[A;B;C;D>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_nullLimit_truncated_1Transform_arguments")
        @DisplayName("separator + postfix + truncated + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Postfix_Truncated_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Postfix_Truncated_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>",        invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[A>",       invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[A;B>",     invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[A;B;C;D>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_0Limit_nullTruncated_1Transform_arguments")
        @DisplayName("separator + postfix + limit 0 + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Postfix_Limit0_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Postfix_Limit0_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>", invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[>", invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[>", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_1Limit_nullTruncated_1Transform_arguments")
        @DisplayName("separator + postfix + limit 1 + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Postfix_Limit1_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Postfix_Limit1_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>",    invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[A>",   invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[A;…>", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[A;…>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_2Limit_nullTruncated_1Transform_arguments")
        @DisplayName("separator + postfix + limit 2 + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Postfix_Limit2_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Postfix_Limit2_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>",      invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[A>",     invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[A;B>",   invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[A;B;…>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_3Limit_nullTruncated_1Transform_arguments")
        @DisplayName("separator + postfix + limit 3 + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Postfix_Limit3_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Postfix_Limit3_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>",        invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[A>",       invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[A;B>",     invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[A;B;C;…>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_4Limit_nullTruncated_1Transform_arguments")
        @DisplayName("separator + postfix + limit 4 + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Postfix_Limit4_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Postfix_Limit4_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>",        invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[A>",       invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[A;B>",     invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[A;B;C;D>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_0Limit_truncated_1Transform_arguments")
        @DisplayName("separator + postfix + limit 0 + truncated + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Postfix_Limit0_Truncated_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Postfix_Limit0_Truncated_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>", invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[>", invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[>", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_1Limit_truncated_1Transform_arguments")
        @DisplayName("separator + postfix + limit 1 + truncated + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Postfix_Limit1_Truncated_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Postfix_Limit1_Truncated_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>",    invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[A>",   invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[A;‥>", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[A;‥>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_2Limit_truncated_1Transform_arguments")
        @DisplayName("separator + postfix + limit 2 + truncated + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Postfix_Limit2_Truncated_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Postfix_Limit2_Truncated_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>",      invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[A>",     invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[A;B>",   invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[A;B;‥>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_3Limit_truncated_1Transform_arguments")
        @DisplayName("separator + postfix + limit 3 + truncated + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Postfix_Limit3_Truncated_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Postfix_Limit3_Truncated_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>",        invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[A>",       invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[A;B>",     invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[A;B;C;‥>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_4Limit_truncated_1Transform_arguments")
        @DisplayName("separator + postfix + limit 4 + truncated + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Postfix_Limit4_Truncated_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Postfix_Limit4_Truncated_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>",        invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[A>",       invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[A;B>",     invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[A;B;C;D>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_nullLimit_nullTruncated_1Transform_arguments")
        @DisplayName("separator + prefix + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]",        invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<A]",       invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<A;B]",     invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<A;B;C;D]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_nullLimit_truncated_1Transform_arguments")
        @DisplayName("separator + prefix + truncated + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Truncated_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Truncated_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]",        invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<A]",       invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<A;B]",     invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<A;B;C;D]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_0Limit_nullTruncated_1Transform_arguments")
        @DisplayName("separator + prefix + limit 0 + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Limit0_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Limit0_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]", invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<]", invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<]", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_1Limit_nullTruncated_1Transform_arguments")
        @DisplayName("separator + prefix + limit 1 + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Limit1_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Limit1_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]",    invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<A]",   invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<A;…]", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<A;…]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_2Limit_nullTruncated_1Transform_arguments")
        @DisplayName("separator + prefix + limit 2 + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Limit2_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Limit2_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]",      invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<A]",     invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<A;B]",   invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<A;B;…]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_3Limit_nullTruncated_1Transform_arguments")
        @DisplayName("separator + prefix + limit 3 + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Limit3_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Limit3_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]",        invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<A]",       invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<A;B]",     invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<A;B;C;…]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_4Limit_nullTruncated_1Transform_arguments")
        @DisplayName("separator + prefix + limit 4 + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Limit4_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Limit4_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]",        invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<A]",       invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<A;B]",     invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<A;B;C;D]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_0Limit_truncated_1Transform_arguments")
        @DisplayName("separator + prefix + limit 0 + truncated + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Limit0_Truncated_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Limit0_Truncated_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]", invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<]", invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<]", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_1Limit_truncated_1Transform_arguments")
        @DisplayName("separator + prefix + limit 1 + truncated + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Limit1_Truncated_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Limit1_Truncated_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]",    invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<A]",   invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<A;‥]", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<A;‥]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_2Limit_truncated_1Transform_arguments")
        @DisplayName("separator + prefix + limit 2 + truncated + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Limit2_Truncated_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Limit2_Truncated_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]",      invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<A]",     invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<A;B]",   invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<A;B;‥]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_3Limit_truncated_1Transform_arguments")
        @DisplayName("separator + prefix + limit 3 + truncated + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Limit3_Truncated_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Limit3_Truncated_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]",        invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<A]",       invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<A;B]",     invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<A;B;C;‥]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_4Limit_truncated_1Transform_arguments")
        @DisplayName("separator + prefix + limit 4 + truncated + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Limit4_Truncated_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Limit4_Truncated_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]",        invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<A]",       invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<A;B]",     invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<A;B;C;D]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_nullLimit_nullTruncated_1Transform_arguments")
        @DisplayName("separator + prefix + postfix + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Postfix_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Postfix_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>",        invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{A>",       invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{A;B>",     invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{A;B;C;D>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_nullLimit_truncated_1Transform_arguments")
        @DisplayName("separator + prefix + postfix + truncated + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Postfix_Truncated_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Postfix_Truncated_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>",        invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{A>",       invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{A;B>",     invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{A;B;C;D>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_0Limit_nullTruncated_1Transform_arguments")
        @DisplayName("separator + prefix + postfix + limit 0 + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Postfix_Limit0_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Postfix_Limit0_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>", invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{>", invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{>", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_1Limit_nullTruncated_1Transform_arguments")
        @DisplayName("separator + prefix + postfix + limit 1 + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Postfix_Limit1_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Postfix_Limit1_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>",    invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{A>",   invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{A;…>", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{A;…>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_2Limit_nullTruncated_1Transform_arguments")
        @DisplayName("separator + prefix + postfix + limit 2 + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Postfix_Limit2_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Postfix_Limit2_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>",      invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{A>",     invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{A;B>",   invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{A;B;…>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_3Limit_nullTruncated_1Transform_arguments")
        @DisplayName("separator + prefix + postfix + limit 3 + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Postfix_Limit3_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Postfix_Limit3_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>",        invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{A>",       invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{A;B>",     invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{A;B;C;…>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_4Limit_nullTruncated_1Transform_arguments")
        @DisplayName("separator + prefix + postfix + limit 4 + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Postfix_Limit4_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Postfix_Limit4_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>",        invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{A>",       invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{A;B>",     invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{A;B;C;D>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_0Limit_truncated_1Transform_arguments")
        @DisplayName("separator + prefix + postfix + limit 0 + truncated + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Postfix_Limit0_Truncated_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Postfix_Limit0_Truncated_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>", invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{>", invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{>", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_1Limit_truncated_1Transform_arguments")
        @DisplayName("separator + prefix + postfix + limit 1 + truncated + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Postfix_Limit1_Truncated_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Postfix_Limit1_Truncated_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>",    invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{A>",   invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{A;‥>", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{A;‥>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_2Limit_truncated_1Transform_arguments")
        @DisplayName("separator + prefix + postfix + limit 2 + truncated + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Postfix_Limit2_Truncated_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Postfix_Limit2_Truncated_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>",      invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{A>",     invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{A;B>",   invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{A;B;‥>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_3Limit_truncated_1Transform_arguments")
        @DisplayName("separator + prefix + postfix + limit 3 + truncated + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Postfix_Limit3_Truncated_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Postfix_Limit3_Truncated_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>",        invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{A>",       invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{A;B>",     invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{A;B;C;‥>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_4Limit_truncated_1Transform_arguments")
        @DisplayName("separator + prefix + postfix + limit 4 + truncated + transform (T) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Postfix_Limit4_Truncated_Transform1 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Postfix_Limit4_Truncated_Transform1(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>",        invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{A>",       invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{A;B>",     invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{A;B;C;D>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }

        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_nullLimit_nullTruncated_2Transform_arguments")
        @DisplayName("transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[0:A]",                  invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[0:A, 1:B]",             invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[0:A, 1:B, 2:C, 3:D]",   invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_nullLimit_truncated_2Transform_arguments")
        @DisplayName("truncated + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Truncated_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Truncated_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[0:A]",                  invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[0:A, 1:B]",             invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[0:A, 1:B, 2:C, 3:D]",   invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_0Limit_nullTruncated_2Transform_arguments")
        @DisplayName("limit 0 + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Limit0_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Limit0_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_1Limit_nullTruncated_2Transform_arguments")
        @DisplayName("limit 1 + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Limit1_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Limit1_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[0:A]",                  invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[0:A, …]",               invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[0:A, …]",               invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_2Limit_nullTruncated_2Transform_arguments")
        @DisplayName("limit 2 + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Limit2_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Limit2_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[0:A]",                  invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[0:A, 1:B]",             invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[0:A, 1:B, …]",          invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_3Limit_nullTruncated_2Transform_arguments")
        @DisplayName("limit 3 + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Limit3_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Limit3_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[0:A]",                  invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[0:A, 1:B]",             invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[0:A, 1:B, 2:C, …]",     invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_4Limit_nullTruncated_2Transform_arguments")
        @DisplayName("limit 4 + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Limit4_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Limit4_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[0:A]",                  invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[0:A, 1:B]",             invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[0:A, 1:B, 2:C, 3:D]",   invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_0Limit_truncated_2Transform_arguments")
        @DisplayName("limit 0 + truncated + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Limit0_Truncated_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Limit0_Truncated_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_1Limit_truncated_2Transform_arguments")
        @DisplayName("limit 1 + truncated + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Limit1_Truncated_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Limit1_Truncated_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[0:A]",                  invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[0:A, ‥]",               invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[0:A, ‥]",               invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_2Limit_truncated_2Transform_arguments")
        @DisplayName("limit 2 + truncated + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Limit2_Truncated_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Limit2_Truncated_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[0:A]",                  invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[0:A, 1:B]",             invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[0:A, 1:B, ‥]",          invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_3Limit_truncated_2Transform_arguments")
        @DisplayName("limit 3 + truncated + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Limit3_Truncated_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Limit3_Truncated_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[0:A]",                  invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[0:A, 1:B]",             invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[0:A, 1:B, 2:C, ‥]",     invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_nullPostfix_4Limit_truncated_2Transform_arguments")
        @DisplayName("limit 4 + truncated + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Limit4_Truncated_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Limit4_Truncated_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[0:A]",                  invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[0:A, 1:B]",             invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[0:A, 1:B, 2:C, 3:D]",   invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_nullLimit_nullTruncated_2Transform_arguments")
        @DisplayName("postfix + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Postfix_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Postfix_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>",                   invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[0:A>",                invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[0:A, 1:B>",           invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[0:A, 1:B, 2:C, 3:D>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_nullLimit_truncated_2Transform_arguments")
        @DisplayName("postfix + truncated + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Postfix_Truncated_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Postfix_Truncated_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>",                   invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[0:A>",                invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[0:A, 1:B>",           invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[0:A, 1:B, 2:C, 3:D>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_0Limit_nullTruncated_2Transform_arguments")
        @DisplayName("postfix + limit 0 + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Postfix_Limit0_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Postfix_Limit0_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>", invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[>", invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[>", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_1Limit_nullTruncated_2Transform_arguments")
        @DisplayName("postfix + limit 1 + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Postfix_Limit1_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Postfix_Limit1_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>",       invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[0:A>",    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[0:A, …>", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[0:A, …>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_2Limit_nullTruncated_2Transform_arguments")
        @DisplayName("postfix + limit 2 + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Postfix_Limit2_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Postfix_Limit2_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>",            invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[0:A>",         invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[0:A, 1:B>",    invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[0:A, 1:B, …>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_3Limit_nullTruncated_2Transform_arguments")
        @DisplayName("postfix + limit 3 + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Postfix_Limit3_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Postfix_Limit3_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>",                 invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[0:A>",              invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[0:A, 1:B>",         invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[0:A, 1:B, 2:C, …>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_4Limit_nullTruncated_2Transform_arguments")
        @DisplayName("postfix + limit 4 + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Postfix_Limit4_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Postfix_Limit4_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>",                   invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[0:A>",                invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[0:A, 1:B>",           invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[0:A, 1:B, 2:C, 3:D>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_0Limit_truncated_2Transform_arguments")
        @DisplayName("postfix + limit 0 + truncated + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Postfix_Limit0_Truncated_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Postfix_Limit0_Truncated_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>", invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[>", invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[>", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_1Limit_truncated_2Transform_arguments")
        @DisplayName("postfix + limit 1 + truncated + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Postfix_Limit1_Truncated_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Postfix_Limit1_Truncated_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>",       invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[0:A>",    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[0:A, ‥>", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[0:A, ‥>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_2Limit_truncated_2Transform_arguments")
        @DisplayName("postfix + limit 2 + truncated + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Postfix_Limit2_Truncated_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Postfix_Limit2_Truncated_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>",            invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[0:A>",         invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[0:A, 1:B>",    invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[0:A, 1:B, ‥>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_3Limit_truncated_2Transform_arguments")
        @DisplayName("postfix + limit 3 + truncated + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Postfix_Limit3_Truncated_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Postfix_Limit3_Truncated_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>",                 invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[0:A>",              invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[0:A, 1:B>",         invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[0:A, 1:B, 2:C, ‥>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_nullPrefix_postfix_4Limit_truncated_2Transform_arguments")
        @DisplayName("postfix + limit 4 + truncated + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Postfix_Limit4_Truncated_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Postfix_Limit4_Truncated_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>",                   invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[0:A>",                invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[0:A, 1:B>",           invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[0:A, 1:B, 2:C, 3:D>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_nullLimit_nullTruncated_2Transform_arguments")
        @DisplayName("prefix + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]",                   invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<0:A]",                invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<0:A, 1:B]",           invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<0:A, 1:B, 2:C, 3:D]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_nullLimit_truncated_2Transform_arguments")
        @DisplayName("prefix + truncated + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Truncated_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Truncated_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]",                   invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<0:A]",                invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<0:A, 1:B]",           invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<0:A, 1:B, 2:C, 3:D]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_0Limit_nullTruncated_2Transform_arguments")
        @DisplayName("prefix + limit 0 + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Limit0_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Limit0_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]", invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<]", invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<]", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_1Limit_nullTruncated_2Transform_arguments")
        @DisplayName("prefix + limit 1 + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Limit1_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Limit1_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]",       invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<0:A]",    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<0:A, …]", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<0:A, …]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_2Limit_nullTruncated_2Transform_arguments")
        @DisplayName("prefix + limit 2 + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Limit2_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Limit2_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]",            invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<0:A]",         invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<0:A, 1:B]",    invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<0:A, 1:B, …]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_3Limit_nullTruncated_2Transform_arguments")
        @DisplayName("prefix + limit 3 + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Limit3_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Limit3_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]",                 invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<0:A]",              invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<0:A, 1:B]",         invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<0:A, 1:B, 2:C, …]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_4Limit_nullTruncated_2Transform_arguments")
        @DisplayName("prefix + limit 4 + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Limit4_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Limit4_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]",                   invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<0:A]",                invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<0:A, 1:B]",           invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<0:A, 1:B, 2:C, 3:D]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_0Limit_truncated_2Transform_arguments")
        @DisplayName("prefix + limit 0 + truncated + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Limit0_Truncated_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Limit0_Truncated_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]", invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<]", invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<]", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_1Limit_truncated_2Transform_arguments")
        @DisplayName("prefix + limit 1 + truncated + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Limit1_Truncated_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Limit1_Truncated_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]",       invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<0:A]",    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<0:A, ‥]", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<0:A, ‥]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_2Limit_truncated_2Transform_arguments")
        @DisplayName("prefix + limit 2 + truncated + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Limit2_Truncated_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Limit2_Truncated_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]",            invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<0:A]",         invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<0:A, 1:B]",    invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<0:A, 1:B, ‥]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_3Limit_truncated_2Transform_arguments")
        @DisplayName("prefix + limit 3 + truncated + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Limit3_Truncated_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Limit3_Truncated_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]",                 invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<0:A]",              invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<0:A, 1:B]",         invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<0:A, 1:B, 2:C, ‥]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_nullPostfix_4Limit_truncated_2Transform_arguments")
        @DisplayName("prefix + limit 4 + truncated + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Limit4_Truncated_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Limit4_Truncated_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]",                   invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<0:A]",                invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<0:A, 1:B]",           invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<0:A, 1:B, 2:C, 3:D]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_nullLimit_nullTruncated_2Transform_arguments")
        @DisplayName("prefix + postfix + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Postfix_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Postfix_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>",                   invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{0:A>",                invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{0:A, 1:B>",           invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{0:A, 1:B, 2:C, 3:D>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_nullLimit_truncated_2Transform_arguments")
        @DisplayName("prefix + postfix + truncated + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Postfix_Truncated_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Postfix_Truncated_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>",                   invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{0:A>",                invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{0:A, 1:B>",           invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{0:A, 1:B, 2:C, 3:D>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_0Limit_nullTruncated_2Transform_arguments")
        @DisplayName("prefix + postfix + limit 0 + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Postfix_Limit0_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Postfix_Limit0_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>", invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{>", invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{>", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_1Limit_nullTruncated_2Transform_arguments")
        @DisplayName("prefix + postfix + limit 1 + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Postfix_Limit1_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Postfix_Limit1_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>",       invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{0:A>",    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{0:A, …>", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{0:A, …>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_2Limit_nullTruncated_2Transform_arguments")
        @DisplayName("prefix + postfix + limit 2 + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Postfix_Limit2_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Postfix_Limit2_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>",            invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{0:A>",         invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{0:A, 1:B>",    invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{0:A, 1:B, …>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_3Limit_nullTruncated_2Transform_arguments")
        @DisplayName("prefix + postfix + limit 3 + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Postfix_Limit3_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Postfix_Limit3_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>",                 invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{0:A>",              invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{0:A, 1:B>",         invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{0:A, 1:B, 2:C, …>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_4Limit_nullTruncated_2Transform_arguments")
        @DisplayName("prefix + postfix + limit 4 + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Postfix_Limit4_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Postfix_Limit4_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>",                   invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{0:A>",                invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{0:A, 1:B>",           invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{0:A, 1:B, 2:C, 3:D>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_0Limit_truncated_2Transform_arguments")
        @DisplayName("prefix + postfix + limit 0 + truncated + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Postfix_Limit0_Truncated_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Postfix_Limit0_Truncated_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>", invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{>", invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{>", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_1Limit_truncated_2Transform_arguments")
        @DisplayName("prefix + postfix + limit 1 + truncated + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Postfix_Limit1_Truncated_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Postfix_Limit1_Truncated_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>",       invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{0:A>",    invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{0:A, ‥>", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{0:A, ‥>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_2Limit_truncated_2Transform_arguments")
        @DisplayName("prefix + postfix + limit 2 + truncated + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Postfix_Limit2_Truncated_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Postfix_Limit2_Truncated_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>",            invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{0:A>",         invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{0:A, 1:B>",    invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{0:A, 1:B, ‥>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_3Limit_truncated_2Transform_arguments")
        @DisplayName("prefix + postfix + limit 3 + truncated + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Postfix_Limit3_Truncated_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Postfix_Limit3_Truncated_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>",                 invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{0:A>",              invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{0:A, 1:B>",         invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{0:A, 1:B, 2:C, ‥>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#nullSeparator_prefix_postfix_4Limit_truncated_2Transform_arguments")
        @DisplayName("prefix + postfix + limit 4 + truncated + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Prefix_Postfix_Limit4_Truncated_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Prefix_Postfix_Limit4_Truncated_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>",                   invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{0:A>",                invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{0:A, 1:B>",           invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{0:A, 1:B, 2:C, 3:D>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_nullLimit_nullTruncated_2Transform_arguments")
        @DisplayName("separator + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[0:A]",                  invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[0:A;1:B]",              invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[0:A;1:B;2:C;3:D]",      invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_nullLimit_truncated_2Transform_arguments")
        @DisplayName("separator + truncated + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Truncated_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Truncated_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[0:A]",                  invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[0:A;1:B]",              invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[0:A;1:B;2:C;3:D]",      invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_0Limit_nullTruncated_2Transform_arguments")
        @DisplayName("separator + limit 0 + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Limit0_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Limit0_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_1Limit_nullTruncated_2Transform_arguments")
        @DisplayName("separator + limit 1 + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Limit1_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Limit1_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[0:A]",                  invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[0:A;…]",                invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[0:A;…]",                invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_2Limit_nullTruncated_2Transform_arguments")
        @DisplayName("separator + limit 2 + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Limit2_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Limit2_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[0:A]",                  invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[0:A;1:B]",              invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[0:A;1:B;…]",            invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_3Limit_nullTruncated_2Transform_arguments")
        @DisplayName("separator + limit 3 + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Limit3_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Limit3_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[0:A]",                  invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[0:A;1:B]",              invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[0:A;1:B;2:C;…]",        invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_4Limit_nullTruncated_2Transform_arguments")
        @DisplayName("separator + limit 4 + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Limit4_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Limit4_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[0:A]",                  invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[0:A;1:B]",              invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[0:A;1:B;2:C;3:D]",      invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_0Limit_truncated_2Transform_arguments")
        @DisplayName("separator + limit 0 + truncated + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Limit0_Truncated_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Limit0_Truncated_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_1Limit_truncated_2Transform_arguments")
        @DisplayName("separator + limit 1 + truncated + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Limit1_Truncated_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Limit1_Truncated_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[0:A]",                  invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[0:A;‥]",                invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[0:A;‥]",                invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_2Limit_truncated_2Transform_arguments")
        @DisplayName("separator + limit 2 + truncated + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Limit2_Truncated_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Limit2_Truncated_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[0:A]",                  invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[0:A;1:B]",              invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[0:A;1:B;‥]",            invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_3Limit_truncated_2Transform_arguments")
        @DisplayName("separator + limit 3 + truncated + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Limit3_Truncated_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Limit3_Truncated_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[0:A]",                  invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[0:A;1:B]",              invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[0:A;1:B;2:C;‥]",        invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_nullPostfix_4Limit_truncated_2Transform_arguments")
        @DisplayName("separator + limit 4 + truncated + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Limit4_Truncated_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Limit4_Truncated_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals(DEFAULT_EMPTY_COLLECTION, invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[0:A]",                  invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[0:A;1:B]",              invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[0:A;1:B;2:C;3:D]",      invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_nullLimit_nullTruncated_2Transform_arguments")
        @DisplayName("separator + postfix + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Postfix_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Postfix_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>",                invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[0:A>",             invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[0:A;1:B>",         invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[0:A;1:B;2:C;3:D>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_nullLimit_truncated_2Transform_arguments")
        @DisplayName("separator + postfix + truncated + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Postfix_Truncated_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Postfix_Truncated_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>",                invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[0:A>",             invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[0:A;1:B>",         invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[0:A;1:B;2:C;3:D>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_0Limit_nullTruncated_2Transform_arguments")
        @DisplayName("separator + postfix + limit 0 + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Postfix_Limit0_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Postfix_Limit0_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>", invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[>", invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[>", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_1Limit_nullTruncated_2Transform_arguments")
        @DisplayName("separator + postfix + limit 1 + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Postfix_Limit1_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Postfix_Limit1_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>",      invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[0:A>",   invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[0:A;…>", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[0:A;…>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_2Limit_nullTruncated_2Transform_arguments")
        @DisplayName("separator + postfix + limit 2 + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Postfix_Limit2_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Postfix_Limit2_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>",          invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[0:A>",       invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[0:A;1:B>",   invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[0:A;1:B;…>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_3Limit_nullTruncated_2Transform_arguments")
        @DisplayName("separator + postfix + limit 3 + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Postfix_Limit3_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Postfix_Limit3_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>",              invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[0:A>",           invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[0:A;1:B>",       invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[0:A;1:B;2:C;…>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_4Limit_nullTruncated_2Transform_arguments")
        @DisplayName("separator + postfix + limit 4 + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Postfix_Limit4_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Postfix_Limit4_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>",                invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[0:A>",             invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[0:A;1:B>",         invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[0:A;1:B;2:C;3:D>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_0Limit_truncated_2Transform_arguments")
        @DisplayName("separator + postfix + limit 0 + truncated + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Postfix_Limit0_Truncated_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Postfix_Limit0_Truncated_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>", invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[>", invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[>", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_1Limit_truncated_2Transform_arguments")
        @DisplayName("separator + postfix + limit 1 + truncated + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Postfix_Limit1_Truncated_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Postfix_Limit1_Truncated_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>",      invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[0:A>",   invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[0:A;‥>", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[0:A;‥>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_2Limit_truncated_2Transform_arguments")
        @DisplayName("separator + postfix + limit 2 + truncated + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Postfix_Limit2_Truncated_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Postfix_Limit2_Truncated_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>",          invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[0:A>",       invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[0:A;1:B>",   invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[0:A;1:B;‥>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_3Limit_truncated_2Transform_arguments")
        @DisplayName("separator + postfix + limit 3 + truncated + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Postfix_Limit3_Truncated_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Postfix_Limit3_Truncated_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>",              invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[0:A>",           invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[0:A;1:B>",       invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[0:A;1:B;2:C;‥>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_nullPrefix_postfix_4Limit_truncated_2Transform_arguments")
        @DisplayName("separator + postfix + limit 4 + truncated + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Postfix_Limit4_Truncated_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Postfix_Limit4_Truncated_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("[>",                invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("[0:A>",             invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("[0:A;1:B>",         invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("[0:A;1:B;2:C;3:D>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_nullLimit_nullTruncated_2Transform_arguments")
        @DisplayName("separator + prefix + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]",                invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<0:A]",             invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<0:A;1:B]",         invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<0:A;1:B;2:C;3:D]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_nullLimit_truncated_2Transform_arguments")
        @DisplayName("separator + prefix + truncated + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Truncated_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Truncated_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]",                invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<0:A]",             invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<0:A;1:B]",         invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<0:A;1:B;2:C;3:D]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_0Limit_nullTruncated_2Transform_arguments")
        @DisplayName("separator + prefix + limit 0 + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Limit0_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Limit0_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]", invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<]", invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<]", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_1Limit_nullTruncated_2Transform_arguments")
        @DisplayName("separator + prefix + limit 1 + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Limit1_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Limit1_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]",      invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<0:A]",   invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<0:A;…]", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<0:A;…]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_2Limit_nullTruncated_2Transform_arguments")
        @DisplayName("separator + prefix + limit 2 + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Limit2_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Limit2_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]",          invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<0:A]",       invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<0:A;1:B]",   invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<0:A;1:B;…]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_3Limit_nullTruncated_2Transform_arguments")
        @DisplayName("separator + prefix + limit 3 + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Limit3_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Limit3_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]",              invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<0:A]",           invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<0:A;1:B]",       invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<0:A;1:B;2:C;…]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_4Limit_nullTruncated_2Transform_arguments")
        @DisplayName("separator + prefix + limit 4 + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Limit4_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Limit4_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]",                invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<0:A]",             invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<0:A;1:B]",         invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<0:A;1:B;2:C;3:D]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_0Limit_truncated_2Transform_arguments")
        @DisplayName("separator + prefix + limit 0 + truncated + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Limit0_Truncated_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Limit0_Truncated_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]", invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<]", invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<]", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_1Limit_truncated_2Transform_arguments")
        @DisplayName("separator + prefix + limit 1 + truncated + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Limit1_Truncated_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Limit1_Truncated_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]",      invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<0:A]",   invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<0:A;‥]", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<0:A;‥]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_2Limit_truncated_2Transform_arguments")
        @DisplayName("separator + prefix + limit 2 + truncated + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Limit2_Truncated_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Limit2_Truncated_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]",          invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<0:A]",       invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<0:A;1:B]",   invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<0:A;1:B;‥]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_3Limit_truncated_2Transform_arguments")
        @DisplayName("separator + prefix + limit 3 + truncated + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Limit3_Truncated_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Limit3_Truncated_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]",              invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<0:A]",           invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<0:A;1:B]",       invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<0:A;1:B;2:C;‥]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_prefix_nullPostfix_4Limit_truncated_2Transform_arguments")
        @DisplayName("separator + prefix + limit 4 + truncated + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Limit4_Truncated_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Limit4_Truncated_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("<]",                invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("<0:A]",             invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("<0:A;1:B]",         invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("<0:A;1:B;2:C;3:D]", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_nullLimit_nullTruncated_2Transform_arguments")
        @DisplayName("separator + prefix + postfix + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Postfix_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Postfix_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>",                invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{0:A>",             invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{0:A;1:B>",         invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{0:A;1:B;2:C;3:D>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_nullLimit_truncated_2Transform_arguments")
        @DisplayName("separator + prefix + postfix + truncated + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Postfix_Truncated_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Postfix_Truncated_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>",                invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{0:A>",             invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{0:A;1:B>",         invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{0:A;1:B;2:C;3:D>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_0Limit_nullTruncated_2Transform_arguments")
        @DisplayName("separator + prefix + postfix + limit 0 + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Postfix_Limit0_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Postfix_Limit0_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>", invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{>", invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{>", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_1Limit_nullTruncated_2Transform_arguments")
        @DisplayName("separator + prefix + postfix + limit 1 + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Postfix_Limit1_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Postfix_Limit1_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>",      invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{0:A>",   invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{0:A;…>", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{0:A;…>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_2Limit_nullTruncated_2Transform_arguments")
        @DisplayName("separator + prefix + postfix + limit 2 + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Postfix_Limit2_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Postfix_Limit2_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>",          invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{0:A>",       invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{0:A;1:B>",   invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{0:A;1:B;…>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_3Limit_nullTruncated_2Transform_arguments")
        @DisplayName("separator + prefix + postfix + limit 3 + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Postfix_Limit3_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Postfix_Limit3_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>",              invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{0:A>",           invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{0:A;1:B>",       invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{0:A;1:B;2:C;…>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_4Limit_nullTruncated_2Transform_arguments")
        @DisplayName("separator + prefix + postfix + limit 4 + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Postfix_Limit4_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Postfix_Limit4_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>",                invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{0:A>",             invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{0:A;1:B>",         invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{0:A;1:B;2:C;3:D>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_0Limit_truncated_2Transform_arguments")
        @DisplayName("separator + prefix + postfix + limit 0 + truncated + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Postfix_Limit0_Truncated_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Postfix_Limit0_Truncated_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>", invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{>", invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{>", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_1Limit_truncated_2Transform_arguments")
        @DisplayName("separator + prefix + postfix + limit 1 + truncated + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Postfix_Limit1_Truncated_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Postfix_Limit1_Truncated_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>",      invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{0:A>",   invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{0:A;‥>", invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{0:A;‥>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_2Limit_truncated_2Transform_arguments")
        @DisplayName("separator + prefix + postfix + limit 2 + truncated + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Postfix_Limit2_Truncated_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Postfix_Limit2_Truncated_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>",          invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{0:A>",       invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{0:A;1:B>",   invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{0:A;1:B;‥>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_3Limit_truncated_2Transform_arguments")
        @DisplayName("separator + prefix + postfix + limit 3 + truncated + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Postfix_Limit3_Truncated_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Postfix_Limit3_Truncated_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>",              invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{0:A>",           invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{0:A;1:B>",       invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{0:A;1:B;2:C;‥>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }
        @FieldSource("value.JoinToStringValues#separator_prefix_postfix_4Limit_truncated_2Transform_arguments")
        @DisplayName("separator + prefix + postfix + limit 4 + truncated + transform (T, int) → String") @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class Separator_Prefix_Postfix_Limit4_Truncated_Transform2 extends AbstractReflectionTests {
            //#region -------------------- Required test constructor --------------------

            public Separator_Prefix_Postfix_Limit4_Truncated_Transform2(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) { super(values, types); }

            //#endregion -------------------- Required test constructor --------------------

                                     @Test void empty() { assertEquals("{>",                invokeMethod(newInstance(EMPTY), "joinToString", types, values)); }
            @DisplayName("1 field")  @Test void test1() { assertEquals("{0:A>",             invokeMethod(newInstance(A),     "joinToString", types, values)); }
            @DisplayName("2 fields") @Test void test2() { assertEquals("{0:A;1:B>",         invokeMethod(newInstance(AB),    "joinToString", types, values)); }
            @DisplayName("4 fields") @Test void test4() { assertEquals("{0:A;1:B;2:C;3:D>", invokeMethod(newInstance(ABCD),  "joinToString", types, values)); }
        }

    }

}

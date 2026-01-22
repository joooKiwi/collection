import java.util.List;
import instance.CollectionHolderForTest;
import instance.GenericCollectionHolder_SizeAlias;
import joookiwi.collection.java.CollectionHolder;
import org.jetbrains.annotations.NotNullByDefault;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator.Simple;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedClass;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.FieldSource;
import test.AbstractEmptyCollectionHolderTests;
import test.AbstractInstancesTests;
import test.AbstractMethodsTests;
import value.SizeValueInstance;

import static helper.JoinAsArguments.getStaticField;
import static helper.JoinAsArguments.joinAsArguments;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;
import static value.Instances.everyInstances;
import static value.Sizes.SIZE_VALUES;

@NotNullByDefault
@DisplayNameGeneration(Simple.class)
@DisplayName("CollectionHolder tests (size)") @TestInstance(PER_CLASS) class CollectionHolder02_SizeTests {

    @Nested class EmptyCollectionHolder extends AbstractEmptyCollectionHolderTests {
        @Test void size()       { assertEquals(0, instance.size()); }
        @Test void length()     { assertEquals(0, instance.length()); }
        @Test void count()      { assertEquals(0, instance.count()); }
        @Test void isEmpty()    { assertTrue(     instance.isEmpty()); }
        @Test void isNotEmpty() { assertFalse(    instance.isNotEmpty()); }
    }

    @Nested class aliases {
        @Test void length() { assertEquals(1, new GenericCollectionHolder_SizeAlias().execute(CollectionHolder::length).getAmountOfCall()); }
        @Test void count() { assertEquals(1, new GenericCollectionHolder_SizeAlias().execute(CollectionHolder::count).getAmountOfCall()); }
    }

    @FieldSource("value.Instances#everyExtensionMethodInstancesAsArguments")
    @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class methods extends AbstractMethodsTests {
        //#region -------------------- Required test configuration --------------------

        public methods(CollectionHolderForTest<?, ?> instance) { super(instance); }

        //#endregion -------------------- Required test configuration --------------------

        @Test void isEmpty() { assertTrue(instance.isEmpty()); }
        @Test void isNotEmpty() { assertFalse(instance.isNotEmpty()); }
    }

    @FieldSource("values")
//    @TestInstance(PER_CLASS)
    @ParameterizedClass(name = "{0} {1}") @Nested class instances extends AbstractInstancesTests {

        //#region -------------------- Required test configuration --------------------

        static final List<Arguments> values = joinAsArguments(everyInstances, getStaticField("SIMPLIFIED_NAME"), SIZE_VALUES, it -> String.valueOf(it.size()));

        final Object[] array;
        final int size;

        public instances(final Class<CollectionHolderForTest<?, ?>> instanceClass, final SizeValueInstance size) {
            super(instanceClass);
            array = size.array();
            this.size = size.size();
        }

        //#endregion -------------------- Required test configuration --------------------

        @Test void size() { assertEquals(size, newInstance(array).size()); }

        @Test void isEmpty() {
            if (size == 0)
                assertTrue(newInstance(array).isEmpty());
            else
                assertFalse(newInstance(array).isEmpty());
        }

        @Test void isNotEmpty() {
            if (size == 0)
                assertFalse(newInstance(array).isNotEmpty());
            else
                assertTrue(newInstance(array).isNotEmpty());
        }

    }

}

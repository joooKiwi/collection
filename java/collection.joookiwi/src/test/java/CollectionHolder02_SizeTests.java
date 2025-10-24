import java.util.List;
import instance.CollectionHolderForTest;
import instance.EmptyCollectionHolderForTest;
import instance.GenericCollectionHolder_SizeAlias;
import joookiwi.collection.java.CollectionHolder;
import org.jetbrains.annotations.NotNullByDefault;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator.Simple;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedClass;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.FieldSource;
import value.SizeValueInstance;

import static helper.JoinAsArguments.getStaticField;
import static helper.JoinAsArguments.joinAsArguments;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static value.Instances.everyCollectionInstances;
import static value.Sizes.SIZE_VALUES;

@NotNullByDefault
@DisplayNameGeneration(Simple.class)
@DisplayName("CollectionHolder tests (size)")
class CollectionHolder02_SizeTests {

    @Nested class EmptyCollectionHolder {
        @Test void size()       { assertEquals(0, new EmptyCollectionHolderForTest<>().size()); }
        @Test void length()     { assertEquals(0, new EmptyCollectionHolderForTest<>().length()); }
        @Test void count()      { assertEquals(0, new EmptyCollectionHolderForTest<>().count()); }
        @Test void isEmpty()    { assertTrue(     new EmptyCollectionHolderForTest<>().isEmpty()); }
        @Test void isNotEmpty() { assertFalse(    new EmptyCollectionHolderForTest<>().isNotEmpty()); }
    }

    @Nested class aliases {
        @Test void length() { assertEquals(1, new GenericCollectionHolder_SizeAlias().execute(CollectionHolder::length).getAmountOfCall()); }
        @Test void count() { assertEquals(1, new GenericCollectionHolder_SizeAlias().execute(CollectionHolder::count).getAmountOfCall()); }
    }

    @FieldSource("values")
//    @TestInstance(PER_CLASS)
    @ParameterizedClass(name = "{0} {1}") @Nested class instances extends AbstractInstancesTests {

        //#region -------------------- Required test configuration --------------------

        static final List<Arguments> values = joinAsArguments(everyCollectionInstances, getStaticField("SIMPLIFIED_NAME"), SIZE_VALUES, it -> String.valueOf(it.size()));

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

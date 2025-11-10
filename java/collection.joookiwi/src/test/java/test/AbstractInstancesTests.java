package test;

import java.lang.reflect.InvocationTargetException;
import instance.CollectionHolderForTest;
import joookiwi.collection.java.exception.EmptyCollectionException;
import joookiwi.collection.java.exception.NullCollectionException;
import org.intellij.lang.annotations.MagicConstant;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FALSE_0;
import static org.junit.jupiter.api.Assertions.fail;

/// An instance that describe the instance classes with meaningful information
/// about the instance class being created
@NotNullByDefault
public abstract class AbstractInstancesTests {

    //#region -------------------- Fields --------------------

    /// The [Class] of [CollectionHolderForTest] that should be used for the tests
    public final Class<CollectionHolderForTest<?, ?>> instanceClass;
    /// The reusable class that contains all the necessary elements
    public final InstanceClassUtil util;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    protected AbstractInstancesTests(final Class<CollectionHolderForTest<?, ?>> instanceClass) { util = InstanceClassUtil.get(this.instanceClass = instanceClass); }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Getter method --------------------

    /// The [EmptyCollectionException] class
    public Class<? extends EmptyCollectionException> emptyExceptionClass() { return util.emptyExceptionClass(); }

    /// The type of [CollectionHolderForTest] type that is used.
    ///
    /// If it has "extension" in it, then it directly uses the extension methods.
    /// Otherwise, it is on an already defined instance.
    @MagicConstant(stringValues = {"normal", "minimalist", "normal viewer", "minimalist viewer", "normal extension", "minimalist extension", "array extension", "null normal extension", "null minimalist extension", "null array extension",}) public String type() { return util.type(); }

    /// Tell if the [#instanceClass] is of the type `null`
    @Contract(ALWAYS_FALSE_0)
    public boolean isNull() { return util.isNull(); }

    /// Tell if the [#instanceClass] is of the type [GenericCollectionHolder][joookiwi.collection.java.GenericCollectionHolder]
    public boolean isNormal() { return util.isNormal(); }

    /// Tell if the [#instanceClass] is of the type [CollectionViewer][joookiwi.collection.java.CollectionViewer]
    public boolean isNormalViewer() { return util.isNormalViewer(); }

    /// Tell if the [#instanceClass] is of the type [MinimalistCollectionHolder][joookiwi.collection.java.MinimalistCollectionHolder] directly
    public boolean isMinimalist() { return util.isMinimalist(); }

    /// Tell if the [#instanceClass] is based on the extension methods directly
    @Contract(ALWAYS_FALSE_0)
    public boolean isExtension() { return util.isExtension(); }

    /// Tell if the [#instanceClass] is a viewer instance
    public boolean isViewer() { return util.isViewer(); }

    //#endregion -------------------- Getter method --------------------
    //#region -------------------- Method --------------------

    /// Create a new instance from the field [#instanceClass] with the array received onto the constructor `Object[]`
    ///
    /// @param values The array to create the instance
    /// @param <T>    The instance type
    @SuppressWarnings("unchecked cast")
    public <T extends @Nullable Object> CollectionHolderForTest<T, ?> newInstance(final T @Unmodifiable [] values) {
        try {
            return (CollectionHolderForTest<T, ?>) instanceClass.getConstructor(Object[].class).newInstance((Object) values);
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            fail("InstantiationException|IllegalAccessException|InvocationTargetException|NoSuchFieldException was thrown on “newInstance”.", e);
            throw new RuntimeException("Assertions.fail was expected to throw an exception on “newInstance” call if InstantiationException|IllegalAccessException|InvocationTargetException|NoSuchFieldException occurred.");
        }
    }

    //#endregion -------------------- Method --------------------

}


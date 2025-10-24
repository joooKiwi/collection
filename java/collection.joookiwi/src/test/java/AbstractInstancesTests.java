import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import instance.CollectionHolderForTest;
import org.intellij.lang.annotations.MagicConstant;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;
import org.junit.jupiter.params.ParameterizedClass;

import static helper.GetField.getStaticBooleanField;
import static helper.GetField.getStaticStringField;
import static org.junit.jupiter.api.Assertions.fail;

/// An instance that describe the instance classes with meaningful information
/// about the instance class being created
@NotNullByDefault
abstract class AbstractInstancesTests {

    //#region -------------------- Fields --------------------

    /// The [Class] of [CollectionHolderForTest] that should be used for the tests
    final Class<CollectionHolderForTest<?, ?>> instanceClass;
    /// The reusable class that contains all the necessary elements
    final InstanceClassUtil util;
    /// A field to reuse the same instance for a test instead of always create a new instance with nothing initialized
    static final Map<Class<CollectionHolderForTest<?, ?>>, InstanceClassUtil> bag = new HashMap<>(2);

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    protected AbstractInstancesTests(final Class<CollectionHolderForTest<?, ?>> instanceClass) {
        this.instanceClass = instanceClass;

        final var bag = AbstractInstancesTests.bag;
        if (!bag.containsKey(instanceClass))
            bag.put(instanceClass, new InstanceClassUtil(instanceClass));
        util = bag.get(instanceClass);
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Getter method --------------------

    /// The type of [CollectionHolderForTest] type that is used.
    ///
    /// If it has "extension" in it, then it directly uses the extension methods.
    /// Otherwise, it is on an already defined instance.
    @MagicConstant(stringValues = {"normal", "minimalist", "normal extension", "minimalist extension", "array extension",}) String type() { return util.type(); }

    /// Tell if the [#instanceClass] is of the type [GenericCollectionHolder][joookiwi.collection.java.GenericCollectionHolder]
    boolean isNormal() { return util.isNormal(); }

    /// Tell if the [#instanceClass] is of the type [MinimalistCollectionHolder][joookiwi.collection.java.MinimalistCollectionHolder] directly
    boolean isMinimalist() { return util.isMinimalist(); }

    /// Tell if the [#instanceClass] is based on the extension methods directly
    boolean isExtension() { return util.isExtension(); }

    //#endregion -------------------- Getter method --------------------
    //#region -------------------- Method --------------------

    /// Create a new instance from the field [#instanceClass] with the array received onto the constructor `Object[]`
    ///
    /// @param values The array to create the instance
    /// @param <T>    The instance type
    @SuppressWarnings("unchecked cast")
    <T> CollectionHolderForTest<T, ?> newInstance(final T @Unmodifiable [] values) {
        try {
            return (CollectionHolderForTest<T, ?>) instanceClass.getConstructor(Object[].class).newInstance((Object) values);
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            fail("InstantiationException|IllegalAccessException|InvocationTargetException|NoSuchFieldException was thrown on “newInstance”.", e);
            throw new RuntimeException("Assertions.fail was expected to throw an exception on “newInstance” call if InstantiationException|IllegalAccessException|InvocationTargetException|NoSuchFieldException occurred.");
        }
    }

    //#endregion -------------------- Method --------------------

}

/// A reusable class that is used in [AbstractInstancesTests] construction since [ParameterizedClass]
/// and a [per-class lifecycle][org.junit.jupiter.api.TestInstance.Lifecycle#PER_CLASS] is not supported at the moment
/// with the reason `Constructor injection is not supported for @ParameterizedClass classes with @TestInstance(Lifecycle.PER_CLASS)`
final class InstanceClassUtil {

    //#region -------------------- Fields --------------------

    final Class<CollectionHolderForTest<?, ?>> instanceClass;

    @Nullable String __type;

    private boolean __isNormal;
    private boolean __isNormalInitialized = false;

    private boolean __isMinimalist;
    private boolean __isMinimalistInitialized = false;

    private boolean __isExtension;
    private boolean __isExtensionInitialized = false;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    InstanceClassUtil(final Class<CollectionHolderForTest<?, ?>> instanceClass) { this.instanceClass = instanceClass; }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Getter method --------------------

    @MagicConstant(stringValues = {"normal", "minimalist", "normal extension", "minimalist extension", "array extension",}) String type() {
        final var value = __type;
        if (value != null)
            return value;
        return __type = getStaticStringField(instanceClass, "SIMPLIFIED_NAME");
    }

    boolean isNormal() {
        if (__isNormalInitialized)
            return __isNormal;

        final var value = __isNormal = type().equals("normal");
        __isNormalInitialized = true;
        return value;
    }

    boolean isMinimalist() {
        if (__isMinimalistInitialized)
            return __isMinimalist;

        final var value = __isMinimalist = getStaticBooleanField(instanceClass, "IS_MINIMALIST");
        __isMinimalistInitialized = true;
        return value;
    }

    boolean isExtension() {
        if (__isExtensionInitialized)
            return __isExtension;

        final var value = __isExtension = getStaticBooleanField(instanceClass, "IS_EXTENSION");
        __isExtensionInitialized = true;
        return value;
    }

    //#endregion -------------------- Getter method --------------------

}

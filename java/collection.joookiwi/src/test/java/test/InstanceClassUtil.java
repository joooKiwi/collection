package test;

import instance.CollectionHolderForTest;
import joookiwi.collection.java.exception.EmptyCollectionException;
import joookiwi.collection.java.exception.NullCollectionException;
import org.intellij.lang.annotations.MagicConstant;
import org.jetbrains.annotations.Nullable;
import org.junit.jupiter.params.ParameterizedClass;

import java.util.HashMap;
import java.util.Map;

import static helper.GetField.getStaticBooleanField;
import static helper.GetField.getStaticStringField;

/// A reusable class that is used in [AbstractInstancesTests] and [AbstractMethodsTests] construction since [ParameterizedClass]
/// and a [per-class lifecycle][org.junit.jupiter.api.TestInstance.Lifecycle#PER_CLASS] is not supported at the moment
/// with the reason `Constructor injection is not supported for @ParameterizedClass classes with @TestInstance(Lifecycle.PER_CLASS)`
public final class InstanceClassUtil {

    //#region -------------------- Fields --------------------

    public static final Map<Class<? extends CollectionHolderForTest<?, ?>>, InstanceClassUtil> bag = new HashMap<>(8);


    public final Class<? extends CollectionHolderForTest<?, ?>> instanceClass;

    public @Nullable Class<? extends EmptyCollectionException> __emptyExceptionClass;

    private @Nullable String __type;

    private boolean __isNull;
    private boolean __isNullInitialized = false;

    private boolean __isNormal;
    private boolean __isNormalInitialized = false;

    private boolean __isNormalViewer;
    private boolean __isNormalViewerInitialized = false;

    private boolean __isMinimalist;
    private boolean __isMinimalistInitialized = false;

    private boolean __isExtension;
    private boolean __isExtensionInitialized = false;

    private boolean __isViewer;
    private boolean __isViewerInitialized = false;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    private InstanceClassUtil(final Class<? extends CollectionHolderForTest<?, ?>> instanceClass) { this.instanceClass = instanceClass; }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Getter method --------------------

    public Class<? extends EmptyCollectionException> emptyExceptionClass() {
        final var value = __emptyExceptionClass;
        if (value != null)
            return value;

        if (isNull())
            return __emptyExceptionClass = NullCollectionException.class;
        return __emptyExceptionClass = EmptyCollectionException.class;
    }


    @MagicConstant(stringValues = {"normal", "minimalist", "normal viewer", "minimalist viewer" , "normal extension", "minimalist extension", "array extension", "null normal extension", "null minimalist extension", "null array extension",}) public String type() {
        final var value = __type;
        if (value != null)
            return value;
        return __type = getStaticStringField(instanceClass, "SIMPLIFIED_NAME");
    }

    public boolean isNull() {
        if (__isNullInitialized)
            return __isNull;

        final var value = __isNull = getStaticBooleanField(instanceClass, "IS_NULL");
        __isNullInitialized = true;
        return value;
    }

    public boolean isNormal() {
        if (__isNormalInitialized)
            return __isNormal;

        final var value = __isNormal = type().equals("normal");
        __isNormalInitialized = true;
        return value;
    }

    public boolean isNormalViewer() {
        if (__isNormalViewerInitialized)
            return __isNormalViewer;

        final var value = __isNormalViewer = type().equals("normal viewer");
        __isNormalViewerInitialized = true;
        return value;
    }

    public boolean isMinimalist() {
        if (__isMinimalistInitialized)
            return __isMinimalist;

        final var value = __isMinimalist = getStaticBooleanField(instanceClass, "IS_MINIMALIST");
        __isMinimalistInitialized = true;
        return value;
    }

    public boolean isExtension() {
        if (__isExtensionInitialized)
            return __isExtension;

        final var value = __isExtension = getStaticBooleanField(instanceClass, "IS_EXTENSION");
        __isExtensionInitialized = true;
        return value;
    }

    public boolean isViewer() {
        if (__isViewerInitialized)
            return __isViewer;

        final var value = __isViewer = getStaticBooleanField(instanceClass, "IS_VIEWER");
        __isViewerInitialized = true;
        return value;
    }

    //#endregion -------------------- Getter method --------------------
    //#region -------------------- Method --------------------

    public static InstanceClassUtil get(final Class<? extends CollectionHolderForTest<?, ?>> instanceClass) {
        final var bag = InstanceClassUtil.bag;
        if (!bag.containsKey(instanceClass))
            bag.put(instanceClass, new InstanceClassUtil(instanceClass));
        return bag.get(instanceClass);
    }

    //#endregion -------------------- Method --------------------

}

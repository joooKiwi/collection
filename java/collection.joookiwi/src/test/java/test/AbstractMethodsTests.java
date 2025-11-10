package test;

import instance.CollectionHolderForTest;
import joookiwi.collection.java.CollectionConstants;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.CommonContracts;
import joookiwi.collection.java.exception.EmptyCollectionException;
import joookiwi.collection.java.exception.NullCollectionException;
import org.intellij.lang.annotations.MagicConstant;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FALSE_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_TRUE_0;

public class AbstractMethodsTests {

    //#region -------------------- Fields --------------------

    /// The [CollectionHolderForTest] that should be used for the tests
    public final CollectionHolderForTest<?, ?> instance;
    /// The reusable class that contains all the necessary elements
    public final InstanceClassUtil util;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    @SuppressWarnings("unchecked cast")
    protected AbstractMethodsTests(final CollectionHolderForTest<?, ?> instance) { util = InstanceClassUtil.get((Class<? extends CollectionHolderForTest<?, ?>>) (this.instance = instance).getClass()); }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Getter method --------------------

    /// The [EmptyCollectionException] class (either [EmptyCollectionException] or [NullCollectionException])
    public Class<? extends EmptyCollectionException> emptyExceptionClass() { return util.emptyExceptionClass(); }

    /// The type of [CollectionHolderForTest] type that is used.
    ///
    /// If it has "extension" in it, then it directly uses the extension methods.
    /// Otherwise, it is on an already defined instance.
    @MagicConstant(stringValues = {"normal", "minimalist", "normal viewer", "minimalist viewer", "normal extension", "minimalist extension", "array extension", "null normal extension", "null minimalist extension", "null array extension",}) public String type() { return util.type(); }

    /// Tell if the [#instanceClass] is of the type `null`
    public boolean isNull() { return util.isNull(); }

    /// Tell if the [#instanceClass] is of the type [GenericCollectionHolder][joookiwi.collection.java.GenericCollectionHolder]
    public boolean isNormal() { return util.isNormal(); }

    /// Tell if the [#instanceClass] is of the type [CollectionViewer][joookiwi.collection.java.CollectionViewer]
    public boolean isNormalViewer() { return util.isNormalViewer(); }

    /// Tell if the [#instanceClass] is of the type [MinimalistCollectionHolder][joookiwi.collection.java.MinimalistCollectionHolder] directly
    public boolean isMinimalist() { return util.isMinimalist(); }

    /// Tell if the [#instanceClass] is based on the extension methods directly
    @Contract(ALWAYS_TRUE_0)
    public boolean isExtension() { return util.isExtension(); }

    /// Tell if the [#instanceClass] is a viewer instance
    @Contract(ALWAYS_FALSE_0)
    public boolean isViewer() { return util.isViewer(); }

    //#endregion -------------------- Getter method --------------------
    //#region -------------------- Method --------------------

    /// Get the [#instance] cast to the type specified
    ///
    /// @param <T> The instance type
    @SuppressWarnings("unchecked cast")
    public <T extends @Nullable Object> CollectionHolder<T> getInstance() {
        return (CollectionHolder<T>) instance;
    }

    //#endregion -------------------- Method --------------------

}

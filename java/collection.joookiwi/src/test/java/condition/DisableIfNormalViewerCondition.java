package condition;

import org.jetbrains.annotations.NotNullByDefault;

/// Disable the test if the [instance.CollectionHolderForTest]`#SIMPLIFIED_NAME` is of the type "normal viewer"
///
/// The main reason for this is that a "normal viewer" does not test negative indexes
/// Hence, no tests about "get() being called" or "get" can be tested properly.
@NotNullByDefault
public final class DisableIfNormalViewerCondition
        extends AbstractCondition {

    @Override String methodName() { return "disableIfNormalViewer"; }
    @Override String isATypeName() { return "The instance is of type “normal viewer”."; }
    @Override String isNotATypeName() { return "The instance is not of type “normal viewer”."; }

}

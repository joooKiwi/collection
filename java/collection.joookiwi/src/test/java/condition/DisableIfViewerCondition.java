package condition;

import org.jetbrains.annotations.NotNullByDefault;

/// Disable the test if the [instance.CollectionHolderForTest]`#SIMPLIFIED_NAME` is of the type "normal|minimalist viewer"
///
/// The main reason for this is that a "viewer" does not test negative indexes
/// Hence, no tests about "get" can be tested properly.
@NotNullByDefault
public final class DisableIfViewerCondition
        extends AbstractCondition {

    @Override String methodName() { return "disableIfViewer"; }
    @Override String isATypeName() { return "The instance is of type “viewer”."; }
    @Override String isNotATypeName() { return "The instance is not of type “viewer”."; }

}

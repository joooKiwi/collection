package condition;

import org.jetbrains.annotations.NotNullByDefault;

/// Disable the test if the [instance.CollectionHolderForTest]`#SIMPLIFIED_NAME` is of the type "(normal|minimalist|array) extension"
///
/// The main reason for this is that no extension method needs to test any method being called
@NotNullByDefault
public final class DisableIfExtensionCondition
        extends AbstractCondition {

    @Override String methodName() { return "disableIfExtension"; }
    @Override String isATypeName() { return "The instance is an extension type."; }
    @Override String isNotATypeName() { return "The instance is not an extension type."; }

}

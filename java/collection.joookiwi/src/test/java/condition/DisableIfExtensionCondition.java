package condition;

import org.jetbrains.annotations.NotNullByDefault;
import test.AbstractInstancesTests;

/// Disable the test if the [instance.CollectionHolderForTest]`#SIMPLIFIED_NAME` is of the type "(normal|minimalist|array) extension"
///
/// The main reason for this is that no extension method needs to test any method being called
@NotNullByDefault
public final class DisableIfExtensionCondition
        extends AbstractCondition {

    @Override boolean condition(final AbstractInstancesTests instance) { return instance.isExtension(); }
    @Override String disabledMessage(final String name) { return "“" + name + "” is disabled because it is an extension type."; }
    @Override String enabledMessage(final String name) { return "“" + name + "” is enabled because it is not an extension type."; }

}

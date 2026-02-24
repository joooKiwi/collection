package condition;

import java.lang.reflect.Field;
import org.jetbrains.annotations.NotNullByDefault;
import org.junit.jupiter.api.extension.ConditionEvaluationResult;
import org.junit.jupiter.api.extension.ExecutionCondition;
import org.junit.jupiter.api.extension.ExtensionContext;
import test.AbstractInstancesTests;

import static java.util.Arrays.stream;

/// A generalized [ExecutionCondition] for the tests for a specific method to call
@NotNullByDefault
abstract class AbstractCondition
        implements ExecutionCondition {

    abstract boolean condition(AbstractInstancesTests instance);

    /// The message to tell it is **disabled** based on the name of the instance
    abstract String disabledMessage(String name);

    /// The message to tell it is **enabled** based on the name of the instance
    abstract String enabledMessage(String name);

    @Override public ConditionEvaluationResult evaluateExecutionCondition(final ExtensionContext context) {
        final var optionalTestInstance = context.getTestInstance();
        if (optionalTestInstance.isEmpty())
            return ConditionEvaluationResult.enabled("Only a method can be disabled, hence a class should not be evaluated.");

        final Object instanceToRetrieveRootInstance = getInstanceToRetrieveRootInstance(context);
        final Field rootFieldForTheSkippedTests;
        try {
            rootFieldForTheSkippedTests = instanceToRetrieveRootInstance.getClass().getField("rootInstance");
        }
        catch (NoSuchFieldException e) {
            throw new RuntimeException("No root field named “rootInstance” was found in “" + instanceToRetrieveRootInstance.getClass().getName() + "”.", e);
        }
        rootFieldForTheSkippedTests.setAccessible(true);

        final AbstractInstancesTests rootInstanceForTheSkippedTests;
        try {
            rootInstanceForTheSkippedTests = (AbstractInstancesTests) rootFieldForTheSkippedTests.get(instanceToRetrieveRootInstance);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("No root field named “rootInstance” in “" + instanceToRetrieveRootInstance.getClass().getName() + "” was not accessible.", e);
        }

        if (condition(rootInstanceForTheSkippedTests))
            return ConditionEvaluationResult.disabled(disabledMessage(getInstanceName(context)));
        return ConditionEvaluationResult.enabled(enabledMessage(getInstanceName(context)));
    }

    private Object getInstanceToRetrieveRootInstance(final ExtensionContext context) {
        //TODO maybe try to retrieve the “AbstractInstancesTests” without the needs of a temporary variable
        final var optionalInstance = context.getTestInstance();
        if (optionalInstance.isEmpty())
            // We have no test instance associated to the context. We go to the outer class
            return getInstanceToRetrieveRootInstance(context.getParent().orElseThrow());

        final var instance = optionalInstance.get();
        if (stream(instance.getClass().getFields()).noneMatch(it -> it.getName().equals("rootInstance")))
            // We have no field and possibly the disabled condition is not here. We go to the outer class
            return getInstanceToRetrieveRootInstance(context.getParent().orElseThrow());
        // We have a test instance with “rootInstance” being present
        return instance;
    }

    private String getInstanceName(final ExtensionContext context) {
        final var instanceNameBuilder = new StringBuilder(context.getDisplayName());
        var parentContext = context.getParent().orElseThrow();
        while (true) {
            final var optionalParentContext = parentContext.getParent();
            if (optionalParentContext.isEmpty())
                break;

            final var displayedName = parentContext.getDisplayName();
            if (displayedName.equals("JUnit Jupiter"))
                break;

            parentContext = optionalParentContext.get();
            instanceNameBuilder.insert(0, " → ").insert(0, displayedName);
        }
        return instanceNameBuilder.toString();
    }

}

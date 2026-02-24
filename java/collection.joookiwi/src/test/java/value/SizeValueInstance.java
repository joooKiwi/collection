package value;

import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

@NotNullByDefault
public record SizeValueInstance(Object @Unmodifiable [] array, int size) {}

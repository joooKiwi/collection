package helper;

import java.util.function.Function;

import joookiwi.collection.java.extended.ArrayAsImmutableList;
import joookiwi.collection.java.extended.EmptyList;
import joookiwi.collection.java.extended.ImmutableList;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;
import org.junit.jupiter.api.Named;
import org.junit.jupiter.params.provider.Arguments;

@NotNullByDefault
public final class JoinAsArguments {

    /// Give a supplier to retrieve the static field of a class having the specified `name`.
    /// The argument is supposed to be a [String].
    ///
    /// @param name The field name
    /// @throws RuntimeException The failed assertion did not throw (it should not happen normally)
    public static Function<? super Class<?>, String> getStaticField(final @NonNls String name) { return it -> GetField.getStaticStringField(it, name); }


    /// Join both the argument arrays (which should be equals in their `size`)
    ///
    /// @param argument1 The 1<sup>st</sup> arguments to associate
    /// @param argument2 The 2<sup>nd</sup> arguments to associate
    /// @return An [ImmutableList] of [Arguments] with the same index on both arguments
    public static ImmutableList<Arguments> joinAsArguments(final @Nullable Object @Unmodifiable [] argument1,
                                                           final @Nullable Object @Unmodifiable [] argument2) {
        final var size1 = argument1.length;
        final var size2 = argument2.length;
        final var size = size1 * size2;
        if (size == 0)
            return EmptyList.getInstance();

        final var arguments = new Arguments[size];
        var index = -1;
        var index1 = -1;
        while (++index1 < size1) {
            var index2 = -1;
            while (++index2 < size2)
                arguments[++index] = Arguments.of(argument1[index1], argument2[index2]);
        }

        return new ArrayAsImmutableList<>(arguments);
    }

    /// Join both the argument arrays (which should be equals in their `size`)
    /// applying a transformation on each argument
    ///
    /// @param argument1     The 1<sup>st</sup> arguments to associate
    /// @param argument1Name The name transform of the 1<sup>st</sup> argument
    /// @param argument2     The 2<sup>nd</sup> arguments to associate
    /// @param argument2Name The name transform of the 2<sup>nd</sup> argument
    /// @param <T>           The 1<sup>st</sup> argument type
    /// @param <U>           The 2<sup>nd</sup> argument type
    /// @return An [ImmutableList] of [Arguments] with the same index on both arguments and a custom name
    public static <T extends @Nullable Object, U extends @Nullable Object> ImmutableList<Arguments> joinAsArguments(final T @Unmodifiable [] argument1,
                                                                                                                    final Function<? super T, String> argument1Name,
                                                                                                                    final U @Unmodifiable [] argument2,
                                                                                                                    final Function<? super U, String> argument2Name) {
        final var size1 = argument1.length;
        final var size2 = argument2.length;
        final var size = size1 * size2;
        if (size == 0)
            return EmptyList.getInstance();

        final var arguments = new Arguments[size];
        var index = -1;
        var index1 = -1;
        while (++index1 < size1) {
            var index2 = -1;
            while (++index2 < size2) {
                final var value1 = argument1[index1];
                final var value2 = argument2[index2];
                arguments[++index] = Arguments.of(Named.of(argument1Name.apply(value1), value1), Named.of(argument2Name.apply(value2), value2));
            }
        }

        return new ArrayAsImmutableList<>(arguments);
    }

}

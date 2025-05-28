package joookiwi.collection.java.extended;

import java.util.Comparator;
import joookiwi.collection.java.helper.ComparatorHelper;
import joookiwi.collection.java.helper.EqualsHelper;
import org.jetbrains.annotations.ApiStatus.Internal;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

@Internal
@NotNullByDefault
final class UtilityForArray {

    public static <T> void validateValuesForSet(final T[] reference) {
        final var size = reference.length;
        if (size == 0)
            return; // Useless to validate since it is empty
        if (size == 1)
            return; // Useless to validate if it has only 1 element

        final var equalHelper = EqualsHelper.getInstance();
        final var tempArray = new Object[size];
        tempArray[0] = reference[0];
        var index1 = 0;
        while (++index1 < size) {
            final var value = reference[index1];
            var index2 = -1; //The index2 should always be under the element that has been validated

            while (++index2 < index1)
                if (equalHelper.equals(tempArray[index2], value))
                    throw new RuntimeException("A duplicate value exist during the creation of a Set.");
            tempArray[index2] = value;
        }
    }

    public static <T> void validateValuesForSortedSet(final T[] reference) {
        final var size = reference.length;
        if (size == 0)
            return; // Useless to validate since it is empty
        if (size == 1)
            return; // Useless to validate if it has only 1 element

        final var equalHelper = EqualsHelper.getInstance();
        final var tempArray = new Object[size];
        tempArray[0] = reference[0];
        var index1 = 0;
        while (++index1 < size) {
            final var value = reference[index1];
            var index2 = -1; //The index2 should always be under the element that has been validated

            while (++index2 < index1)
                if (equalHelper.equals(tempArray[index2], value))
                    throw new RuntimeException("A duplicate value exist during the creation of a Set.");
            tempArray[index2] = value;
        }

        final var comparatorHelper = ComparatorHelper.getInstance();
        var index3 = -1;
        while (++index3 < size)
            if (comparatorHelper.compare(reference[index3], reference[index3 + 1]) > 0)
                throw new RuntimeException("A value was not ordered during the creation of a SortedSet.");
    }

    public static <T> void validateValuesForSortedSet(final T[] reference, final @Nullable Comparator<? super T> comparator) {
        if (comparator == null) {
            validateValuesForSortedSet(reference);
            return;
        }

        final var size = reference.length;
        if (size == 0)
            return; // Useless to validate since it is empty
        if (size == 1)
            return; // Useless to validate if it has only 1 element

        final var equalHelper = EqualsHelper.getInstance();
        final var tempArray = new Object[size];
        tempArray[0] = reference[0];
        var index1 = 0;
        while (++index1 < size) {
            final var value = reference[index1];
            var index2 = -1; //The index2 should always be under the element that has been validated

            while (++index2 < index1)
                if (equalHelper.equals(tempArray[index2], value))
                    throw new RuntimeException("A duplicate value exist during the creation of a Set.");
            tempArray[index2] = value;
        }

        final var comparatorHelper = ComparatorHelper.getInstance();
        var index3 = -1;
        while (++index3 < size)
            if (comparatorHelper.compare(reference[index3], reference[index3 + 1], comparator) > 0)
                throw new RuntimeException("A value was not ordered during the creation of a SortedSet.");
    }

}

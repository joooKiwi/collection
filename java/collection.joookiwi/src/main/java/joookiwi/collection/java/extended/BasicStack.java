package joookiwi.collection.java.extended;

import java.util.Collection;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

/// A [Collection] that has the common functionalities
/// of a [Deque][java.util.Deque] and a [Stack][java.util.Stack]
///
/// @apiNote This is not part of the <a href="https://docs.oracle.com/en/java/javase/24/core/java-collections-framework.html">Java collection framework</a>,
///          but it is an extension of it
@NotNullByDefault
public interface BasicStack<T>
        extends Collection<T> {

    /// Retrieves the first value of the current [stack][BasicStack] without removing it.
    ///
    /// If the [stack][BasicStack] [is empty][#isEmpty], `null` is returned.
    @Nullable T peek();

    /// Get the first element in the current [stack][BasicStack]
    ///
    /// @throws NoSuchElementException The [stack][BasicStack] [is empty][#isEmpty]
    T getFirst();

    /// Get the last element in the current [stack][BasicStack]
    ///
    /// @throws NoSuchElementException The [stack][BasicStack] [is empty][#isEmpty]
    T getLast();


    /// Add an element at the start of the current [stack][BasicStack]
    ///
    /// @param value The element to add
    /// @throws NullPointerException          The `value` is null
    /// @throws UnsupportedOperationException The [stack][BasicStack] is immutable
    void addFirst(T value);

    /// Add an element at the end of the current [stack][BasicStack]
    ///
    /// @param value The element to add
    /// @throws NullPointerException          The `value` is null
    /// @throws UnsupportedOperationException The [stack][BasicStack] is immutable
    void addLast(T value);


    /// Remove and returns the first of this stack
    ///
    /// @throws NoSuchElementException        The [stack][BasicStack] [is empty][#isEmpty]
    /// @throws UnsupportedOperationException The [stack][BasicStack] is immutable
    T pop();

    /// Remove the first element of the current [stack][BasicStack]
    ///
    /// @throws NoSuchElementException        The [stack][BasicStack] [is empty][#isEmpty]
    /// @throws UnsupportedOperationException The [stack][BasicStack] is immutable
    T removeFirst();

    /// Remove the last element of the current [stack][BasicStack]
    ///
    /// @throws NoSuchElementException        The [stack][BasicStack] [is empty][#isEmpty]
    /// @throws UnsupportedOperationException The [stack][BasicStack] is immutable
    T removeLast();

}

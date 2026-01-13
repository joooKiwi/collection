package value;

import instance.ArrayAsJavaArrayBlockingQueue;
import instance.ArrayAsJavaArrayDeque;
import instance.ArrayAsJavaArrayList;
import instance.ArrayAsJavaBlockingDeque;
import instance.ArrayAsJavaBlockingQueue;
import instance.ArrayAsJavaCollection;
import instance.ArrayAsJavaConcurrentLinkedDeque;
import instance.ArrayAsJavaConcurrentLinkedQueue;
import instance.ArrayAsJavaConcurrentSkipListSet;
import instance.ArrayAsJavaCopyOnWriteArrayList;
import instance.ArrayAsJavaCopyOnWriteArraySet;
import instance.ArrayAsJavaDeque;
import instance.ArrayAsJavaHashSet;
import instance.ArrayAsJavaLinkedBlockingDeque;
import instance.ArrayAsJavaLinkedBlockingQueue;
import instance.ArrayAsJavaLinkedHashSet;
import instance.ArrayAsJavaLinkedList;
import instance.ArrayAsJavaLinkedTransferQueue;
import instance.ArrayAsJavaList;
import instance.ArrayAsJavaNavigableSet;
import instance.ArrayAsJavaPriorityBlockingQueue;
import instance.ArrayAsJavaPriorityQueue;
import instance.ArrayAsJavaQueue;
import instance.ArrayAsJavaSequencedCollection;
import instance.ArrayAsJavaSequencedSet;
import instance.ArrayAsJavaSet;
import instance.ArrayAsJavaSortedSet;
import instance.ArrayAsJavaStack;
import instance.ArrayAsJavaSynchronousQueue;
import instance.ArrayAsJavaTransferQueue;
import instance.ArrayAsJavaTreeSet;
import instance.ArrayAsJavaVector;
import instance.CollectionHolderForTest;
import instance.CollectionHolder_ByMinimalistViewer;
import instance.CollectionHolder_ByGenericCollection;
import instance.CollectionHolder_ByMinimalistCollection;
import instance.CollectionHolder_ByViewer;
import instance.CollectionHolder_FromArrayExtensionFunction;
import instance.CollectionHolder_FromExtensionFunction;
import instance.CollectionHolder_FromMinimalistExtensionFunction;
import java.util.Collection;
import java.util.Deque;
import java.util.List;
import java.util.NavigableSet;
import java.util.Queue;
import java.util.SequencedCollection;
import java.util.SequencedSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TransferQueue;
import instance.CollectionHolder_FromNullArrayExtensionFunction;
import instance.CollectionHolder_FromNullExtensionFunction;
import instance.CollectionHolder_FromNullMinimalistExtensionFunction;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.junit.jupiter.api.Named;
import org.junit.jupiter.params.provider.Arguments;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static value.Arrays.EMPTY;

@NotNullByDefault
public final class Instances {

    @Contract(ALWAYS_FAIL_0) private Instances() { throw new Error("The utility class “Instances” cannot be constructed."); }

    //#region -------------------- Framework instances --------------------

    @SuppressWarnings("unchecked cast") public static final Class<CollectionHolderForTest<?, ?>>[] everyCollectionInstances = (Class<CollectionHolderForTest<?, ?>>[]) new Class[]{
            CollectionHolder_ByMinimalistCollection.class,
            CollectionHolder_ByGenericCollection.class,
//            CollectionHolder_ByArrayCollection.class,
            CollectionHolder_ByMinimalistViewer.class,
            CollectionHolder_ByViewer.class,
            CollectionHolder_FromMinimalistExtensionFunction.class,
            CollectionHolder_FromExtensionFunction.class,
            CollectionHolder_FromArrayExtensionFunction.class,
            CollectionHolder_FromNullMinimalistExtensionFunction.class,
            CollectionHolder_FromNullExtensionFunction.class,
            CollectionHolder_FromNullArrayExtensionFunction.class,
    };

    @SuppressWarnings("unchecked cast") public static final Class<CollectionHolderForTest<?, ?>>[] everyInstances = (Class<CollectionHolderForTest<?, ?>>[]) new Class[]{
            CollectionHolder_ByMinimalistCollection.class,
            CollectionHolder_ByGenericCollection.class,
//            CollectionHolder_ByArrayCollection.class,
            CollectionHolder_ByMinimalistViewer.class,
            CollectionHolder_ByViewer.class,
    };

    public static final Arguments[] everyInstancesAsArguments = {
            Arguments.of(Named.of("collection (by minimalist)",        CollectionHolder_ByMinimalistCollection.class)),
            Arguments.of(Named.of("collection (by normal)",            CollectionHolder_ByGenericCollection.class)),
//            Arguments.of(Named.of("collection (by array)",             CollectionHolder_ByArrayCollection.class)),
            Arguments.of(Named.of("collection (by minimalist viewer)", CollectionHolder_ByMinimalistViewer.class)),
            Arguments.of(Named.of("collection (by normal viewer)",     CollectionHolder_ByViewer.class)),
    };

    public static final Arguments[] everyExtensionMethodInstancesAsArguments = {
            Arguments.of(Named.of(     "minimalist extension", new CollectionHolder_FromMinimalistExtensionFunction<>(EMPTY))),
            Arguments.of(Named.of("null minimalist extension", new CollectionHolder_FromNullMinimalistExtensionFunction<>())),
            Arguments.of(Named.of(     "normal extension",     new CollectionHolder_FromExtensionFunction<>(EMPTY))),
            Arguments.of(Named.of("null normal extension",     new CollectionHolder_FromNullExtensionFunction<>())),
            Arguments.of(Named.of(     "array extension",      new CollectionHolder_FromArrayExtensionFunction<>(EMPTY))),
            Arguments.of(Named.of("null array extension",      new CollectionHolder_FromNullArrayExtensionFunction<>())),
    };

    //#endregion -------------------- Framework instances --------------------

    //#region -------------------- Java Collection instances --------------------

    /// Every instances associated to a [java Collection][Collection] without being the nested children.
    ///
    /// Meaning, no [SequencedCollection], [List], [Set], [Queue] nor [Deque]
    @SuppressWarnings("unchecked cast") public static final Class<Collection<?>>[] everyJavaCollectionInstances = (Class<Collection<?>>[]) new Class[]{
            ArrayAsJavaCollection.class,
    };

    public static final Arguments[] everyJavaCollectionInstancesAsArguments = {
            Arguments.of(Named.of("Java Collection<T>", ArrayAsJavaCollection.class)),
    };

    //#endregion -------------------- Java Collection instances --------------------
    //#region -------------------- Java SequencedCollection instances --------------------

    /// Every instances associated to a [java SequencedCollection][SequencedCollection] without being the nested children.
    ///
    /// Meaning, no [List], [SequencedSet] nor [Deque]
    @SuppressWarnings("unchecked cast") public static final Class<SequencedCollection<?>>[] everyJavaSequencedCollectionInstances = (Class<SequencedCollection<?>>[]) new Class[]{
            ArrayAsJavaSequencedCollection.class,
    };

    public static final Arguments[] everyJavaSequencedCollectionInstancesAsArguments = {
            Arguments.of(Named.of("Java SequencedCollection<T>", ArrayAsJavaSequencedCollection.class)),
    };

    //#endregion -------------------- Java SequencedCollection instances --------------------
    //#region -------------------- Java List instances --------------------

    /// Every instances associated to a [java List][List] without being the nested children
    @SuppressWarnings("unchecked cast") public static final Class<List<?>>[] everyJavaListInstances = (Class<List<?>>[]) new Class[]{
            ArrayAsJavaList.class,
            ArrayAsJavaArrayList.class,
            ArrayAsJavaCopyOnWriteArrayList.class,
            ArrayAsJavaLinkedList.class,
            ArrayAsJavaVector.class,
            ArrayAsJavaStack.class,
    };

    public static final Arguments[] everyJavaListInstancesAsArguments = {
            Arguments.of(Named.of("Java List<T>",                 ArrayAsJavaList.class)),
            Arguments.of(Named.of("Java ArrayList<T>",            ArrayAsJavaArrayList.class)),
            Arguments.of(Named.of("Java CopyOnWriteArrayList<T>", ArrayAsJavaCopyOnWriteArrayList.class)),
            Arguments.of(Named.of("Java LinkedList<T>",           ArrayAsJavaLinkedList.class)),
            Arguments.of(Named.of("Java Vector<T>",               ArrayAsJavaVector.class)),
            Arguments.of(Named.of("Java Stack<T>",                ArrayAsJavaStack.class)),
    };

    //#endregion -------------------- Java List instances --------------------
    //#region -------------------- Java Set instances --------------------

    /// Every instances associated to a [java Set][Set] without being the nested children.
    ///
    /// Meaning, no [SequencedSet], [SortedSet] nor [NavigableSet]
    @SuppressWarnings("unchecked cast") public static final Class<Set<?>>[] everyJavaSetInstances = (Class<Set<?>>[]) new Class[]{
            ArrayAsJavaSet.class,
            ArrayAsJavaCopyOnWriteArraySet.class,
            ArrayAsJavaHashSet.class,
    };

    public static final Arguments[] everyJavaSetInstancesAsArguments = {
            Arguments.of(Named.of("Java Set<T>",                 ArrayAsJavaSet.class)),
            Arguments.of(Named.of("Java CopyOnWriteArraySet<T>", ArrayAsJavaCopyOnWriteArraySet.class)),
            Arguments.of(Named.of("Java HashSet<T>",             ArrayAsJavaHashSet.class)),
    };

    //#endregion -------------------- Java Set instances --------------------
    //#region -------------------- Java SequencedSet instances --------------------

    /// Every instances associated to a [java SequencedSet][SequencedSet] without being the nested children.
    ///
    /// Meaning, no [SortedSet] nor [NavigableSet]
    @SuppressWarnings("unchecked cast") public static final Class<SequencedSet<?>>[] everyJavaSequencedSetInstances = (Class<SequencedSet<?>>[]) new Class[]{
            ArrayAsJavaSequencedSet.class,
            ArrayAsJavaLinkedHashSet.class,
    };

    public static final Arguments[] everyJavaSequencedSetInstancesAsArguments = {
            Arguments.of(Named.of("Java SequencedSet<T>",  ArrayAsJavaSequencedSet.class)),
            Arguments.of(Named.of("Java LinkedHashSet<T>", ArrayAsJavaLinkedHashSet.class)),
    };

    //#endregion -------------------- Java SequencedSet instances --------------------
    //#region -------------------- Java SortedSet instances --------------------

    /// Every instances associated to a [java SortedSet][SortedSet] without being the nested children.
    ///
    /// Meaning, no [NavigableSet]
    @SuppressWarnings("unchecked cast") public static final Class<SortedSet<?>>[] everyJavaSortedSetInstances = (Class<SortedSet<?>>[]) new Class[]{
            ArrayAsJavaSortedSet.class,
    };

    public static final Arguments[] everyJavaSortedSetInstancesAsArguments = {
            Arguments.of(Named.of("Java SortedSet<T>", ArrayAsJavaSortedSet.class)),
    };

    //#endregion -------------------- Java SortedSet instances --------------------
    //#region -------------------- Java NavigableSet instances --------------------

    /// Every instances associated to a [java NavigableSet][NavigableSet] without being the nested children
    @SuppressWarnings("unchecked cast") public static final Class<NavigableSet<?>>[] everyJavaNavigableSetInstances = (Class<NavigableSet<?>>[]) new Class[]{
            ArrayAsJavaNavigableSet.class,
            ArrayAsJavaConcurrentSkipListSet.class,
            ArrayAsJavaTreeSet.class,
    };

    public static final Arguments[] everyJavaNavigableSetInstancesAsArguments = {
            Arguments.of(Named.of("Java NavigableSet<T>",          ArrayAsJavaNavigableSet.class)),
            Arguments.of(Named.of("Java ConcurrentSkipListSet<T>", ArrayAsJavaConcurrentSkipListSet.class)),
            Arguments.of(Named.of("Java TreeSet<T>",               ArrayAsJavaTreeSet.class)),
    };

    //#endregion -------------------- Java NavigableSet instances --------------------
    //#region -------------------- Java Queue instances --------------------

    /// Every instances associated to a [java Queue][Queue] without being the nested children.
    ///
    /// Meaning, no [LinkedList][java.util.LinkedList], [BlockingQueue], [TransferQueue] nor [Deque]
    @SuppressWarnings("unchecked cast") public static final Class<Queue<?>>[] everyJavaQueueInstances = (Class<Queue<?>>[]) new Class[]{
            ArrayAsJavaQueue.class,
            ArrayAsJavaConcurrentLinkedQueue.class,
            ArrayAsJavaPriorityQueue.class,
    };

    public static final Arguments[] everyJavaQueueInstancesAsArguments = {
            Arguments.of(Named.of("Java Queue<T>",                 ArrayAsJavaQueue.class)),
            Arguments.of(Named.of("Java ConcurrentLinkedQueue<T>", ArrayAsJavaConcurrentLinkedQueue.class)),
            Arguments.of(Named.of("Java PriorityQueue<T>",         ArrayAsJavaPriorityQueue.class)),
    };

    //#endregion -------------------- Java Queue instances --------------------
    //#region -------------------- Java BlockingQueue instances --------------------

    /// Every instances associated to a [java BlockingQueue][BlockingQueue] without being the nested children.
    ///
    /// Meaning, no [SynchronousQueue], [TransferQueue] nor [BlockingDeque]
    @SuppressWarnings("unchecked cast") public static final Class<BlockingQueue<?>>[] everyJavaBlockingQueueInstances = (Class<BlockingQueue<?>>[]) new Class[]{
            ArrayAsJavaBlockingQueue.class,
            ArrayAsJavaArrayBlockingQueue.class,
            ArrayAsJavaLinkedBlockingQueue.class,
            ArrayAsJavaPriorityBlockingQueue.class,
    };

    public static final Arguments[] everyJavaBlockingQueueInstancesAsArguments = {
            Arguments.of(Named.of("Java BlockingQueue<T>",         ArrayAsJavaBlockingQueue.class)),
            Arguments.of(Named.of("Java ArrayBlockingQueue<T>",    ArrayAsJavaArrayBlockingQueue.class)),
            Arguments.of(Named.of("Java LinkedBlockingQueue<T>",   ArrayAsJavaLinkedBlockingQueue.class)),
            Arguments.of(Named.of("Java PriorityBlockingQueue<T>", ArrayAsJavaPriorityBlockingQueue.class)),
    };

    //#endregion -------------------- Java BlockingQueue instances --------------------
    //#region -------------------- Java SynchronousQueue instances --------------------

    /// Every instances associated to a [java BlockingQueue][SynchronousQueue] without being the nested children.
    @SuppressWarnings("unchecked cast") public static final Class<SynchronousQueue<?>>[] everyJavaSynchronousQueueInstances = (Class<SynchronousQueue<?>>[]) new Class[]{
            ArrayAsJavaSynchronousQueue.class,
    };

    public static final Arguments[] everyJavaSynchronousQueueInstancesAsArguments = {
            Arguments.of(Named.of("Java SynchronousQueue<T>", ArrayAsJavaSynchronousQueue.class)),
    };

    //#endregion -------------------- Java SynchronousQueue instances --------------------
    //#region -------------------- Java TransferQueue instances --------------------

    /// Every instances associated to a [java TransferQueue][TransferQueue] without being the nested children
    @SuppressWarnings("unchecked cast") public static final Class<TransferQueue<?>>[] everyJavaTransferQueueInstances = (Class<TransferQueue<?>>[]) new Class[]{
            ArrayAsJavaTransferQueue.class,
            ArrayAsJavaLinkedTransferQueue.class,
    };

    public static final Arguments[] everyJavaTransferQueueInstancesAsArguments = {
            Arguments.of(Named.of("Java TransferQueue<T>",       ArrayAsJavaTransferQueue.class)),
            Arguments.of(Named.of("Java LinkedTransferQueue<T>", ArrayAsJavaLinkedTransferQueue.class)),
    };

    //#endregion -------------------- Java TransferQueue instances --------------------
    //#region -------------------- Java Deque instances --------------------

    /// Every instances associated to a [java Deque][Deque] without being the nested children.
    ///
    /// Meaning, no [LinkedList][java.util.LinkedList] nor [BlockingDeque]
    @SuppressWarnings("unchecked cast") public static final Class<Deque<?>>[] everyJavaDequeInstances = (Class<Deque<?>>[]) new Class[]{
            ArrayAsJavaDeque.class,
            ArrayAsJavaArrayDeque.class,
            ArrayAsJavaConcurrentLinkedDeque.class,
    };

    public static final Arguments[] everyJavaDequeInstancesAsArguments = {
            Arguments.of(Named.of("Java Deque<T>",                 ArrayAsJavaDeque.class)),
            Arguments.of(Named.of("Java ArrayDeque<T>",            ArrayAsJavaArrayDeque.class)),
            Arguments.of(Named.of("Java ConcurrentLinkedDeque<T>", ArrayAsJavaConcurrentLinkedDeque.class)),
    };

    //#endregion -------------------- Java Deque instances --------------------
    //#region -------------------- Java BlockingDeque instances --------------------

    /// Every instances associated to a [java BlockingDeque][BlockingDeque] without being the nested children
    @SuppressWarnings("unchecked cast") public static final Class<BlockingDeque<?>>[] everyJavaBlockingDequeInstances = (Class<BlockingDeque<?>>[]) new Class[]{
            ArrayAsJavaBlockingDeque.class,
            ArrayAsJavaLinkedBlockingDeque.class,
    };

    public static final Arguments[] everyJavaBlockingDequeInstancesAsArguments = {
            Arguments.of(Named.of("Java BlockingDeque<T>",       ArrayAsJavaBlockingDeque.class)),
            Arguments.of(Named.of("Java LinkedBlockingDeque<T>", ArrayAsJavaLinkedBlockingDeque.class)),
    };

    //#endregion -------------------- Java BlockingDeque instances --------------------

}

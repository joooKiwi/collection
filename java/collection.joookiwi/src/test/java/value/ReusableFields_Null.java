package value;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.NavigableSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.SequencedCollection;
import java.util.SequencedSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.Spliterator;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TransferQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.DoubleAccumulator;
import java.util.concurrent.atomic.DoubleAdder;
import java.util.concurrent.atomic.LongAccumulator;
import java.util.concurrent.atomic.LongAdder;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.callback.IntObjFunction;
import joookiwi.collection.java.callback.IntObjPredicate;
import joookiwi.collection.java.callback.ObjIntFunction;
import joookiwi.collection.java.callback.ObjIntPredicate;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CollectionConstants.emptyArray;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;

public final class ReusableFields_Null {

    @Contract(ALWAYS_FAIL_0) private ReusableFields_Null() { throw new Error("The utility class “ReusableFields_Null” cannot be constructed."); }

    public static final @Nullable Object                                           NULL_OBJECT = null;
    public static final @Nullable CharSequence                                     NULL_CHAR_SEQUENCE = null;
    public static final @Nullable String                                           NULL_STRING = null;
    public static final @Nullable Character                                        NULL_CHARACTER = null;

    public static final @Nullable ObjIntFunction<?, ? super String>                NULL_SUPPLIER2 = null;
    public static final @Nullable IntObjFunction<?, ? super String>                NULL_SUPPLIER2_ALT = null;
    public static final @Nullable Function<?, ? super String>                      NULL_SUPPLIER1 = null;
    public static final @Nullable IntFunction<? extends String>                    NULL_SUPPLIER1_ALT = null;
    public static final @Nullable Supplier<? extends String>                       NULL_SUPPLIER0 = null;
    public static final @Nullable ObjIntPredicate<? super String>                  NULL_PREDICATE2 = null;
    public static final @Nullable IntObjPredicate<? super String>                  NULL_PREDICATE2_ALT = null;
    public static final @Nullable Predicate<? super String>                        NULL_PREDICATE1 = null;
    public static final @Nullable IntPredicate                                     NULL_PREDICATE1_ALT = null;
    public static final @Nullable BooleanSupplier                                  NULL_PREDICATE0 = null;

    public static final @Nullable MinimalistCollectionHolder<? extends String>     NULL_MINIMALIST_COLLECTION_HOLDER = null;
    public static final @Nullable CollectionHolder<? extends String>               NULL_COLLECTION_HOLDER = null;
    public static final @Nullable Iterator<? extends String>                       NULL_JAVA_ITERATOR = null;
    public static final @Nullable ListIterator<? extends String>                   NULL_JAVA_LIST_ITERATOR = null;
    public static final @Nullable Spliterator<? extends String>                    NULL_JAVA_SPLITERATOR = null;
    public static final @Nullable Enumeration<? extends String>                    NULL_JAVA_ENUMERATION = null;
    public static final @Nullable Iterable<? extends String>                       NULL_JAVA_ITERABLE = null;
    public static final @Nullable Collection<? extends String>                     NULL_JAVA_COLLECTION = null;
    public static final @Nullable SequencedCollection<? extends String>            NULL_JAVA_SEQUENCED_COLLECTION = null;
    public static final @Nullable List<? extends String>                           NULL_JAVA_LIST = null;
    public static final @Nullable ArrayList<? extends String>                      NULL_JAVA_ARRAY_LIST = null;
    public static final @Nullable CopyOnWriteArrayList<? extends String>           NULL_JAVA_COPY_ON_WRITE_ARRAY_LIST = null;
    public static final @Nullable LinkedList<? extends String>                     NULL_JAVA_LINKED_LIST = null;
    public static final @Nullable Vector<? extends String>                         NULL_JAVA_VECTOR = null;
    public static final @Nullable Set<? extends String>                            NULL_JAVA_SET = null;
    public static final @Nullable SequencedSet<? extends String>                   NULL_JAVA_SEQUENCED_SET = null;
    public static final @Nullable SortedSet<? extends String>                      NULL_JAVA_SORTED_SET = null;
    public static final @Nullable NavigableSet<? extends String>                   NULL_JAVA_NAVIGABLE_SET = null;
    public static final @Nullable ConcurrentSkipListSet<? extends String>          NULL_JAVA_CONCURRENT_SKIP_LIST_SET = null;
    public static final @Nullable CopyOnWriteArraySet<? extends String>            NULL_JAVA_COPY_ON_WRITE_ARRAY_SET = null;
    public static final @Nullable HashSet<? extends String>                        NULL_JAVA_HASH_SET = null;
    public static final @Nullable LinkedHashSet<? extends String>                  NULL_JAVA_LINKED_HASH_SET = null;
    public static final @Nullable TreeSet<? extends String>                        NULL_JAVA_TREE_SET = null;
    public static final @Nullable Queue<? extends String>                          NULL_JAVA_QUEUE = null;
    public static final @Nullable BlockingQueue<? extends String>                  NULL_JAVA_BLOCKING_QUEUE = null;
    public static final @Nullable TransferQueue<? extends String>                  NULL_JAVA_TRANSFER_QUEUE = null;
    public static final @Nullable ArrayBlockingQueue<? extends String>             NULL_JAVA_ARRAY_BLOCKING_QUEUE = null;
    public static final @Nullable ConcurrentLinkedQueue<? extends String>          NULL_JAVA_CONCURRENT_LINKED_QUEUE = null;
    public static final @Nullable LinkedBlockingQueue<? extends String>            NULL_JAVA_LINKED_BLOCKING_QUEUE = null;
    public static final @Nullable LinkedTransferQueue<? extends String>            NULL_JAVA_LINKED_TRANSFER_QUEUE = null;
    public static final @Nullable PriorityBlockingQueue<? extends String>          NULL_JAVA_PRIORITY_BLOCKING_QUEUE = null;
    public static final @Nullable PriorityQueue<? extends String>                  NULL_JAVA_PRIORITY_QUEUE = null;
    public static final @Nullable SynchronousQueue<? extends String>               NULL_JAVA_SYNCHRONOUS_QUEUE = null;
    public static final @Nullable Deque<? extends String>                          NULL_JAVA_DEQUE = null;
    public static final @Nullable BlockingDeque<? extends String>                  NULL_JAVA_BLOCKING_DEQUE = null;
    public static final @Nullable ArrayDeque<? extends String>                     NULL_JAVA_ARRAY_DEQUE = null;
    public static final @Nullable ConcurrentLinkedDeque<? extends String>          NULL_JAVA_CONCURRENT_LINKED_DEQUE = null;
    public static final @Nullable LinkedBlockingDeque<? extends String>            NULL_JAVA_LINKED_BLOCKING_DEQUE = null;
    public static final @Nullable Stack<? extends String>                          NULL_JAVA_STACK = null;
    public static final String @Nullable @Unmodifiable []                          NULL_ARRAY = null;

    public static final Object @Nullable @Unmodifiable []                          NULL_VARARGS = null;

    public static final @Nullable AtomicInteger                                    NULL_ATOMIC_INTEGER = null;
    public static final @Nullable AtomicLong                                       NULL_ATOMIC_LONG = null;
    public static final @Nullable LongAdder                                        NULL_LONG_ADDER = null;
    public static final @Nullable LongAccumulator                                  NULL_LONG_ACCUMULATOR = null;
    public static final @Nullable DoubleAdder                                      NULL_DOUBLE_ADDER = null;
    public static final @Nullable DoubleAccumulator                                NULL_DOUBLE_ACCUMULATOR = null;
    public static final @Nullable Number                                           NULL_NUMBER = null;

}

import java.util.NoSuchElementException;

/**
 * Queue interface
 * @param <T> Type of variable used
 */
public interface QueueInterface<T> {
    /**
     * Adds element e to the queue at the end of the queue without violating the restrictions on the capacity.
     * @param e Element to be added.
     * @throws IllegalStateException if the capacity is exhausted.
     */
    void addQueue(T e) throws IllegalStateException;
    /**
     * Peek at the next element.
     * @return The head of the queue without removing it.
     */
    T getFront();
    /**
     * Removes the head of the queue and returns it.
     * @return The head of the queue.
     * @throws NoSuchElementException when the queue is empty.
     */
    T remQueue() throws NoSuchElementException;
    /**
     * Detects if the queue is empty.
     * @return True if empty, false otherwise.
     */
    boolean isEmpty();
    /**
     * Size of Queue
     * @return The size or number of elements in the queue.
     */
    int size();
    /**
     * Removes all elements in queue.
     */
    void clear();
}

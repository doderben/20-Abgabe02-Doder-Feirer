package at.fhj.iit;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * This class can be used as a queue. It can also be parameterized with. It implements the IQueue Interface
 *
 * @param <T>
 */
public class GenericQueue<T> implements IQueue<T> {

    /**
     * all the elements in the queue from front to back
     */
    private List<T> elements = new ArrayList<T>();

    /**
     * the maximum size of the queue
     */
    private int maxSize;

    /**
     * Creates a StringQueue object with a given maxSize
     *
     * @param maxSize the maximum size of the queue
     */
    public GenericQueue(int maxSize) {
        this.maxSize = maxSize;
    }

    @Override
    public boolean offer(T obj) {
        if (elements.size() != maxSize)
            elements.add(obj);
        else
            return false;

        return true;
    }

    @Override
    public T poll() {
        T element = peek();

        if (elements.size() > 0) {
            elements.remove(0);
        }

        return element;
    }

    @Override
    public T remove() {
        T element = poll();
        if (element == null)
            throw new NoSuchElementException("there's no element any more");

        return element;
    }

    @Override
    public T peek() {
        T element;
        if (elements.size() > 0)
            element = elements.get(0);
        else
            element = null;

        return element;
    }

    @Override
    public T element() {
        T element = peek();
        if (element == null)
            throw new NoSuchElementException("there's no element any more");

        return element;
    }

    /**
     * getter for maxSize
     *
     * @return the maximum Size of the Queue
     */
    public int getMaxSize() {
        return maxSize;
    }

}

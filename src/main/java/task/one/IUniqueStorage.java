package task.one;


import java.util.Iterator;

/**
 * @param <T> what store
 *
 */
interface IUniqueStorage <T> {

    /**
     * @param t what add
     */
    void add(T t);

    /**
     * @param t which to remove
     */
    void remove(T t);

    /**
     * @param t which
     * @return true if contain
     */
    boolean contains(T t);

    /**
     * @return iterator
     */
    Iterator<T> iterator();

}

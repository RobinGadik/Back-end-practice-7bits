package task.one;

/**
 * @param <T1> key
 * @param <T2> value
 */
interface IFixedStorage<T1, T2> {
    /**
     * @param t1 key
     * @param t2 value
     */
    void add(T1 t1, T2 t2);

    /**
     * @param t1 key
     */
    void remove(T1 t1);

    /**
     * @param t1 key
     * @return value
     */
    T2 get(T1 t1);

    /**
     * @param t2 value
     * @return true if value contain
     */
    boolean contains(T2 t2);
}

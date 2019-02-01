package task.one;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.KeyException;
import java.util.HashMap;
import java.util.Map;

/**
 * @param <T1> key
 * @param <T2> value
 */
class MaxSevenStorage <T1, T2> implements IFixedStorage<T1 , T2> {

    private Map<T1, T2> store;
    private static final Logger logger = LoggerFactory.getLogger(MaxSevenStorage.class);

    /**
     *
     */
    MaxSevenStorage() {
        this.store = new HashMap<>();
    }

    @Override
    public void add(final T1 t1, final T2 t2) {
        if (store.containsKey(t1)) {
            store.put(t1, t2);
            logger.warn("Key exist, change value");
        } else {
            if (7 <= store.size()) {
                logger.error("Max size");

            } else {
            store.put(t1, t2);
            logger.info("value " + t2.toString() +  " added");
            }
        }
    }

    @Override
    public void remove(final T1 t1) {
        if (store.containsKey(t1)) {
            store.remove(t1);
            logger.info("Key exist, removed value");
        } else {
            logger.info("Key doesn't exist");
        }
    }

    @Override
    public T2 get(final T1 t1) {
        if (store.containsKey(t1)) {
            logger.info("Key exist");
            return store.get(t1);
        } else {
            logger.error("Key doesn't exist", new KeyException());
            return null;
        }
    }

    @Override
    public boolean contains(final T2 t2) {
        for (T2 t : store.values()) {
            if (t.equals(t2)) {
                return true;
            }
        }
        return false;
    }
}

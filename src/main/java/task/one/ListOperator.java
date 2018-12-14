package task.one;

import java.util.List;
import java.util.NoSuchElementException;

class ListOperator {

    public <T extends Comparable<T>> T max(final List<T> list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("Empty list");
        }
        T max = list.get(0);
        for (T t : list) {
            if (max.compareTo(t) < 0) {
                max = t;
            }
        }
        return max;
    }

    public <T> void changeElementsPosition(List<T> list , int first , int second) {
        T f = list.get(first);
        T s = list.get(second);
        list.remove(first);
        list.add(first, s);

        list.remove(second);
        list.add(second, f);
    }

}

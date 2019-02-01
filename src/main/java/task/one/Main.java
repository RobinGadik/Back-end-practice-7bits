package task.one;

import java.util.Iterator;

/**
 *
 */
class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        PlanetStorage ps = new PlanetStorage();
        ps.add(new Planet("first"));
        ps.add(new Planet("second"));
        ps.add(new Planet("third"));
        ps.add(new Planet("another"));
        ps.add(new Planet("4"));
        ps.add(new Planet("5"));
        Planet t = new Planet("6");
        ps.add(t);
        ps.add(t);
        ps.add(t);
        ps.contains(t);
        ps.remove(t);


        IFixedStorage<String, Planet> fs = new MaxSevenStorage<>();
        for (int i = 0; i < 5 ; i++ ) {
            t = new Planet(String.valueOf(i));
            fs.add(t.getId(), t);
        }

        fs.add(t.getId(), new Planet("Another"));

        for (int i = 5 ; i < 10 ; i++) {
            t = new Planet(String.valueOf(i));
            fs.add(t.getId(), t);
        }

        boolean flag = true;
        Iterator<Planet> it = ps.iterator();
        while (it.hasNext()) {
            t = it.next();
            if (!fs.contains(t)) {
                flag = false;
            }
        }

        if (flag) {
            System.out.println("Contains all elems of ps");
        } else {
            System.out.println("Not contains all elems of ps");
        }

        fs = new MaxSevenStorage<>();
        flag = true;
        it = ps.iterator();
        while (it.hasNext()) {
            t = it.next();
            fs.add(t.getId(), t);
        }

        it = ps.iterator();
        while (it.hasNext()) {
            t = it.next();
            if (!fs.contains(t)) {
                flag = false;
            }
        }
        if (flag) {
            System.out.println("Contains all elems of ps");
        } else {
            System.out.println("Not contains all elems of ps");
        }

    }

}

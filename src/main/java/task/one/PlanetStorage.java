package task.one;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * unic planet storage
 */
class PlanetStorage implements IUniqueStorage<Planet> {

    private Set<Planet> store;
    private static final Logger LOGGER = LoggerFactory.getLogger(PlanetStorage.class);

    @Override
    public void add(final Planet planet) {
        if (store.contains(planet)) {
            LOGGER.warn("Planet " + planet.getName() + " in store now");
        } else {
            try {
                store.add(planet);
                LOGGER.info("Planet " + planet.getName() + " added");
            } catch (Exception e) {
                LOGGER.error("Adding error" , e);
                throw e;
            }
        }
    }

    @Override
    public void remove(final Planet planet) {
       try {
            store.remove(planet);
            LOGGER.info("Planet " + planet.getName() + " removed");
       } catch (Exception e) {
            LOGGER.error("Remove error" , e);
            throw e;
       }

    }

    /**
     *
     */
    PlanetStorage() {
        store = new HashSet<>();
    }

    @Override
    public boolean contains(final Planet planet) {
        if (store.contains(planet)) {
            LOGGER.info("Planet " + planet.getName() + " in store now");
            return true;
        } else {
            LOGGER.info("Planet " + planet.getName() + " not in store now");
            return false;

        }
    }

    @Override
    public Iterator<Planet> iterator() {
        return store.iterator();
    }


}

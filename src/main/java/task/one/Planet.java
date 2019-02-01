package task.one;

import java.util.UUID;

/**
 *
 */
class Planet {
    private String name;
    private String id;

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Planet planet = (Planet) o;

        return (getName() != null ? getName().equals(planet.getName()) : planet.getName() == null) && (getId() != null ? getId().equals(planet.getId()) : planet.getId() == null);
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getId() != null ? getId().hashCode() : 0);
        return result;
    }

    /**
     * @param name of planet
     */
    Planet(final String name) {
        this.name = name;
        this.id = UUID.randomUUID().toString();
    }

    String getName() {
        return name;
    }

    String getId() {
        return id;
    }
}
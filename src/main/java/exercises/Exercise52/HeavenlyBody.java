package exercises.Exercise52;

import java.util.HashSet;
import java.util.Set;

public abstract class HeavenlyBody {
    private final Key key;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;

    public HeavenlyBody(String name, double orbitalPeriod, BodyTypes bodyType) {
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
        this.key = new Key(name, bodyType);
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public Key getKey() {
        return key;
    }

    @SuppressWarnings("unused")
    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    public boolean addSatellite (HeavenlyBody moon) {
        return this.satellites.add(moon);
    }


    @Override
    public final boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }

        if ((obj instanceof HeavenlyBody hev)) {
            return this.key == hev.getKey();
        }

        return false;
    }

    @Override
    public final int hashCode() {
        System.out.println("hashcode called");
        return this.key.hashCode();
    }

    @SuppressWarnings("unused")
    public static Key makeKey(String name, BodyTypes bodyType) {
        return new Key(name, bodyType);
    }

    @Override
    public String toString() {
        return this.key.name + ": " + this.key.bodyType + ", " + this.getOrbitalPeriod();
    }

    public static final class Key {
        private String name;
        private BodyTypes bodyType;

        private Key(String name, BodyTypes bodyTypes) {
            this.name = name;
            this.bodyType = bodyTypes;
        }

        public String getName() {
            return name;
        }

        public BodyTypes getBodyType() {
            return bodyType;
        }

        @Override
        public int hashCode() {
            return this.name.hashCode() + 4 + this.bodyType.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            Key newKey = (Key) obj;
            if (this.getName().equals(newKey.getName())) {
                return this.getBodyType().equals(newKey.getBodyType());
            }
            return false;
        }

        @Override
        public String toString() {
            return this.getName() + ": " + this.getBodyType();
        }
    }

    @SuppressWarnings("unused")
    public enum BodyTypes {
        PLANET,
        DWARF_PLANET,
        MOON
    }
}

package exercises;

import java.util.List;
import java.util.ArrayList;

public class Exercise47Interface {

}

interface ISaveable {
    List<String> write();
    void read(List<String> list);
}

class Player implements ISaveable {
    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.weapon = "Sword";
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public String getWeapon() {
        return weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public List<String> write() {
        List<String> list = new ArrayList<>();
        list.add(0, this.name);
        list.add(1, "" + this.hitPoints);
        list.add(2, "" + this.strength);
        list.add(3, this.weapon);
        return list;
    }

    @Override
    public void read(List<String> list) {
        if (list != null) {
            if (list.size() > 0) {
                setName(list.get(0));
                setHitPoints(Integer.parseInt(list.get(1)));
                setStrength(Integer.parseInt(list.get(2)));
                setWeapon(list.get(3));
            }
        }
    }

    @Override
    public String toString() {
        return "Player{name='" + getName() +
                "', hitPoints=" + getHitPoints() +
                ", strength=" + getStrength() +
                ", weapon='" + getWeapon() + "'}";
    }
}

class Monster implements ISaveable {
    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public List<String> write() {
        List<String> list = new ArrayList<>();
        list.add(getName());
        list.add(String.valueOf(getHitPoints()));
        list.add(String.valueOf(getStrength()));
        return list;
    }

    @Override
    public void read(List<String> list) {
        if (list != null) {
            if (list.size() > 0) {
                this.name = list.get(0);
                this.hitPoints = Integer.parseInt(list.get(1));
                this.strength = Integer.parseInt(list.get(2));
            }
        }
    }

    @Override
    public String toString() {
        return "Player{name='" + getName() +
                "', hitPoints=" + getHitPoints() +
                ", strength=" + getStrength() + "}";
    }
}

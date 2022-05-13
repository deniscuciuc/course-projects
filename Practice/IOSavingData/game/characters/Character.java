package game.characters;

import java.io.Serializable;

public class Character implements Serializable {

    transient private String id;
    private int power;
    private String race;

    public Character(String id,int power, String race) {
        this.id = id;
        this.power = power;
        this.race = race;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }
}

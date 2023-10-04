import java.util.*;
import java.util.Random;

public abstract class Character {
    private String id;
    private String name;
    private int hp;
    private boolean isAlive;
    Random rand = new Random();


    public Character(String name, int hp, boolean isAlive) {
        this.id = id;
        this.name = name;
        this.hp = hp;
        this.isAlive = true;
    }


    public String getName() {


        return name;
    }

    public void setId(String id) {

        this.id = Integer.toString(rand.nextInt(10000));
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getHp() {

        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public boolean isAlive() {

        return isAlive;
    }

    public void setAlive(boolean alive) {

        isAlive = alive;
    }

}


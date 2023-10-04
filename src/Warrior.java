public class Warrior extends Character implements Attacker {
    private int stamina;
    private int strength;


    public Warrior(String name, int hp, int stamina, int strength, boolean isAlive) {
        super(name, hp, isAlive);
        this.stamina = stamina;
        this.strength = strength;
    }


    public int getStamina() {

        return stamina;
    }

    public void setStamina(int stamina) {

        this.stamina = stamina;
    }

    public int getStrength() {

        return strength;
    }

    public void setStrength(int strength) {

        this.strength = strength;
    }

    public void setHp(int hp) {

        super.setHp(hp);
    }


    @Override
    public void attack(Character C) {

        if (stamina == 0) {
            stamina += 2;
        } else {

            int attackType = (int) (Math.random() * 2);
            if (attackType == 0) {
                if (stamina >= 5) {

                    C.setHp(C.getHp() - strength);


                    stamina -= 5;
                } //heavy attack
                else {
                    C.setHp(C.getHp() - (strength / 2));

                    stamina++;
                } // weak attack
            } else {
                C.setHp(C.getHp() - (strength / 2));

                stamina++;
            } //weak attack
        }
        if (C.getHp() <= 0) {
            C.setAlive(false);
        }
    }
}




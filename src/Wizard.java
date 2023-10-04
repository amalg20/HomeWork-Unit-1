public class Wizard extends Character implements Attacker {
    private int mana;
    private int intelligence;

    public Wizard(String name, int hp, int mana, int intelligence, boolean isAlive) {
        super(name, hp, isAlive);
        this.mana = mana;
        this.intelligence = intelligence;
    }

    public int getMana() {

        return mana;
    }

    public void setMana(int mana) {

        this.mana = mana;
    }

    public int getIntelligence() {

        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public void setHp(int hp) {
        super.setHp(hp);
    }

    @Override
    public void attack(Character character) {
        if (mana == 0) {
            mana += 2;
        } else {

            int attackType = (int) (Math.random() * 2);
            if (attackType == 0) {
                if (mana >= 5) {

                    character.setHp(character.getHp() - intelligence);

                    mana -= 5;
                } //Fireball
                else {
                    character.setHp(character.getHp() - (intelligence = 2));
                    mana++;
                } // Staff hit
            } else {
                character.setHp(character.getHp() - (intelligence = 2));
                mana++;
            } //Staff hit
        }
        if (character.getHp() <= 0) {
            character.setAlive(false);
        }
    }
}



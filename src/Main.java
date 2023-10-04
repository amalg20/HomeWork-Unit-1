import java.util.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Wizard wizard = null;
        Warrior warrior = null;


        int hp, stamina, strength, mana, intelligence;
        System.out.println("Welcome to the game!");
        while (true) {

            System.out.println("Please select an option:");
            System.out.println("1. Create a new warrior");
            System.out.println("2. Create a new wizard");
            System.out.println("3. Start a battle");
            System.out.println("4. Quit");
            int choice = scanner.nextInt();

            switch (choice) {

                // create warrior
                case 1:
                    System.out.println("Enter the warrior's name:");
                    String name = scanner.next();
                    do {
                        System.out.println("Enter the warrior's HP (between 100 - 200):");
                        hp = scanner.nextInt();
                    } while (hp > 200 || hp < 100);
                    do {
                        System.out.println("Enter the warrior's stamina (between 10 - 50):");
                        stamina = scanner.nextInt();
                    } while (stamina > 50 || stamina < 10);
                    do {
                        System.out.println("Enter the warrior's strength (between 1 - 10):");
                        strength = scanner.nextInt();
                    } while (strength > 10 || strength < 1);
                    warrior = new Warrior(name, hp, stamina, strength, true);
                    break;

                // create wizard
                case 2:
                    System.out.println("Enter the wizard's name:");
                    name = scanner.next();
                    do {
                        System.out.println("Enter the wizard's HP (between 50 - 100):");
                        hp = scanner.nextInt();
                    } while (hp > 100 || hp < 50);
                    do {
                        System.out.println("Enter the wizard's mana (between 10 - 50):");
                        mana = scanner.nextInt();
                    } while (mana > 50 || mana < 10);
                    do {
                        System.out.println("Enter the wizard's intelligence (between 1 - 50):");
                        intelligence = scanner.nextInt();
                    } while (intelligence > 50 || intelligence < 1);
                    wizard = new Wizard(name, hp, mana, intelligence, true);
                    break;

                // start battle
                case 3:
                    int round = 0;
                    while (warrior.isAlive() && wizard.isAlive() && round < 15) {
                        System.out.println("The number of the round is : " + ++round);

                        warrior.attack(wizard);
                        //sout a message that says "wizard has done X damage to the wizard.
                        System.out.println("warrior has done " + warrior.getHp() + " damage to the wizard");
                        Thread.sleep(1000);

                        System.out.println("wizard has done " + wizard.getHp() + " damage to the wizard");
                        wizard.attack(warrior);
                        Thread.sleep(1000);
                    }
                    if (!warrior.isAlive()) {
                        System.out.println("The wizard wins!");

                    } else if (!wizard.isAlive()) {
                        System.out.println("The warrior wins!");
                    } else {
                        System.out.println(" There is a draw ");
                    }
                    break;

                // exit
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid selection.");
                    break;

            }
        }
    }
}

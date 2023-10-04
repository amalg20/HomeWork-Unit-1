# HomeWork-Unit-1

 In this homework, you will implement a basic **RPG battle** simulator that will consist of having two characters fighting to determine one winner...
In the first part we  create **Attacker** interfacehave:
A public void function __attack()__ that takes a character as a parameter

In the other class, we create **Character** class (Parent-Abstrac): 
This class  will contains the following Private variables: __id , name , hp ,isAlive__  
In hp Variable called hp of data type int, ***random between 100-200*** to warriors and ***50-100*** for wizards, representing the health points 
Variable called isAlive of data type boolean defaulted to true
 We create constructor that takes all the variable 
We create Public Getter and   Setter functions
**Warrior** Class (child1)  This class is extends from the Character class. A Warrior is a Character that fights by attacking. Attacks inflict damage and in order to do one
This class  will contains the following  Private variables : 
***•	private int hp – random (100-200)
•	private int stamina – random (10-50)
•	private int strength – random (1-10)***
 in Variable stamina, random between 10-50, representing a resource the warrior consumes to make an attack
 in Variable strength random between 1-10, measuring how strong the warrior attack
A constructor that takes name, hp, stamina and strength : Warrior (String name, int hp, int stamina, int strength)
public function that overloads attack() implemented in the Attacker interface, that will take a character as a parameter and reduce that character’s health based on the strength of the
 attack on  Each round --> random (Heavy / Weak attack )
1- Heavy  it will create when Damage  equals strength and then each hit will decrease (stamina -5)
2- Weak it will create when Damage equal strength/2 and then each hit will recover stamina +1


 
***Wizard*** class (child2)  This class is extends from the Character class A Wizard is a Character that fights by casting spells. Spells inflict damage and require mana to be cast.
This class  will contains the following  Private variables :
***private int hp – random (50-100)
private int mana – random (10-50) 
private int intelligence – random (1-50)***
•	Variable called mana of data type int, random between 10-50, representing a resource the wizard consumes to cast spells 
•	Variable called intelligence of data type int, random between 1-50, measuring how strong the wizard spells 
A constructor that takes name, hp, mana and intelligence also we did Getter and Setter 


### Simple drawn to represent the Homework

[HW 1 - IronBattle.pdf](https://github.com/amalg20/HomeWork-Unit-1/files/12803432/HW.1.-.IronBattle.pdf)


A public function that overloads attack() implemented in the Attacker interface, that will take a character as a parameter and reduce that character’s health based on the intelligence of the spell
1- Fireball it will create when Damage equals intelligence and then each hit will decrease mana -5 
2- Weak it will create when Damage equals 2 , and then each hit will recover mana +1

## In the Main Class 

we Generate players (Warrior/ wizard) – Rounds 
And  we initialized the variables int hp, stamina, strength, mana, intelligence 
In class main we use function **Switch**  to create  cases  of the game in
 case (1)  we create the  warrior  we ask from user to Enter the number of the case 1 then Enter the The following details name and  health points and stamina and strength the game of case 1 will  be created

case (2)  we create the  Wizard we ask from user to Enter the number of the case 2 then Enter the The following details name and health points and  mana and intelligence the game of case 2 will  be created 

case (3) start battle we ask from user to Enter the number of the case 3 In the third step, the game will start and emerge as the winner at this point ,We  Use the **speed** function to reduce the number of data appearances in case 3 the steps will begin to decrease in seconds for our use of the millisecond function. Then you will start choosing the winner according to the requirements 
case(4) - game ends 


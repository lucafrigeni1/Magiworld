package Magiworld;

public class Menu {

    public String welcome {
        System.out.println("Welcome in MagiWorld. A fighting game between Warrior, Bowman and Wizard");
        System.out.println("First you have to choose your characters"); }

    public String choiceP1 {
        System.out.println("P1 what will you play ?"); }

    public String choiceP2 {
        System.out.println("P2 what will you play ?"); }

    public String characters {
        System.out.println("1_ Warrior: he attack with a sword and use is strength");
        System.out.println("RAGE: The Warrior hit 2 times but is strength is divide by 2 and he lost a little bit of life");
        System.out.println("2_ Wizard: he is very smart and can heal is self");
        System.out.println("HEAL: The Wizard heal himself (the healing amount is equals of the intelligence X2)");
        System.out.println("3_ Bowman: he use a bow and is very agile");
        System.out.println("CONCENTRATION: The Bowman gain is level/2 in agility"); }

        //Switch

    public String charactersLevel {
        System.out.println("You have to choose the level of your characters (between 1 and 100)");
        System.out.println("The level you choose is equal of the number of points you have to spend in the ability of your character"); }

        // if > 100 || < 1 error
}

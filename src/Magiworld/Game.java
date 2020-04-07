package Magiworld;

public class Game {
    public static void start(){
        Menu menu = new Menu();
        Combat.start(menu.joueur1, menu.joueur2);
    }
}

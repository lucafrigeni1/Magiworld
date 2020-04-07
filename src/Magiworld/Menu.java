package Magiworld;

import Magiworld.Heros.Heros;
import Magiworld.Heros.Guerrier;
import Magiworld.Heros.Mage;
import Magiworld.Heros.Rodeur;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    Heros joueur1;
    Heros joueur2;
    Scanner sc = new Scanner(System.in);

    public Menu(){
       joueur1 = création(1);
       joueur1.présenteToi();
       System.out.println();
       joueur2 = création (2);
       joueur2.présenteToi();
    }

    public Heros création(int nJoueur){
        Heros player = null;
        int classe = 0, niveau = -1;
        System.out.println("Création du personnage du J" + nJoueur);
        do {
            System.out.println("Choisissez votre classe :");
            System.out.println("------------------------------------");
            System.out.println("1. Guerrier: il combat avec sa force et son épée");
            System.out.println("RAGE: Coup puissant qui fait également perdre de la vie au lanceur");
            System.out.println();
            System.out.println("2. Rodeur: il combat avec agilité et utilise un arc");
            System.out.println("Concentration: Double l'agilité");
            System.out.println();
            System.out.println("3. Mage: il combat avec son intelligence et sa magie");
            System.out.println("SOIN: soigne");

                try {
                    classe = sc.nextInt();
                }catch (InputMismatchException e){}
                sc.nextLine();

            if (classe != 1 && classe != 2 && classe != 3)
                System.out.println("saisissez 1,2 ou 3");

        }while (classe != 1 && classe != 2 && classe != 3);

        do {
            System.out.println("Niveau du personnage ?");

            try {
                niveau = sc.nextInt();
            }catch (InputMismatchException a){}
            sc.nextLine();

            if (niveau < 1 || niveau > 100)
                System.out.println("saisissez un nombre entre 0 et 101");

        } while (niveau < 1 || niveau > 100);

        switch (classe){
            case 1:
                player = new Guerrier(niveau,nJoueur);
                break;
            case 2:
                player = new Rodeur(niveau,nJoueur);
                break;
            case 3:
                player = new Mage(niveau,nJoueur);
                break;
        }

        return player;
    }
}

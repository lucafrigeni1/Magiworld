package Magiworld;

import Magiworld.Heros.Heros;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Combat {

    static Scanner sc = new Scanner(System.in);

    public static void start(Heros joueur1, Heros joueur2){

        int attaque = -1;

        while (joueur1.getVie() > 0 && joueur2.getVie() > 0)
        {
            do {
                System.out.println("J1 à ton tour");
                System.out.println("1. Attaque basique ");
                System.out.println("2. Attaque spécial ");

                try {
                    attaque = sc.nextInt();
                }catch (InputMismatchException c){}
                sc.nextLine();

                if (attaque != 1 && attaque != 2)
                    System.out.println("saisissez 1 ou 2");

            }while (attaque != 1 && attaque != 2);

            if (attaque == 1){
                joueur1.aBasique(joueur2);
                System.out.println("J2 possède " + joueur2.getVie() + " points de vie");
                System.out.println("J1 possède " + joueur1.getVie() + " points de vie");
                System.out.println();
            }
            else {
                joueur1.aSpécial(joueur2);
                System.out.println("J2 possède " + joueur2.getVie() + " points de vie");
                System.out.println("J1 possède " + joueur1.getVie() + " points de vie");
                System.out.println();
            }

            if (joueur2.getVie() <= 0 ) {
                System.out.println("Le Joueur 2 a perdu");
                break;
            }

            do {
                System.out.println("J2 à ton tour");
                System.out.println("1. Attaque basique ");
                System.out.println("2. Attaque spécial ");

            try {
                attaque = sc.nextInt();
            }catch (InputMismatchException b){}
            sc.nextLine();

            if (attaque != 1 && attaque != 2)
                System.out.println("saisissez 1 ou 2");

            } while (attaque != 1 && attaque != 2);

            if (attaque == 1){
                joueur2.aBasique(joueur1);
                System.out.println("J1 possède " + joueur1.getVie() + " points de vie");
                System.out.println("J2 possède " + joueur2.getVie() + " points de vie");
                System.out.println();
            }
            else {
                joueur2.aSpécial(joueur1);
                System.out.println("J1 possède " + joueur1.getVie() + " points de vie");
                System.out.println("J2 possède " + joueur2.getVie() + " points de vie");
                System.out.println();
            }

            if (joueur1.getVie() < 0 ) {
                System.out.println("Le joueur 1 a perdu");
            }
        }
    }
}

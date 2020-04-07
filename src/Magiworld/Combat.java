package Magiworld;

import Magiworld.Heros.Heros;
import java.util.Scanner;

public class Combat {

    static Scanner sc = new Scanner(System.in);

    public static void start(Heros joueur1, Heros joueur2){

        int attaque = 0;

        while (joueur1.getVie() > 0 && joueur2.getVie() > 0)
        {
            System.out.println("J1 à ton tour");
            System.out.println("1. Attaque basique ");
            System.out.println("2. Attaque spécial ");

            attaque = sc.nextInt();
            if (attaque == 1){
                joueur1.aBasique(joueur2);
                System.out.println("J2 possède " + joueur2.getVie() + " points de vie");
                System.out.println("J1 possède " + joueur1.getVie() + " points de vie");
            }
            else {
                joueur1.aSpécial(joueur2);
                System.out.println("J2 possède " + joueur2.getVie() + " points de vie");
                System.out.println("J1 possède " + joueur1.getVie() + " points de vie");
            }

            if (joueur2.getVie() > 0 ) {
                System.out.println("J2 à ton tour");
                System.out.println("1. Attaque basique ");
                System.out.println("2. Attaque spécial ");
            }
            else {
                System.out.println("Le Joueur 2 a perdu");
                break;
            }

            attaque = sc.nextInt();
            if (attaque == 1){
                joueur1.aBasique(joueur2);
                System.out.println("J1 possède " + joueur1.getVie() + " points de vie");
                System.out.println("J2 possède " + joueur2.getVie() + " points de vie");
            }
            else {
                joueur1.aSpécial(joueur2);
                System.out.println("J1 possède " + joueur1.getVie() + " points de vie");
                System.out.println("J2 possède " + joueur2.getVie() + " points de vie");
            }

            if (joueur1.getVie() < 0 ) {
                System.out.println("Le joueur 1 a perdu");
            }
        }
    }
}

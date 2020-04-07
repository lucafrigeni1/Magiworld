package Magiworld.Heros;

public class Mage extends Heros {

    int intelligence;
    int vieMax;

    public Mage(int niveau, int nJoueur){
        super(niveau, nJoueur);
        this.intelligence = niveau;
        this.vieMax = niveau*5;
    }

    @Override
    public void aBasique(Heros ennemi){
        int dégats = getIntelligence();
        System.out.println("J" +getnJoueur() + "lance une boule de feu et inflige: " + dégats + "dommages.");
        ennemi.viePerdu(dégats);
    }

    @Override
    public void aSpécial(Heros ennemi){
        int soin = getIntelligence()*2;
        if (getVie() + soin >= vieMax){
            soin = vieMax - getVie();
            vieSoignée(soin);
        }
        else
            vieSoignée(soin);
    }

    public void vieSoignée(int soin){
        System.out.println("Joueur " + getnJoueur() + " utilise SOIN : +" + soin + " en vitalité.");
        setVie(getVie() + soin);
    }

    @Override
    public void présenteToi() {
        System.out.println("Je suis un mage de niveau " + getNiveau() + " j'ai " + getVie() + " points de vie ainsi que " + getIntelligence() + " points d'intelligence");
    }

    public int getIntelligence() {return intelligence;}
    public void setIntelligence(int intelligence) {this.intelligence = intelligence;}
}

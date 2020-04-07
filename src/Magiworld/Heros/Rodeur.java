package Magiworld.Heros;

public class Rodeur extends Heros {

    int agilité;

    public Rodeur (int niveau, int nJoueur){
            super(niveau, nJoueur);
            this.agilité = niveau;
    }

    @Override
    public void aBasique(Heros ennemi){
        int dégats = getAgilité();
        System.out.println("J" + getnJoueur() + "Tire une flèche et inflige : " + dégats + "dommages.");
        ennemi.viePerdu(dégats);
    }

    @Override
    public void aSpécial(Heros ennemi){
        int concentration = getNiveau()/2;
        upAgilité(concentration);
    }

    public void upAgilité(int concentration){
        System.out.println("J" + getnJoueur() + " utilise CONCENTRATION : +" + concentration + " agilité");
        setAgilité(getAgilité() + concentration);
    }

    @Override
    public void présenteToi() {
        System.out.println("Je suis un rodeur de niveau " + getNiveau() + " j'ai " + getVie() + " points de vie ainsi que " + getAgilité() + " points d'agilité");
    }

    public int getAgilité() {return agilité;}
    public void setAgilité(int agilité) {this.agilité = agilité;}
}

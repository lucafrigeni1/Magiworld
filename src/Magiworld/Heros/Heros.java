package Magiworld.Heros;

public abstract class Heros {

    int niveau, vie, nJoueur;

    public Heros(int niveau, int nJoueur){
        this.niveau = niveau;
        this.vie = niveau*5;
        this.nJoueur = nJoueur;
    }

    public abstract void aBasique(Heros ennemi);
    public abstract void aSpécial(Heros ennemi);
    public abstract void présenteToi();

    //GET
    public int getNiveau() {return niveau;}
    public int getVie() {return vie;}
    public int getnJoueur() {return nJoueur;}

    //SET
    public void setNiveau(int niveau) {this.niveau = niveau;}
    public void setVie(int vie) {this.vie = vie;}
    public void setnJoueur(int nJoueur) {this.nJoueur = nJoueur;}

    public void viePerdu(int dégats){
        int vieActuelle = getVie();
        System.out.println("Joueur " + getnJoueur() + " perd " + dégats + " points de vie");
        setVie(vieActuelle - dégats);
        if(getVie() <= 0){
            System.out.println("Joueur " + getnJoueur() + " est mort");
        }
    }
}

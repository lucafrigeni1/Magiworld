package Magiworld.Heros;

public class Guerrier extends Heros {

    int force;

    public Guerrier(int niveau, int nJoueur){
        super(niveau, nJoueur);
        this.force = niveau;
    }

    @Override
    public void aBasique(Heros ennemi){
        int dégats = getForce();
        System.out.println("J" + getnJoueur() + " frappe avec son épée et inflige: " + dégats + " dégats");
        ennemi.viePerdu(dégats);
    }

    @Override
    public void aSpécial(Heros ennemi){
        int dégats = getForce()*2;
        int sacrifice = getForce()/2;
        System.out.println("J" + getnJoueur() + " utilise RAGE: il inflige " + dégats + " dégats et perd " + sacrifice + " points de vie");
        ennemi.viePerdu(dégats);
        viePerdu(sacrifice);
    }

    @Override
    public void présenteToi() {
        System.out.println("Je suis un guerrier de niveau " + getNiveau() + " j'ai " + getVie() + " points de vie ainsi que " + getForce() + " points de force");
    }

    public int getForce() {return force;}
    public void setForce(int force) {this.force = force;}
}

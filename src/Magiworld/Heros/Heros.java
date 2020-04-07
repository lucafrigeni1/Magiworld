package Magiworld;

abstract class Heros {

    double level = 0;
    double health = level*5;
    double strength = 0;
    double agility = 0;
    double intelligence = 0;
    int player = 0;

    abstract void basicAttack(Heros ennemy);
    abstract void specialAttack ();

    public void printHealth(){
        System.out.println("you got " + health);

    }

    public double getLevel() {
         return level;
    }
    public double getHealth() {
        return health;
    }
    public double getStrength() {
        return strength;
    }
    public double getAgility() {
        return agility;
    }
    public double getIntelligence() {
        return intelligence;
    }
    public int getPlayer() {
        return player;
    }
    public int getAttack() {
        return attack;
    }

    public void setLevel(double level) {
        this.level = level;
    }
    public void setHealth(double health) {
        this.health = health;
    }
    public void setStrength(double strength) {
        this.strength = strength;
    }
    public void setAgility(double agility) {
        this.agility = agility;
    }
    public void setIntelligence(double intelligence) {
        this.intelligence = intelligence;
    }
    public void setPlayer(int player) {
        this.player = player;
    }
    public void setAttack(int attack) {
        this.attack = attack;
    }
}

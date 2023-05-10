public abstract class Character {
    private String name;
    private int level;
    private int power;
    private int hp;
    private int initiative;


    public Character(String name,int level, int power, int hp, int initiative){
     this.name = name;
     this.level = level;
     this.power = power;
     this.hp = hp;
     this.initiative = initiative;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getInitiative(){
        return initiative;
    }

    public void setInitiative(int initiative){
        this.initiative = initiative;
    }


    public abstract void attack(Mob enemy);

    // methodlardaki davranışlar da alt sınıflar tarafından belirleneceği için
    // bunların da başlarına "abstract" yazarız
    public abstract void defend();
}

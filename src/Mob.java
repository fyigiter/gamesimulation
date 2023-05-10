// Enemy
public class Mob {
    private String name;
    private int hp;
    private int power;

    public Mob(String name, int hp, int power){
        this.name = name;
        this.hp = hp;
        this.power = power;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getHp(){
        return hp;
    }

    public void setHp(int hp){
        this.hp = hp;
    }

    public int getPower(){
        return power;
    }

    public void setPower(){
        this.power = power;
    }

    public void mobAttack(Character enemy){
        enemy.setHp(enemy.getHp() - power);
        System.out.println(name +" attacked " + power);
        System.out.println(enemy.getName() +" new hp --> "+ enemy.getHp());
    }

    
}

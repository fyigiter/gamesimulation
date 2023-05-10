// abstract class'tan extend etti
public class Rogue extends Character{
    private String spell;

    public Rogue(String name, int level,int power, int hp, int initiative, String spell){
        super(name, level, power, hp, initiative);
        this.spell = spell;
    }

    public String getSpell(){
        return spell;
    }

    public void setSpell(String spell){
        this.spell = spell;
    }

    @Override
    public void attack(Mob enemy){
        enemy.setHp(enemy.getHp() - this.getPower());
        System.out.println(this.getName() + " attacked with "+ this.getSpell() +" to " + enemy.getName() +" " + this.getPower() +" and enemy's new hp: "+ enemy.getHp());
    }

    @Override
    public void defend(){
        this.setHp(this.getHp() + 5);
        System.out.println(this.getName() + " casts the Defend Spell and icreases hp by 5");
    }
}

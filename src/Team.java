import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Team {
    private String name;
    private ArrayList<Character> members;

    public Team(String name){
        this.name = name;
        this.members = new ArrayList<Character>();
        System.out.println(name + " takımı oluşturuldu");
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public ArrayList<Character> getMembers(){
        return members;
    }

    public void setMembers(ArrayList<Character> members){
        this.members = members;
    }

    public void addMember(Character member){
        this.members.add(member);
        System.out.println(member.getName() + " joined " + this.name);
    }

    public void removeMember(Character member){
        this.members.remove(member);
        System.out.println(member.getName() + " left " + this.name);
    }

    public void teamAttack(Mob enemy){
        ArrayList<Character> sortedMembers = new ArrayList<>(members);
        Collections.sort(sortedMembers, Comparator.comparing(Character::getInitiative).reversed());

        for(Character member : sortedMembers){
            member.attack(enemy);
        }
    }
}

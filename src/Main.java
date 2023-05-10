public class Main {
    public static void main(String[] args) {
        Sadida sadida = new Sadida("SadiX",100, 100, 400, 150, "Bramble");
        Rogue rogue = new Rogue("RogX", 120, 80, 400, 210, "Explobomb");

        Mob tofu = new Mob("Batofu", 2500, 80);

        Team teamUnity = new Team("Unity");
        teamUnity.addMember(sadida);
        teamUnity.addMember(rogue);

        teamUnity.teamAttack(tofu);

    }
}
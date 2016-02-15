public class Mainclass {

    public static void main(String[] args) {
        System.out.println("Spawning characters.");
        
        Character cKing = new King("King Pablo");
        Character cKnight = new Knight("Knight Arthur");
        Character cQueen = new Queen("Queen Elizabeth");
        Character cTroll = new Troll("Troll Troll");
        
        System.out.println("Giving weapons.");
        
        cKing.setWeapon(new AxeBehavior());
        cKnight.setWeapon(new SwordBehavior());
        cQueen.setWeapon(new KnifeBehavior());
        cTroll.setWeapon(new ClubBehavior());
        
        System.out.println("Fighting!");
        
        cKing.fight();
        cKnight.fight();
        cQueen.fight();
        cTroll.fight();
    }
}

// Mage.java
public class Mage extends Role {

    public Mage() {
        super("Mage");
        this.weapon = new Staff();
    }

    @Override
    public void attack() {
        System.out.println(name + " Basic Attack : Lightning Bolt");
    }

    @Override
    public void skill() {
        System.out.println(name + "  Skill : Lightning Storm");
    }

    @Override
    public void specialMove() {
        System.out.println(name + " Special Move : Summon Lightning Lord");
    }

    @Override
    public void defend() {
        System.out.println(name + " Defend : Magic Barrier");
    }
}

// Archer.java
public class Archer extends Role {

    public Archer() {
        super("Archer");
        this.weapon = new Bow();
    }

    @Override
    public void attack() {
        System.out.println(name + " Basic Attack : Quick Shot");
    }

    @Override
    public void skill() {
        System.out.println(name + " Skill : Multi-Shot!");
    }

    @Override
    public void specialMove() {
        System.out.println(name + " Special Move : Rain of Arrows");
    }

    @Override
    public void defend() {
        System.out.println(name + " Defend : Evasion Roll");
    }
}

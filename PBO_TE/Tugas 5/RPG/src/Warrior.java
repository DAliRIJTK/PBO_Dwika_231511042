// Warrior.java
public class Warrior extends Role {

    public Warrior() {
        super("Warrior");
        this.weapon = new Sword();
    }

    @Override
    public void attack() {
        System.out.println(name + " Basic Attack : Sword Slash");
    }

    @Override
    public void skill() {
        System.out.println(name + " Skill : War Cry");
    }

    @Override
    public void specialMove() {
        System.out.println(name + " Special Move : Berserker Rage");
    }

    @Override
    public void defend() {
        System.out.println(name + " Defend : Iron Wall");
    }
}

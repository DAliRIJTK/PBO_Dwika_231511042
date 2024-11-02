public class Main {
    public static void main(String[] args) {
        //Membuat Role
        Role warrior = new Warrior();
        Role mage = new Mage();
        Role archer = new Archer();

        System.out.println();

        // Warior
        warrior.roleInfo();
        warrior.attack();
        warrior.skill();
        warrior.specialMove();
        warrior.defend();

        System.out.println();

        //Mage
        mage.roleInfo();
        mage.attack();
        mage.skill();
        mage.specialMove();
        mage.defend();

        System.out.println();

        //Archer
        archer.roleInfo();
        archer.attack();
        archer.skill();
        archer.specialMove();
        archer.defend();
    }
}

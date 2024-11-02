public abstract class Role {
    protected String name;
    protected Weapon weapon;

    public Role(String name) {
        this.name = name;
    }

    public abstract void attack();
    public abstract void skill();
    public abstract void specialMove();
    public abstract void defend();

    public void roleInfo() {
        System.out.println("Role : " + name);
        System.out.println("Weapon Type: " + weapon.getWeaponUse());
        System.out.println("Weapon Name : " + weapon.getWeaponName());
    }
}

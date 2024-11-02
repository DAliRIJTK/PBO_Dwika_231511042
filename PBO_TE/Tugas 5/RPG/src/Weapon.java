// Weapon.java
public abstract class Weapon {
    protected String weaponType;
    private String weaponName;

    public Weapon(String weaponType, String weaponName) {
        this.weaponName = weaponName;
        this.weaponType = weaponType;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public String getWeaponUse() {
        return weaponType;
    }
}


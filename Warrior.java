public class Warrior extends GameCharacter {
    private String weaponType;

    public Warrior(String name, int hp, String weaponType) {
        super(name, hp);
        this.weaponType = weaponType;
    }

    // Implementasi konkret dari method abstract attack()
    @Override
    public void attack() {
        System.out.println(name + " menyerang dengan " + weaponType + "! *Swiing!*");
    }
}
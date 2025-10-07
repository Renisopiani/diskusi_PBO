public class Mage extends GameCharacter implements IHealer {

    private String spellType;

    public Mage(String name, int hp, String spellType) {
        super(name, hp);
        this.spellType = spellType;
    }

    // Implementasi attack() (Polymorphism)
    @Override
    public void attack() {
        System.out.println(name + " merapal mantra " + spellType + "! *Wushh!*");
    }

    // Implementasi method heal() dari IHealer
    @Override
    public void heal(GameCharacter target) {
        int healAmount = 50;
        target.hp += healAmount;
        System.out.println(name + " menyembuhkan " + target.name + " dengan " + healAmount + " HP! HP Baru: " + target.hp);
    }
}
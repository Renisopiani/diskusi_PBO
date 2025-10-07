/**
 * Mage.java (Subclass)
 * Kelas Mage juga turunan dari GameCharacter.
 */
public class Mage extends GameCharacter {

    private String spellType;

    public Mage(String name, int hp, String spellType) { // 
        super(name, hp);
        this.spellType = spellType;
    } 

    // Implementasi method attack() khusus untuk Mage
    @Override
    public void attack() { 
        System.out.println(name + " merapal mantra " + spellType + "! *Wushh!*");
    } 

} 
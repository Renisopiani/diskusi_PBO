/**
 * Warrior.java (Subclass)
 * Kelas Warrior adalah turunan dari GameCharacter.
 *
 * Konsep: Inheritance
 * - Menggunakan keyword 'extends' untuk mewarisi.
 * - Memiliki properti dan method dari GameCharacter.
 * - Menambahkan properti spesifik: weaponType.
 * - Memberikan implementasi konkret untuk method abstract 'attack()'.
 */
public class Warrior extends GameCharacter {
    private String weaponType;

    public Warrior(String name, int hp, String weaponType) {
        // 'super()' digunakan untuk memanggil constructor dari kelas induk (GameCharacter)
    
        super(name, hp);
        this.weaponType = weaponType;
    }

    // Implementasi method attack() khusus untuk Warrior
    @Override
    public void attack() {
        System.out.println(name + " menyerang dengan " + weaponType + "! *Swiing!*");
    }
}
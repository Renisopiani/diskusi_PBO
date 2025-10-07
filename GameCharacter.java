/**
 * GameCharacter.java (Abstract Superclass)
 * Ini adalah 'blueprint' untuk semua karakter di dalam game.
 * Kelas ini abstract karena tidak ada karakter umum, yang ada adalah
 * kelas spesifik seperti Warrior atau Mage.
 *
 * Konsep: Abstract Class
 * - Mendefinisikan atribut dasar (name, hp) yang dimiliki semua karakter.
 * - Memiliki method 'attack()' yang abstract, memaksa semua kelas turunan
 * untuk membuat versi serangan mereka sendiri.
 */
public abstract class GameCharacter {
    protected String name;
    protected int hp;

    public GameCharacter(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    // Method ini bisa langsung diwariskan dan digunakan oleh kelas anak.
    public void showStatus() {
        System.out.println("Name: " + this.name);
        System.out.println("HP: " + this.hp);
    }

    // Abstract method: Cara menyerang diserahkan kepada kelas anak.
    // Tidak ada implementasi di sini, hanya deklarasi.
    public abstract void attack();
}
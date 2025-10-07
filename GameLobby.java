/**
 * GameLobby.java
 * Kelas utama untuk menjalankan simulasi game.
 */
public class GameLobby {
    public static void main(String[] args) {
        // =======================================================
        // Konsep: Array of Object
        // Membuat array 'party' dengan tipe GameCharacter.
        // Array ini bisa diisi oleh objek apa pun yang merupakan turunan
        // dari GameCharacter (Warrior, Mage, dll).
        // =======================================================
        GameCharacter[] party = new GameCharacter[3];

        // Mengisi array dengan instance dari subclass yang berbeda
        party[0] = new Warrior("Alucard", 150, "Pedang Anduril");
        party[1] = new Mage("Zhuxin", 100, "Cahaya Istari");
        party[2] = new Warrior("Tigreal", 180, "Kapak Perang");

        System.out.println("===== KELOMPOK PETUALANG SIAP! =====");

        // =======================================================
        // Konsep: Polymorphism
        // Kita melakukan loop pada array 'party'. Variabel 'member' bertipe
        // GameCharacter, namun bisa merujuk ke objek Warrior atau Mage.
        //
        // Saat member.attack() dipanggil, Java akan secara cerdas menjalankan
        // method attack() yang ada di kelas aslinya (Warrior atau Mage).
        // Inilah inti dari Polymorphism.
        // =======================================================
        for (GameCharacter member : party) {
            member.showStatus(); // Method ini diwariskan
            member.attack();     // Method ini polimorfik
            System.out.println("--------------------------");
        }
    }
}
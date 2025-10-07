public class GameLobby {
    public static void main(String[] args) {

        System.out.println("=========================================");
        System.out.println("SIMULASI KELOMPOK PETUALANG (OOP DEMO)");
        System.out.println("=========================================");

        // Array of Object: Menyimpan objek dari berbagai subkelas
        GameCharacter[] party = new GameCharacter[3];

        party[0] = new Warrior("Alucard", 150, "Pedang Anduril");
        party[1] = new Mage("Zhuxin", 100, "Cahaya Istari");
        party[2] = new Warrior("Tigreal", 180, "Kapak Perang");

        System.out.println("\n===== 1. DEMO INHERITANCE & POLYMORPHISM =====");

        // Polymorphism: Panggilan member.attack() menjalankan implementasi kelas aslinya
        for (GameCharacter member : party) {
            member.showStatus(); // Inherited method
            member.attack();     // Polymorphic method
            System.out.println("--------------------------");
        }

        System.out.println("\n===== 2. DEMO INTERFACE (IHealer) =====");
        GameCharacter tigreal = party[2];

        // Demonstrasi Interface
        if (party[1] instanceof IHealer) {
            // Casting ke tipe Interface IHealer
            IHealer healer = (IHealer) party[1];
            System.out.println(tigreal.name + " terluka (HP: " + tigreal.hp + ").");
            healer.heal(tigreal); // Memanggil method dari Interface
            System.out.println("Kondisi Akhir: " + tigreal.name + " HP: " + tigreal.hp);
        }
        System.out.println("=========================================");
    }
}







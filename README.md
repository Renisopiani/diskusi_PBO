# Eksplorasi Konsep OOP: Simulasi Game Karakter

Proyek ini adalah implementasi Java yang dirancang khusus untuk mendemonstrasikan lima pilar utama dalam Pemrograman Berorientasi Objek (OOP): **Abstract Class**, **Interface**, **Inheritance**, **Polymorphism**, dan **Array of Object**, melalui simulasi sederhana kelompok karakter game.

-----

## 1\. Abstract Class & Inheritance (Fondasi Hirarki)

### Abstract Class (`GameCharacter.java`)

Kelas ini berfungsi sebagai **cetak biru (blueprint)** dan **akar hirarki** dari semua karakter game.

  * **Atribut:** Mendefinisikan atribut esensial yang dimiliki setiap karakter, yaitu `name` dan `hp`, dengan akses **`protected`** agar dapat diakses langsung oleh subkelas namun tetap terlindungi dari dunia luar.
  * **Kewajiban (`Abstract Method`):** Method `public abstract void attack();` tidak memiliki implementasi. Fungsinya adalah **memaksa** semua kelas turunan (`Warrior`, `Mage`) untuk menyediakan detail cara menyerang mereka sendiri. Ini menjamin bahwa setiap objek karakter yang dibuat *pasti* memiliki kemampuan menyerang.

### Inheritance (Pewarisan)

**Inheritance** adalah mekanisme di mana `Warrior.java` dan `Mage.java` memperoleh semua sifat dan perilaku dari `GameCharacter.java`.

  * **Kata Kunci:** Menggunakan **`extends GameCharacter`**.
  * **Penggunaan `super()`:** Di dalam *constructor* subkelas, `super(name, hp)` dipanggil untuk mendelegasikan inisialisasi atribut yang diwarisi ke *constructor* kelas induk.
  * **Pewarisan Perilaku:** Metode `showStatus()` diwariskan sepenuhnya. Semua karakter dapat menampilkan status mereka dengan kode yang sama, menghilangkan redundansi kode (*code duplication*).

-----

## 2\. Interface (Kontrak Kemampuan Tambahan)

### Interface (`IHealer.java`)

Berbeda dengan Abstract Class yang mendefinisikan "siapa Anda" (sebagai karakter), **Interface** mendefinisikan **"apa yang bisa Anda lakukan"** (kemampuan).

  * **Kontrak:** `IHealer` hanyalah sebuah kontrak yang berisi deklarasi method `void heal(GameCharacter target);`.
  * **Realisasi:** Kelas **`Mage`** menggunakan kata kunci **`implements IHealer`**. Ini mengikat `Mage` untuk menyediakan implementasi konkret dari method `heal()`.
  * **Fleksibilitas:** Ini memungkinkan suatu objek (`Mage`) memiliki **banyak tipe** (`GameCharacter` dan `IHealer`), memisahkan kemampuan tambahan dari hirarki kelas utama. Jika kita ingin `Warrior` juga bisa menyembuhkan, kita cukup membuat `Warrior implements IHealer` tanpa mengubah struktur pewarisan mereka.

-----

## 3\. Polymorphism (Eksekusi Fleksibel)

Polymorphism (yang berarti "banyak bentuk") memungkinkan satu instruksi (panggilan method) menghasilkan perilaku yang berbeda tergantung pada objek spesifik yang dipanggil.

Ini didemonstrasikan di **`GameLobby.java`** saat perulangan:

```java
// Variabel member bertipe GameCharacter
for (GameCharacter member : party) {
    // Panggilan ini akan menjalankan kode attack() yang spesifik:
    // Warrior.attack() jika member adalah Warrior, atau
    // Mage.attack() jika member adalah Mage.
    member.attack();
}
```

  * **Dynamic Method Dispatch:** Java menentukan versi `attack()` mana yang akan dijalankan saat *runtime* (saat program berjalan), bukan saat *compile time*. Hal ini membuat kode `GameLobby` menjadi modular dan mudah dikembangkan.

-----

## 4\. Array of Object (Manajemen Koleksi)

Konsep ini diterapkan di **`GameLobby.java`** untuk mengelola seluruh kelompok petualang sebagai satu kesatuan.

  * **Deklarasi Tipe Superclass:** Array dideklarasikan dengan tipe superclass: `GameCharacter[] party = new GameCharacter[3];`.
  * **Objek Heterogen:** Array ini dapat menyimpan objek **heterogen** (berbeda jenis: `Warrior` dan `Mage`) karena keduanya adalah turunan dari tipe array (`GameCharacter`).
  * **Kesatuan Logis:** Ini memungkinkan kita memperlakukan seluruh kelompok secara **homogen** (sama) saat kita ingin melakukan tindakan umum, seperti menampilkan status atau memerintahkan serangan, yang merupakan fondasi praktis dari **Polymorphism**.

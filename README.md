1. Abstract Class & Inheritance
Abstract Class (GameCharacter)
Kelas ini dideklarasikan sebagai abstract karena ia hanya mendefinisikan sifat umum. Tidak ada karakter generik, yang ada hanya karakter spesifik (seperti Warrior atau Mage).

Ia memiliki atribut dasar (protected String name, protected int hp) yang harus dimiliki semua karakter.

Ia mendefinisikan metode public abstract void attack();, yang memaksa semua kelas anak untuk menyediakan versi serangan mereka sendiri.

Inheritance (Pewarisan)
Kelas Warrior dan Mage menggunakan kata kunci extends GameCharacter.

Dengan pewarisan, kedua subkelas secara otomatis mendapatkan atribut (name, hp) dan metode (showStatus()) dari kelas induk.

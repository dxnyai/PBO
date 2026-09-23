/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas5;

/**
 *
 * @author Asus Vivobook
 */
class Hewan {
    String nama;
    String jenis;

public void tampilkanInfo() {
        System.out.println("Nama Hewan: " + nama);
        System.out.println("Jenis: " + jenis);
    }
}

class Kucing extends Hewan {
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        suaraKhas();
    }

public void suaraKhas() {
        System.out.println("Suara: Meow.. Meow..");
    }
}

class Anjing extends Hewan {
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        suaraKhas();
    }

public void suaraKhas() {
        System.out.println("Suara: Guk! Guk!");
    }
}

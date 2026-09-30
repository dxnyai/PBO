/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package utspraktikum;

/**
 *
 * @author Asus Vivobook
 */
public class ResponsiUTS {
    public static void main(String[] args) {
        // Objek Produk 1 (Elektronik) dan Pegawai 1 (PegawaiTetap)
        Produk produk1 = new Elektronik("PlayStation", 18000000, 2);
        Pegawai pegawai1 = new PegawaiTetap("Dany Akhdan Imaduddin", 70000000, 10000000); 

        // Objek Produk 2 (Makanan) dan Pegawai 2 (PegawaiKontrak)
        Produk produk2 = new Makanan("Onigiri", 11000, "2026-12-30");
        Pegawai pegawai2 = new PegawaiKontrak("Ella", 30000000, 24);

        // Menampilkan Output sesuai format spesifikasi proyek
        System.out.println("1. Output Produk");
        produk1.tampilkanInfo();

        System.out.println("\n2. Output Pegawai");
        pegawai1.tampilkanInfo();

        System.out.println("\n3. Output Polimorfisme");
        produk2.tampilkanInfo();
        pegawai2.tampilkanInfo();
    }
}
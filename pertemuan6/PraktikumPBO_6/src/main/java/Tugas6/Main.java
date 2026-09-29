/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas6;

/**
 *
 * @author Asus Vivobook
 */
public class Main {
    public static void main(String[] args) {
        KeranjangBelanja keranjang = new KeranjangBelanja(10);
        
        Produk bukuJava = new Buku("Buku Pemrograman Java", 100000);
        Produk laptop = new Elektronik("Laptop Asus Vivobook", 10000000);
        Produk jaket = new Pakaian("Jaket Hoodie", 200000);
        keranjang.tambahProduk(bukuJava);
        keranjang.tambahProduk(laptop);
        keranjang.tambahProduk(jaket);
        System.out.println("=== NOTA BELANJAAN ===");
        double totalBelanja = keranjang.hitungTotalHarga();
        System.out.println("---------------------------------");
        System.out.println("Total Bayar Keseluruhan: Rp " + totalBelanja);
    }
}


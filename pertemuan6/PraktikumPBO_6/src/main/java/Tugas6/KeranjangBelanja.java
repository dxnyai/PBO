/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas6;

/**
 *
 * @author Asus Vivobook
 */
public class KeranjangBelanja {
    Produk[] listProduk; 
    int jumlahProduk;    
    public KeranjangBelanja(int kapasitas) {
        listProduk = new Produk[kapasitas];
        jumlahProduk = 0;
    }
    public void tambahProduk(Produk p) {
        if (jumlahProduk < listProduk.length) {
            listProduk[jumlahProduk] = p;
            jumlahProduk++;
        } else {
            System.out.println("Maaf, keranjang belanja udah penuh!");
        }
    }
    public double hitungTotalHarga() {
        double total = 0;
        for (int i = 0; i < jumlahProduk; i++) {
            Produk p = listProduk[i];
            total += p.getHargaSetelahDiskon();
            System.out.println("Item: " + p.nama + " | Harga Awal: " + p.harga + " | Diskon: " + p.hitungDiskon() + " | Harga Akhir: " + p.getHargaSetelahDiskon());
        }
        return total;
    }
}

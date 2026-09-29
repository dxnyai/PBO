/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas6;

/**
 *
 * @author Asus Vivobook
 */
public class Produk {
    String nama;
    double harga;
    public Produk(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }
    public double hitungDiskon() {
        return 0; 
    }
    public double getHargaSetelahDiskon() {
        return harga - hitungDiskon();
    }
}

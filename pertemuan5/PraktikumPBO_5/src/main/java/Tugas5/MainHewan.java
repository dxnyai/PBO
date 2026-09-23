/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas5;

/**
 *
 * @author Asus Vivobook
 */
class MainHewan {
    public static void main(String[] args) {
        Kucing kucing = new Kucing();
        kucing.nama = "Garfield";
        kucing.jenis = "Mamalia";
        kucing.tampilkanInfo();

System.out.println();

Anjing anjing = new Anjing();
        anjing.nama = "Scooby";
        anjing.jenis = "Mamalia";
        anjing.tampilkanInfo();
    }
}

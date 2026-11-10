/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum9;

/**
 *
 * @author Dany
 */
public class TugasPBO_9 {
    public static void main(String[] args) {
        // Membuat objek menggunakan referensi kelas abstrak
        Hewan kucing = new Kucing();
        Hewan anjing = new Anjing();
        
        // Memanggil metode suara
        kucing.suara();
        anjing.suara();
    }
}
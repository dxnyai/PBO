/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikum6;

/**
 *
 * @author Asus Vivobook
 */
public class PraktikumPBO_6 {

    public static void main(String[] args) {
        Hewan kucing = new Kucing();
        kucing.bersuara(); // Output: Hewan bersuara
        kucing.makan("ikan"); // memanggil metode makan() dari kelas Hewan
        kucing.makan("ikan", 2); // Memanggil metode makan() yang overloaded
        
        Anjing anjing = new Anjing();
        anjing.bersuara(); // Output: Woof
        anjing.makan("daging", 3); // Memanggil metode makan() yang overloaded pada kelas Hewan
    }
}

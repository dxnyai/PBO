/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikum9;

/**
 *
 * @author Dany
 */
// Kode utama untuk pengujian 
public class PraktikumPBO_9 { 
    public static void main(String[] args) { 
        Kendaraan mobil = new Mobil(); 
        Kendaraan sepeda = new Sepeda();
        
        mobil.berjalan(); 
        mobil.info();
        
        sepeda.berjalan(); 
        sepeda.info(); 
    } 
}
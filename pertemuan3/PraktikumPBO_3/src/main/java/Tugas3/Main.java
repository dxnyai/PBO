/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas3;

/**
 *
 * @author Asus Vivobook
 */
public class Main {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Toyota", "Avanza", 2021, "Black");
        Mobil mobil2 = new Mobil("Honda", "Civic", 2023, "White");
        
        System.out.println("Display Before");
        mobil1.displayInfo();
        mobil2.displayInfo();
        
        System.out.println("\nStarting Engine");
        mobil1.startEngine();
        mobil2.startEngine();
        
        System.out.println("\nChanging Color");
        mobil1.setWarna("Pink");
        System.out.println("Warna mobil " + mobil1.getMerk() + " telah diubah!");
        
        System.out.println("\nDisplay After");
        mobil1.displayInfo();
        mobil2.displayInfo();
    }
}
        

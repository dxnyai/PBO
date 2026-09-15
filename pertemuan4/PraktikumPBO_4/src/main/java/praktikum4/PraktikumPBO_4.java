/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikum4;

/**
 *
 * @author Asus Vivobook
 */
public class PraktikumPBO_4 {
    public static void main(String[] args) {
        System.out.println("=== VEHICLES CLASS TESTING ===");
        Vehicles vehicle1 = new Vehicles("Toyota Avanza", 160, "Gasoline");
        
        // Modify name using setter
        vehicle1.setName("Toyota Kijang Innova");
        
        // Display data
        System.out.println("Vehicle Name: " + vehicle1.getName());
        vehicle1.displayVehiclesInfo();
        
        System.out.println("\n=== CAR CLASS (SUBCLASS) TESTING ===");
        Car car1 = new Car("Honda Civic", 200, "Gasoline", 4);
        
        // Call subclass method
        car1.displayCarInfo();
        
        // Call inherited method from superclass
        car1.displayVehiclesInfo();
    }
}

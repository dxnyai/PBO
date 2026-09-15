/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author Asus Vivobook
 */
public class Car extends Vehicles {
    private int doorAmount; 
    
    // Constructor
    public Car(String name, int maxSpeed, String engineType, int doorAmount) {
        super(name, maxSpeed, engineType); // Call the parent constructor
        this.doorAmount = doorAmount;
    }
    
    // Method to display car info
    public void displayCarInfo() {
        // Can access maxSpeed directly because it is protected
        System.out.println("Car Max Speed: " + maxSpeed + " km/h");
        System.out.println("Door Amount: " + doorAmount);
    }
}
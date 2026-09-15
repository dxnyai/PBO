/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author Asus Vivobook
 */
public class Vehicles {
    // Attributes with different access modifiers
    private String name;
    protected int maxSpeed;
    public String engineType;
    
    // Constructor
    public Vehicles(String name, int maxSpeed, String engineType) {
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.engineType = engineType;        
    }
    
    // Getter and Setter for the private variable 'name'
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    // Public method to display vehicle info
    public void displayVehiclesInfo() {
        System.out.println("Vehicle Name: " + name);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Engine Type: " + engineType);
    }
}
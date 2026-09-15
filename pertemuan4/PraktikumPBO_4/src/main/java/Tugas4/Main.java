/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas4;

/**
 *
 * @author Asus Vivobook
 */
public class Main {
    public static void main(String[] args) {
        // Create an Employee object
        Employee emp1 = new Employee("Claire Redfield", 30, "Software Engineer", 15000.00);
        
        System.out.println("=== Initial Information ===");
        System.out.println(emp1.toString());
        
        // Modify name
        emp1.setName("Chris Redfield");
        System.out.println("\n=== Information After Modification ===");
        System.out.println(emp1.toString());
        
        // DIRECT ACCESS TESTING:
        
        // 1. Access name attribute (private) -> ERROR
        // emp1.name = "Leon S. Kennedy"; 
        
        // 2. Access age attribute (protected) -> SUCCESS
        emp1.age = 31; 
        
        // 3. Access salary attribute (private) -> ERROR
        // emp1.salary = 20000.00; 
        
        // 4. Access occupation attribute (public) -> SUCCESS
        emp1.occupation = "Project Manager"; 
    }
}
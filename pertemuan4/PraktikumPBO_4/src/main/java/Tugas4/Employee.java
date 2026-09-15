/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas4;

/**
 *
 * @author Asus Vivobook
 */
public class Employee extends Person {
    private double salary;

    // Constructor
    public Employee(String name, int age, String occupation, double salary) {
        super(name, age, occupation); // Call Person constructor
        this.salary = salary;
    }

    // Getter and Setter for salary
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Override toString() method
    @Override
    public String toString() {
        return "Name: " + getName() + 
               ", Age: " + age + 
               ", Occupation: " + occupation + 
               ", Salary: $" + salary;
    }
}

/**
 * Write a description of class Employee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.*;
public class Employee
{
    // instance variables - replace the example below with your own
    String name;
    int age;
    String designation;
    double salary;
    
    /**
     * Constructor for objects of class Employee
     */
    public Employee(String name)
    {
        // initialise instance variables
        this.name = name;
    }
    
    public void empAge(int empAge){
        age = empAge;

    }
    
    public void empDesignation(String empDesig){
        designation = empDesig;
    }
    
    public void empSalary(double empSalary){
        salary = empSalary;
    }
    
    public void printEmployee(){
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Designation:" + designation);
        System.out.println("Salary:" + salary);
    }
}


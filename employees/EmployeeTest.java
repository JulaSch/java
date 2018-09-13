
/**
 * Write a description of class EmployeeTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.*;
public class EmployeeTest
{
   public static void main(String args[]){
       Employee empOne = new Employee("James Smith");
       Employee empTwo = new Employee("Mary Anne");
       Employee empThree = new Employee("Mateusz Zawila");
       Employee empFour = new Employee("Maks Skiendzielewski");
       
       empOne.empAge(26);
       empOne.empDesignation("Senior software engineer");
       empOne.empSalary(1000);
       empOne.printEmployee();
       
       
       empTwo.empAge(21);
       empTwo.empDesignation("Software engineer");
       empTwo.empSalary(500);
       empTwo.printEmployee();
       
       
       empThree.empAge(17);
       empThree.empDesignation("Student");
       empThree.empSalary(0);
       empThree.printEmployee();
       
       
       empFour.empAge(55);
       empFour.empDesignation("CEO");
       empFour.empSalary(2500);
       empFour.printEmployee();
       
       
    }}
       
       


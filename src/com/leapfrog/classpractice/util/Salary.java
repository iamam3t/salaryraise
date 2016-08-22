package com.leapfrog.classpractice.util;
import java.util.Scanner;
public class Salary {
    private String fullName,lastName,email,contactNo;
    private double salary;
    Scanner name = new Scanner(System.in);
    public String getFirstName() {
        System.out.println("Enter the First name:");
        //Scanner name = new Scanner(System.in);
        String fullName = name.next();
        return fullName;
    }

    
    public String getLastName() {
        System.out.println("Enter the Last name:");
        //Scanner name = new Scanner(System.in);
        String lastName = name.next();
        return fullName;
    }


    public String getEmail() {
        System.out.println("Enter the Email:");
        //Scanner name = new Scanner(System.in);
        String email = name.next();
        return email;
    }


    public String getContactNo() {
        System.out.println("Enter the Contact Number:");
        //Scanner name = new Scanner(System.in);
        String contactNo = name.next();
        return contactNo;
    }


    public double getSalary() {
        System.out.println("Enter the Salary:");
        //Scanner name = new Scanner(System.in);
        double salary = name.nextDouble();
        return salary;
    }

    public double calculate(){
        if(salary <= 5000)
            salary+=salary;
        else if (salary>5000 && salary<=10000)
            salary=salary+salary * 0.8;
        else if (salary>10000 && salary<=20000)
            salary=salary+salary * 0.5;
        else if (salary>20000 && salary<=50000)
            salary=salary+salary * 0.2;
        else if (salary>50000)
            salary=salary+salary * 0.1;
        return salary;
    }      
    
}

package com.leapfrog.classpractice.util;
import java.util.Scanner;
public class Salary {
    
    Scanner name = new Scanner(System.in);
    private String fullName,lastName,email,contactNo;
    private double salary;
    
    public String getFirstName() {
        System.out.println("Enter the First name:");
        String fullName = name.next();
        return this.fullName = fullName;
    }

    
    public String getLastName() {
        System.out.println("Enter the Last name:");
        String lastName = name.next();
        return this.lastName = lastName;
    }


    public String getEmail() {
        System.out.println("Enter the Email:");
        String email = name.next();
        return this.email = email;
    }


    public String getContactNo() {
        System.out.println("Enter the Contact Number:");
        String contactNo = name.next();
        return this.contactNo = contactNo;
    }


    public double getSalary() {
        System.out.println("Enter the Salary:");
        double salary = name.nextDouble();
        return this.salary=salary;
    }

    /*public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }*/

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

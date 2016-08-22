package com.leapfrog.classpractice;
import com.leapfrog.classpractice.util.Salary;
public class salaryRaise {
    public static void main(String[] args) {
        Salary s = new Salary();
        
        String fname = s.getFirstName();
        String lname = s.getLastName();
        String em = s.getEmail();
        String con = s.getContactNo();
        double sal = s.getSalary();
        System.out.println("First Name : "+ fname);
        System.out.println("Last Name : "+ lname);
        System.out.println("Email : "+ em);
        System.out.println("Contact Number : "+ con);
        System.out.println("Initial Salary : $"+ sal);
        System.out.println("Final Salary After Raise = $"+ s.calculate());
                
    }
    
}

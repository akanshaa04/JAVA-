package com.eis.pl;

import com.eis.bean.Employee;
import com.eis.service.EmployeeService;
import com.eis.service.EmployeeServiceImpl;

import java.util.Scanner;

public class EmployeeMain {

    public static void main(String[] args) {
    	
        Scanner obj = new Scanner(System.in);
        EmployeeService employeeService = new EmployeeServiceImpl();
        
        System.out.println("Enter Employee ID:");
        int id = obj.nextInt();
        obj.nextLine(); 
        
        System.out.println("Enter Employee Name:");
        String name = obj.nextLine();
        
        System.out.println("Enter Employee Salary:");
        double salary = obj.nextDouble();
        obj.nextLine(); 
        
        System.out.println("Enter Employee Designation:");
        String designation = obj.nextLine();
        
        
        Employee employee = employeeService.getEmployeeDetails(id, name, salary, designation);
        employeeService.displayEmployeeDetails(employee);
        
        obj.close();
    }
}

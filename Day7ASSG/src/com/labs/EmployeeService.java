package com.labs;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeService {

	public static void main(String st[]) {
		
	    List<Employee> employees = EmployeeRepository.getEmployees();
	    List<Department> departments = EmployeeRepository.getDepartments();
	
	    // 1. Find out the sum of salary of all employees.
	    
	    double totalSalary = employees.stream()
	            .collect(Collectors.summingDouble(Employee::getSalary));
	    System.out.println("Total Salary of All Employees: " + totalSalary);
	
	
	
	 // 2. List out department names and count of employees in each department.
        Map<String, Long> employeeCountByDepartment = employees.stream()
                .collect(Collectors.groupingBy(
                        employee -> employee.getDepartment() != null ? employee.getDepartment().getDepartmentName() : "No Department",
                        Collectors.counting()
                ));
        System.out.println();
        System.out.println("Department Names and Count of Employees:");
        employeeCountByDepartment.forEach((department, count) ->
                System.out.println(department + ": " + count)
        );

        
        // 3. Find out the senior most employee of an organization.
        Optional<Employee> seniorMostEmployee = employees.stream()
                .min((e1, e2) -> e1.getHireDate().compareTo(e2.getHireDate()));
        System.out.println();
        seniorMostEmployee.ifPresent(e ->
                System.out.println("Senior Most Employee: " + e.getFirstName() + " " + e.getLastName())
        );
	}
}

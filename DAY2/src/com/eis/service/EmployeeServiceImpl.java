package com.eis.service;

import com.eis.bean.Employee;

public class EmployeeServiceImpl implements EmployeeService {

    @Override
    public Employee getEmployeeDetails(int id, String name, double salary, String designation) {
        String insuranceScheme = findInsuranceScheme(new Employee(id, name, salary, designation, null));
        return new Employee(id, name, salary, designation, insuranceScheme);
    }

    @Override
    public String findInsuranceScheme(Employee employee) {
        double salary = employee.getSalary();
        String designation = employee.getDesignation();
        
        if (salary >= 50000) {
            return "Exclusive";
        } else if (salary >= 30000) {
            return "Medium";
        } else {
            return "Basic";
        }
    }

    @Override
    public void displayEmployeeDetails(Employee employee) {
        System.out.println(employee);
    }
}

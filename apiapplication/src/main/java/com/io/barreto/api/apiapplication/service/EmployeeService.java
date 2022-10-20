package com.io.barreto.api.apiapplication.service;

import com.io.barreto.api.apiapplication.model.Employee;

import java.util.List;

public interface EmployeeService {
    //Save an Employee
    Employee addEmployee (Employee employee);

    //Get employee
    List<Employee> getAllEmployee();
    // Get one employee
    Employee findById(Integer id);

    //update employee
    void updateEmployee (Employee employee);

    //delete employee
    Boolean deleteById(Integer id);

}

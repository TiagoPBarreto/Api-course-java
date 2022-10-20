package com.io.barreto.api.apiapplication.repository;

import com.io.barreto.api.apiapplication.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Boolean.TRUE;

@Repository
public class InMemoryEmployeeRepository {
    private static final List<Employee>DATABASE = new ArrayList<>();

    static{
        DATABASE.add(new Employee(1,"john","Smith","john@gmail.com"));
        DATABASE.add(new Employee(2,"tiago","Pereira","ti@gmail.com"));
        DATABASE.add(new Employee(3,"Victor","Almeida","victor@gmail.com"));
    }


    public Employee addEmployee (Employee employee){
         DATABASE.add(employee);
        return employee;
    }


    public List<Employee> getAllEmployee(){
        return List.copyOf(DATABASE);
    }

    public Employee findById(Integer id){
        return DATABASE
                .stream()
                .filter(emp -> id.equals(emp.getId()))
                .findFirst()
                .orElseThrow();
    }


    public void updateEmployee (Employee employee){

    }

    //delete employee
    public Boolean deleteById(Integer id){
        Employee employee =  DATABASE
                .stream()
                .filter(emp -> id.equals(emp.getId()))
                .findFirst()
                .orElseThrow();
        DATABASE.remove(employee);
        return TRUE;
    }
}

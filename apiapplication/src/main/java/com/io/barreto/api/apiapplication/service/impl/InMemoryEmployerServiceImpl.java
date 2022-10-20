package com.io.barreto.api.apiapplication.service.impl;

import com.io.barreto.api.apiapplication.model.Employee;
import com.io.barreto.api.apiapplication.repository.InMemoryEmployeeRepository;
import com.io.barreto.api.apiapplication.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@Service
@Qualifier(value = "inMemory")
public class InMemoryEmployerServiceImpl implements EmployeeService {
    private final InMemoryEmployeeRepository inMemoryEmployeeRepository;
    @Override
    public Employee addEmployee(Employee employee) {
        return inMemoryEmployeeRepository.addEmployee(employee);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return inMemoryEmployeeRepository.getAllEmployee();
    }

    @Override
    public Employee findById(Integer id) {
        return inMemoryEmployeeRepository.findById(id);
    }

    @Override
    public void updateEmployee(Employee employee) {

    }

    @Override
    public Boolean deleteById(Integer id) {
        return inMemoryEmployeeRepository.deleteById(id);
    }
}

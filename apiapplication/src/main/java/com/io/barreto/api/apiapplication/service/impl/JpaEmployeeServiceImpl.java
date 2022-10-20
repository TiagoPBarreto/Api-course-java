package com.io.barreto.api.apiapplication.service.impl;

import com.io.barreto.api.apiapplication.model.Employee;
import com.io.barreto.api.apiapplication.repository.JpaEmployeeRepository;
import com.io.barreto.api.apiapplication.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.lang.Boolean.TRUE;

@RequiredArgsConstructor
@Service
@Qualifier(value = "mySQLEmployeeService")
public class JpaEmployeeServiceImpl implements EmployeeService {
    private final JpaEmployeeRepository jpaEmployeeRepository;
    @Override
    public Employee addEmployee(Employee employee) {
        return jpaEmployeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return jpaEmployeeRepository.findAll();
    }

    @Override
    public Employee findById(Integer id) {
        return jpaEmployeeRepository.findById(id).get();
    }

    @Override
    public void updateEmployee(Employee employee) {

    }

    @Override
    public Boolean deleteById(Integer id) {
         jpaEmployeeRepository.deleteById(id);
        return TRUE;
    }
}

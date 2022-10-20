package com.io.barreto.api.apiapplication.repository;

import com.io.barreto.api.apiapplication.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaEmployeeRepository extends JpaRepository<Employee,Integer> {

}

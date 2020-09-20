package com.dollardeveloper.employeemanagement.employeemanagement.repository;

import com.dollardeveloper.employeemanagement.employeemanagement.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository <Employee, Long> {
}

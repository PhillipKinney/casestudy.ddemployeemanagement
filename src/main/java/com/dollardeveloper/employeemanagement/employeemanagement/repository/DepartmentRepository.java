package com.dollardeveloper.employeemanagement.employeemanagement.repository;

import com.dollardeveloper.employeemanagement.employeemanagement.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Deque;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}

package com.dollardeveloper.employeemanagement.employeemanagement.service;

import com.dollardeveloper.employeemanagement.employeemanagement.model.Employee;
import com.dollardeveloper.employeemanagement.employeemanagement.repository.EmployeeRepository;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {




    List<Employee> getAllEmployees();

    void saveEmployee (Employee employee);
    Employee getEmployeeById(Long id);
    }

    // saveEmployee (Employee employee);
}

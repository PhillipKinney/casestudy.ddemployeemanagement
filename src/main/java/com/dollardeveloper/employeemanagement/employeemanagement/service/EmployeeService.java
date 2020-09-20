package com.dollardeveloper.employeemanagement.employeemanagement.service;

import com.dollardeveloper.employeemanagement.employeemanagement.model.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();

    Employee saveEmployee (Employee employee);

    // saveEmployee (Employee employee);
}

package com.dollardeveloper.employeemanagement.employeemanagement.service;

import com.dollardeveloper.employeemanagement.employeemanagement.model.Employee;
import com.dollardeveloper.employeemanagement.employeemanagement.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }


    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

        @Override
    public Employee saveEmployee(Employee employee) {
         return employeeRepository.save(employee);
    }

//    @Override
//    public void saveEmployee(Employee employee) {
//         this.employeeRepository.save(employee);
//    }
}

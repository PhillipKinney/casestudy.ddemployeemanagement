package com.dollardeveloper.employeemanagement.employeemanagement.service;

import com.dollardeveloper.employeemanagement.employeemanagement.model.Employee;
import com.dollardeveloper.employeemanagement.employeemanagement.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }


    @Override //Read all employees
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }


    @Override //save new employee
    public void saveEmployee(Employee employee) {
         this.employeeRepository.save(employee);
    }

    @Override //update employee record
    public Employee getEmployeeByEmpId(Long empId) {
        Optional<Employee> optional = employeeRepository.findById(empId);
        Employee employee = null;
        if(optional.isPresent()){
            employee = optional.get();
        }else{
            throw new RuntimeException("Employee not for id ::" + empId);
        }
        return employee ;
    }

    @Override
    public void deleteEmployeeById(Long empId) {
        this.employeeRepository.deleteById(empId);
    }

//    @Override
//    public void saveEmployee(Employee employee) {
//         this.employeeRepository.save(employee);
//    }
}

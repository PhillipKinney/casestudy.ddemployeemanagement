package com.dollardeveloper.employeemanagement.employeemanagement.Configuration;

import com.dollardeveloper.employeemanagement.employeemanagement.model.Department;
import com.dollardeveloper.employeemanagement.employeemanagement.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.Arrays;
//TODO department configuration deferred to v2
//@Configuration
//public class DepartmentConfig {
//    @Autowired
//    private DepartmentRepository repository;
//
//    @PostConstruct
//    public void setup(){
//        repository.saveAll(Arrays.asList(
//                new Department(),
//                new Department(),
//                new Department()
//        ));
//    }
//}

package com.dollardeveloper.employeemanagement.employeemanagement.Configuration;

import com.dollardeveloper.employeemanagement.employeemanagement.model.Department;
import com.dollardeveloper.employeemanagement.employeemanagement.model.Employee;
import com.dollardeveloper.employeemanagement.employeemanagement.model.Post;
import com.dollardeveloper.employeemanagement.employeemanagement.repository.DepartmentRepository;
import com.dollardeveloper.employeemanagement.employeemanagement.repository.EmployeeRepository;
import com.dollardeveloper.employeemanagement.employeemanagement.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.Arrays;
//I decided to add dummy data here as opposed to connecting a virutal database after I deployed to heroku.
//Prior to this, I was not using this class, and made use of my local MySQL database.
@Configuration
public class ProjectConfig {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private PostRepository postRepository;

    @PostConstruct
    public void setup(){
//        employeeRepository.saveAll(Arrays.asList(
//                new Employee(),
//                new Employee(),
//                new Employee()
//        ));

        postRepository.saveAll(Arrays.asList(
                new Post(),
                new Post(),
                new Post()
        ));
    }
}

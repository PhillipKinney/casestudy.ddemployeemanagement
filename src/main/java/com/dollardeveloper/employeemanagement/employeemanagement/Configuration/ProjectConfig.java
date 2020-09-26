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
//    @Autowired
//    private EmployeeRepository employeeRepository;

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
                new Post("Getting Money!", "Mr. Money Getter","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Proin sed libero enim sed faucibus. Dignissim sodales ut eu sem integer. Eleifend mi in nulla posuere sollicitudin aliquam ultrices sagittis"),
                new Post("Saving Money!", "Mrs. Money Saver", "Tortor vitae purus faucibus ornare suspendisse sed nisi lacus. Eget felis eget nunc lobortis. Suspendisse faucibus interdum posuere lorem ipsum dolor. Nec dui nunc mattis enim ut tellus. At erat pellentesque adipiscing commodo elit at imperdiet."),
                new Post("Where did the money go????", "Mr. and Mrs. Spend-A-Lot", "Scelerisque felis imperdiet proin fermentum leo. Quisque non tellus orci ac auctor augue. Eu scelerisque felis imperdiet proin fermentum leo vel orci porta. Vulputate odio ut enim blandit volutpat.")
        ));
    }
}

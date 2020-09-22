package com.dollardeveloper.employeemanagement.employeemanagement.service;

import com.dollardeveloper.employeemanagement.employeemanagement.dto.UserRegistrationDto;
import com.dollardeveloper.employeemanagement.employeemanagement.model.Role;
import com.dollardeveloper.employeemanagement.employeemanagement.model.User;
import com.dollardeveloper.employeemanagement.employeemanagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class UserServiceImpl implements UserService{

   private UserRepository userRepository;

    //private BCryptPasswordEncoder passwordEncoder;


    @Autowired
    public UserServiceImpl(UserRepository userRepository /*, BCryptPasswordEncoder passwordEncoder*/) {
        super();
        this.userRepository = userRepository;
       // this.passwordEncoder = passwordEncoder;
    }

    @Override
    public User save(UserRegistrationDto registrationDto) {
        User user = new User(registrationDto.getFirstName(),
                registrationDto.getLastName(), registrationDto.getEmail(),
                registrationDto.getPassword(), Arrays.asList(new Role("ROLE_USER")));

        return userRepository.save(user);
    }
}

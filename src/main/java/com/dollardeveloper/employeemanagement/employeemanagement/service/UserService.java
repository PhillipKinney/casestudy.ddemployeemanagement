package com.dollardeveloper.employeemanagement.employeemanagement.service;

import com.dollardeveloper.employeemanagement.employeemanagement.dto.UserRegistrationDto;
import com.dollardeveloper.employeemanagement.employeemanagement.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    User save(UserRegistrationDto registrationDto);
}

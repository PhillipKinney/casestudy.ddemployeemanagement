package com.dollardeveloper.employeemanagement.employeemanagement.service;

import com.dollardeveloper.employeemanagement.employeemanagement.dto.UserRegistrationDto;
import com.dollardeveloper.employeemanagement.employeemanagement.model.User;

public interface UserService {

    User save(UserRegistrationDto registrationDto);
}

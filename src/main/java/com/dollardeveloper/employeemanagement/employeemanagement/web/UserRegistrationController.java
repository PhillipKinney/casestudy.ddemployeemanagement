package com.dollardeveloper.employeemanagement.employeemanagement.web;

import com.dollardeveloper.employeemanagement.employeemanagement.dto.UserRegistrationDto;
import com.dollardeveloper.employeemanagement.employeemanagement.service.UserService;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {

    private UserService userService;

    public UserRegistrationController(UserService userService) {
        super();
        this.userService = userService;
    }

    @PostMapping
    public String registerUserAccount(@ModelAttribute("user") UserRegistrationDto registrationDto){
        userService.save(registrationDto);
        return "redirect:/registration";
    }

}

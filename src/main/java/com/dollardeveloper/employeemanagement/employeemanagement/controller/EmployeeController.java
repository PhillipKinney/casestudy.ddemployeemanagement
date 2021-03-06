package com.dollardeveloper.employeemanagement.employeemanagement.controller;

import com.dollardeveloper.employeemanagement.employeemanagement.model.Employee;
import com.dollardeveloper.employeemanagement.employeemanagement.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }



    @GetMapping("/index")
    public String viewHomePage(Model model){
        model.addAttribute("listEmployees", employeeService.getAllEmployees());
        return "index";
    }

    //model attribute to bind form data
    @GetMapping("/showNewEmployeeForm")
    public String showNewEmployeeForm(Model model){
        Employee employee = new Employee();
        model.addAttribute("employee", employee);

        return "new_employee";
    }

    //Save employee to database
    @PostMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("employee") Employee employee){
    employeeService.saveEmployee(employee);
    return "redirect:/index";
    }


    @GetMapping("/showFormForUpdate/{empId}")
    public String showFromForUpdate(@PathVariable (value = "empId") long empId, Model model){

        //Get Employee from Service
        Employee employee = employeeService.getEmployeeByEmpId(empId);

        //Set employee as model attribute to pre-populate form
        model.addAttribute("employee", employee);
        return "update_employee";

    }

    @GetMapping("/deleteEmployee/{empId}")
    public String deleteEmployee(@PathVariable(value = "empId") Long empId){
        this.employeeService.deleteEmployeeById(empId);
        return "redirect:/index";
    }

}

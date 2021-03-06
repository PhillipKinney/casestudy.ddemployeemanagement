package com.dollardeveloper.employeemanagement.employeemanagement.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Department {

    //A department can have my employees, but an employee can only have one department
    //TODO integrate Department to employee list in v2

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long deptId;
    private String deptName;

    @OneToMany
    @JoinColumn
    private List<Employee> employees;

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }




}

package com.dollardeveloper.employeemanagement.employeemanagement.model;

import javax.persistence.*;


@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long empId;
    private String lastName;
    private String firstName;
    private String email;
    private Long hireYear;

//    @OneToOne
//    private Department department;

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getHireYear() {
        return hireYear;
    }

    public void setHireYear(Long hireYear) {
        this.hireYear = hireYear;
    }
}

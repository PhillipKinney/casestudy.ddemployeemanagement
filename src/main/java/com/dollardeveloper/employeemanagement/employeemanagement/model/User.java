package com.dollardeveloper.employeemanagement.employeemanagement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Collection;

@Entity
public class User {

    //A user is an actor that adds employees to the database
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long userId;


    private String firstName;
    private String lastName;
    private String password;
    private Collection<Role> roles;

    public User(){
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Collection<Role> getRoles() {
        return roles;
    }

    public void setRoles(Collection<Role> roles) {
        this.roles = roles;
    }

    public User(String firstName, String lastName, String password, Collection<Role> roles) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.roles = roles;


    }
}

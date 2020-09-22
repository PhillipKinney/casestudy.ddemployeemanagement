package com.dollardeveloper.employeemanagement.employeemanagement.repository;

import com.dollardeveloper.employeemanagement.employeemanagement.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <User, Long> {

}

package com.dollardeveloper.employeemanagement.employeemanagement.repository;

import com.dollardeveloper.employeemanagement.employeemanagement.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
}

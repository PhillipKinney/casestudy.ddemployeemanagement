package com.dollardeveloper.employeemanagement.employeemanagement.service;

import com.dollardeveloper.employeemanagement.employeemanagement.model.Post;

import java.util.List;

public interface PostService {

    List<Post> getAllPosts();
    void savePost(Post post);

}

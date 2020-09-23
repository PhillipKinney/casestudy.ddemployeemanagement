package com.dollardeveloper.employeemanagement.employeemanagement.service;

import com.dollardeveloper.employeemanagement.employeemanagement.model.Post;
import com.dollardeveloper.employeemanagement.employeemanagement.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    private PostRepository postRepository;

    @Autowired
    public PostServiceImpl(PostRepository postRepository){
        this.postRepository= postRepository;
    }

    @Override
    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }
}

package com.dollardeveloper.employeemanagement.employeemanagement.controller;

import com.dollardeveloper.employeemanagement.employeemanagement.model.Post;
import com.dollardeveloper.employeemanagement.employeemanagement.service.EmployeeService;
import com.dollardeveloper.employeemanagement.employeemanagement.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PostController {

    private PostService postService;

    @Autowired
    public PostController(PostService postService){
        this.postService= postService;
    }

    //display list of all posts
    @GetMapping("/posts")
    public String viewPostPage(Model model){
        model.addAttribute("listPosts", postService.getAllPosts());
        return "index2";
    }
}
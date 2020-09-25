package com.dollardeveloper.employeemanagement.employeemanagement.controller;

import com.dollardeveloper.employeemanagement.employeemanagement.model.Employee;
import com.dollardeveloper.employeemanagement.employeemanagement.model.Post;
import com.dollardeveloper.employeemanagement.employeemanagement.service.EmployeeService;
import com.dollardeveloper.employeemanagement.employeemanagement.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PostController {

    private PostService postService;

    @Autowired
    public PostController(PostService postService){
        this.postService= postService;
    }

    //display list of all posts that can be updated or deleted
    @GetMapping("/postManager")
    public String viewPostPage(Model model){
        model.addAttribute("listPosts", postService.getAllPosts());
        return "index2";
    }
    //shows all posts including the post content
    @GetMapping("/posts")
    public String viewPostHomePage(Model model){
        model.addAttribute("listPosts", postService.getAllPosts());
        return "posts_home";
    }

    //form to create new blog post
    @GetMapping ("/showNewPostForm")
    public String showNewPostForm(Model model){
        Post post = new Post();
        model.addAttribute("post", post);
        return "new_post";
    }

    //save post to database
    @PostMapping("/savePost")
    public String savePost (@ModelAttribute("post") Post  post){
        postService.savePost(post);
        return "redirect:/postManager";
    }

    //update blog post
    @GetMapping ("/showFormForPostUpdate/{id}")
    public String showFormForPostUpdate(@PathVariable (value="id") Long id, Model model){
        //get post from service
        Post post = postService.getPostById(id);
        //set post as model attribute to populate form
        model.addAttribute("post", post);
        return "update_post";

    }

    //delete blog post
    @GetMapping("/deletePost/{id}")
    public String deletePost(@PathVariable(value = "id") Long id){
        this.postService.deleteEmployeeById(id);
        return "redirect:/postManager";
    }

    @GetMapping("/")
    public String home(){
        return "home_page";
    }
}

package com.test.blog;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BlogController {
	
	@Autowired
    private BlogService blogService;

    @RequestMapping("/blog")
    public List<Blog> getAllBlogPosts() {
        List<Blog> blogPosts = blogService.getAllBlogPosts();
        return blogPosts;
    }
    @GetMapping("/blog/add")
    public String showAddForm(Model model) {
        model.addAttribute("blogPost", new Blog());
        return "blog/add";
    }

    @PostMapping("/blog/add")
    public String addBlogPost(@ModelAttribute Blog blogPost) {
        blogService.addBlogPost(blogPost);
        return "redirect:/blog";
    }
}

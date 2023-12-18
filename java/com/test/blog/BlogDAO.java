package com.test.blog;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BlogDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Blog> getAllBlogPosts() {
        String sql = "SELECT * FROM blog_posts";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Blog.class));
    }
    
    public void addBlogPost(Blog blog) {
    	String sql = "INSERT INTO blog_posts (title, content) VALUES (?, ?)";
        jdbcTemplate.update(sql, blog.getTitle(), blog.getContent());  
    }
    
    
    
}



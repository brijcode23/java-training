package com.test.blog;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogService {
	
	@Autowired
	private BlogDAO blogDao;

	public List<Blog> getAllBlogPosts() {
		return blogDao.getAllBlogPosts();
    }
	
    public void addBlogPost(Blog blogPost) {
        blogDao.addBlogPost(blogPost);
    }
}


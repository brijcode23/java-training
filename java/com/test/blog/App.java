package com.test.blog;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        try (AnnotationConfigApplicationContext info = new AnnotationConfigApplicationContext(AppConfig.class)) {
			BlogController bc = info.getBean(BlogController.class);
			bc.getAllBlogPosts();
        }
    }
}

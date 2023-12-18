package com.test.blog;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class AppConfig {
@Bean
public DataSource dataSource() {
	DriverManagerDataSource dataSource = new DriverManagerDataSource();
	dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
	dataSource.setUrl("jdbc:mysql://localhost:3306/Blog");
	dataSource.setUsername("admin");
	dataSource.setPassword("admin123");
	return dataSource;
    }

	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource) {
	return new JdbcTemplate(dataSource);
	}
	
	@Bean
     public BlogService getblogService() {
         return new BlogService();
     }
	@Bean
     public BlogDAO blogDao() {
         return new BlogDAO();
     }
}

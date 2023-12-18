package com.test.blog;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class AppConfig {
@Bean
public DataSource dataSource() {
	DriverManagerDataSource dataSource = new DriverManagerDataSource();
	dataSource.setDriverClassName("your_database_driver_class");
	dataSource.setUrl("your_database_url");
	dataSource.setUsername("your_database_username");
	dataSource.setPassword("your_database_password");
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

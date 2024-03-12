package com.goonok.Spring1App.jdbc.javaconf;



import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.goonok.Spring1App.jdbc.modelDAO.StudentDAO;
import com.goonok.Spring1App.jdbc.modelDAO.StudentDaoImpl;

@Configuration
@ComponentScan(basePackages = "com.goonok.Spring1App.jdbc.modelDAO" )
public class Config {

	
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/student");
		dataSource.setUsername("root");
		dataSource.setPassword("252646");
		return dataSource;
	}
	
	@Bean
	public JdbcTemplate jdbcTemplate() {
		JdbcTemplate jdbc = new JdbcTemplate();
		jdbc.setDataSource(dataSource());
		return jdbc;
	}
	
	/*
	 * @Bean public StudentDAO studentDAO() { StudentDaoImpl daoImpl = new
	 * StudentDaoImpl(); daoImpl.setJdbcTemplate(jdbcTemplate()); return daoImpl; }
	 */
}

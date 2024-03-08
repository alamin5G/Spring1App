package com.goonok.Spring1App.jdbc.javaconf;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		JdbcTemplate jdbc =  context.getBean("jdbcTemplate", JdbcTemplate.class);
		try {
			System.out.println(jdbc.getDataSource().getConnection());
			String sql = "INSERT INTO st_info(id, name, address, phone) VALUES (?, ?, ?, ?)";
			int rowsAffected = jdbc.update(sql, 2, "Rakib", "Uttara, Dhaka", "01581741783");
			System.out.println(rowsAffected + " rows affected!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

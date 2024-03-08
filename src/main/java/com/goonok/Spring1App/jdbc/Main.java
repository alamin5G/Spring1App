package com.goonok.Spring1App.jdbc;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/goonok/Spring1App/jdbc/beans.xml");
		JdbcTemplate jdbc =  context.getBean("jdbcTemplate", JdbcTemplate.class);
		try {
			System.out.println(jdbc.getDataSource().getConnection());
			String sql = "INSERT INTO st_info (id, name,address, phone) VALUES (?, ?, ?, ?)";
			int rowsAffected = jdbc.update(sql, 1, "Md. Alamin", "Tongi", "01822679672");
			System.out.println(rowsAffected + " rows affected");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

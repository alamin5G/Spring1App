package com.goonok.Spring1App.jdbc.javaconf;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.goonok.Spring1App.jdbc.model.Model;
import com.goonok.Spring1App.jdbc.modelDAO.StudentDAO;
import com.goonok.Spring1App.jdbc.modelDAO.StudentDaoImpl;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		JdbcTemplate jdbc =  context.getBean("jdbcTemplate", JdbcTemplate.class);
		try {
			System.out.println(jdbc.getDataSource().getConnection());
			/*
			 * String sql =
			 * "INSERT INTO st_info(id, name, address, phone) VALUES (?, ?, ?, ?)"; int
			 * rowsAffected = jdbc.update(sql, 3, "Sakib", "Jatrabari, Dhaka",
			 * "01581741785"); System.out.println(rowsAffected + " rows affected!");
			 */
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		StudentDaoImpl dao = context.getBean("studentDaoImpl",StudentDaoImpl.class);
		
		/*
		 * Model model = new Model(); model.setId(4); model.setName("Rahim");
		 * model.setAddress("Dattapara, Tongi"); model.setPhone("01385676861");
		 * 
		 * int rowAffected = dao.insert(model); System.out.println(rowAffected +
		 * " data inserted successfully!");
		 */
		
		
		/*
		 * Model model = new Model(); model.setId(4); model.setName("Rahim Uddin");
		 * model.setAddress("Dottopara, Tongi West"); model.setPhone("01385575861"); int
		 * rowAffected = dao.updateDetails(model); System.out.println(rowAffected +
		 * " data inserted successfully!");
		 */
		
		Model m = dao.getModelById(3);
		System.out.println(m);
	}
}

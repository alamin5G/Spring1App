package com.goonok.Spring1App.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.goonok.Spring1App.jdbc.model.Model;
import com.goonok.Spring1App.jdbc.modelDAO.StudentDaoImpl;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/goonok/Spring1App/jdbc/beans.xml");
		JdbcTemplate jdbc = context.getBean("jdbcTemplate", JdbcTemplate.class);
		try {
			System.out.println(jdbc.getDataSource().getConnection());
			/*
			 * String sql =
			 * "INSERT INTO st_info (id, name,address, phone) VALUES (?, ?, ?, ?)"; int
			 * rowsAffected = jdbc.update(sql, 1, "Md. Alamin", "Tongi", "01822679672");
			 * System.out.println(rowsAffected + " rows affected");
			 */
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		/*
		 * sql insert
		 * 
		 * String insertSql =
		 * "insert into st_info(id, name, address, phone)values(?, ?, ?, ?)"; int
		 * rowAffected = jdbc.update(insertSql, 5, "Rakib", "Uttara, Dhaka",
		 * "01581733764"); System.out.println("Total " + rowAffected +
		 * " row inserted int to the st_info table");
		 */

		/*
		 * sql update
		 */
		/*
		 * String sqlUpdate = "update st_info set name =?, address=? where id = ?"; int
		 * rowsAffected = jdbc.update(sqlUpdate, "Md. Al-Amin", "Tongi, Gazipur", 1);
		 * System.out.println("total " + rowsAffected +
		 * " row data updated on table st_info");
		 */

		/*
		 * sql delete
		 *
		 */

		/*
		 * String sqlDelete = "delete from st_info where id = ?"; int rowsAffected =
		 * jdbc.update(sqlDelete, 5); System.out.println(rowsAffected +
		 * " row deleted succesfully!");
		 */

		// fetch or retrive data from the database table by id
		/*
		 * String sql = "select * from st_info where id = ?"; RowMapper rowMapper = new
		 * RowMapper() {
		 * 
		 * public Object mapRow(ResultSet rs, int rowNum) throws SQLException { String
		 * name = rs.getString(2); //column num return name; } }; String name = (String)
		 * jdbc.queryForObject(sql, rowMapper, 4); //2 for row number
		 * System.out.println(name);
		 */

		/*
		 * String sql = "select * from st_info"; RowMapper rowMap = new RowMapper() {
		 * 
		 * @Override public Object mapRow(ResultSet rs, int rowNum) throws SQLException
		 * { // TODO Auto-generated method stub String name = rs.getString(2); return
		 * name; } }; List<String> list = jdbc.query(sql, rowMap); for(String st : list)
		 * { System.out.println(st); }
		 */

		// invoke the bean
		StudentDaoImpl dao = context.getBean("studentDaoImpl", StudentDaoImpl.class);

		/*
		 * Model model = new Model(); model.setId(2); model.setName("Rahim");
		 * model.setAddress("Kazipara, Mirpur"); model.setPhone("01928374342");
		 * 
		 * int rowAffected = dao.insert(model); System.out.println(rowAffected +
		 * " data inserted succesfully");
		 */

		
		/*
		 * Model model = new Model(); model.setId(2); model.setName("Rahim Uddin");
		 * model.setAddress("Kazipara, Mirpur-1230"); model.setPhone("01928374344");
		 * 
		 * int rowAffected = dao.updateDetails(model); System.out.println(rowAffected +
		 * " data updated succesfully");
		 */
		
		/*
		 * int rowAffected = dao.delete(2); System.out.println(rowAffected +
		 * " data deleted succesfully");
		 */
		
		/*
		 * Model model = dao.getModelById(1); System.out.println(model.toString());
		 */
		
		List<Model> list = dao.getAllModel();
		for(Model m : list) {
			System.out.println(m);
		}
	}
}

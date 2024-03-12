package com.goonok.Spring1App.jdbc.modelDAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.goonok.Spring1App.jdbc.model.Model;

@Component
public class StudentDaoImpl implements StudentDAO{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	/*
	 * public JdbcTemplate getJdbcTemplate() { return jdbcTemplate; }
	 * 
	 * public void setJdbcTemplate(JdbcTemplate jdbcTemplate) { this.jdbcTemplate =
	 * jdbcTemplate; }
	 */

	@Override
	public int insert(Model model) {

		String insert = "INSERT INTO st_info(id, name, address, phone) VALUES (?, ?, ?, ?)";
		int rowsAffected = jdbcTemplate.update(insert, model.getId(), model.getName(), model.getAddress(), model.getPhone());
		
		return rowsAffected;
	}

	@Override
	public int updateDetails(Model model) {
		String sql = "UPDATE st_info set name =? , address=?, phone = ? where id = ?";
		int rowsAffected = jdbcTemplate.update(sql, model.getName(), model.getAddress(), model.getPhone(), model.getId());
		return rowsAffected;
	}

	@Override
	public int delete(int id) {
		String sql = "DELETE FROM st_info WHERE id = ?";
		int rowsAffected = jdbcTemplate.update(sql, id);
		return rowsAffected;
	}

	@Override
	public Model getModelById(int id) {
		String sql = "SELECT * FROM st_info WHERE id = ?";
		RowMapper rowMap = new RowMapper() {

			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				Model model = new Model();
				model.setId(rs.getInt(1));
				model.setName(rs.getString(2));
				model.setAddress(rs.getString(3));
				model.setPhone(rs.getString(4));
				return model;
			}
			
		};
		Model myModel = (Model) jdbcTemplate.queryForObject(sql, rowMap, id);
		return myModel;
	}

	@Override
	public List<Model> getAllModel() {
		String sql = "SELECT * FROM st_info";
		RowMapper rowMap = new RowMapper() {
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException{
				Model model = new Model();
				model.setId(rs.getInt(1));
				model.setName(rs.getString(2));
				model.setAddress(rs.getString(3));
				model.setPhone(rs.getString(3));
				return model;
			}
		};
		List<Model> modelList = jdbcTemplate.query(sql, rowMap);
		return modelList;
	}

	
}

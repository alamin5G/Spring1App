package com.goonok.Spring1App.jdbc.modelDAO;

import java.util.List;

import com.goonok.Spring1App.jdbc.model.Model;

public interface StudentDAO {

	public int insert(Model model);
	public int updateDetails(Model model);
	public int delete(int id);
	public Model getModelById(int id);
	public List<Model> getAllModel();
}

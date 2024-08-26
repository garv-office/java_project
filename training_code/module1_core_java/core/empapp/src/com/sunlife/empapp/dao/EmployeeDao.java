package com.sunlife.empapp.dao;

import java.util.List;

public interface EmployeeDao {
	public List<Employee> getAll();
	public Employee getById(int id);
	public void addEmployee(Employee employee);
	//update
	//delete
}
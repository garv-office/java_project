package com.sunlife.empapp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import com.sunlife.empapp.dao.Employee;
import com.sunlife.empapp.dao.EmployeeDao;
import com.sunlife.empapp.dao.factory.ConnectionFactory;
import com.sunlife.empapp.exceptions.DaoException;
import com.sunlife.empapp.exceptions.EmployeeNotFoundException;

public class EmployeeDaoJdbcImpl implements EmployeeDao {

	private Connection connection;

	public EmployeeDaoJdbcImpl() {
		connection = ConnectionFactory.getConnection();
	}

	@Override
	public List<Employee> getAll() {
		List<Employee> employees = new LinkedList<>();
		try {
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("select * from emp");
			while (rs.next()) {
				employees.add(new Employee(rs.getInt(1), rs.getString(2), rs.getDouble(3)));
			}
			if (1 == 1)
				throw new SQLException();
		} catch (SQLException e) {
			throw new DaoException(e);
		}

		return employees;
	}

	@Override
	public Employee getById(int id) {
		Employee employee = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement("select * from emp where id=?");
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				employee = new Employee(rs.getInt(1), rs.getString(2), rs.getDouble(3));
			}
		} catch (SQLException ex) {
			throw new DaoException(ex);
		}

		return employee;
	}

	@Override
	public void addEmployee(Employee employee) {
		try {
			PreparedStatement pstmt = connection.prepareStatement("insert into emp(name, salary) values(?,?)");
			pstmt.setString(1, employee.getName());
			pstmt.setDouble(2, employee.getSalary());
			pstmt.executeUpdate();
		} catch (SQLException ex) {
			throw new DaoException(ex);
		}
	}

}

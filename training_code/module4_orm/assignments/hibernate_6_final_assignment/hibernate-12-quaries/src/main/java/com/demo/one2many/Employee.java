package com.demo.one2many;

import jakarta.persistence.*;

@Entity
@Table(name = "emp_table_one2many")
public class Employee {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer empId;

	private String empName;

	@ManyToOne
	@JoinColumn(name = "deptId_fk", nullable = false)
	private Department department;

	public Employee() {
	}

	public Employee(String empName) {
		this.empName = empName;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName  + "]";
	}

	
}

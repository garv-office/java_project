package com.day2.assignment.q1;

import java.util.Objects;

//code --> test
public class Employee extends Object{
	private int id;
	private String firstName;
	private String lastName;
	private int salary;

	public Employee(int id, String firstName, String lastName, int salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getAnnualSalary() {
		return 12 * getSalary();
	}

	public String getName() {
		return getFirstName() + " " + getLastName();
	}

	public int raiseSalary(int percent) {
		salary = salary*(100+percent)/100;
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
				+ "]";
	}

//	@Override
//	public int hashCode() {
//		return Objects.hash(firstName, id, lastName, salary);
//	}
	
	
	

	//Dry run
	//Object vs Objects
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(firstName, other.firstName) 
				&& id == other.id && Objects.equals(lastName, other.lastName)
				&& salary == other.salary;
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("finalize is called");
		super.finalize();
	}

	

}

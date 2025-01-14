package com.day4.session2.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class E_Comparable_Comparator {

	public static void main(String[] args) {
		List<Employee> employees=new LinkedList<>();
	
		employees.add(new Employee(189, "Ekta", 2200));
		employees.add(new Employee(51, "Ramesh", 3000));
		employees.add(new Employee(81, "Ramesh", 3000));
		employees.add(new Employee(1, "Raj", 2000));
		
		printEmployeesList(employees);
		//SOLID
		Collections.sort(employees);//OCP
		
		System.out.println("sorted as per ID");
		printEmployeesList(employees);
		
		System.out.println("sorted as per Name");
		Collections.sort(employees, new NameSorter());
		printEmployeesList(employees);
		
		System.out.println("sorted as per Salary");
		Collections.sort(employees, new SalarySorter());
		printEmployeesList(employees);
		
	}

	private static void printEmployeesList(List<Employee> employees) {
		Iterator<Employee> it=employees.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}

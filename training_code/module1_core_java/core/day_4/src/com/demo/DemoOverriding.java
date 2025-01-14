package com.demo;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class MyFooImpl implements Foo{

	@Override
	public  void foo() {
		System.out.println("foo imp");
	}
	
}
public class DemoOverriding {

	public static void main(String[] args) {
//		Set<Emp> emps=new HashSet<>();
//		emps.add(new Emp(1, "raj"));
//		System.out.println(emps.contains(new Emp(1, "raj")));
		
		//type inference?
		
		Comparator<Emp> comparator=( o1, o2) ->o1.getName().compareTo(o2.getName());
		
		
		Set<Emp> emps=new TreeSet<>(comparator);
		emps.add(new Emp(1, "raj"));
		emps.add(new Emp(16, "ekta"));
		
		Iterator<Emp> it=emps.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}






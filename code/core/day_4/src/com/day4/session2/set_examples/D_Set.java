package com.day4.session2.set_examples;

import java.util.HashSet;
import java.util.Set;

public class D_Set {
	public static void main(String[] args) {
		// Set dont allow duplicate
		// HashSet, LinkedHashSet,TreeSet
		Set<String> set = new HashSet<>();
		set.add("foo");
		set.add("bar");
		set.add("foo");
		set.add("apple");
		set.add("umesh");
	}

}

package com.day4.session2.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class RevSorter implements Comparator<String>{
	@Override
	public int compare(String o1, String o2) {
		return o2.compareTo(o1);
	}
	
}
public class E2_ImpQue {

	public static void main(String[] args) {
		//list of string
		List<String> list=new ArrayList<>();
		list.add("foo");
		list.add("jar");
		list.add("jar");
//		Collections.sort(list, new RevSorter());
//		Collections.sort(list, new Comparator<String>() {
//
//			@Override
//			public int compare(String o1, String o2) {
//				return o2.compareTo(o1);
//			}
//		});
		
		Collections.sort(list,( o1,  o2) ->o2.compareTo(o1));
		
		System.out.println(list);
		
	}
}
package com.day4.session1.a.pending_topics_string;

public class A_String {
	
	public static void main(String[] args) {
//		String a1="foo";
//		String a2=new String("foo").intern();
//		if(a1==a2) {
//			System.out.println("eq");
//		}else {
//			System.out.println("not eq");
//		}
		
//		String s="1"+"2"+"3"+"4";
//		String s2=new StringBuilder().append("1").append("2").append("3")
//				.append("4").toString();
		
		
//		String data="india";
//		data=data.toUpperCase();
//		System.out.println(data);
		
		String data="india";
		data=new StringBuilder().append("india").reverse().toString();
		System.out.println(data);
		
		
	}

}
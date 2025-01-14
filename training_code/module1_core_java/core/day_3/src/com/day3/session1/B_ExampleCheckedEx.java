package com.day3.session1;

import java.io.*;
import java.util.*;

public class B_ExampleCheckedEx {

	public static void main(String[] args) /* throws FileNotFoundException */ {
//		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Set<String> hashSet = new TreeSet<>();
		try (BufferedReader br = new BufferedReader(
				new FileReader(new File("C:\\Users\\busyc\\OneDrive\\Desktop\\photo\\data.txt")))) {

			String line = null;
			while ((line = br.readLine()) != null) {
				String tokens[] = line.split(" ");
				for (String token : tokens) {
					hashSet.add(token.toLowerCase());
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		for (String token : hashSet) {
			System.out.println(token);
		}
	}
}

package com.sunlife.facerecsystem.iaf.controller;

import java.util.Scanner;

import com.sunlife.facerecsystem.iaf.ui.*;


public class Main {

	public static void main(String[] args) {
//		Face faceUi=new Face();
//		faceUi.printFacePixelOnUI();
//		
//		com.sunlife.facerecsystem.iaf.db.Face faceDb=new com.sunlife.facerecsystem.iaf.db.Face();
	//	faceDb.saveFacePixelToDb();
		int data;
//		Scanner scanner=new Scanner(System.in);
//		data= scanner.nextInt();
//		System.out.println(data);
		
		String data2;
		Scanner scanner=new Scanner(System.in);
		data2= scanner.nextLine();
		
		String []tokens=data2.split(" ");
		for(String token: tokens) {
			System.out.println(token);
		}
		
	}
}


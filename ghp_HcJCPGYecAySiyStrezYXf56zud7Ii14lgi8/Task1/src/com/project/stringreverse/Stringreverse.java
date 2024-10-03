package com.project.stringreverse;

import java.util.Scanner;

public class Stringreverse {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);     //taking input from user
		System.out.println("Enter the no to reverse:");
		String string=sc.next();  //store the taken input
		
		int lenghth=string.length();   //calculate the lenghth of the string 
		System.out.println(lenghth);
		System.out.println("===================================");
		
		
//		string index starts from zero so lenghth-1 and going uptill zero
		for(int i=lenghth-1;i>=0;i--) {
			
			System.out.print(string.charAt(i));  //print all string in one line
			
		}
		
		
		
	}

}

package com.project.wordcount;

import java.util.Scanner;

public class Wordcount {

	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Strings to count words:");
		String string=sc.nextLine();
		
		String[] wordcount=string.split(" ");
		
		int count=wordcount.length;
		
		
		System.out.println("the total enter word is "+count);
		
		
	}
}

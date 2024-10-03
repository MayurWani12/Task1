package com.project.duplicate;

import java.util.Scanner;

public class Duplicateno {
	
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);//input taken
		
		System.out.println("Enter the lenghth of array"); 
		int size=sc.nextInt();//store lenghth
		
		int[] number=new int[size]; //naking array of that size
		
		System.out.println("Entere the "+size+"element");
		
		for(int i=0;i<size;i++) {
			
			number[i] = sc.nextInt();
		}
		
		boolean duplicate=false; //show value present or not
		
		
		 for (int i = 0; i < size; i++) {
	            for (int j = i + 1; j < size; j++) {
	                if (number[i] == number[j]) {
	                	System.out.println(number[i]);
	                	duplicate=true;
						break; 
	                }
	            }
		 }
		
		 if (!duplicate) {
	            System.out.println("no duplicates found");
	        }
	}

}

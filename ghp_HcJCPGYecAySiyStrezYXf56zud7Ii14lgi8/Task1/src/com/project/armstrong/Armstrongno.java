package com.project.armstrong;

import java.util.Scanner;

public class Armstrongno {
	public static void main(String[] args) {
		
		System.out.println("Enter the no to check no is palidrone or not:");
		Scanner sc=new Scanner(System.in);//taking input
		int number=sc.nextInt();//store input
		
		int originalno=number;  
		int last;
		int sum=0;
		
		while(number>0) {
			
			last=number%10;  //getting last digit
			number=number/10;   //getting remaining digit of first
			sum= sum +last*last*last;  
			
			
		}
		//checking condition for armstrong no
		
		if(originalno==sum) {
			System.out.println("The  "+originalno+" is Armstrong no");
		}
		else {
			System.out.println("The  "+originalno+" is not Armstrong no");
		}
	}

}

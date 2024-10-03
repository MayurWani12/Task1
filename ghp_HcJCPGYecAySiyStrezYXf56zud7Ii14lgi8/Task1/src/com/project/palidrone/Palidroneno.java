package com.project.palidrone;

import java.util.Scanner;

public class Palidroneno {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in); //getting input
		System.out.println("Enter The No:");
		int number=sc.nextInt();
//		System.out.println("The original no is:"+number);
		
		int originalno=number;
		int reverseno=0;
		
		while(number>0) {
			
			int last=number%10;    //for getting last
			reverseno=reverseno*10+last; //for reverse
			number/=10;  //remove last
			
			
		}
		
		//condition for check both no are same or not
		
		if(originalno==reverseno) {
			
		System.out.println("the enter no is palidrone and enter no is:"+originalno);
			
		}
		else {
			System.out.println("the entere no is not palidrone and enter no is:"+originalno);
			
		}
		
		
		
	}

}

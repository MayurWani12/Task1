package com.project.neon;

import java.util.Scanner;

public class Neonno {

	public static void main(String[] args) {
		
		System.out.println("Enter The No To Check No Is Neon Or Not:");
		
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		
		int originalno=number;
		int sum=0;
		
		int Square=number*number;  //for square of no
		
		while(Square>0) {   
			
			int no=Square%10;  //last digit
			sum=sum+no;   //adding no
			
			Square/=10;  //remove last
			
			
		}
		//checking condition
		if(originalno==sum) {
			
			
			System.out.println("Enter no is neon");
			
		}
		else {
			System.out.println("no is not neon no");
		}
		
		
		
	}
	
	
}

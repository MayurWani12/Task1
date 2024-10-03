package com.project.sumofarray;

import java.util.Scanner;

public class Sumofarray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the lenghth of array");
		int size=sc.nextInt();
		
		int[] number=new int[size];
		
		System.out.println("Entere the "+size+"element");
		
		for(int i=0;i<size;i++) {
			
			number[i] = sc.nextInt();
		}
		
		int sum = 0;
        for (int numbers : number) {
            sum += numbers;
        }
        
        System.out.println("The sum of the array elements is: " + sum);
		
		
		
		
	}
	
}

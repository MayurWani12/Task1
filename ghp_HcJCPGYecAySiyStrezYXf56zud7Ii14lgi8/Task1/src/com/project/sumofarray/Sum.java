package com.project.sumofarray;

public class Sum {

	public static void main(String[] args) {
		
		int [] num= {1,2,3,4,5}; //assing the array and its elememt
		int sum=0;  
		for(int number:num) {   //use for each loop for iteration
			
			sum=sum+number;
			
		}
		
		System.out.println("the sum of no is:"+sum);
		
		
	}
}

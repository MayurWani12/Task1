package com.project.findvowels;

public class Vowels {

	public static void main(String[] args) {
		
		String string="welcome to pune city"; //input string
		
		string=string.toLowerCase();  //convert it into lowercase
		

		int vowelcount=0;   //initial vowel count 0
		
		for(char ch:string.toCharArray()) { //making the characterarray
			
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				
				vowelcount++;
				
			}
			
			
			}
		System.out.println("The total no of vowels is:"+vowelcount); //printing total vowel
		}
		
	}
	



package com.project.vowelscount;

public class Vowlcount {
	
	public static void main(String[] args) {
		
		
		String string="welcome to pune city";
		
		string=string.toLowerCase();
		
		int vowelcount=0;
		
		int a=0;
		int e=0;
		int i=0;
		int o=0;
		int u=0;
		
		
		for(char ch:string.toCharArray()){
			
		switch (ch) {
		case 'a':
			a++;
			break;
		case 'e':
			e++;
			break;

		case 'i':
			i++;
			break;

		case 'o':
			o++;
			break;

		case 'u':
			u++;
			break;


		}
			
		}
		
		System.out.println("total no of vowels count is as follow");
		
		System.out.println("a=="+a);
		System.out.println("e=="+e);
		System.out.println("i=="+i);
		System.out.println("o=="+o);
		System.out.println("u=="+u);
	}
	

}

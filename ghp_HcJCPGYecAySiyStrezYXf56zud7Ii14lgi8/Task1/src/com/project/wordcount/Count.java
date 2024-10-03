package com.project.wordcount;

public class Count {
	public static void main(String[] args) {
		String string="welcome to pune city";
	
		String[] wordcount=string.split(" ");
		
		int count=wordcount.length;
		
		System.out.println("the Total Word Is "+count);
	
	}

}

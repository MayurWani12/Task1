package com.project.bubblesort;

public class Bubblesort {
	 public static void main(String[] args) {
	        
	        int arr[] = {4, 2, 3, 1};//define array
	        int length = arr.length;
	        
	        // algoritm for bubble Sort 
	        for (int i = 0; i < length - 1; i++) {
	            for (int j = 0; j < length - 1 - i; j++) { //  loop condition
	                if (arr[j] > arr[j + 1]) {
	                    // Swap j and j+1
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	            }
	        }
	        
	        // output the sorted array
	        System.out.println("Sorted elements are:");
	        for (int i = 0; i < length; i++) {
	            System.out.print(arr[i] + " "); //one line print
	        }
	    }
	}
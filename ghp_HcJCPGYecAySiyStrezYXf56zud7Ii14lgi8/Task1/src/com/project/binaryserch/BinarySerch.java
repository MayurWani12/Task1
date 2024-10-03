package com.project.binaryserch;

import java.util.ArrayList;
import java.util.Arrays;

public class BinarySerch {

    public static void main(String[] args) {
        int[] arr = {80, 90, 60, 80, 94, 85, 30, 80, 72}; //given array
        Arrays.sort(arr); //sort is neccesary for bubble sort
        System.out.println("Sorted array: " + Arrays.toString(arr));
        //print the sorted array

        int target = 80; //we want to fing 80 so target variable is used 
        ArrayList<Integer> positions = findAllOccurrences(arr, target);
//checking if target is present or not
        if (positions.isEmpty()) {
            System.out.println(target + " not found in the array.");
        } else {
            System.out.println(target + " found at positions: " + positions);
        }
    }

    public static ArrayList<Integer> findAllOccurrences(int[] arr, int target) {
        ArrayList<Integer> positions = new ArrayList<>();
        int index = binarySearch(arr, target);

        if (index == -1) {
            return positions;
        }

        int leftIndex = index;
        while (leftIndex >= 0 && arr[leftIndex] == target) {
            positions.add(leftIndex);
            leftIndex--;
        }

        int rightIndex = index + 1;
        while (rightIndex < arr.length && arr[rightIndex] == target) {
            positions.add(rightIndex);
            rightIndex++;
        }

        return positions;
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}

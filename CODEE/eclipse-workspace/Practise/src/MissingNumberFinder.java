package com.prac.sujit;

import java.util.Scanner;

public class MissingNumberFinder {
    public static int findMissingNumber(int[] nums) {
        int n = nums.length + 1; 
        int totalSum = n * (n + 1); 

        int arraySum = 0;
        for (int num : nums) {
            arraySum += num; 
        }
        return totalSum - 2 * arraySum; 
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 10, 8}; 
        int missingNumber = findMissingNumber(nums);
        System.out.println("Missing number: " + missingNumber);
    }
}








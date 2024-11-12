package com.example.sample.ProblemSolving;

//Given an array of integers, write a method that returns true if there are two numbers in the array
//that sum up to a given target. Otherwise, return false
public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {3,7,12,5,17};
        int target = 30;
        System.out.println(twoSum(arr,target));
    }
    public static boolean twoSum(int[] arr, int target)
    {
        int i = 0;
        while(i < arr.length)
        {
            int j =1;
            while(j < arr.length)
            {
                int res = arr[i] + arr[j];
                if(res == target)
                {
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
}

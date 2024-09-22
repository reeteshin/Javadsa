package Blind75.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class ContainsDuplicate {
    public static void  IterativeDuplicate(int arr[]){

        Boolean count = false;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count=true;
                }
            }
        }
        System.out.println("HI"+count);
    }

    public static void SortThenFind(ArrayList<Integer> arr){
        Collections.sort(arr);
        System.out.println("Sort and Find"+arr);
    }
   
    public static void HashSetMethod(ArrayList<Integer> nums){
          HashSet<Integer> set = new HashSet<>();
        
        for(int i = 0; i<nums.size();i++){
            set.add(nums.get(i));
        }
        System.err.println(set);

        // if set size less then the arr, then we can say array having duplicates
    }
    public static void main(String[] args){
// Given an integer array nums, return true if any value appears at
// least twice in the array, and return false if every element is
// distinct.
// Input: nums = [1,2,3,1]
// Output: true
       // int arr[] = {1,2,3,4,5,6};
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,1,3,4,5,6));
        //IterativeDuplicate(arr);
        // SortThenFind(arr);
        HashSetMethod(arr);
      // System.out.println("Hi"+arr);

    }
}

package GFGDSA.Array.Top50Quetions;

// Given an array arr[] of non-negative integers and an integer sum,
// find a subarray that adds to a given sum.

// Note: There may be more than one subarray with sum as the given sum, print first such subarray. 

// Examples: 

// Input: arr[] = {1, 4, 20, 3, 10, 5}, sum = 33
// Output: Sum found between indexes 2 and 4
// Explanation: Sum of elements between indices 2 and 4 is 20 + 3 + 10 = 33

class SubArrayWithSumFuntion {
    void Calculate(int[] arr, int sum) {

        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int total = 0;
                // System.out.println(arr[j]);
                for (int l = i; l <= j; l++) {
                     total =total+arr[l];
                    System.out.println(arr[l]);
                }
                if(total==sum)
                {
                    System.out.println("sum"+sum);
                }
                else{
                    System.out.println("sum not found");
                }
                System.out.println("\n");
            }
           
        }

    }
}

public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        int arr[] = {1, 4, 20, 3, 10, 5};
        int sum = 33;
        SubArrayWithSumFuntion obj = new SubArrayWithSumFuntion();
        obj.Calculate(arr, sum);
        System.out.println("hi");
    }
}

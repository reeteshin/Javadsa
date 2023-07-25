package GFGDSA.Array.Top50Quetions;
// Given an array arr[] of size N-1 with integers in the range of [1, N], 
//the task is to find the missing number from the first N integers.

// Note: There are no duplicates in the list.
public class FindMisingNumberInArray {
    public static void main(String[] args){
        System.out.println("Missing no In Array");
        int arr[] ={1, 2, 4, 6, 3, 7, 8};
        int N = 8;
        int sum =0;
        for(int i=0;i<arr.length;i++)
        {
            sum = (arr[i]*(arr[i]+1))/2;
        }
        System.out.println("Sum =>"+sum);

    }
}

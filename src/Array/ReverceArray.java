package Array;

import java.util.Scanner;

public class ReverceArray {
    
    public static void PrintArray(int arr[], int n) {

        for (var k = n - 1; k >= 0; k--) 
        {
            System.out.println(arr[k]);
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }

        int n = arr.length;
        PrintArray(arr, n);
    }
}

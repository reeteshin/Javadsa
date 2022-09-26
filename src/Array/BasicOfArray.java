package Array;

import java.util.Scanner;

public class BasicOfArray {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr;
        arr = new int[10];
        int[] arr2 = {1,2,3,5,6};
        System.out.println(arr.length);
        for(int i=0;i<arr2.length;i++)
        {
            System.out.println(arr2[i]);
           
        }
    }
}

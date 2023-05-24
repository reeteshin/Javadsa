package GFGDSA.Array.Top50Quetions;

import java.util.Arrays;

class SelectionSort {
    //we find minimum element for ascending order
    //and we find maximum element for decnding order 
    void SortFuntion(int[] arr) {
      for(int i=0;i<arr.length-1;i++)
      {
        int minIndex = i;
        for(int j=i+1;j<arr.length;j++){
            //we will find here minimum and maximum
            if(arr[j]<arr[minIndex])
            {
                minIndex = j;
            }
        }
        //if we found min element then swap that element with first index
        int temp = arr[i];
        arr[i]= arr[minIndex];
        arr[minIndex] = temp;
      }

      System.out.println("This is bubble sort -:"+Arrays.toString(arr));

    }
}

public class SortTheArray {
    public static void main(String[] Cmd_arg) {
        System.out.println("Sort the array \nSelection Sort");
        // int[] arr2 = { 2, 5, 6, 4, 8, 9, 7, 4, 1, 2 };
        // System.out.println(Arrays.toString(arr2));
        int arr[] = {64,25,12,22,11};
        SelectionSort ob = new SelectionSort();
        ob.SortFuntion(arr);
    }
}


// int[] arr2 = { 2, 5, 6, 4, 8, 9, 7, 4, 1, 2 };
// System.out.println(Arrays.toString(arr2));
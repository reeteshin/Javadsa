package GFGDSA.Sorting;

import java.lang.reflect.Array;

public class SelectionSort {
    public static void SelectionSortFn(int[] arr){
        // for(int i = 0;i<arr.length;i++){
        //     System.out.println("Sorted Array"+ arr[i]);
        // }
        for(int i=0;i<arr.length;i++){
            int min = arr[i];
            for(int j = i+1;j<arr.length;j++){
                if(min<arr[j]){
                    int tepm = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tepm;

                }
            }
        }
       // return arr;
        
        for(int i = 0;i<arr.length;i++){
            System.out.print(" "+ arr[i]);
        }
        
    }

    public static void main(String ar[]){

        int[] arr = {2,4,5,56,1,0};
        SelectionSortFn(arr);
        System.out.println(" --->"+arr.length);

    }
}

package GFGDSA.Array.Top50Quetions;

import java.util.Arrays;

class Sort {
    int Sorting123(int[] arr) {
        // System.out.println("Hello");
        int arrLen = arr.length;
        int[] NewArray = new int[arr.length];
        int cZero = 0, cOne = 0;
        int cTwo = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                cZero++;
            } else if (arr[i] == 1) {
                cOne++;
            } else {
                cTwo++;
            }

        }
        int op =0;//pointer to track 
        System.out.println("Count of Zero -:"+cZero+"\nCount Of One -:"+cOne+"\nCount Of 2 -:"+cTwo);
        while (cZero != 0) {
            NewArray[op] = 0;

            cZero--;
            op++;
        }

        while (cOne != 0) {
            NewArray[op] = 1;
            cOne--;
            op++;
        }
        while (cTwo != 0) {
            NewArray[op] = 2;
            cTwo--;
            op++;
        }

        System.out.println("New Array Will Be" + Arrays.toString(NewArray));
        return 0;
    }
}

public class SortingDutchManAlgo {
    public static void main(String[] arg) {
        Sort ob = new Sort();
        int[] arr = { 0, 1, 2, 0, 2, 1, 0, 2, 2, 0, 0, 1, 1 };
        ob.Sorting123(arr);
    }
}

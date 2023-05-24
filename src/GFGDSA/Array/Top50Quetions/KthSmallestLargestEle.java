package GFGDSA.Array.Top50Quetions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class KthSmallestLargestEle {
    public static void main(String[] arg){
        //K’th Smallest/Largest Element In Array
        int arr[] = {7, 10, 4, 3, 20, 15};
        int K = 3;
        Set<Integer> set = new TreeSet<>();

        for(int num : arr){
            set.add(num);
        }
        Iterator<Integer> itr = set.iterator();
       // System.out.println(itr.next());
        while (K-1 > 0) {
            K--;
            itr.next();
        } // itr points to the Kth element in the set
 
        System.out.println(itr.next());


    }
}

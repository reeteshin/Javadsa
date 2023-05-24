package GFGDSA.Array.Top50Quetions;

import javafx.util.Pair;

class FindMinMax{
    static Pair findMaxMinElement(int[] arr){
        int len = arr.length;
        int max=0,min=arr[0];
        for(int i=1;i<len;i++)
        {
            if(arr[i]>max)
            {
               max = arr[i];
            }
            else if(arr[i]<min)
            {
                min = arr[i];
            }
        }
        Pair p = new Pair(min, max);
        return p;
    }
}

public class FindMaxMinInArray {
   
    public static void main(String[] args)
    {
        System.out.println("Max Min In Array");
        FindMinMax ob = new FindMinMax();
        int[] arr = {1,2,5,6,8,9,7,18,10};
        System.out.println(ob.findMaxMinElement(arr));
        

    }
}

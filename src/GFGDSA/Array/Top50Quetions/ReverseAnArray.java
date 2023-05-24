package GFGDSA.Array.Top50Quetions;

import java.util.ArrayList;

class ReverseStringOrArray{
    void SwapReverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    void ReverseIt(int[] arr){
        System.out.println("Enterd In Funtion"+arr.length);
        ArrayList<Integer> AList = new ArrayList<Integer>();
        for(int i = arr.length-1;i>=0;i--)
        {
            System.out.println(i);
            AList.add(arr[i]);
        }
        System.out.println(AList);
    }
}
public class ReverseAnArray {
    public static void main(String[] arg)
    {
    //    "reverse an array or string"
        ReverseStringOrArray ob = new ReverseStringOrArray();
        int arr[] = {1,2,3,4,5,6,7};
        ob.SwapReverse(arr);
        // ob.ReverseIt(arr);

    }
}

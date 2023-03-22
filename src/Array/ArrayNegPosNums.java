package Array;
import java.util.ArrayList;


public class ArrayNegPosNums {
    public static ArrayList<Integer> Sort(int[] arr,int n){
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i = 0 ;i<n;i++)
        {
            if(arr[i]>0 || arr[i]==0)
            {
                list.add(arr[i]);
            }
        }
        for(int j=0;j<n;j++)
        {
            if(arr[j]<0)
            {
                list.add(arr[j]);
            }
        }
        return list;

    }
    public static void main(String[] args){
        int[] arr = {-12,11,-13,-5,6,-7,5,-3,-6 ,0};
        int len = arr.length;
        ArrayList<Integer> list =  Sort(arr,len);
        for (int e : list)
            System.out.print(e + " ");

    }
}

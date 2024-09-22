package GFGDSA.Array;

public class LargetElementInArray {
    public static void LargetElementInArrayFn(int[] a){
        // in itrative solution we can take one variabel call largest
        int max = a[0] ;
        for(int i = 0;i<a.length;i++){
           // int largest = a[i];
            for(int j = i+1;j<a.length;j++){
                if(max<a[j]){
                    int temp = max;
                    max =a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println(max);

    }
    public static void main(String args[]){
        int[] arr = {1,2,50,4,3,8,0};
        LargetElementInArrayFn(arr);

    }
}

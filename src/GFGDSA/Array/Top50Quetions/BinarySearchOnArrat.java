package GFGDSA.Array.Top50Quetions;

class BinaryS{
    
    int BinarySearchFuntion(int[] arr,int x){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = low+high/2;
            if(arr[mid] ==x)
            {
                return mid;
            }else if(arr[mid]<x){
                low = mid+1;
            }else{
                high = mid-1;
            }
            

        }
       
    return -1;
}
}

public class BinarySearchOnArrat {
   
    public static void main(String[] args){
        
        BinaryS ob = new BinaryS();
        int[] arr = {1,2,3,4,5,6,7,8};
        int find = 4;
       
        int result = ob.BinarySearchFuntion(arr,find);
       // System.out.println("Element not Found"+result);
        if(result == -1){
            System.out.println("Element not Found");
        }
        else{
            System.out.println("Element fount at  " + result +"   index");
        }

       
    }
}
 
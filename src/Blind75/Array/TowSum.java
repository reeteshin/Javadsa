package Blind75.Array;



public class TowSum {

    public static void FindSum(int[] arr,int target){

        int start = 0;
        int end = arr.length-1;
        System.out.println(arr.length);
        int sum = 0;
        while(start<=end){
            sum = arr[start]+arr[end];
           if(sum==target){

               System.out.println(sum+"start"+start+"end"+end);
               break;
           }else if(sum>target){
               end--;
           }else{
               start++;
           }
       
       }
       if(sum!=target){
           System.out.println("No element found");
       }
    }   

    public static void IterativeFindSum(int arr[],int target){


        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                
            }
           // System.err.println(arr[i]);
        }

    }
     public static void main(String ar[]){
        // Input Format: N = 5, arr[] = {2,6,5,8,11}, target = 14

        int arr[] = {1, 3, 4, 7, 9};
        
        int target = 5;

        //FindSum(arr, target);
        IterativeFindSum(arr, target);
      
        

    }
}

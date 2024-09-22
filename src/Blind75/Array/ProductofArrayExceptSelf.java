package Blind75.Array;


class ProductofArrayExceptSelf{
    public static void main(String args[]){
        System.out.println("Product of array BF");

        int arr[] = {1,2,3,4};
        int arr2[] = {};
        int pro = arr[0];
        for(int i=0;i<arr.length;i++){
            for(int j = 0 ;j<arr.length;j++){
                if(arr[i]!=arr[j]){
                    pro = pro*arr[j];
                    //continue;
                    //pro=1;
                }
                System.out.print(pro);
                pro=1;
            }
            System.out.println("");
        }
    }
}
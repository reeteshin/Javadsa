package Blind75.Array;

public class LargeNoInArray {
    public static void main(String[] args){
        int num[] = {2,5,1,3,10};
        int largNumber = 0;
        for(int i = 0 ;i<num.length;i++){
            if(num[i]>largNumber){
                largNumber = num[i];
            }
        }
        System.out.println(largNumber);
    }
}

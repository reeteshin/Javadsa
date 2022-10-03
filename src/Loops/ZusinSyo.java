package Loops;

import java.util.Scanner;

public class ZusinSyo {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
  
        // write ur code here
       int n = scn.nextInt();
         
       if(n==0 || n==1)
       {
        System.out.println("Not Prime NO lp");
       }
       else{
        for(int i = 2 ;i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.println("Not Prime");
                break;
            }
            else
            {
                System.out.println(("Prime"));
                break;
            }
        }
       }
         
    }
}

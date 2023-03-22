package Loops;

import java.util.Scanner;

import javax.swing.event.ChangeListener;

public class Zprint {
    public static void main(String args[]){
        //take input 
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
       

        for(int i=0;i<n;i++)
        {
            if(i==0 || i==n-1)
            {
               for(int k = 0 ;k<n;k++)
               {
                System.out.print("* ");
               }
               System.out.println(); 
            }
            else{
               for(int l = 0;l<i;l++)
               {
                System.out.print("  ");
               }
               System.out.println("*");
            }
        }


        scn.close();
    }
}
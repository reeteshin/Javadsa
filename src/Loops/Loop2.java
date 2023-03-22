package Loops;

import java.util.Scanner;

public class Loop2 {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int i = n; i > 0; i--) {

            for (int j = i ;j>0;j--)
            {
                System.out.print("*");
            }
            // for(int k = i;k>0;k--)
            // {
            //     System.out.print("6");
            // }
            System.out.println("");
        }
    }
}

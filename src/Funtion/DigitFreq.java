package Funtion;

import java.util.Scanner;

public class DigitFreq {
    


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int f = getDigitFrequency(n, d);
        System.out.println(f);
    }

    public static int getDigitFrequency(int n, int d) {
        // write code here
        int count = 0;
        while(n>0)
        {
            //5415965
            int res = n%10;
            n = n/10; 
            if(res == d)
            {
                count++;
            }
        }
        return count;
    }

}

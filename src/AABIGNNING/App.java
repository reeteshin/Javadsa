package AABIGNNING;

import java.util.Scanner;

public class App {

    public static void Pattern1() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Pattern2() {
        for (int i = 5; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Pattern3() {
        // Right-Angled Number Pyramid
        for (int i = 0; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }

    public static void Pattern4() {
        // 1 2 3 4 5 6
        // 1 2 3 4 5
        // 1 2 3 4
        // 1 2 3
        // 1 2
        // 1
        for (int i = 5; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }

    public static void Pattern5(int n) {
        // int oddNumber = ((2*n)+1);
        // *
        // ***
        // *****
        // *******
        // *********

        for (int i = 0; i < n; i++) {
            for (int k = n; k > i; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j < ((2 * i) + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void Pattern6() {
        // 1
        // 01
        // 101
        // 0101
        // 10101
        // 010101
        // working Only
        // for(int i=0;i<5;i++){
        // for(int j=0;j<=i;j++){
        // if(i%2==0){
        // if(j%2==0){
        // System.out.print("1");
        // }else{
        // System.out.print("0");
        // }

        // }else{
        // if(j%2==0){
        // System.out.print("0");
        // }else{
        // System.out.print("1");
        // }
        // }
        // }
        // System.out.println();
        // }

        int start = 0;
        for (int i = 0; i < 5; i++)// row
        {
            if (i % 2 == 0)
                start = 1;
            else
                start = 0;
            for (int j = 0; j <= i; j++) {// columns
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }
    }

    public static void Pattern7() {
        // 1 1
        // 12 21
        // 12 321
        // 1234 4321
        // 12345 54321
        // 123456654321

        // for(int i=0;i<5;i++){
        // for(int j=0;j<=i;j++){
        // System.out.print("*");
        // }
        // for(int n = ((2*5)+1);n>i;n--){
        // System.out.print(" ");
        // }
        // for(int j=0;j<=i;j++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        int N = 5;
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= N; j++) {
                if (j <= N - i) {
                    System.out.print(" ");
                } else {

                    System.out.print("*");
                }
            }

            System.out.println();
        }

    }

    public static void Pettern8() {
        int number = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }

    public static void Pattern9() {
        // *
        // ***
        // *****
        for (int i = 0; i < 10; i++) {
            for (int m = 10; m > i; m--) {
                System.out.print(" ");
            }
            for (int j = i; j >= 0; j--) {
                System.out.print(" *");
            }

            System.out.println("");
        }
        for (int i = 10; i >= 0; i--) {
            for (int m = 10; m > i; m--) {
                System.out.print(" ");
            }
            for (int j = i; j >= 0; j--) {
                System.out.print(" *");
            }

            System.out.println("");
        }
    }

    public static void Patturn10(int n) {


        for (int i = 0; i < n; i++) {
            // if(i%2!=0){

            for (int j = 0; j < n; j++) {
                if (j == n - 1 || j == 0 || i == 0 || i == n - 1) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }

            }
            // }

            System.out.println("");

        }
    }

    public static void Pattern11() {
        // 1
        // 2 3
        // 4 5 6
        // 7 8 9 10
        // 11 12 13 14 15
        // 16 17 18 19 20 21
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 4; j++) {
                System.out.print(" * ");
            }
            System.out.println("  ");
        }
    }
    public static void Pattern13(){
        for(char i='A';i<'F';i++){
            for(char space='F';space>i;space--){
                System.out.print(" ");
            }
            for(char j='A';j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void Pattern12(int n) {
       
        // 3 3 3 3 3 
        // 3 2 2 2 3 
        // 3 2 1 2 3 
        // 3 2 2 2 3 
        // 3 3 3 3 3

        for (int i = 0; i < (2 * n - 1); i++) {
            for (int j = 0; j < (2 * n - 1); j++) {
               
               System.out.print(i+""+j+" ");
                
            }
            System.out.println("");
        }

    }
    public static void Patturn14(){
        for(int i=0;i<5;i++){
            for(int j = 5;j>i;j--){
                System.out.print(j);
            }
            for(int j=0;j>0;j++){
                System.out.print("5");
            }
            // for(int j = 0 ; j<i;j++){
            //     System.out.print("*");
            // }
            // for(int j = 5;j>0;j--){
            //     System.out.print("f");
            // }
             System.out.println("");
        }
        // for(int j = 5;j>0;j--){
        //     System.out.print("f");
        // }
    }

    public static void Patturn(){
    //    ***********
    //     *       *
    //      *     *
    //       *   *
    //         *
        
    }


    public static void main(String[] args) {
        //

        int n = 3;
        Patturn14();
        // System.out.println("L");
        // for(int i=5;i>0;i--){ //rows

        // for(int j=0;j<2;j++)//columns
        // {
        // System.out.print("A");
        // }

        // System.out.print(" ");
        // }
    }
}

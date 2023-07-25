package GFGDSA.Array.PatternLogic;

public class Pattern1 {

    public static void patternOne(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == i)
                    System.out.print("* ");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void PatternTwo(int n) {
        // *
        // * *
        // * * *
        // * * * *
        // * * * * *
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void PatternThree(int n) {
        // 1
        // 22
        // 333
        // 4444
        // 55555
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void PatternFour(int n) {
        // * * * * *
        // * * * *
        // * * *
        // * *
        // *
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void PatternFive(int n) {
        // 12345
        // 1234
        // 123
        // 12
        // 1
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i + 1); j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void PatternSix(int n) {
        // *
        // ***
        // *****
        // *******
        // *********
        for (int i = 0; i < n; i++) {
            // first think how you can get odd numbers of star
            int val = 2 * i + 1; // genrating the odd numbers
            // System.out.println(val);

            for (int k = 0; k < n - i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < val; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void PatternSeven(int n) {
        // primd pattern
        for (int i = n - 1; i >= 0; i--) {
            int val = 2 * i + 1; // genrate the odd numbers (2*n+1)
            // for even no we use (2*n)
            for (int space = 0; space < n - i; space++) {
                System.out.print(" ");
            }
            for (int j = 0; j < val; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void PatternEight(int n) {
        PatternSix(n);
        PatternSeven(n);
    }

    public static void PatternNine(int n) {
        // *
        // **
        // ***
        // ****
        // *****
        // ****
        // ***
        // **
        // *
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < j; i++) {
                System.out.print("*");

            }
            System.out.println("");
        }
        for (int j = n; j > 0; j--) {
            for (int k = j; k > 0; k--) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }

    public static void PatternTen(int n) {
        // altrantive zero one
        for (int i = 0; i < n; i++) {
            
             

            System.out.println(i);
        }
    }

    public static void main(String[] arg) {
        int n = 7;
        PatternTen(n);
    }

}

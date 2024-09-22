package KnowBasicMaths;

public class ProgramOne {
    public static void CountDigit() {
        int N = 1234567;
        ;
        int count = 0;
        while (N > 0) {

            int reminder = N % 10;
            N = N / 10;
            count++;
            // System.out.println(reminder+" "+count);
        }
        System.out.println(count);
    }

    public static void ReverseNumber() {
        int N = 12345;
        // System.out.println(29%10);

        int NUM = 0;
        while (N > 0) {
            int remonder = N % 10;
            N = N / 10;

            // System.out.println(NUM);
            NUM = (NUM * 10) + remonder;

        }
        System.out.println(NUM);

    }

    public static void Palindrome() {
        // Check if a number is Palindrome or Not
        int N = 1221;
        int store = 0;
        for (int i = N; i != 0; i = i / 10) {
            int currentState = i % 10;
            store = (store * 10) + currentState;
        }
        System.out.println(store == N);

    }

    public static void  GCDoftwoNumber(){
        // divide the number the 
        int a = 100;
        int b = 20;
        int n = a;
        while(n>0){
            if(a%n==0 && b%n==0){
                System.out.println(n);
            }
            n--;

        }
        // Euclidean algorithm need to try
    }

    public static void main(String[] args) {

        // Given an integer N, return the number of digits in N.
        // Given an integer N return the reverse of the given number.
        // Check if a number is Palindrome or Not
        // GCD of two Number

        GCDoftwoNumber();
        // System.out.println("This is basic math");
    }
}

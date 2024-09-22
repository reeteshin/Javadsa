package AABIGNNING;
public class AppTwo {

    static void Pattern1 (int N){
        for (int i=0; i<=N; i++){
            for(int j=0; j<=N; j++){
                System.out.print(" m ");
            }
            System.out.println();
        }

    }
    static void Pattern2 (int N){
        for(int i=0; i<5; i++){
            for(int j=0; j<= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int N= 5;
        Pattern2(N);
    }
} 

package AABIGNNING;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       Scanner string = new Scanner(System.in);
       int n = scanner.nextInt();
       String str = string.nextLine();
        for(int i = 0 ;i<n ;i++)
        {
            System.out.println("Hello, World!"+str);
        }
    }
}

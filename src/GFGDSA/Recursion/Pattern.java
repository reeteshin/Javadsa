package GFGDSA.Recursion;

public class Pattern {
    public static void PatternFn(int row){
        if(row==0)return;
        System.out.print("*");
        PatternFn(row-1);
    }
    public static void PrintRactangal(int row,int cloums){
        if(cloums==0)return;
        PatternFn(cloums);
        System.out.println();
        PrintRactangal(row, cloums-1); 
    }



    

    public static void main(String[] ar){
        System.out.println("Pattern Using Recursion");

        int n = 5;
       // PatternFn(n);
       int row = 5;
       int cloums = 5;
       PrintRactangal(row, cloums);

    }
}

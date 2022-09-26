package Funtion;

public class NpRFormula {
    public static void main(String args[]){
        int num = 5;
        int r = 2 ;
        int fect = 1;
        int nmr = 1;
        for(var i=1;i<=num;i++)
        {
            fect = fect*i;
        }
        for(var i=1;i<=num-r;i++)
        {
            nmr = nmr*i;
        }
        System.out.println(num+"P"+r+"=="+fect/nmr);
    }
}

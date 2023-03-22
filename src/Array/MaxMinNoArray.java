package Array;
public class MaxMinNoArray {
    // static pair getMinMax(long a[], long n)  
    // {
      
    //   long max=a[0],min=a[0];
    //   for(int i=0;i<a.length-1;i++)
    //   {
    //       if(max<a[i+1])
    //          max=a[i+1];
    //       if(min>a[i+1])
    //          min=a[i+1];
      
    //   }
    //   pair minmax=new pair(min,max);
    //   return minmax;
      
    // }
    
    public static void main(String[] args)
    {
        long[] A = {3, 2, 1, 56, 10000, 167,-1};
        long len = A.length;
        GetMinMaxValue obj = new GetMinMaxValue();
        obj.MinMax(A, len);
        System.out.println("MinValue"+obj.Min()+"\n"+"MaxValue"+obj.Max());
        obj.Min();
        obj.Max();
    }
}

class GetMinMaxValue{
    private long MaxValue;
    private long MinValue;

    public void MinMax(long A[],long n)
    {
        long Max = A[0];
        long Min = A[0];
        for(int i = 0 ;i<A.length ;i++)
        {
            if(Max < A[i])
            {
                Max = A[i];
            }
            if(Min > A[i])
            {
                Min = A[i];
            }
        }
       
        this.MaxValue = Max;
        this.MinValue = Min;
    }
    public long Min() {
        return MinValue;
    }

    public long Max() {
        return MaxValue;
    }
}

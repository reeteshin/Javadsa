package GFGDSA.Recursion;

public class SuffelArray {
    public static void Recurtion(long[] arr, int n) {
        long[] aux = new long[n];
        int count = 0;

        for (int i = 0; i < n / 2; i++) {
            aux[count] = arr[i];
            count += 2;
        }

        count = 1;

        for (int i = n / 2; i < n - 1; i++) {
            aux[count] = arr[i];
            count += 2;
        }

        for (int i = 0; i < n - 1; i++) {
            arr[i] = aux[i];
        }

        if (n % 2 != 0) {
            arr[n - 1] = 0;
        }

    }

    public static void main(String[] args) {

        System.out.println("Good TO GO");
        long[] arr = {1,2,3,4,5,6};
        long[] aux = new long[arr.length];
       // System.out.println(arr[0]);

       int count = 0;
       for(int i=0;i<arr.length/2;i++)
       {
            aux[count] = arr[i];
            count=count+2;
       }
       count=1;
       for(int i=arr.length/2;i<arr.length;i++)
       {
            aux[count] = arr[i];
            count=count+2;
       }
       for(int j=0;j<arr.length;j++)
       {
        System.out.print(" " +aux[j]);
       }
        
    }
}















// System.out.println("Hello");
// long array[] = { 1, 2, 3, 4, 5, 6 };

// int len = array.length;
// int mid = len / 2;
// int a = 1;
// int b = mid;
// int q = 1;

// long[] NewA = new long[len];
// NewA[0] = array[0];
// NewA[len - 1] = array[len - 1];
// while (a < mid && mid < len) {
//     NewA[q++] = array[a++];
//     NewA[q++] = array[b++];

//     for (int l = 0; l < len; l++) {

//         NewA[l] = array[l];

//     }
// }
// for (int j = 0; j < NewA.length; j++) {

//     System.out.print(NewA[j] + ",");
// }
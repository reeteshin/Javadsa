package GFGDSA.Array.Top50Quetions;

// Given an array arr[] of integers. Find a peak element 

// i.e. an element that is not smaller than its neighbors

// The following corner cases give a better idea about the problem. 

// If the input array is sorted in a strictly increasing order, the last element is always a peak element. For example, 50 is peak element in {10, 20, 30, 40, 50}.
// If the input array is sorted in a strictly decreasing order, the first element is always a peak element. 100 is the peak element in {100, 80, 60, 50, 20}.
// If all elements of the input array are the same, every element is a peak element.
// It is clear from the above examples that there is always a peak element in the input array.
public class FindPeekElement {
    static int FindPeek(int arr[], int n) {
        if (n == 1)
            return 0;
        if (arr[0] >= arr[1])
            return 0;
        if (arr[n - 1] >= arr[n - 2])
            return n - 1;

        for (int i = 1; i < n-1; i++) {
            if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] arg) {
        int[] arr = { 5, 100, 20, 15 };
        int n = arr.length;
        System.out.println("Find a Peek Element -:" + arr[0]);

        int result =  FindPeek(arr, n);
        System.out.println(arr[result]);

    }
}
